#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _page{
   char word[50];
   struct _page *left;
   struct _page *right;
}page;

void init(void);
void display(void);
void release(void);
void add(void);
void delete(void);
page* makeNode(page *p, char *w);
page* deleteNode(page *p, char *w);
page* searchMin(page *p);
void displayNode(page *p);
void releaseNode(page *p);

page *root;

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--�ǉ�\t2--�폜\t3--�\��\t0--�I��\n");
      scanf("%d", &res); 
      if(!res){
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
   root = NULL;
}
void release(void)
{
   releaseNode(root);
}
void add(void)
{
   char w[50];

   printf("�f�[�^����͂��Ă��������B\n");
   scanf("%s", w);
   root = makeNode(root, w);
}
void delete(void)
{
   char w[50];

   printf("�ǂ̃f�[�^���폜���܂����H\n");
   scanf("%s", w);
   root = deleteNode(root, w);
}
void display(void)
{
   printf("---\n");
   displayNode(root);
   printf("---\n");
}
page* makeNode(page *p, char *w)
{
   if(p == NULL){
      p = (page *)malloc(sizeof(page));
      if(p == NULL){
         printf("���������m�ۂł��܂���ł����B\n");
         return p;
      }
      strcpy(p->word, w);
      p->left = NULL;
      p->right = NULL;
   }
   else if(strcmp(w, p->word) <= 0){
      p->left = makeNode(p->left, w);
   }
   else{
      p-> right = makeNode(p->right, w);
   }
   return p;
}
page* deleteNode(page *p, char *w)
{
   page *x;
   if (p == NULL){
      printf("�݂���܂���ł����B\n");
      return NULL;
   }
   else if(strcmp(w, p->word) < 0){
      p->left = deleteNode(p->left, w);
      return p;
   }
   else if(strcmp(w, p->word) > 0){
      p->right = deleteNode(p->right, w);
      return p;
   }
   else{
      if(p->left == NULL && p->right == NULL){
         free(p);
         printf("�폜����܂����B\n");
         return NULL;
      }
      else if(p->left == NULL){
         x = p->right;
      }
      else if(p->right == NULL){ 
         x = p->left;
      }
      else{
         x = searchMin(p->right);
         x->left = p->left;
         x->right = p->right;
       }
       free(p);
       printf("�폜����܂����B\n");
       return x;
   }
}

page* searchMin(page *p)
{
   page *x;

   while(p->left != NULL){
      p = p->left;
   }
   x = p;
   p = p-> right;
   return x;
}
void displayNode(page *p)
{
   if(p !=NULL){
      displayNode(p->left);
      printf("%s\n", p->word);
      displayNode(p->right);
   }
}
void releaseNode(page *p)
{
   if(p != NULL){
      releaseNode(p->left);
      releaseNode(p->right);
      free(p);
   }
}
