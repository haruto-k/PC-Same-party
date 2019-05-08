#include <stdio.h>

#define SIZE 50

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, c;
   int test[SIZE];

   if(argc != 2){
      printf("パラメータの数が違います。\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("ファイルをオープンできませんでした。\n");
      return 1;
   }

   for(i=0; i<SIZE; i++){
      if(fscanf(fp, "%d", &(test[i])) == EOF) break;
   }

   printf("何番目の点数を読み込みますか？（1-%d）\n", i);
   scanf("%d",&c);

   printf("%d番目の人の点数は%dです。\n", c, test[c-1]);

   fclose(fp);

   return 0;
}

