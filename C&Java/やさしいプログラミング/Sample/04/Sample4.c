#include <stdio.h>

int main(void)
{
   int res1, res2;
   double w1, w2, h, r;

   printf("�}�`�̖ʐς��v�Z���܂��B\n");
   printf("�ԍ�����͂��Ă��������B\n");
   printf("1---�l�p�`\n");
   printf("2---�~\n");
   scanf("%d", &res1);


   if(res1 == 1){
      printf("�ԍ�����͂��Ă��������B\n");
      printf("1---�����`\n");
      printf("2---�����`\n");
      scanf("%d", &res2);
      if(res2 == 1){
         printf("�����`�̕ӂ̒�������͂��Ă��������B\n");
         scanf("%lf", &w1);
         printf("�����`�̖ʐς�%.3f�ł��B\n", w1 * w1);
      }
      else if(res2 == 2){
         printf("�����`�̕ӂ̒�������͂��Ă��������B\n");
         scanf("%lf", &w2);
         scanf("%lf", &h);
         printf("�����`�̖ʐς�%.3f�ł��B\n", w2 * h);
      }
   }
   else if(res1 == 2){
      printf("�~�̔��a����͂��Ă��������B\n");
      scanf("%lf", &r);
      printf("�~�̖ʐς�%.3f�ł��B\n", r * r * 3.14);
   }
   else{
      printf("���������͂��Ă�������\n");
   }

   return 0;
}
