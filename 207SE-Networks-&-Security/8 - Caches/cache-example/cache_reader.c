#include "cache_reader.h"


//http://www.phim.unibe.ch/comp_doc/c_manual/C/SYNTAX/struct.html
//http://vergil.chemistry.gatech.edu/resources/programming/c-tutorial/structs.html


int refill(cr_file* buff){
  //Refills a buffer
  //Only works when completely used buffer
  if(buff->usedbuffer!=buff->bufferlength)
    return 0;
  else{
    buff->usedbuffer=0;
    int len=fread(buff->buffer, sizeof(char), buff->bufferlength, buff->file);
    //If we didn't fill the buffer, fill up with EOF
    if(len<buff->bufferlength)
      for(int i=len;i<buff->bufferlength;i++)
	buff->buffer[i]=EOF;  //Accessing like an array!
    return len;
  }

}

void cr_close(cr_file* f){
  free(f->buffer);
  fclose(f->file);
}


cr_file* cr_open(char * filename, int buffersize){

  //Info on malloc
  //http://www.space.unibe.ch/comp_doc/c_manual/C/FUNCTIONS/malloc.html
  FILE* f;
  if ((f = fopen(filename, "r")) == NULL){
    fprintf(stderr, "Cannot open %s\n", filename);
    return 0;
  }

  cr_file* a=(cr_file*)malloc(sizeof(cr_file));
  a->file=f;
  a->bufferlength=buffersize;
  a->usedbuffer=buffersize; //Start off with no characters, so refill will work as expected
  a->buffer=(char*)malloc(sizeof(char)*buffersize);

  refill(a);
  return a;
}




//------------------------------------------------------------------
char cr_read_byte(cr_file* f){
  // your code goes here
  // remember that this needs to return a char (a byte, put another way..)
  char btoRet;
  if (f->usedbuffer >= f->bufferlength){ // if the buffer is all used, return EOF
    refill(f);
    
  }
    else{
   
       btoRet = f->buffer[f->usedbuffer];
        f->usedbuffer +=1;
       return btoRet;
      
    }

}
