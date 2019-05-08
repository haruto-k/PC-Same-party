#include <stdio.h>

int main(void)
{
   char ch;

   printf("アルファベットを入力してください。（小文字）\n");
   scanf("%c", &ch);

   ch = ch-('a'-'A');
   printf("大文字に変換すると%cです。\n", ch);

   return 0;
}
