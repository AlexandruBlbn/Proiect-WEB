#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/**
Un șir care citit de la cap la coadă și de la coadă la cap este același se numește palindrom (exemplu: radar).
Scrieți un program care citește un șir de caractere de la tastatură și decide dacă este sau nu palindrom.
 */

int main()
{
    char a[100];
    scanf("%s",&a);
    int i,ok=0;
    int n=strlen(a);

    for(i=0;i<n/2;i++)
        if(a[i]==a[n-1-i])
                 ok=1;
    if(ok==1)
    printf("palindrom");
    else
        printf("nu este");
    return 0;
}
