#include <stdio.h>

#define SIZE 10

int main(void)
{
   int data[SIZE] = {0,1,2,3,4,5,6,7,8,9};
   int n, l, h, m;

   printf("���͂��Ă��������B\n");
   scanf("%d", &n);

   l = 0;
   h = 9;

   while(l <= h){
      m = (l + h) / 2;
      if(data[m] == n){
         printf("%d�Ԗڂ�%d���݂���܂����B\n", m+1, data[m]);
         return 0;
      }
      else if(data[m] < n){
         l = m + 1;
      }
      else{
         h = m - 1;
      }
   }
   printf("�݂���܂���ł����B\n");

   return 0;
}
