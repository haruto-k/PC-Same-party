#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _page{
   int data;
   struct _page *left;
   struct _page *right;
}page;

void init(void);
void release(void);
void display1(page *p);
void display2(page *p);
void display3(page *p);
page* makeNode(page *p, int i);
void releaseNode(page *p);

page *root;

int main(void)
{
   init();
   printf("中間順に出力します。\n");
   display1(root);
   printf("\n");
   printf("前順に出力します。\n");
   display2(root);
   printf("\n");
   printf("後順に出力します。\n");
   display3(root);
   printf("\n");
   release();

   return 0;
}

void init(void)
{
   int i;
   int data[10] = {5,3,4,1,2,0,7,6,8,9};

   root = NULL;
 
   for(i=0; i<10; i++){
      root = makeNode(root, data[i]);
   }
}
void release(void)
{
   releaseNode(root);
}
page* makeNode(page *p, int i)
{
   if(p==NULL){
      p = (page *)malloc(sizeof(page));
      p->data = i;
      p->left = NULL;
      p->right = NULL;
   }
   else if(i <= p->data){
      p->left = makeNode(p->left, i);
   }
   else{
      p-> right = makeNode(p->right, i);
   }
   return p;
}

void display1(page *p)
{
   if(p != NULL){
      display1(p->left);
      printf("%d", p->data);
      display1(p->right);
   }
}
void display2(page *p)
{
   if(p != NULL){
      printf("%d", p->data);
      display2(p->left);
      display2(p->right);
   }
}
void display3(page *p)
{
   if(p != NULL){
      display3(p->left);
      display3(p->right);
      printf("%d", p->data);
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

