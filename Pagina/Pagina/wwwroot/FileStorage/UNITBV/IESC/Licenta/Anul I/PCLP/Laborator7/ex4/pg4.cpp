#include <iostream>

/* Creati o structura de campuri de biti ptr un intreg, inclusa intr-o uniune. Cititi un intreg si afisati corespondentul binar.
Afisati valoarea in baza 10 dupa rotirea la stanga cu un octet.
*/

using namespace std;

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
    unsigned b16:1;
    unsigned b17:1;
    unsigned b18:1;
    unsigned b19:1;
    unsigned b20:1;
    unsigned b21:1;
    unsigned b22:1;
    unsigned b23:1;
    unsigned b24:1;
    unsigned b25:1;
    unsigned b26:1;
    unsigned b27:1;
    unsigned b28:1;
    unsigned b29:1;
    unsigned b30:1;
    unsigned b31:1;
} intreg;

typedef union{
    int i;
    intreg x;
    } dateInt;



int main()
{

    dateInt nr;
    cin>>nr.i;

    cout<<nr.x.b31<<nr.x.b30<<nr.x.b29<<nr.x.b28<<nr.x.b27<<nr.x.b26<<nr.x.b25<<nr.x.b24<<nr.x.b23<<nr.x.b22<<nr.x.b21<<nr.x.b20<<nr.x.b19
    <<nr.x.b18<<nr.x.b17<<nr.x.b16<<nr.x.b15<<nr.x.b14<<nr.x.b13<<nr.x.b12<<nr.x.b11<<nr.x.b10<<nr.x.b9<<nr.x.b8<<nr.x.b7<<nr.x.b6<<nr.x.b5
    <<nr.x.b4<<nr.x.b3<<nr.x.b2<<nr.x.b1<<nr.x.b0<<endl;

    unsigned aux1= nr.x.b31;
    unsigned aux2 =nr.x.b30;
    unsigned aux3 =nr.x.b29;
    unsigned aux4 =nr.x.b28;
    unsigned aux5 =nr.x.b27;
    unsigned aux6 =nr.x.b26;
    unsigned aux7 =nr.x.b25;
    unsigned aux8 =nr.x.b24;

    nr.i = nr.i<<8;

    nr.x.b7 =aux1;
    nr.x.b6 =aux2;
    nr.x.b5 =aux3;
    nr.x.b4 =aux4;
    nr.x.b3 =aux5;
    nr.x.b2 =aux6;
    nr.x.b1 =aux7;
    nr.x.b0 =aux8;


    cout<<"Dupa rotiri "<<nr.i;
return 0;
}
