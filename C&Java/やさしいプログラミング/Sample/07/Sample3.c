#include<stdio.h>
#include<malloc.h>

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

   /* ���X�g�̍쐬*/
   s = 0;
   printf("���l�̃��X�g���쐬���܂���?\n");
   scanf("%d", &s);

   head = NULL;
 
   for(i=1; i<=s; i++){
      p = (person *)malloc(sizeof(person));
      if(p == NULL){
         printf("���������m�ۂł��܂���ł����B\n");
         return 1;
      }

      printf("��������͂��Ă��������B\n");
      scanf("%s", p->name);
      printf("�d�b�ԍ�����͂��Ă��������B\n");
      scanf("%s", p->phone);
      p->next = head;
      head = p;
   }

   /* ���X�g�̕\��*/
   printf("���X�g��\�����܂��B\n");
   p = head;
   while(p != NULL){
      printf("�����F%s\t�d�b�F%s\n", p->name, p->phone);
      p = p->next;
   }

   /* ���X�g�̉��*/
   p = head;
   tmp = head;
   while(p != NULL){
      tmp = p->next;
      free(p);  
      p = tmp;
   }

   return 0;
}
