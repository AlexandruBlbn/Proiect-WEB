#include <iostream>
#include <math.h>
using namespace std;


struct punct
{
    float x,y;
};

void citire( punct &n)
{

    cin>>n.x>>n.y;
}
void afisare(punct n)
{
    cout<<n.x<<" "<<n.y<<endl;
}

float  dist(punct n, punct m)
{
    return sqrt(pow(m.x-n.x,2)+ pow(m.y-n.y,2));
}
int main()
{
    punct n,m;
    citire(n);
    citire(m);
    afisare(m);
    afisare(n);
    float d=dist( n,m);
    cout<< d;
    return 0;
}
