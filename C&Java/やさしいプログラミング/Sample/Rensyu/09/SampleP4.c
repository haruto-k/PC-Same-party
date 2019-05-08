#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 10

void displayData(char *data[]);

int main()
{
   int i, j, s, t;
   char w[50], tmp[50];
   char *data[SIZE];

   printf("何個のデータを入力しますか？(1-%d)\n", SIZE);
   scanf("%d", &s);
   if(s>SIZE) return 1;

   for(t=0; t<s; t++){
      printf("入力してください。\n");
      scanf("%s",w);
      data[t] = (char *)malloc(sizeof(char)*(strlen(w)+1));
      strcpy(data[t], w);
   }

   for(i=1; i<s; i++){
      strcpy(tmp, data[i]);
      j = i;
      while(strcmp(data[j-1],tmp)>0 && j>=1){
         strcpy(data[j], data[j-1]);
         j--;
      }
      strcpy(data[j], tmp);
   }

   printf("---\n");
   for(t=0; t<s; t++){
      printf("%s\n", data[t]);
      free(data[t]);
   }

   return 0;
}

