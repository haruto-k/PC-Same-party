#include <stdio.h>

int main(void)
{
   int i;

   printf("1`10‚Ì‹ô”‚ğo—Í‚µ‚Ü‚·B\n");

   for(i=1; i<=10; i++){
      if((i % 2) == 0)
          printf("%d\n", i);
   }

   return 0;
}
