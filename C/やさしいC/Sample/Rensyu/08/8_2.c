#include <stdio.h>

/* squareŠÖ”‚ÌéŒ¾ */
int square(int x);

int main(void)
{
   int num, ans;

   printf("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &num);

   ans = square(num);

   printf("%d‚Ì2æ‚Í%d‚Å‚·B\n", num, ans);

   return 0;
}

/* squareŠÖ”‚Ì’è‹` */
int square(int x)
{
   return x * x;
}
