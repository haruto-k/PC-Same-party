#include <stdio.h>

#define PI 3.14

int main(void)
{
   double radius, height, area, volume;

   printf("���a����͂��Ă��������B\n");
   scanf("%lf", &radius);

   printf("��������͂��Ă��������B\n");
   scanf("%lf", &height);

   area = radius * radius * PI;
   volume = area * height;

   printf("��ʐς�%.3f�ł��B\n", area);
   printf("�~���̑̐ς�%.3f�ł��B\n", volume);

   return 0;
}
