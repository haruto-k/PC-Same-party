#include <stdio.h>

int main(void)
{
   int x, y;

   printf("x座標を入力してください。\n");
   scanf("%d", &x);
   printf("y座標を入力してください。\n");
   scanf("%d", &y);

   if(x>0 && y>0){
      printf("第一象限です。\n");
   }
   else if(x<0 && y>0){
      printf("第二象限です。\n");
   }
   else if(x<0 && y<0){
      printf("第三象限です。\n");
   }
   else if(x>0 && y<0){
      printf("第四象限です。\n");
   }

   return 0;
}
