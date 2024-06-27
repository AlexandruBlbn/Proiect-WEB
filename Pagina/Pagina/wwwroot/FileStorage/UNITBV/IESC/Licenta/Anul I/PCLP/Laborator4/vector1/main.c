#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[10],i;
    for(i=0;i<10;i++)
    {

        scanf("%d", &a[i]);
    }
   int s=0,nr=0;
   for(i=0;i<10;i++)
   {
       s=s+a[i];
       nr++;
   }


   printf("media este : %.2f" , (float)s/nr);

   int nr0=0;
   for(i=0;i<10;i++)
    if(a[i]==0)
    nr0++;
   printf("\nNumarul de 0 = %d", nr0);

   int negative=0;
   for(i=0;i<10;i++)
    if(a[i]<0)
    negative++;
   printf("\nNumarul negative = %d", negative);

    int produsul=1;
    for(i=0;i<10;i++)
        produsul*=a[i];
   printf("\nProdusul = %d", produsul);

    return 0;
}
