#include <stdio.h>

#define SIZE 10

int main(void)
{
   int data[SIZE] = {3,2,5,6,1,7,0,9,4,8};
   int n, i;

   printf("���͂��Ă��������B\n");
   scanf("%d", &n);

   for(i=0; i<SIZE; i++){
      if(data[i] == n){ 
          break;
      }
   }

   if(i<SIZE){
      printf("%d�Ԗڂ�%d���݂���܂����B\n", i+1, data[i]);
   }
   else{
      printf("�݂���܂���ł����B");
   }

   return 0;
}
