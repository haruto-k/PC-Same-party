#include <stdio.h>

int main(void)
{
   int bt[256];
   int i, x, b;
   
   printf("��������͂��Ă��������B\n");
   scanf("%d", &x);

   b=0;
   while(x > 0){
      bt[b] = x % 2;
      x = x / 2;
      b++;
   }

   printf("2�i���ɂ����");

   for(i=b-1; i>=0; i--){
      printf("%d", bt[i]);
   }

   printf("�ł��B\n");

   return 0;
}

