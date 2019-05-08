#include <stdio.h>
#include <ctype.h>

int main(void)
{
   int ch;
   int num;

   printf("式を入力してください。\n");

   while((ch = getchar()) != '\n'){
      if(isdigit(ch)){
         ungetc(ch, stdin);
         scanf("%d", &num);
         printf("数値:%d\n", num);
      }
      else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
         printf("演算子:%c\n", ch);
      }
      else{
         printf("不明:%c\n", ch);
      }
  }

   return 0;
}

