#include <stdio.h>
#include <string.h>

int main(void)
{
   char str1[100], str2[100];

   printf("���������͂��Ă��������B\n");
   scanf("%s", str1);

   printf("������x���͂��Ă��������B\n");
   scanf("%s", str2);
   
   if(strcmp(str1, str2) == 0){
      printf("�����ł��B\n");
   }
   else{
      printf("�Ⴂ�܂��B\n");
   }

   return 0;
}
