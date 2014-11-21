#import "cache_reader.h"

//Simple file display to show how easy it is to use the cached reader functions

int main(){
  char c;

  //Open a file
  cr_file* f = cr_open("text",20);

  //While there are useful bytes coming from it
  while((c=cr_read_byte(f))!=EOF)
    //Print them
    printf("%c",c);

  //Then close the file
  cr_close(f);

  //And finish
  return 0;
}
