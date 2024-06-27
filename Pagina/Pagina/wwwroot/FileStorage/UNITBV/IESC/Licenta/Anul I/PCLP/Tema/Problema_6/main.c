#include <stdio.h>
#include <stdlib.h>



/**
Sã se întocmeascã un program în care se declară o matrice cu n linii şi m coloane. Se citesc de la tastatură valori pentru elementele matricei.
Se verifică dacă există două linii care conțin aceleași valori, în aceeași ordine. Dacă da, se elimină una dintre ele.
Se afişează matricea care rezultă.
 */

int main()
{
    int a[100][100],n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    int i,j,k;
    for(i=0; i<n; i++)
        for(j=0; j<m; j++)
            scanf("%d",&a[i][j]);

    for(i=0; i<n-1; i++)
    {
        for(k=i+1; k<n; k++)
        {
            int ok=1;
            for(j=0; j<m; j++)
            {
                if(a[i][j]!=a[k][j])
                    {
                        ok=0;
                        break;
                    }
            }
            if(ok==1)
            {
                int q;
                for (q=i; q<n-1; q++)
                    for(j=0; j<m; j++)
                        a[q][j]=a[q+1][j];
                     n--;
                     i--;
            }

        }
    }
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
                printf("%d ",a[i][j]);
            printf("\n");
        }
        return 0;
    }
