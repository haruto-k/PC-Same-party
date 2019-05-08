#include "Sample.h"

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

   return 0;
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
void delete(void)
{
   if(isEmpty())
      return;
   printf("%dを取り出しました。\n", pop());
}