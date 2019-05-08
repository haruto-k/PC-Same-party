#include <stdio.h>

int main(void)
{
   int tmp, x, y;

   printf("１番目の数を入力してください。\n");
   scanf("%d", &x);

   printf("2番目の数を入力してください。\n");
   scanf("%d", &y);

   printf("1番目の数は%dです。2番目の数は%dです。\n", x ,y);

   tmp = y;
   y = x;
   x = tmp;

   printf("交換しました。\n");
   printf("1番目の数は%dです。2番目の数は%dです。\n", x ,y);

   return 0;
}

