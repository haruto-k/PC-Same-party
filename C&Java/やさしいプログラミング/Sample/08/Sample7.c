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

   printf("������͂��Ă��������B\n");
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
  printf("�v�Z���ʂ�%d�ł��B\n", c);
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
       printf("�X�^�b�N�����t�ł��B\n");
       return 1;
   }
   return 0;
}
int isEmpty(void)
{
   if(sp <= 0){
      printf("�X�^�b�N�͋�ł��B\n");
      return 1;
   }
   return 0;
}