#include <stdio.h>

int main(void)
{
   int bt[256];
   int i, x, b;
   
   printf("ê≥êîÇì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢ÅB\n");
   scanf("%d", &x);

   b=0;
   while(x > 0){
      bt[b] = x % 2;
      x = x / 2;
      b++;
   }

   printf("2êiêîÇ…Ç∑ÇÈÇ∆");

   for(i=b-1; i>=0; i--){
      printf("%d", bt[i]);
   }

   printf("Ç≈Ç∑ÅB\n");

   return 0;
}

