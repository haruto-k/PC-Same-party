#include <stdio.h>

int main(void)
{
   int i, num, sum;

   printf("��������͂��Ă��������B\n");
   scanf("%d", &num);
 
   sum = 0;
   for(i=1; i<=num; i++){
      sum = sum + i;
   }

   printf("1�`%d�܂ł����v�����%d�ł��B\n", num, sum);

   return 0;
}

