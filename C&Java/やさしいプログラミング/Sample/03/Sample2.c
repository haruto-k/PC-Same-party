#include <stdio.h>
#include <time.h>

int main(void)
{
   time_t timer;

   timer = time(&timer);

   printf("Œ»İ‚Ì‚Í\n");
   printf("%s", ctime(&timer));
   printf("‚Å‚·B\n");

   return 0;
}
