#include <stdio.h>

int main(void)
{
   int res1, res2;
   double w1, w2, h, r;

   printf("図形の面積を計算します。\n");
   printf("番号を入力してください。\n");
   printf("1---四角形\n");
   printf("2---円\n");
   scanf("%d", &res1);


   if(res1 == 1){
      printf("番号を入力してください。\n");
      printf("1---正方形\n");
      printf("2---長方形\n");
      scanf("%d", &res2);
      if(res2 == 1){
         printf("正方形の辺の長さを入力してください。\n");
         scanf("%lf", &w1);
         printf("正方形の面積は%.3fです。\n", w1 * w1);
      }
      else if(res2 == 2){
         printf("長方形の辺の長さを入力してください。\n");
         scanf("%lf", &w2);
         scanf("%lf", &h);
         printf("長方形の面積は%.3fです。\n", w2 * h);
      }
   }
   else if(res1 == 2){
      printf("円の半径を入力してください。\n");
      scanf("%lf", &r);
      printf("円の面積は%.3fです。\n", r * r * 3.14);
   }
   else{
      printf("正しく入力してください\n");
   }

   return 0;
}
