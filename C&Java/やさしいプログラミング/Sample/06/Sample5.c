#include <stdio.h>

#define BUTTONA   0x01
#define BUTTONB   0x02
#define BUTTONC   0x04

void checkButton(int p);

int main(void)
{
   int p = 0;

   printf("ボタンAとボタンBをオンにします。\n");

   p = p | (BUTTONA | BUTTONB);

   checkButton(p);
 
   printf("ボタンAをオフにします。\n");

   p = p ^ BUTTONA;

   checkButton(p);

   printf("反転します。\n");

   p = ~p;

   checkButton(p);

   return 0;
}

void checkButton(int p)
{
   if(p & BUTTONA){
      printf("---ボタンAはオンです。\n");
   }    
   if(p & BUTTONB){
      printf("---ボタンBはオンです。\n");
   }
   if(p & BUTTONC){
      printf("---ボタンCはオンです。\n");
   }
}
