#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _person{
   char name[50];
   char phone[50];
   struct _person *left;
   struct _person *right;
}person;

void init(void);
void add(void);
void delete(void);
void search(void);
void display(void);
void release(person *p);
person* makeNode(person *p, char *nm, char *ph);
person* deleteNode(person *p, char *nm);
person* searchMin(person *p);
void searchNode(person *p, char *nm);
void displayNode(person *p);

person *root;

int main(void)
{
   int res;

   init();
      
   while(1){
      printf("1--追加\t2--削除\t3--探索\t4--表示\t0--終了\n");
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
            search();
            break;
         case 4:
            display();
            break;
      }
   }
   release(root);

   return 0;
}

void init(void)
{
   root = NULL;
}
void add(void)
{
   char nm[50];
   char ph[50];

   printf("氏名を入力してください。\n");
   scanf("%s", nm);
   printf("電話を入力してください。\n");
   scanf("%s", ph);

   root = makeNode(root, nm, ph);
}
void delete(void)
{
   char nm[50];

   printf("氏名を入力してください。\n");
   scanf("%s", nm);
   root = deleteNode(root, nm);
}
void search(void)
{
   char nm[50];

   printf("氏名を入力してください。\n");
   scanf("%s", nm);
   searchNode(root, nm);
}
void display(void)
{
   displayNode(root);
}
void release(person *p)
{
   if(p != NULL){
      release(p->left);
      release(p->right);
      free(p);
   }
}
person* makeNode(person *p, char *nm, char *ph)
{
   if(p == NULL){
      p = (person *)malloc(sizeof(person));
      if(p == NULL){
         printf("メモリを確保できませんでした。");
         return p;
      }
      strcpy(p->name, nm);
      strcpy(p->phone, ph);
      p->left = NULL;
      p->right = NULL;
   }
   else if(strcmp(nm, p->name) <= 0){
      p->left = makeNode(p->left, nm, ph);
   }
   else{
      p-> right = makeNode(p->right, nm, ph);
   }
   return p;
}
person* deleteNode(person *p, char *nm)
{
   person *x;
   if (p == NULL){
      printf("みつかりませんでした。\n");
      return NULL;
   }
   if(strcmp(nm, p->name) < 0){
      p->left = deleteNode(p->left, nm);
      return p;
   }
   else if(strcmp(nm, p->name) > 0){
      p->right = deleteNode(p->right, nm);
      return p;
   }
   else{
      if(p->left == NULL && p->right == NULL){
         free(p);
         printf("削除されました。\n");
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
       printf("削除されました。\n");
       return x;
   }
}
person* searchMin(person *p)
{
   person *x;

   while(p->left != NULL){
      p = p->left;
   }
   x = p;
   p = p-> right;
   return x;
}
void searchNode(person *p, char *nm)
{
   if(p == NULL){
      printf("みつかりませんでした。\n");
   }
   else if(strcmp(nm, p->name) == 0){
      printf("氏名：%s\t電話：%s\n", p->name, p->phone);
   }
   else if(strcmp(nm, p->name) <= 0){
      searchNode(p->left, nm);
   }
   else{
      searchNode(p->right, nm);
   }
}
void displayNode(person *p)
{
   if(p != NULL){
      displayNode(p->left);
      printf("氏名：%s\t電話：%s\n", p->name, p->phone);
      displayNode(p->right);
   }
}



