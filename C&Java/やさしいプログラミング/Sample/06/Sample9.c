#include <stdio.h>
#include <string.h>
#include <limits.h>

int main(void)
{
   long l;
   int b, i;
   float f;
   char bt[256];

   printf("¬”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%f", &f);

   memcpy(&l, &f,sizeof(f));

   b = sizeof(f) * CHAR_BIT;

   for(i=0; i<b; i++){
      bt[i] = (l & 0x01) ? '1': '0';
      l = l >> 1;
   }

   for(i=b-1; i>=0; i--){
      putchar(bt[i]);
   }
   printf("\n");

   return 0;
}
