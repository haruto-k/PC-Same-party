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
  
   printf("トランプの札を調べます。\n");
   
   switch (game){
      case HEART:
        printf("ハートです。\n");
        break; 
      case DIAMOND:
        printf("ダイヤです。\n");
        break; 
      case SPADE:
        printf("スペードです。\n");
        break;
       case CLUB:
        printf("クラブです。\n");
        break;
      default:
          printf("%d\n", game);
   }

   return 0;
}
