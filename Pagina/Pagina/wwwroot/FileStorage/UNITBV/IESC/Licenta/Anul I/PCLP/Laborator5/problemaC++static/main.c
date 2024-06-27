#include <stdio.h>
#include <stdlib.h>
/// Creati un program in care se defineste  un vector cu maxim 1000 de elemente.Vectorul va contine temperatura in grade celsius la
/// diverse ore.Se va citi de la tastatura numarul de date introduse si datele respective.Sa se afiseze datele citite.Sa se afiseze cate date a dorit utilizaotrul  sa introduca.
///Sa se afiseze temperatura maxima si minima.Sa se afiseze media temperaturilor
int main()
{
     float temp[1000];
     int i,n,nr=0;
     printf("Cate temperaturi veti introduce? ");
     scanf("%d",&n);

     for(i=0;i<n;i++)
     {
        printf("temperatura %d: ", i);
        scanf("%f", &temp[i]);
        nr++;
     }


     for(i=0;i<n;i++)
        printf("\n %5.1f ", temp[i]);

        printf("\nS-au citit %d temperaturi",nr);

        float maxim=-100,minim=100,s=0;

        for(i=0;i<n;i++)
        {
            if(maxim<temp[i])
                maxim=temp[i];
            if(minim>temp[i])
                minim=temp[i];
                s=s+temp[i];
        }

    printf("\nTemperatura maxima este %5.1f", maxim);
    printf("\nTemperatura minima este %5.1f", minim);

    float media=s/nr;

     printf("\nTemperatura medie este %5.1f", media);


    return 0;
}
