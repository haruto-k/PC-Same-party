#include <stdio.h>

#define PI 3.14

int main(void)
{
   double radius, height, area, volume;

   printf("半径を入力してください。\n");
   scanf("%lf", &radius);

   printf("高さを入力してください。\n");
   scanf("%lf", &height);

   area = radius * radius * PI;
   volume = area * height;

   printf("底面積は%.3fです。\n", area);
   printf("円筒の体積は%.3fです。\n", volume);

   return 0;
}
