#include <stdio.h>
#include <ctype.h>

int main(void)
{
   char ch;

   printf("文字を入力してください。\n");
   scanf("%c", &ch);

   if(isdigit(ch)){
      printf("数値です。\n");
   }
   else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
      printf("演算子です。\n");
   }
   else{
      printf("不明です。\n");
   }

   return 0;
}

