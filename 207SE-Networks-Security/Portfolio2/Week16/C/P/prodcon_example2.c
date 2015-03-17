#include <sys/ipc.h>
#include <sys/sem.h>
#include <sys/shm.h>
#include <stdio.h>
#include <stdlib.h>
#include "se207_sems.h"

/* Remember to try reversing the timings...*/


int bufferlength=8; //Limited buffer length 
//what could we do about this?

int main(int argc, char argv[]){

  //Create shared memory segment
  int shm_id=shmget(ftok("prodcon_example2.c",2),bufferlength, 
		    0666|IPC_CREAT);

  //Use our source file as the "key"
  int id=se207_semget("prodcon_example2.c",0);

  char* data; //For our pointer to shared memory...

  int pid=fork();  
  if(pid){
    //P1 - CONSUMER
    shm_id=shmget(ftok("prodcon_example2.c",2),0,006);

    //Attach the shared buffer
    data = shmat(shm_id, (void *)0, 0);
    int consumed=0;
    while(consumed<bufferlength){
      se207_wait(id);
      printf("Consuming item number %d...\n",consumed);
      sleep(1);
      char item=data[consumed];
      
      printf("Consumed item number %d.  Item value was %d\n",
	     consumed,item);
      consumed++;
    }

    //Detatch
    shmdt(data);
    printf("All done consuming.\n");

    wait(); //For child process so that we can

    //Delete the shared memory
    printf("Child ended, removing shm\n");
    shmctl(shm_id, IPC_RMID, NULL);    
  }else{
    //P2
    shm_id=shmget(ftok("prodcon_example2.c",2),0,006);                   
    //Attach the shared buffer
    data = shmat(shm_id, (void *)0, 0);

    int produced=0;
    while(produced<bufferlength){
      printf("Producing item number %d...\n",produced);
      sleep(2);
      data[produced]=produced*2; //Simple data, easy to check.
      printf("Produced item number %d.  Value is %d\n",
	     produced,data[produced]);
      se207_signal(id);
      produced++;
    }
    //Detatch
    shmdt(data);
    printf("Producer finished.");
  }  
}
