#include <stdio.h>

#define SIZE 10

int main(void)
{
   int data[SIZE+1] = {3,2,5,6,1,7,0,9,4,8};
   int n, i;

   printf("���͂��Ă��������B\n");
   scanf("%d", &n);
   data[SIZE] = n;

   i = 0;
   while(data[i] != n){
      i++;
   }
 
   if(i < SIZE){
      printf("%d�Ԗڂ�%d���݂���܂����B\n", i+1, data[i]);
   }
   else{
      printf("�݂���܂���ł����B\n");
   }

   return 0;
}
