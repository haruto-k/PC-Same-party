#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
   srand((unsigned) time(NULL));

   printf("�A���t�@�x�b�g��\�����܂��B\n");
   printf("����̃A���t�@�x�b�g��%c�ł��B\n", rand() % 26 + 'A');

   return 0;
}
