#include <stdio.h>

int main(void)
{
   char ch;

   printf("�A���t�@�x�b�g����͂��Ă��������B\n");
   scanf("%c", &ch);


   if(ch >= 'a' && ch <= 'z'){
      ch = ch - ('a'-'A');
      printf("�啶���ɕϊ������%c�ł��B\n", ch);
   }
   else if(ch >= 'A' && ch <= 'Z'){
      ch = ch + ('a'-'A');
      printf("�������ɕϊ������%c�ł��B\n", ch);
   }
   else{
      printf("���������͂��Ă��������B\n");
   }
   return 0;
}

