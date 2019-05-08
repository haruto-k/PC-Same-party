#include <stdio.h>
#include <time.h>

int main(void)
{
   time_t t1, t2;
   struct tm *t;

   t1 = time(&t1);

   printf("Œ»İ‚Ì‚Í\n");
   printf("%s", ctime(&t1));
   printf("‚Å‚·B\n");

   t = localtime(&t1);
   t->tm_mday = t->tm_mday + 100;
   t2 = mktime(t);
   
   printf("100“úŒã‚Í\n");
   printf("%s", ctime(&t2));
   printf("‚Å‚·B\n");

   return 0;
}
