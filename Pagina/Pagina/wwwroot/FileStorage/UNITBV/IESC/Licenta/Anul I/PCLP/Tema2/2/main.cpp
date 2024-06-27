#include <iostream>

using namespace std;
/**
Să se definească o uniune cu un întreg și o structură de câmpuri de biți pe 2 octeți și să se afișeze în binar numărului întreg citit și valoarea în binar a dublului
numărului dacă numărul este mai mic sau egal decât 32767.
Exemplu:
nr = 511
Binar: 0000000111111111
Dublu binar: 0000001111111110
 */

int main()
{

typedef struct
{
    unsigned b0:1;
    unsigned b1:1;
    unsigned b2:1;
    unsigned b3:1;
    unsigned b4:1;
    unsigned b5:1;
    unsigned b6:1;
    unsigned b7:1;
    unsigned b8:1;
    unsigned b9:1;
    unsigned b10:1;
    unsigned b11:1;
    unsigned b12:1;
    unsigned b13:1;
    unsigned b14:1;
    unsigned b15:1;

} intreg;

typedef union{
    int i;
    intreg x;
    } dateInt;

    dateInt nr;
    cin>>nr.i;
    if(nr.i<32767)
    {
        unsigned aux=nr.x.b15;
        nr.i=nr.i<<1;
        nr.x.b0=aux;
    }
    cout<<"Numarul dublu este "<<nr.i;
    return 0;
}
