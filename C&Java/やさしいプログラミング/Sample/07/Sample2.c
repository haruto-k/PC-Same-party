#include <stdio.h>

#define TABLESIZE 50
#define CHARSIZE  50
#define SUBJECT    4 

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, j, c;
   int test[TABLESIZE][SUBJECT];
   char subject[SUBJECT][CHARSIZE]={"国語", "算数", "理科", "社会"};

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
      if(fscanf(fp, "%d,%d,%d,%d", &(test[i][0]), &(test[i][1]), &(test[i][2]), &(test[i][3])) == EOF) break;

  }

   printf("何番目の点数を読み込みますか？（1-%d）\n", i);
   scanf("%d",&c);

   for(j=0; j<SUBJECT; j++){
      printf("%d番目の人の%sの点数は%dです。\n", c, subject[j], test[c-1][j]);
   }

   fclose(fp);

   return 0;
}
