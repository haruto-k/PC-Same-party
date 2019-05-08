#include <stdio.h>

int main(void)
{
   double height, weight;

   printf("身長と体重を入力してください。\n");

   scanf("%lf", &height);
   scanf("%lf", &weight);

   printf("身長は%fセンチ：体重は%fキロです。\n", height, weight);

   return 0;
}
