#include <stdio.h>

int main(void)
{
   char str[100];
   int i, c;

   printf("文字列を入力してください。\n");
   scanf("%s", str);

   c = 0;

   for(i=0; str[i]!='\0'; i++){
      if(str[i] == 'a'){
        c++;
      }
   }

   printf("%sの中にaは%d個あります。\n", str, c);

   return 0;
}
