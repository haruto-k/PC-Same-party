#include <stdio.h>

int main(void)
{
   char str[100];
   int i, c;

   c = 0;

   printf("文字列を入力してください。\n");
   scanf("%s", str);

   for(i=0; str[i]!='\0'; i++){
     c++;
   }

   printf("文字列の長さは%dです。\n", c);

   return 0;
}
