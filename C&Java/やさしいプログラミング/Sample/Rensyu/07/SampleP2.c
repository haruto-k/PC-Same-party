#include <stdio.h>
#include <stdlib.h>

typedef struct _person{
   char name[50];
   char phone[50];
   struct _person *next;
}person;

person  *head;

int main(void)
{
   int s, i;
   person *p, *tmp;

   /* リストの作成*/
   s = 0;
   printf("何人のリストを作成しますか?\n");
   scanf("%d", &s);

   head = NULL;
 
   for(i=0; i<s; i++){
      p = (person *)malloc(sizeof(person));
      if(p == NULL){
         printf("メモリを確保できませんでした。\n");
         return 1;
      }

      printf("氏名を入力してください。\n");
      scanf("%s", p->name);
      printf("電話番号を入力してください。\n");
      scanf("%s", p->phone);
      p->next = head;
      head = p;
   }

   /* リストの表示*/
   printf("リストを表示します。\n");
   for(p = head; p != NULL; p = p->next){
      printf("氏名：%s\t電話：%s\n", p->name, p->phone);
   }

   /* リストの解放*/
   for(p = head, tmp = head; p != NULL; p = tmp){
      tmp = p->next;
      free(p);  
   }

   return 0;
}
