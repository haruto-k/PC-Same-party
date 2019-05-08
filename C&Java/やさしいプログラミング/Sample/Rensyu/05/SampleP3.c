#include <stdio.h>
#include <ctype.h>

int main(int argc, char* argv[])
{
   FILE *fp;
   char ch;
   int isword, i; 

   if(argc != 2){
      printf("�p�����[�^�̐����Ⴂ�܂��B\n");
      return 1;
   }

   fp = fopen(argv[1], "r");

   if(fp == NULL){
      printf("�t�@�C�����I�[�v���ł��܂���ł����B\n");
      return 1;
   }

   i= 0; isword = 0;
   while((ch = fgetc(fp)) != EOF){
      if(isspace(ch) || ispunct(ch)){
         isword = 0;
      }
      else if(isword == 0){
         isword = 1;
         i++;
      }      
   }
   printf("�P�ꐔ:%d\n", i);

   fclose(fp);

   return 0;
}
