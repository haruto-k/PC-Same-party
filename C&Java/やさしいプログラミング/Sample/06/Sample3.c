#include <stdio.h>

int main(void)
{
   int bt[256];
   int i, x, b;
   
   printf("正数を入力してください。\n");
   scanf("%d", &x);

   b=0;
   while(x > 0){
      bt[b] = x % 2;
      x = x / 2;
      b++;
   }

   printf("2進数にすると");

   for(i=b-1; i>=0; i--){
      printf("%d", bt[i]);
   }

   printf("です。\n");

   return 0;
}

