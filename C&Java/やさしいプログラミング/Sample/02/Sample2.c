#include <stdio.h>

int main(void)
{
   int res;
   double w, r;

   /* コマンドを入力する */
   printf("図形の面積を計算します。\n");
   printf("番号を入力してください。\n");
   printf("1---正方形\n");
   printf("2---円\n");
   scanf("%d", &res);

   /* 正方形の面積を計算する */
   if(res == 1){
      printf("正方形の辺の長さを入力してください。\n");
      scanf("%lf", &w);
      printf("正方形の面積は%.3fです。\n", w * w);
   }
   /* 円の面積を計算する */
   else if(res == 2){
      printf("円の半径を入力してください。\n");
      scanf("%lf", &r);
      printf("円の面積は%.3fです。\n", r * r * 3.14);
   }
   /* エラーを表示する */
   else{
      printf("正しく入力してください。\n");
   }

   return 0;
}
