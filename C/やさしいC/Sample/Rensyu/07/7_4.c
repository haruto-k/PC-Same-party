#include <stdio.h>

int main(void)
{
   char str[100];
   int i, c;

   printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%s", str);

   c = 0;

   for(i=0; str[i]!='\0'; i++){
      if(str[i] == 'a'){
        c++;
      }
   }

   printf("%s‚Ì’†‚Éa‚Í%dŒÂ‚ ‚è‚Ü‚·B\n", str, c);

   return 0;
}
