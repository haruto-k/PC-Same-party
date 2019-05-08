#include <stdio.h>

int main(void)
{
   double height, width;

   printf("三角形の高さを入力してください。\n");
   scanf("%lf", &height);

   printf("三角形の底辺を入力してください。\n");
   scanf("%lf", &width);

   printf("三角形の面積は%fです。\n", height * width / 2);

   return 0;
}
