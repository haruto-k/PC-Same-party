/* powerŠÖ”‚Ì’è‹` */
int power(int x, int y)
{
   int i;
   int pow = 1; 

   for(i=1; i<=y; i++){
      pow = pow * x;
   }
   return pow;
}
