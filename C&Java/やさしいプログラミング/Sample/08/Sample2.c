#include <stdio.h>
#include <stdlib.h>

typedef struct _stack{
   int data;
   struct _stack *next;
}stack;

void init(void);
void add(void);
void delete(void);
void display(void);
void release(void);
void push(stack *s, int n);
int pop(void);

stack *head;

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
   release();

   return 0;
}

void init(void)
{
   head = NULL;
}
void add(void)
{
   stack *s;
   int n;

   s = (stack *)malloc(sizeof(stack));
   if(s == NULL){
      printf("メモリを確保できませんでした。\n");
      return;
   }

   printf("整数を入力してください。\n");
   scanf("%d",&n);
   push(s, n);
   printf("%dを追加しました。\n", s->data);
}
void delete(void)
{
   printf("%dを取り出しました。\n", pop());
}
void display(void)
{
   stack *s;

   s = head;

   printf("---\n");
   while(s != NULL){
      printf("%d\n", s->data);
      s = s->next;
   }
   printf("---\n");
}
void release(void)
{
   stack *s, *tmp;

   s = head;
   tmp = head;
   while(s != NULL){
      tmp = s->next;
      free(s);  
      s = tmp;
   }
}
void push(stack *s, int n)
{
   s->data = n;
   s->next = head;
   head = s;
}
int pop(void)
{
   stack *s;
   int n;
   
   s = head;

   n = s->data;
   head = s->next;
   free(s);

   return n;
}