#include <stdio.h>

#define TABLESIZE 50
#define CHARSIZE  50
#define DATANUM    2 

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, j, c;
   int data[TABLESIZE][DATANUM][CHARSIZE];
   char dataname[DATANUM][CHARSIZE]={"氏名", "電話番号"};

   if(argc != 2){
      printf("パラメータの数が違います。\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("ファイルをオープンできませんでした。\n");
      return 1;
   }

   for(i=0; i<TABLESIZE; i++){
      if(fscanf(fp, "%s %s", data[i][0], data[i][1])== EOF) break;
  }

   printf("何番目のデータを読み込みますか？（1-%d）\n", i);
   scanf("%d",&c);

   for(j=0; j<DATANUM; j++){
      printf("%d番目の人の%sは%sです。\n", c, dataname[j], data[c-1][j]);
   }

   fclose(fp);

   return 0;
}
