#include <stdio.h>
#include <limits.h>

int main(void)
{
   int b, t, i;
   char bt[256];

   printf("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &t);

   b = sizeof(t) * CHAR_BIT;

   for(i=0; i<b; i++){
      bt[i] = (t & 0x01) ? '1': '0';
      t = t >> 1;
   }

   for(i=b-1; i>=0; i--){
      putchar(bt[i]);
   }

   return 0;
}
