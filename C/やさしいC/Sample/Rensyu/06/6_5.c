#include <stdio.h>

int main(void)
{
   int num, i;

   printf("2ˆÈã‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &num);

   for(i=2; i<=num; i++){
      if(i == num){
         printf("%d‚Í‘f”‚Å‚·B\n", num);
      }
      else if(num % i == 0){
         printf("%d‚Í‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB\n", num);
         break;
      }
   }
   return 0;
}
