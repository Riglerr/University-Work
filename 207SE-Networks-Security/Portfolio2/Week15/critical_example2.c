//critical_example2.c
#include <sys/ipc.h>
#include <sys/sem.h>
#include <stdio.h>
#include <stdlib.h>

#include "se207_sems.h"

int main(int argc, char argv[]){
  //Use our source file as the "key"
  int id=se207_semget("critical_example2.c",1);
 //int id1 =se207_semget("critcal_example2.c",1);


  int pid=fork();
  if(pid){
    //P1
    while(1){


      se207_wait(id);
      printf("There's a hole in my bucket, dear Liza, dear Liza,\n");
      rsleep();
      printf("There's a hole in my bucket, dear Liza, a hole.\n");
    se207_signal(id);

   se207_wait(id);
    printf("With what shall I mend it, dear Liza, dear Liza\n");
    rsleep();
    printf("With what shall I mend it, dear Liza, with what?\n");

    se207_signal(id);

    se207_wait(id);
    printf("But the straw is too long, dear Liza, dear Liza,\n");
    rsleep();
    printf("The straw is too long, dear Liza, too long.\n");

    se207_signal(id);

    se207_wait(id);
    printf("With what shall I cut it, dear Liza, dear Liza?\n");
    rsleep();
    printf("With what shall I cut it, dear Liza, with what?\n");

    se207_signal(id);

    se207_wait(id);
    printf("The axe is too dull, dear Liza, dear Liza,\n");
    rsleep();
    printf("The axe is too dull, dear Liza, too dull.\n");

    se207_signal(id);

    se207_wait(id);
    printf("On what shall I sharpen it, dear Liza, dear Liza?\n");
    rsleep();
    printf("On what shall I sharpen it, dear Liza, with what?\n");

    se207_signal(id);

    se207_wait(id);
    printf("But the stone is too dry, dear Liza, dear Liza,\n");
    rsleep();
    printf("The stone is too dry, dear Liza, too dry.\n");

    se207_signal(id);

    se207_wait(id);
    printf("With what shall I wet it, dear Liza, dear Liza?\n");
    rsleep();
    printf("With what shall I wet it, dear Liza, with what?\n");

    se207_signal(id);

    se207_wait(id);
    printf("In what shall I fetch it, dear Liza, dear Liza?\n");
    rsleep();
    printf("In what shall I fetch it, dear Liza, in what?\n");

    se207_signal(id);

    se207_wait(id);
    printf("There's a hole in my bucket, dear Liza, dear Liza,\n");
    rsleep();
    printf("There's a hole in my bucket, dear Liza, a hole.\n");

    se207_signal(id);


    }
  }else{
    //P2
    while(1){

    dup2(1,2);

      se207_wait(id);
      printf("\t Then fix it, dear Henry, dear Henry, dear Henry,\n");
      rsleep();
      printf(" \t Oh fix it, dear Henry, dear Henry, fix it. \n");
      se207_signal(id);

    se207_wait(id);
    printf("\t With a straw, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t With a straw, dear Henry, dear Henry, with a straw.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t Cut it, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t Then cut it, dear Henry, dear Henry, cut it.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t With an axe, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t With an axe, dear Henry, dear Henry, with an axe.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t  Sharpen it, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t  Oh sharpen it, dear Henry, dear Henry, hone it.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t On a stone, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t On a stone, dear Henry, dear Henry, a stone.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t Then wet it, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t Then wet it, dear Henry, dear Henry, wet it.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t Try water, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t Try water, dear Henry, dear Henry,use water.\n");

    se207_signal(id);

    se207_wait(id);
    printf("\t  In a bucket, dear Henry, dear Henry, dear Henry,\n");
    rsleep();
    printf("\t In a bucket, dear Henry, dear Henry, a bucket.\n");

    se207_signal(id);
    }



  }



}

