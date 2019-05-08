#include <stdio.h>

/* add関数の宣言 */
void add(int *x1, int *x2, int a);

int main(void)
{
   int num1 = 0;
   int num2 = 0;
   int ad = 0;

   printf("2科目分の点数を入力してください。\n");
   scanf("%d", &num1);
   scanf("%d", &num2);

   printf("加算する点数を入力してください。\n");
   scanf("%d", &ad);

   add(&num1, &num2, ad);

   printf("%d点加算しましたので\n", ad);
   printf("科目1は%d点となりました。\n", num1);
   printf("科目2は%d点となりました。\n", num2);

   return 0;
}

/* add関数の定義 */
void add(int *x1, int *x2, int a)
{
   *x1 += a;
   *x2 += a;
}
