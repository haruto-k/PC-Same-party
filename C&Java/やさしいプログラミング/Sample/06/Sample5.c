#include <stdio.h>

#define BUTTONA   0x01
#define BUTTONB   0x02
#define BUTTONC   0x04

void checkButton(int p);

int main(void)
{
   int p = 0;

   printf("�{�^��A�ƃ{�^��B���I���ɂ��܂��B\n");

   p = p | (BUTTONA | BUTTONB);

   checkButton(p);
 
   printf("�{�^��A���I�t�ɂ��܂��B\n");

   p = p ^ BUTTONA;

   checkButton(p);

   printf("���]���܂��B\n");

   p = ~p;

   checkButton(p);

   return 0;
}

void checkButton(int p)
{
   if(p & BUTTONA){
      printf("---�{�^��A�̓I���ł��B\n");
   }    
   if(p & BUTTONB){
      printf("---�{�^��B�̓I���ł��B\n");
   }
   if(p & BUTTONC){
      printf("---�{�^��C�̓I���ł��B\n");
   }
}
