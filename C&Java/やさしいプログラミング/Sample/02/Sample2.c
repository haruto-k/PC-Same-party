#include <stdio.h>

int main(void)
{
   int res;
   double w, r;

   /* �R�}���h����͂��� */
   printf("�}�`�̖ʐς��v�Z���܂��B\n");
   printf("�ԍ�����͂��Ă��������B\n");
   printf("1---�����`\n");
   printf("2---�~\n");
   scanf("%d", &res);

   /* �����`�̖ʐς��v�Z���� */
   if(res == 1){
      printf("�����`�̕ӂ̒�������͂��Ă��������B\n");
      scanf("%lf", &w);
      printf("�����`�̖ʐς�%.3f�ł��B\n", w * w);
   }
   /* �~�̖ʐς��v�Z���� */
   else if(res == 2){
      printf("�~�̔��a����͂��Ă��������B\n");
      scanf("%lf", &r);
      printf("�~�̖ʐς�%.3f�ł��B\n", r * r * 3.14);
   }
   /* �G���[��\������ */
   else{
      printf("���������͂��Ă��������B\n");
   }

   return 0;
}
