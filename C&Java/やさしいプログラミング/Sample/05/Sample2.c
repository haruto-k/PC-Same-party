#include <stdio.h>

int main(void)
{
   int i, num, sum;

   printf("正数を入力してください。\n");
   scanf("%d", &num);
 
   sum = 0;
   for(i=1; i<=num; i++){
      sum = sum + i;
   }

   printf("1〜%dまでを合計すると%dです。\n", num, sum);

   return 0;
}

