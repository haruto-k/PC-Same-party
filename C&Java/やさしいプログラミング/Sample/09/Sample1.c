#include <stdio.h>

#define SIZE 10

int main(void)
{
   int data[SIZE] = {3,2,5,6,1,7,0,9,4,8};
   int n, i;

   printf("入力してください。\n");
   scanf("%d", &n);

   for(i=0; i<SIZE; i++){
      if(data[i] == n){ 
          break;
      }
   }

   if(i<SIZE){
      printf("%d番目に%dがみつかりました。\n", i+1, data[i]);
   }
   else{
      printf("みつかりませんでした。");
   }

   return 0;
}
