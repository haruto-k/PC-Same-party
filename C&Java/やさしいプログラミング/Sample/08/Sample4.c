#include <stdio.h>
#include <stdlib.h>

typedef struct _queue{
   int data;
   struct _queue *next;
}queue;

void init(void);
void add(void);
void delete(void);
void display(void);
void release(void);
void enqueue(queue * q, int n);
int dequeue(void);

queue *head, *tail;

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--追加\t2--削除\t3--表示\t0--終了\n");
      scanf("%d", &res); 
      if(!res){
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
   tail = NULL;
}
void add(void)
{
   queue *q;
   int n;

   q = (queue *)malloc(sizeof(queue));

   if(q == NULL){
      printf("メモリを確保できませんでした。\n");
      return;
   }

   printf("整数を入力してください。\n");
   scanf("%d",&n);
   enqueue(q, n);
   printf("%dを追加しました。\n", q->data);
}
void delete(void)
{
   printf("%dを取り出しました。\n", dequeue());
}
void display(void)
{
   queue *q;

   q = head;

   printf("---\n");
   while(q != NULL){
      printf("%d\n", q->data);
      q = q->next;
   }
   printf("---\n");
}
void release(void)
{
   queue *q, *tmp;

   q = head;
   tmp = head;
   while(q != NULL){
      tmp = q->next;
      free(q);  
      q = tmp;
   }
}
void enqueue(queue *q, int n)
{
   q->data = n;
   if(tail == NULL){
      head = q;
   }
   else{
      tail->next = q;
   }
   q->next = NULL;
   tail = q;
}
int dequeue(void)
{
   queue *q;
   int n;
 
   q = head;

   n = q->data;
   head = q->next;
   free(q);

   if(head == NULL){
      tail = NULL;
   }
   return n;
}
