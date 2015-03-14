
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STACK 15

double stack[MAX_STACK];
int top;

void push(int x){

  top+=1;
  stack[top]=x;

}

double pop(){
  top-=1;
  return stack[top+1];

}

int main()
{
char c;
char number[10] = ""; // No numbers larger than the length of an int.
number[9] = 0; // Not sure if this is needed for atoi().
int i = 0, val1, val2;


printf("--- RPN-calculator. Enter an expression. Exit with ^D ---\n");
do {
  c = getchar();

  if (c >= '0' && c <= '9'
     {
      number[i++] = c;
      } else if (c == '*')
        {
          val1 = pop();
          val2 = pop();
          push(val1 * val2);

        }
         else if (c == '/')
         {
            val1 = pop();
            val2 = pop();

              if (val1 == 0)
                 {
                fprintf(stderr, "[!] Illegal divide by zero. Exiting...\n");
                exit(0);
                  }
          push(val2 / val1);

          }
          else if (c == '-') {
            val1 = pop();
            val2 = pop();
            push(val2 - val1);
          }

          else if (c == '+') {
            val1 = pop();
            val2 = pop();
            push(val1 + val2);
}
          else if (c == ' ' && i != 0)
           {
            val1 = atoi(number);
            push(val1);
            int j;
            for (j = 0; j <= i; j++) {
              number[j] = 0;
            }
            i = 0;
          }

          else if (c == '\n') {
            val1 = pop();
            printf("%d \n", val1);
          }

         else if (c != ' ' && c != EOF) {
           printf("%d\n", (int)c);
           fprintf(stderr, "[!] Syntax error in input. Exiting...\n");
           exit(1);
          }

} while (c != EOF);
printf("--- Program finished. Terminating ---\n");
return 0;
}
