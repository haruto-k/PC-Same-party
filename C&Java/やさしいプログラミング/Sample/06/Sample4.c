#include <stdio.h>

#define MAX 20

int main(void)
{
   int i;

   printf("---------------------\n");   
   printf("10進数\t8進数\t16進数\n");   
   printf("---------------------\n");   

   for(i=0; i<=MAX; i++){
      printf("%2d\t%2o\t%2X\n", i, i, i);
   }

   return 0;
}

