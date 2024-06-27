#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x,i;
    scanf("%d",&x);
    for(i=0;i<=9;i++)
    {
        int aux=x;
        int nr=0;

        do
        {
           if(aux%10==i)
                nr++;
            aux=aux/10;
        }while(aux!=0);
        if(nr!=0)
        printf("Cifra %d s-a afisat de : %d \n",i,nr);
    }

    return 0;
}
