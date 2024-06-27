#include <iostream>
#include <math.h>
/*  Creati o structura care defineste un punct de coordonate x,y.
    Creati un program care citeste 2 puncte, le afiseaza si calculeaza distanta dintre ele.
            (Functii ptr citire, afisare, distante)
*/
using namespace std;
typedef struct
   {
       float x;
       float y;
   } punct;

   punct citeste()
   {
       punct p;

       cout<<"x = ";
       cin>>p.x;
       cout<<"y = ";
       cin>>p.y;

    return p;
   }

   void afiseaza(punct p)
   {
       cout<<"("<<p.x<<","<<p.y<<")"<<endl;
   }
    void distanta (punct p1, punct p2)
    {
        float d = sqrt(pow(p2.x - p1.x, 2) + pow(p2.y -p1.y, 2));
        cout<<endl<<"Distanta: "<<d;
    }
int main()
{
   punct p1, p2;

   p1=citeste();
   afiseaza(p1);

   p2=citeste();
   afiseaza(p2);

   distanta(p1,p2);
    return 0;
}
