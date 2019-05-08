#include "Sample.h"

int rpn[SIZE];
int ch;
int ep;

int main(void)
{
   ep = 0;
   conv();
   calc();

   return 0;
}

void conv(void)
{
   printf("式を入力してください。\n");

   ch = getchar();
   expr();
   if(ch != '\n'){
      printf("正しい式ではありません。\n");exit(1);
   }
}
void expr(void)
{
   term();
   while(1){
      if(ch == '+'){
         ch = getchar();
         term();
         rpn[ep++] = '+';
      }
      else if(ch == '-'){
         ch = getchar();
         term();
         rpn[ep++] = '-';
      }
      else{ 
         break;
      }
   }
}
void term(void)
{
   factor();
   while(1){
      if(ch == '*'){
         ch = getchar();
         factor();
         rpn[ep++] = '*';
      }
      else if(ch == '/'){
         ch = getchar();
         factor();
         rpn[ep++] = '/';
      }
      else{
         break;
      }
   }
}
void factor(void)
{
   if(isdigit(ch)){
      ungetc(ch, stdin);
      scanf("%d", &ch);
      rpn[ep++] = ch;
      ch = getchar();   
   }
   else if(ch=='('){
      ch = getchar();   
      expr();
      if(ch != ')'){
          printf("カッコが対応していません。\n");exit(1);
      }
      ch = getchar();   
   }
   else{
      printf("正しい式ではありません。\n");exit(1);
   }
}
void calc(void)
{
   int i;
   int token;
   int a, b, c;

   init();

   for(i=0; i<ep; i++){
      token = rpn[i];

      if(token == '+' || token == '-' || token == '*' || token == '/' ){
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
      else{
         if(!isFull()) push(token);
      }
   }
   if(!isEmpty()) c = pop();
   printf("計算結果は%dです。\n", c);
}
