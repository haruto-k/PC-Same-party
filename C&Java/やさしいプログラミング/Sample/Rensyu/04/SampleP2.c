#include <stdio.h>

int main(void)
{
   int x, y;

   printf("x���W����͂��Ă��������B\n");
   scanf("%d", &x);
   printf("y���W����͂��Ă��������B\n");
   scanf("%d", &y);

   if(x>0 && y>0){
      printf("���ی��ł��B\n");
   }
   else if(x<0 && y>0){
      printf("���ی��ł��B\n");
   }
   else if(x<0 && y<0){
      printf("��O�ی��ł��B\n");
   }
   else if(x>0 && y<0){
      printf("��l�ی��ł��B\n");
   }

   return 0;
}
