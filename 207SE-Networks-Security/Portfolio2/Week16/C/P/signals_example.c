//signals_example.c

#include <signal.h>

//Prototype for our signal handler
void fun_sig(void);

int main(){
  //attach the callback to the 
  //USR1 signal
  signal(SIGUSR1, (void*)fun_sig);

  while(1){
    printf("I'm bored.\n");
    sleep(4);
  }
  return 0;
}

void fun_sig(){
  //Reset the signal handler
  signal(SIGUSR1, (void*)fun_sig);

  printf("Woo! That was fun :) \n");
}
  
