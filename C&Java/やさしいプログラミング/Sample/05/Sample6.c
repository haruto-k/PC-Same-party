#include <stdio.h>

int main(void)
{
   int i;

   printf("1〜10の偶数を出力します。\n");

   for(i=1; i<=10; i++){
      if((i % 2) == 0)
          printf("%d\n", i);
   }

   return 0;
}
