#include <stdio.h>
#include <math.h>

int main(void)
{
   double b, s;

   printf("�r�b�g������͂��Ă��������B(1-24)\n");
   scanf("%lf", &b);

   if(b > 24 || b < 1)
      return 0;

   s = pow(2, b);

   printf("%1.0f�r�b�g��%1.0f��ނ�����킹�܂��B\n", b, s);

   return 0;
}
