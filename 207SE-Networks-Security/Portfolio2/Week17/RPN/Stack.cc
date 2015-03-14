#include <string>
#include <stack>

using namespace std;


//Create stack, variable and
//top fo stack variable.
double stack[MAX_MSG];
int top;

//function to push a value.
void push(int x){

  top+=1;
  stack[top]=x;

}

//function to pop a value.
double pop(){
  top-=1;
  return stack[top+1];

}

int evalRPN(){
  



}
