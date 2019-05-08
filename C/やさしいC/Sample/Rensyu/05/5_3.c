#include <stdio.h>

int main(void)
{
   int res;

   printf("0から10までの値を入力してください。\n");
   scanf("%d", &res);
   
   if(res >= 0 && res <= 10){
      printf("正解です。\n");
   }
   else{
      printf("間違いです。\n");
   }
   return 0;
}
