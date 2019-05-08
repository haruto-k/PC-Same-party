#include <stdio.h>

int main(void)
{
   char str[100];
   int i, c;

   c = 0;

   printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%s", str);

   for(i=0; str[i]!='\0'; i++){
     c++;
   }

   printf("•¶š—ñ‚Ì’·‚³‚Í%d‚Å‚·B\n", c);

   return 0;
}
