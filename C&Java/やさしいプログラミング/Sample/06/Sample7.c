#include <stdio.h>
#include <limits.h>

int main(void)
{
   int t, i;
   char bt[256];

   printf("•¶š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%c", &t);

   for(i=0; i<CHAR_BIT; i++){
      bt[i] = (t & 0x01) ? '1': '0';
      t = t >> 1;
   }

   for(i=CHAR_BIT-1; i>=0; i--){
      putchar(bt[i]);
   }

   return 0;
}
