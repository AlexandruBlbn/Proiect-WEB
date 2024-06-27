#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vector[]= {1,2,3,4,5,6,7,8,9,10};
    int *p;
    p=vector;

    printf("\n elementele vectorului cu referire prin index :");
    int i;
    for(i=0; i<10; i++)
        printf("%5d",vector[i]);

    printf("\nelementele vectorului cu referire prin adresa :");
    for(int i=0; i<10; i++)
        printf("%5d",*(vector+i));

    printf("\nelementele vectorului cu referire prin adresa , folosind pointerul p :");
    for(int i=0; i<10; i++)
        printf("%5d",*(p+i));

    printf("\nelementele vectorului cu referire prin index , folosind pointerul p :");
    for(int i=0; i<10; i++)
        printf("%5d",p[i]);

    printf("\n");
    printf("\n");

    int mat[2][3]= {{1,2,3},{4,5,6}};
    int *pmat,j;
    pmat=(int*)mat;
    for(i=0; i<2; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("%3d",*(pmat+i*3+j));
        }
        printf("\n");
    }

    return 0;
}
