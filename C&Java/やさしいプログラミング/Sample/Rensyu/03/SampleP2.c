#include <stdio.h>
#include <ctype.h>

int main(void)
{
   char ch;

   printf("1文字入力してください。\n");
   scanf("%c", &ch);
   
   if(isdigit(ch)){
      printf("数値です。\n");
    }
    else{
      printf("数値ではありません。\n");
   }

   return 0;
}
