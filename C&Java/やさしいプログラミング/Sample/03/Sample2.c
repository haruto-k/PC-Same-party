#include <stdio.h>
#include <time.h>

int main(void)
{
   time_t timer;

   timer = time(&timer);

   printf("���݂̎�����\n");
   printf("%s", ctime(&timer));
   printf("�ł��B\n");

   return 0;
}
