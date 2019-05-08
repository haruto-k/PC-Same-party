#include <stdio.h>

int main(void)
{
   /* 台形の上底・下底・高さ*/
   double w1, w2, h;

   /* 上底を入力する */
   printf("台形の上底を入力してください。\n");
   scanf("%lf", &w1);

   /* 下底を入力する */
   printf("台形の下底を入力してください。\n");
   scanf("%lf", &w2);

   /* 高さを入力する */
   printf("台形の高さを入力してください。\n");
   scanf("%lf", &h);

   /* 面積を計算する・結果を出力する */
   printf("台形の面積は%.3fです。\n", (w1+w2)*h/2);

   return 0;
}
