#include <stdio.h>
#include <time.h>

int main(void)
{
   time_t timer;

   timer = time(&timer);

   printf("現在の時刻は\n");
   printf("%s", ctime(&timer));
   printf("です。\n");

   return 0;
}
