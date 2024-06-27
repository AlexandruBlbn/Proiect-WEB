#include <stdio.h>
#include <stdlib.h>



/** Să se scrie un program în care :
a. Se declară o matrice cu 3 x 4 reali.
b. Se afișează adresa de memorie la care este alocată matricea și cele la care sunt alocate liniile matricei.
c. Se citesc de la tastatura valori pentru elementele matricei.
d. Se afisează elementele matricei.
e. Se determină maximele de pe fiecare linie a matricei care se memorează într-un tablou unidimensiunal (dimensiunea = nr. de linii ale matricei) şi maximul dintre toate elementele matricei.
 */

int main()
{
    int a[3][4],i,j;
    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
            scanf("%d", &a[i][j]);
    }
    printf("Adresa matrici: %d",&a);
    printf("\nAdresa primei linii :%d",&a[0]);
    printf("\nAdresa a doua linii :%d",&a[1]);
    printf("\nAdresa a treia linii:%d",&a[2]);


    printf("\nMatricea este : \n");

    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
            printf("%d ",a[i][j]);
        printf("\n");
    }
    int b[3],n=0;
  for(i=0;i<3;i++)
  {
      int maxim=-1;
      for(j=0;j<4;j++)
          if(maxim<a[i][j])
            maxim=a[i][j];
      b[n++]=maxim;
  }
    int maxim2=-1;
  for(i=0;i<n;i++)
  {
    if(maxim2<b[i])
        maxim2=b[i];
  }



    return 0;
}
