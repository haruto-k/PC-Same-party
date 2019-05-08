#include <stdio.h>
#include <ctype.h>

#define SIZE 50

void init(void);
void calc(void);
void push(int n);
int pop(void);
int isEmpty(void);
int isFull(void);

int stack[SIZE];
int sp;

int main(void)
{
   init();
   calc();

   return 0;
}

void calc(void)
{
   int token;
   int a, b, c;

   printf("式を入力してください。\n");
   while((token = getchar()) != '\n'){
      if(token == '\t' || token == ' '){
          ;
      } 
      else if(isdigit(token)){
         ungetc(token, stdin);
         scanf("%d", &token);
         if(!isFull()) push(token);
      }
      else if(token == '+' || token == '-' || token == '*' || token == '/' ){
         if(!isEmpty()) b = pop();
         if(!isEmpty()) a = pop();
         switch (token){
            case '+':   
               if(!isFull()) push(a + b); 
               break;
            case '-':   
               if(!isFull()) push(a - b); 
               break;
            case '*':   
               if(!isFull()) push(a * b); 
               break;
            case '/':   
               if(!isFull()) push(a / b); 
               break;
         }
      }
  }
  if(!isEmpty()) c = pop();
  printf("計算結果は%dです。\n", c);
}
void init(void)
{
   sp = 0;
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