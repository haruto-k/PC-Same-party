#include <stdio.h>
#include <stdlib.h>

#define EMPTY   0
#define DELETED 1
#define USED    2
#define SIZE   10

typedef struct _record{
   int data;
   int empty;
}record;

void init(void);
void add(void);
void delete(void);
void display(void);
int hash(int n);

record hashtable[SIZE];

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--追加\t2--削除\t3--表示\t0--終了\n");
      scanf("%d", &res); 
      if(!res){
         break;
      }
      switch(res){
            break;
         case 1:
            add();
            break;
         case 2:
            delete();
            break;
         case 3:
            display();
            break;
      }
   }

   return 0;
}

void init(void)
{
   int i;

   for(i=0; i<SIZE; i++){
      hashtable[i].data = 0;
      hashtable[i].empty = EMPTY;
   }
}
void display(void)
{
   int i;

   printf("---\n");
   for(i=0; i<SIZE; i++){
       printf("%d\n", hashtable[i].data);
   }
   printf("---\n");
}
void add(void)
{
   int n, h, i;

   printf("整数を入力してください。\n");
   scanf("%d", &n);
   h = hash(n);

   i = 0;
   while(hashtable[h].empty == USED){
      i++;
      if(i>=SIZE){
         printf("ハッシュテーブルが満杯です。\n");
         return;
      }
      h = hash(h+1);
   }
   hashtable[h].data = n;
   hashtable[h].empty = USED;
   printf("%dを追加しました。\n", hashtable[h].data);
}

void delete(void)
{
   int n, h, i;

   printf("どのデータを取り出しますか？\n");
   scanf("%d", &n);
   h = hash(n);
       
   i = 0;
   while(hashtable[h].empty != EMPTY){
      if(hashtable[h].empty == USED && hashtable[h].data == n){
         hashtable[h].empty = DELETED;
         printf("%dを取り出しました。\n",hashtable[h].data);
         hashtable[h].data = 0;
         return;
      }
      i++;
      if(i>=SIZE){
         printf("みつかりませんでした。\n");
         return;
      }
      h = hash(h+1);
   }
   printf("みつかりませんでした。\n");
}
int hash(int n)
{
    return n % SIZE;
}
