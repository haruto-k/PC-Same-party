#include <stdio.h>

int main(void)
{
   int num, i;

   printf("��������͂��Ă��������B\n");
   scanf("%d", &num);

   for(i=2; i< num; i++){
      if((num % i) == 0){
         printf("%d�͑f���ł͂���܂���B\n", num);
         break;
      }
    }
    if(i == num){
       printf("%d�͑f���ł��B\n", num);
   }

   return 0;
}

