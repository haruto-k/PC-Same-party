#include <stdio.h>

#define SIZE 10

void downHeap(int p, int n);
void displayHeap(void);
 
int heap[SIZE+1] = {0,3,2,5,6,1,7,4,9,0,8};

int main(void)
{
   int i, tmp;

   printf("---");
   displayHeap();

   for(i=SIZE/2; i>=1; i--){
      downHeap(i, SIZE);
   }
   printf("---");
   displayHeap();

   for(i=SIZE; i>=1; i--){
      tmp =heap[i];
      heap[i] = heap[1];
      heap[1] = tmp;

      printf("%d--", i);
      displayHeap();
 
      downHeap(1, i-1);
   }

   return 0;
}

void downHeap(int p, int n)
{
   int c, tmp;

   c = p * 2;
   if(c > n){
      return;
   }
   if(c+1<=n && heap[c+1]>heap[c]){
      c++;
   }
   if(heap[p] < heap[c]){
      tmp = heap[p];
      heap[p] = heap[c];
      heap[c] = tmp;
      downHeap(c, n);
   }
}
void displayHeap(void)
{
   int i;

   for(i=1; i<SIZE+1; i++){
      printf("%d", heap[i]);
   }
   printf("\n");
}
