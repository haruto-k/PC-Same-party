#include <stdio.h>

int main(void)
{
   int i;

   printf("1〜10の偶数を出力します。\n");

   i=1;
   while(i <= 10){
      if((i % 2) == 0)
          printf("%d\n", i);
      i++;
   }

   return 0;
}
