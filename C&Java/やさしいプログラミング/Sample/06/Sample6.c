#include <stdio.h>

#define RED    0xFF0000
#define GREEN  0x00FF00
#define BLUE   0x0000FF

#define PURPLE 0xC000FF 

int main(void)
{
   int r, g, b;

   r = (PURPLE & RED) >> 16; 
   g = (PURPLE & GREEN) >> 8;
   b = (PURPLE & BLUE) >> 0;

   printf("���̐������o�͂��܂��B\n");
   printf("�ԁF%2X\n", r);
   printf("�΁F%2X\n", g);
   printf("�F%2X\n", b);

   return 0;
}
