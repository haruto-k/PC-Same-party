#include <stdio.h>

#define SIZE 10

void displayData(int data[]);

int main(void)
{
   int data[SIZE] = {9,3,1,4,2,7,5,6,0,8};
   int h, i, j, tmp;

   printf("---");
   displayData(data);

   for(h=4; h>0; h/=3){
      for(i=h; i<SIZE; i++){   
         tmp = data[i];
         j = i;
         
         while(data[j-h]>tmp && j>=h){
            data[j] = data[j-h];
            j = j-h;
         }

         data[j] = tmp;

      }
      printf("%d--", h);
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


