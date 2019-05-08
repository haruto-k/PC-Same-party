#include <stdio.h>

int main(void)
{
   /* 正方形の辺の長さ */
   int w;

   /* 正方形の面積 */
   int a;

   /* 辺の長さを入力する */
   printf("正方形の辺の長さを入力してください。\n");
   scanf("%d", &w);

   /* 面積を計算する*/
   a = w * w;

   /* 結果を出力する */
   printf("正方形の面積は%dです。\n", a);

   return 0;
}
