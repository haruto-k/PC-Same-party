#include <stdio.h>

int main(void)
{
   int num;

   printf("��������͂��Ă��������B\n");
   scanf("%d", &num);
   
   if((num % 2) == 0)
      printf("%d�͋����ł��B\n", num);
   else
      printf("%d�͊�ł��B\n", num);

   return 0;
}
