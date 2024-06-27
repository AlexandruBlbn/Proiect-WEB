#include <stdio.h>
#include <stdlib.h>

///Să se descompună un număr întreg în cifrele care îl alcătuiesc,
///cu memorarea lor în elementele unui tablou. Să se afişeze elementele tabloului.


int main()
{
    int x, a[25];
    int n=0;
    printf("Introduce-ti numarul : ");
    scanf("%d", &x);

    while(x)
    {
        a[n++]=x%10;
        x=x/10;

    }
    int i;
    for(i=n-1;i>=0;i--)
        printf("%d ",a[i]);
    return 0;
}
