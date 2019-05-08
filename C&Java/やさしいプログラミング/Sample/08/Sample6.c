#include <stdio.h>
#include <stdlib.h>

#define SIZE 10

void init(void);
void add(void);
void delete(void);
void display(void);
void release(void);
int hash(int n);

typedef struct _chain{
   int data;
   struct _chain *next;
}chain;

chain *hashtable[SIZE];

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--追加\t2--削除\t3--表示\t0--終了\n");
      scanf("%d", &res); 
      if (!res){
         break;
      }
      switch(res){
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
  release();

  return 0;
}

void init(void)
{
   int i;

   for(i=0; i<SIZE; i++){
      hashtable[i] = NULL;
   }
}
void display(void)
{
   chain *c;
   int i;

   printf("---\n");
   for(i=0; i<SIZE; i++){
      c = hashtable[i];
      printf("0");
      while(c != NULL){
         printf("-%d", c->data);
         c = c->next;
      }
      printf("\n");
   }
   printf("---\n");
}
void add(void)
{
   chain *c;
   int n, h;

   printf("整数を入力してください。\n");
   scanf("%d", &n);
   h = hash(n);

   c = (chain *)malloc(sizeof(chain));

   c->data = n;
   c->next = hashtable[h];
   hashtable[h] = c;
   printf("%dを追加しました。\n", c->data);
}
void delete(void)
{
   int n, h;
   chain *c, *prev;

   printf("どのデータを削除しますか？\n");
   scanf("%d", &n);
   h = hash(n);
       
   c = hashtable[h];
   prev = hashtable[h];

   while(c != NULL){
      if(c->data == n){
         if(c == hashtable[h]){
            hashtable[h] = c->next;
         }
         else{
            prev->next = c->next;
         }
         printf("%dを取り出しました。\n", c->data);
         free(c);
         return ;
      }
      prev = c;
      c = c->next;
   }
   printf("みつかりませんでした。\n");
}

int hash(int n)
{
   return n % SIZE;
}

void release(void)
{
   chain *c, *tmp;
   int i;

   for(i=0; i<SIZE; i++){
   c = hashtable[i];
   tmp = hashtable[i];
      while(c != NULL){
         tmp = c->next;
         free(c);
         c = tmp;
      }
   }
}
