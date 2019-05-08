#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _person{
   char name[50];
   char phone[50];
   struct _person *next;
}person;

void init(void);
void insert(void);
void search(void);
void delete(void);
void display(void);
void release(void);

person  *head;

int main(void)
{
   int res;

   init();

   while(1){
      printf("1--�ǉ�\t2--�폜\t3--�T��\t4--�\��\t0--�I��\n");
      scanf("%d", &res); 
      if(!res){
         break;
      }
      switch(res){
         case 1:
            insert();
            break;
         case 2:
            delete();
            break;
         case 3:
            search();
            break;
         case 4:
            display();
            break;
      }
   }
   release();

   return 0;
}

void init(void)
{
   head = NULL;
}
void insert(void)
{
   person *p;

   p = (person *)malloc(sizeof(person));
   if(p == NULL){
      printf("���������m�ۂł��܂���ł����B\n");
      return;
   }

   printf("��������͂��Ă��������B\n");
   scanf("%s",p->name);
   printf("�d�b����͂��Ă��������B\n");
   scanf("%s",p->phone);

   p->next = head;
   head = p;
}
void search(void)
{
   char name[50];
   person *p;

   printf("��������͂��Ă��������B\n");
   scanf("%s",name);

   p = head;
   while(p != NULL){
      if(strcmp(p->name, name) == 0){
         printf("�݂���܂����B\n");
         printf("�����F%s\t�d�b�F%s\n", p->name, p->phone);
         return;
      }
      p = p->next;
   }
   printf("�݂���܂���ł����B\n");
}
void delete(void)
{
   char name[50];
   person *p, *prev;

   printf("��������͂��Ă��������B\n");
   scanf("%s",name);

   prev = head;
   p = head;

   while(p != NULL){
      if(strcmp(p->name, name) == 0){
         if(p == head){
            head = p->next;
         }
         else{
            prev->next = p->next;
         }
         printf("�폜���܂����B\n");
         free(p);
         return;
      }
      prev = p;
      p = p->next;
   }
   printf("�݂���܂���ł����B\n");
}
void display(void)
{
   person *p;

   p = head;
   while(p != NULL){
      printf("�����F%s\t�d�b�F%s\n", p->name, p->phone);
      p = p->next;
   }
}
void release(void)
{
   person *p, *tmp;

   p = head;
   tmp = head;
   while(p != NULL){
      tmp = p->next;
      free(p);  
      p = tmp;
   }
}
