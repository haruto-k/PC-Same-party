#include <stdio.h>
#include <ctype.h>

int main(void)
{
   int ch;
   int num;

   printf("������͂��Ă��������B\n");

   while((ch = getchar()) != '\n'){
      if(isdigit(ch)){
         ungetc(ch, stdin);
         scanf("%d", &num);
         printf("���l:%d\n", num);
      }
      else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
         printf("���Z�q:%c\n", ch);
      }
      else{
         printf("�s��:%c\n", ch);
      }
  }

   return 0;
}

