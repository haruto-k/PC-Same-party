#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define HEART    1
#define DIAMOND  2
#define SPADE    3
#define CLUB     4

int main(void)
{
   int game;

   srand((unsigned) time(NULL));

   game = rand() % 4 + 1;
  
   printf("�g�����v�̎D�𒲂ׂ܂��B\n");
   
   switch (game){
      case HEART:
        printf("�n�[�g�ł��B\n");
        break; 
      case DIAMOND:
        printf("�_�C���ł��B\n");
        break; 
      case SPADE:
        printf("�X�y�[�h�ł��B\n");
        break;
       case CLUB:
        printf("�N���u�ł��B\n");
        break;
      default:
          printf("%d\n", game);
   }

   return 0;
}
