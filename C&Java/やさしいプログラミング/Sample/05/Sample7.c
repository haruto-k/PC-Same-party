#include <stdio.h>

int main(void)
{
   int num, i;

   printf("整数を入力してください。\n");
   scanf("%d", &num);

   for(i=2; i< num; i++){
      if((num % i) == 0){
         printf("%dは素数ではありません。\n", num);
         break;
      }
    }
    if(i == num){
       printf("%dは素数です。\n", num);
   }

   return 0;
}

