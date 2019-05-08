#include <stdio.h>

int main(void)
{
   int width;

   printf("正方形の辺の長さを入力してください。\n");
   scanf("%d", &width);

   printf("正方形の面積は%dです。\n", width * width);

   return 0;
}
