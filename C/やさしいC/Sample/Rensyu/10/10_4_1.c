#include <stdio.h>

/* lengthŠÖ”‚ÌéŒ¾ */
int length(char *str);

int main(void)
{
   char str[100];
   int ans;

   printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%s", str);

   ans = length(str);

   printf("•¶š—ñ‚Ì’·‚³‚Í%d‚Å‚·B\n", ans);

   return 0;
}

/* lengthŠÖ”‚Ì’è‹` */
int length(char *str)
{
   int c = 0;

   c = 0;

   while(*str){
      c++;
      str++;
   }

   return c;
}
