#include <stdio.h>

int main(void)
{
   char ch;

   printf("�A���t�@�x�b�g����͂��Ă��������B�i�������j\n");
   scanf("%c", &ch);

   ch = ch-('a'-'A');
   printf("�啶���ɕϊ������%c�ł��B\n", ch);

   return 0;
}
