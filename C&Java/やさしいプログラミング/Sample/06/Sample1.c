#include <stdio.h>
#include <math.h>

int main(void)
{
   double b, s;

   printf("ビット数を入力してください。(1-24)\n");
   scanf("%lf", &b);

   if(b > 24 || b < 1)
      return 0;

   s = pow(2, b);

   printf("%1.0fビットで%1.0f種類があらわせます。\n", b, s);

   return 0;
}
