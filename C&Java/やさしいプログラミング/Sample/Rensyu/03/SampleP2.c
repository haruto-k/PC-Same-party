#include <stdio.h>
#include <ctype.h>

int main(void)
{
   char ch;

   printf("1�������͂��Ă��������B\n");
   scanf("%c", &ch);
   
   if(isdigit(ch)){
      printf("���l�ł��B\n");
    }
    else{
      printf("���l�ł͂���܂���B\n");
   }

   return 0;
}
