#include <stdio.h>

#define MIN 0
#define MAX 100
#define CLASS 10
#define INTERVAL ((MAX-MIN) / CLASS)

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, c, test; 
   int freq[CLASS];

   if(argc != 2){
      printf("パラメータの数が違います。\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("ファイルをオープンできませんでした。\n");
      return 1;
   }

   for(i=0; i<CLASS; i++){
      freq[i] = 0;
   }

   while(fscanf(fp, "%d", &test) != EOF){
      if(test == MAX){
          c = CLASS-1;
      }
      else{
          c = test / INTERVAL;
      }
      freq[c]++;
   }

   for(i=0; i<CLASS-1; i++){
      printf("%d--%d：%d人\n", i*INTERVAL, (i+1)*INTERVAL-1, freq[i]);
   }
      printf("%d--%d：%d人\n", MAX-INTERVAL, MAX, freq[CLASS-1]);

   fclose(fp);

   return 0;
}
