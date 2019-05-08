#include <stdio.h>
#include <stdlib.h>

#define SIZE 50

void init(void);
void add(void);
void delete(void);
void display(void);
void enqueue(int n);
int dequeue(void);
int isFull(void);
int isEmpty(void);

int queue[SIZE];
int head, tail;

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--�ǉ�\t2--�폜\t3--�\��\t0--�I��\n");
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
   head = 0;
   tail = 0;
}
void display(void)
{
   int i;

   printf("---\n");
   if(head%SIZE <= tail%SIZE){
      for(i=head%SIZE; i<tail%SIZE; i++){
         printf("%d\n", queue[i]);
      }
   }
   else{
      for(i=head%SIZE; i<SIZE; i++){
         printf("%d\n", queue[i]);
      }
      for(i=0; i<tail%SIZE; i++){
         printf("%d\n", queue[i]);
      }
   }
   printf("---\n");
}
void add(void)
{
   int n;

   if(isFull())
      return;
   printf("��������͂��Ă��������B\n");
   scanf("%d", &n);
   enqueue(n);
   printf("%d��ǉ����܂����B\n" ,n);
}
void delete(void)
{
   if(isEmpty())
      return;
   printf("%d�����o���܂����B\n", dequeue());
}
void enqueue(int n)
{
   queue[(tail++)%SIZE] = n;
}
int dequeue(void)
{
   return queue[(head++)%SIZE];
}
int isFull(void)
{
   if(head%SIZE == (tail +1)%SIZE){
       printf("�L���[�����t�ł��B\n");
       return 1;
   }
   return 0;
}
int isEmpty(void)
{
   if(head == tail){
      printf("�L���[�͋�ł��B\n");
      return 1;
   }
   return 0;
}
