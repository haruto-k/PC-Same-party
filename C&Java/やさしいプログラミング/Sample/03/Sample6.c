#include <stdio.h>

int main(void)
{
   int tmp, x, y;

   printf("�P�Ԗڂ̐�����͂��Ă��������B\n");
   scanf("%d", &x);

   printf("2�Ԗڂ̐�����͂��Ă��������B\n");
   scanf("%d", &y);

   printf("1�Ԗڂ̐���%d�ł��B2�Ԗڂ̐���%d�ł��B\n", x ,y);

   tmp = y;
   y = x;
   x = tmp;

   printf("�������܂����B\n");
   printf("1�Ԗڂ̐���%d�ł��B2�Ԗڂ̐���%d�ł��B\n", x ,y);

   return 0;
}

