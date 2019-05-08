#include <stdio.h>
#include <string.h>

int main(void)
{
   char str1[100], str2[100];

   printf("文字列を入力してください。\n");
   scanf("%s", str1);

   printf("もう一度入力してください。\n");
   scanf("%s", str2);
   
   if(strcmp(str1, str2) == 0){
      printf("正解です。\n");
   }
   else{
      printf("違います。\n");
   }

   return 0;
}
