#include <stdio.h>

#define TABLESIZE 50
#define CHARSIZE  50
#define SUBJECT    4 

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, j, c;
   int test[TABLESIZE][SUBJECT];
   char subject[SUBJECT][CHARSIZE]={"����", "�Z��", "����", "�Љ�"};

   if(argc != 2){
      printf("�p�����[�^�̐����Ⴂ�܂��B\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("�t�@�C�����I�[�v���ł��܂���ł����B\n");
      return 1;
   }

   for(i=0; i<TABLESIZE; i++){
      if(fscanf(fp, "%d,%d,%d,%d", &(test[i][0]), &(test[i][1]), &(test[i][2]), &(test[i][3])) == EOF) break;

  }

   printf("���Ԗڂ̓_����ǂݍ��݂܂����H�i1-%d�j\n", i);
   scanf("%d",&c);

   for(j=0; j<SUBJECT; j++){
      printf("%d�Ԗڂ̐l��%s�̓_����%d�ł��B\n", c, subject[j], test[c-1][j]);
   }

   fclose(fp);

   return 0;
}
