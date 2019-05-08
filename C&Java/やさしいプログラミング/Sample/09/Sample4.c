#include <stdio.h>

#define SIZE 10

void displayData(int data[]);

int main(void)
{
   int data[SIZE] = {3,2,5,6,1,7,4,9,0,8};
   int i, j, tmp, min;

   printf("---");
   displayData(data);

   for(i=0; i<SIZE-1; i++){
      min = i;
      for(j=i+1; j<SIZE; j++){
         if(data[j] < data[min]){
            min = j;
         }
      }
      tmp = data[min];
      data[min] = data[i];
      data[i] = tmp;

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



