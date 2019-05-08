#include <stdio.h>

int main(int argc, char* argv[])
{
   FILE *fp;
   int test; 
   int sum, avg, i;

   if(argc != 2){
      printf("パラメータの数が違います。\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("ファイルをオープンできませんでした。\n");
      return 1;
   }

   sum = 0;
   i = 0;
   while(fscanf(fp, "%d", &test) != EOF){
      sum = sum + test;
      i++;
   }
   avg = sum / i;

   printf("%d人のテストを集計しました。\n", i);
   printf("合計は%dです。\n", sum);
   printf("平均は%dです。\n", avg);

   fclose(fp);

   return 0;
}
