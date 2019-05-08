#include <stdio.h>

#define SIZE 10

void quickSort(int l, int r, int data[]);
void displayData(int data[]);

int main(void)
{
   int data[SIZE] = {3,2,5,8,1,7,4,9,0,6};

   printf("---");
   displayData(data);

   quickSort(0, SIZE-1, data);

   return 0;
}

void quickSort(int l, int r, int data[])
{
   int i, j, p, t, tmp;

      i = l-1;
      j = r;
      p = data[r];

      if(r > l){
         while(1){  
            while(data[++i] < p);
            while(data[--j] > p && j>0);
            if(i >= j){
               break;
            }
            t = data[i];
            data[i] = data[j];
            data[j] = t;

       }

         tmp = data[i];
         data[i] = p;
         data[r] = tmp;

         printf("%d--", r);
         displayData(data);

         quickSort(l, i-1, data);
         quickSort(i+1, r, data);
      }
}
void displayData(int data[])
{
   int i;

   for(i=0; i<SIZE; i++){
      printf("%d", data[i]);
   }
   printf("\n");
}
