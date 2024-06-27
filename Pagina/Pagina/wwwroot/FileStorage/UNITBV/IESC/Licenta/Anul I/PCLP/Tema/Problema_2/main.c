#include <stdio.h>
#include <stdlib.h>
#include <string.h>
///Se citeşte de la tastatură CNP-ul unei persoane. Să se afișeze sexul și data nașterii ale acelei persoane.



int main()
{
    char cnp[15];
    printf("CNP = ");
    scanf("%s", &cnp);

    if(cnp[0]=='1')
    printf("sexul masculin si data nasteri= %c%c.%c%c.19%c%c" ,cnp[5],cnp[6],cnp[3],cnp[4],cnp[1],cnp[2]);
    if(cnp[0]=='2')
    printf("sexul masculin si data nasteri= %c%c.%c%c.19%c%c" ,cnp[5],cnp[6],cnp[3],cnp[4],cnp[1],cnp[2]);
    if(cnp[0]=='3')
    printf("sexul masculin si data nasteri= %c%c.%c%c.18%c%c" ,cnp[5],cnp[6],cnp[3],cnp[4],cnp[1],cnp[2]);
    if(cnp[0]=='4')
    printf("sexul masculin si data nasteri= %c%c.%c%c.18%c%c" ,cnp[5],cnp[6],cnp[3],cnp[4],cnp[1],cnp[2]);
    if(cnp[0]=='5')
    printf("sexul masculin si data nasteri= %c%c.%c%c.20%c%c" ,cnp[5],cnp[6],cnp[3],cnp[4],cnp[1],cnp[2]);
    if(cnp[0]=='1')
    printf("sexul masculin si data nasteri= %c%c.%c%c.20%c%c" ,cnp[5],cnp[6],cnp[3],cnp[4],cnp[1],cnp[2]);


    return 0;
}
