#include <stdio.h>

int main(void)
{
   int i;

   printf("1�`10�̋������o�͂��܂��B\n");

   i=1;
   while(i <= 10){
      if((i % 2) == 0)
          printf("%d\n", i);
      i++;
   }

   return 0;
}
