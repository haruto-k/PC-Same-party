#include <stdio.h>

#define TABLESIZE 50
#define CHARSIZE  50
#define DATANUM    2 

int main(int argc, char* argv[])
{
   FILE *fp;
   int i, j, c;
   int data[TABLESIZE][DATANUM][CHARSIZE];
   char dataname[DATANUM][CHARSIZE]={"����", "�d�b�ԍ�"};

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
      if(fscanf(fp, "%s %s", data[i][0], data[i][1])== EOF) break;
  }

   printf("���Ԗڂ̃f�[�^��ǂݍ��݂܂����H�i1-%d�j\n", i);
   scanf("%d",&c);

   for(j=0; j<DATANUM; j++){
      printf("%d�Ԗڂ̐l��%s��%s�ł��B\n", c, dataname[j], data[c-1][j]);
   }

   fclose(fp);

   return 0;
}
