#include <stdio.h>

int main(void)
{
   char str[100];
   int i;

   printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%s", str);

   for(i=0; str[i]!='\0'; i++){
      if(str[i] == 'a'){
        str[i] = 'b';
      }
   }

   printf("%s‚É’u‚«‚©‚¦‚Ü‚µ‚½B\n", str);

   return 0;
}
