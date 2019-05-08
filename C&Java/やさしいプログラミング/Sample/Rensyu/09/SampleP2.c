#include <stdio.h>

#define SIZE 10

void search(int l, int h, int n);

int data[SIZE] = {0,1,2,3,4,5,6,7,8,9};

int main(void)
{
   int n, l, h;

   printf("“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n");
   scanf("%d", &n);

   l = 0;
   h = 9;

   search(0, 9, n);

   return 0;
}
void search(int l, int h, int n)
{
   int m;

   if(l <= h){
      m = (l + h) / 2;
      if(data[m] == n){
         printf("%d”Ô–Ú‚É%d‚ª‚İ‚Â‚©‚è‚Ü‚µ‚½B\n", m+1, data[m]);
         return;
      }
      else if(data[m] < n){
         search(m+1, h, n);
      }
      else{
         search(l, m-1, n);
      }
   }
   else{
      printf("‚İ‚Â‚©‚è‚Ü‚¹‚ñ‚Å‚µ‚½B\n");
   }
}
