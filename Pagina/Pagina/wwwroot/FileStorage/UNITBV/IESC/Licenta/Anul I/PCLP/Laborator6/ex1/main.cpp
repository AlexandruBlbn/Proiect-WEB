#include <iostream>

using namespace std;
void schimbare(int &a,int &b)
{
    int aux;
    aux=a;
    a=b;
    b=aux;
}
/**
void schimbare(int *a,int *b)
{
    int aux;
    aux=*a;
    *a=*b;
    *b=aux;
}
 */

int main()
{
    int a,b;
    cin>>a>>b;
    schimbare(a,b);///schimbare(&a,&b);
    cout<<a<<" "<<b;
    return 0;
}
