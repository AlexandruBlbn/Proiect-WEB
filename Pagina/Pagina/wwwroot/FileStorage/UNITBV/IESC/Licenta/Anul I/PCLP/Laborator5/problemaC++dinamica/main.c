#include <stdio.h>
#include <stdlib.h>

int main()
{ float *temp;
    if(temp==NULL)
    {
        printf("\nAlocare imposibila");
        return 0;
    }
    else
    {
        printf("\nS-au alocat %d octeti",1000*sizeof(float));
    }

     int i,n,nr=0;
     printf("\nCate temperaturi veti introduce? ");
     scanf("%d",&n);
   temp=malloc(n*sizeof(float));
     for(i=0;i<n;i++)
     {
        printf("temperatura %d: ", i+1);
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
     free(temp);
    return 0;
}
