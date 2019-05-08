#include <stdio.h>
#define MAX 100
#define MIN 0
#define RANK 10
#define INTERVAL ((MAX-MIN) / RANK)

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, j, r, test; 
   int freq[RANK];

   if(argc != 2){
      printf("パラメータの数が違います。\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("ファイルをオープンできませんでした。\n");
      return 1;
   }

   for(i=0; i<RANK; i++){
      freq[i] = 0;
   }

   while(fscanf(fp, "%d", &test) != EOF){
      if(test == MAX){
          r = RANK-1;
      }
      else{
          r = test / INTERVAL;
      }
      freq[r]++;
   }

   for(i=0; i<RANK-1; i++){
      printf("%d--%d：", i*INTERVAL, (i+1)*INTERVAL-1);
      for(j=0; j<freq[i]; j++){
         printf("*");
      }
      printf("\n");
   }

   printf("%d--%d：", MAX-INTERVAL, MAX);
   for(j=0; j<freq[i]; j++){
      printf("*");
   }
   printf("\n");

   fclose(fp);

   return 0;
}
