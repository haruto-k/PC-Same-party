#include <stdio.h>

#define SIZE 10

void displayData(int data[]);

int main()
{
   int data[SIZE] = {9,3,2,0,8,7,5,6,1,4};
   int i, j, tmp;

   printf("---");
   displayData(data);

   for(i=1; i<SIZE; i++){   
      tmp = data[i];
      j = i;
         
      while(data[j-1]>tmp && j>=1){
         data[j] = data[j-1];
         j--;
      }

      data[j] = tmp;

      printf("%d--", i);
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
