#include <stdio.h>

#define SIZE 50

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, c;
   int test[SIZE];

   if(argc != 2){
      printf("�p�����[�^�̐����Ⴂ�܂��B\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("�t�@�C�����I�[�v���ł��܂���ł����B\n");
      return 1;
   }

   for(i=0; i<SIZE; i++){
      if(fscanf(fp, "%d", &(test[i])) == EOF) break;
   }

   printf("���Ԗڂ̓_����ǂݍ��݂܂����H�i1-%d�j\n", i);
   scanf("%d",&c);

   printf("%d�Ԗڂ̐l�̓_����%d�ł��B\n", c, test[c-1]);

   fclose(fp);

   return 0;
}

