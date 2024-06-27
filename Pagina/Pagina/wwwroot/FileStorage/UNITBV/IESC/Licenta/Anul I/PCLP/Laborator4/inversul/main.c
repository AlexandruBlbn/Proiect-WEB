#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x;
    scanf("%d",&x);
    int y=0;
    while(x!=0)
    {
        y=y*10+x%10;
        x=x/10;
    }
    printf("inversul lui x este : %d",y);

    return 0;
}
