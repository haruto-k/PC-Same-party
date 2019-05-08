#include <stdio.h>

#define SIZE 10

void displayData(int data[]);

int main(void)
{
   int data[SIZE] = {9,3,5,4,1,7,2,6,0,8};
   int i, j, tmp;

   printf("---");
   displayData(data);

   for(i=0; i<SIZE-1; i++){
      for(j=SIZE-1; j>i; j--){
         if(data[j] < data[j-1]){
            tmp = data[j-1];
            data[j-1] = data[j];
            data[j] = tmp;
         }
       }
      printf("%d--", i+1);
      displayData(data);
   }

   return 0;
}

void displayData(int data[])
{
   int i;

   for(i=0; i<SIZE; i++){
      printf("%d", data[i]);
   }
   printf("\n");
}
