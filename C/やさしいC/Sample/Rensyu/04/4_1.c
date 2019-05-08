#include <stdio.h>

int main(void)
{
   int ans1, ans4;
   double ans2, ans3, ans5;

   ans1 = 0-4;
   ans2 = 3.14*2;
   ans3 = 5.0/3.0;
   ans4 = 30%7;
   ans5 = (7+32)/5.0;

   printf("0-4は%dです。\n", ans1);
   printf("3.14×2は%fです。\n", ans2);
   printf("5÷3は%fです。\n", ans3);
   printf("30÷7のあまりの数は%dです。\n", ans4);
   printf("(7+32)÷5は%fです。\n", ans5);

   return 0;
}
