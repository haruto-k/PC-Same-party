#include <stdio.h>
#include <ctype.h>

int main(void)
{
   char ch;

   printf("��������͂��Ă��������B\n");
   scanf("%c", &ch);

   if(isdigit(ch)){
      printf("���l�ł��B\n");
   }
   else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
      printf("���Z�q�ł��B\n");
   }
   else{
      printf("�s���ł��B\n");
   }

   return 0;
}

