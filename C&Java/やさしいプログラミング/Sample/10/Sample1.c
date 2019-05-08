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
page* makeNode(page *p, char *w);
void displayNode(page *p);
void releaseNode(page *p);

page *root;

int main(void)
{
   printf("作成します。\n");
   init();
   printf("表示します。\n");
   display();
   release();

   return 0;
}

void init(void)
{
   int s, i;
   char w[50];

   s = 0;
   printf("何ページありますか?\n");
   scanf("%d", &s);

   root = NULL;
 
   for(i=1; i<=s; i++){
      printf("入力してください。\n");
      scanf("%s", w);
      root = makeNode(root, w);
   }
}
void display()
{
   displayNode(root);
}
void release()
{
   releaseNode(root);
}
page* makeNode(page *p, char *w)
{
   if(p == NULL){
      p = (page *)malloc(sizeof(page));
      if(p == NULL){
         printf("メモリを確保できませんでした。\n");
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
void displayNode(page *p)
{
   if(p != NULL){
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