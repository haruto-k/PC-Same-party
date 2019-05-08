#include <stdio.h>
#include <time.h>

int main(void)
{
   time_t t1, t2;
   struct tm *t;

   t1 = time(&t1);

   printf("現在の時刻は\n");
   printf("%s", ctime(&t1));
   printf("です。\n");

   t = localtime(&t1);
   t->tm_mday = t->tm_mday + 100;
   t2 = mktime(t);
   
   printf("100日後は\n");
   printf("%s", ctime(&t2));
   printf("です。\n");

   return 0;
}
