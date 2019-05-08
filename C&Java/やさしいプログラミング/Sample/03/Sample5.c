#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
   srand((unsigned) time(NULL));

   printf("アルファベットを表示します。\n");
   printf("今回のアルファベットは%cです。\n", rand() % 26 + 'A');

   return 0;
}
