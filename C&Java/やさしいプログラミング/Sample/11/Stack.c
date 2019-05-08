#include "Stack.h"

int stack[SIZE];
int sp;

void init(void)
{
   sp = 0;
}
void display(void)
{
   int i;

   printf("---\n");
   for(i=sp-1; i>=0; i--){
      printf("%d\n", stack[i]);
     
   }
   printf("---\n");
  
}
void push(int n)
{
   stack[sp++] = n;
}
int pop(void)
{
   return stack[--sp];
}
int isFull(void)
{
   if(sp >= SIZE){
      printf("スタックが満杯です。\n");
      return 1;
   }
   return 0;
}
int isEmpty(void)
{
   if(sp <= 0){
      printf("スタックは空です。\n");
      return 1;
   }
   return 0;
}