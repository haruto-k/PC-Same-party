#include <stdio.h>

int main(void)
{
   int i, num, sum;

   printf("³”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &num);
 
   sum = 0;
   for(i=1; i<=num; i++){
      sum = sum + i;
   }

   printf("1`%d‚Ü‚Å‚ğ‡Œv‚·‚é‚Æ%d‚Å‚·B\n", num, sum);

   return 0;
}

