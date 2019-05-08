#include <stdio.h>
#include <stdlib.h>

#define SIZE 50

void init(void);
void display(void);
void add(void);
void delete(void);
void push(int n);
int pop(void);
int isEmpty(void);
int isFull(void);

int stack[SIZE];
int sp;

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--追加\t2--削除\t3--表示\t0--終了\n");
      scanf("%d", &res); 
      if (!res){
         break;
      }
      switch(res){
         case 1:
            add();
            break;
         case 2:
            delete();
            break;
         case 3:
            display();
            break;
      }
   }

   return 0;
}

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
void add(void)
{
   int n;

   if(isFull())
      return;
   printf("整数を入力してください。\n");
   scanf("%d", &n);
   push(n);
   printf("%dを追加しました。\n", n);
}
void delete()
{
   if(isEmpty())
      return;
   printf("%dを取り出しました。\n", pop());
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