#include <stdio.h>

int main(void)
{
   int num, i;

   printf("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &num);

   for(i=2; i< num; i++){
      if((num % i) == 0){
         printf("%d‚Í‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB\n", num);
         break;
      }
    }
    if(i == num){
       printf("%d‚Í‘f”‚Å‚·B\n", num);
   }

   return 0;
}

