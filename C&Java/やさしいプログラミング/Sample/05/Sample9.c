#include <stdio.h>

int main(int argc, char* argv[])
{
   FILE *fp;
   int test; 
   int sum, avg, i;

   if(argc != 2){
      printf("�p�����[�^�̐����Ⴂ�܂��B\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("�t�@�C�����I�[�v���ł��܂���ł����B\n");
      return 1;
   }

   sum = 0;
   i = 0;
   while(fscanf(fp, "%d", &test) != EOF){
      sum = sum + test;
      i++;
   }
   avg = sum / i;

   printf("%d�l�̃e�X�g���W�v���܂����B\n", i);
   printf("���v��%d�ł��B\n", sum);
   printf("���ς�%d�ł��B\n", avg);

   fclose(fp);

   return 0;
}
