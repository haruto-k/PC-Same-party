#include <stdio.h>

/* lengthŠÖ”‚ÌéŒ¾ */
int length(char str[]);

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
int length(char str[])
{
   int i, c;

   c = 0;

   for(i=0; str[i]!='\0'; i++){
      c++;
   }

   return c;
}
