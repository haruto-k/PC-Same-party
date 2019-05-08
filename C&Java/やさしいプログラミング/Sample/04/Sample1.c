#include <stdio.h>

int main(void)
{
   int num;

   printf("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &num);
   
   if((num % 2) == 0)
      printf("%d‚Í‹ô”‚Å‚·B\n", num);
   else
      printf("%d‚ÍŠï”‚Å‚·B\n", num);

   return 0;
}
