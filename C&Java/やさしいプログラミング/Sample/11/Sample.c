#include "Sample.h"

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--�ǉ�\t2--�폜\t3--�\��\t0--�I��\n");
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

   return 0;
}
void add(void)
{
   int n;

   if(isFull())
      return;
   printf("��������͂��Ă��������B\n");
   scanf("%d", &n);
   push(n);
   printf("%d��ǉ����܂����B\n", n);
}
void delete(void)
{
   if(isEmpty())
      return;
   printf("%d�����o���܂����B\n", pop());
}