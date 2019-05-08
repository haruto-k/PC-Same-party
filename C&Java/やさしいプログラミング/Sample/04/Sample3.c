#include <stdio.h>

int main(void)
{
   char ch;

   printf("アルファベットを入力してください。\n");
   scanf("%c", &ch);


   if(ch >= 'a' && ch <= 'z'){
      ch = ch - ('a'-'A');
      printf("大文字に変換すると%cです。\n", ch);
   }
   else if(ch >= 'A' && ch <= 'Z'){
      ch = ch + ('a'-'A');
      printf("小文字に変換すると%cです。\n", ch);
   }
   else{
      printf("正しく入力してください。\n");
   }
   return 0;
}

