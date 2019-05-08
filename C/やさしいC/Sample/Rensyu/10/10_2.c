#include <stdio.h>

/* searchŠÖ”‚ÌéŒ¾ */
int search(char str[]);

int main(void)
{
   char str[100];
   int ans;

   printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%s", str);

   ans = search(str);

   printf("%s‚Ì’†‚Éa‚Í%dŒÂ‚ ‚è‚Ü‚·B\n", str, ans);

   return 0;
}

/* searchŠÖ”‚Ì’è‹` */
int search(char str[])
{
   int i, c;

   c = 0;

   for(i=0; str[i]!='\0'; i++){
      if(str[i] == 'a'){
        c++;
      }
   }

   return c;
}
