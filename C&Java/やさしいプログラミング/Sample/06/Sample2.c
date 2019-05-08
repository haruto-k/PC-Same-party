#include <stdio.h>
#include <string.h>
#include <math.h>

int main(void)
{
   char bt[256];
   int i, j, d, x, b;
   
   printf("ビット列を入力してください。\n");

   scanf("%s", bt);

   b = strlen(bt);

   x = 0;
   j = 0;

   for(i=b-1; i>=0 ; i--){
      d = (bt[i] =='0') ? 0 : 1; 
      x = x + d * pow(2, j);
      j++;
   }

   printf("10進数にすると%dです。", x);

   return 0;
}
