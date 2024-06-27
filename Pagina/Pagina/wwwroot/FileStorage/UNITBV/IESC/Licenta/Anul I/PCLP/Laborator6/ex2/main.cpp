#include <iostream>

using namespace std;

int* citire(int *tab,int n)
{
    tab=new int[n];
    for(int i=0;i<n;i++)
     cin>>tab[i];
   return tab;
}
void afisare(int* tab,int n)
{
    for(int i=0;i<n;i++)
        cout<<tab[i]<<" ";
        cout<<endl;
}
void Fibbonaci(int* tab,int n)
{
    int verificare=1;
    if(tab[0]!=0 || tab[1]!=1)
         verificare=0;
    for(int i=2;i<n;i++)
        if(tab[i]!=tab[i-1]+tab[i-2])
                verificare=0;
    if(verificare==1)
        cout<<"este un sir fibonacci\n";
    else
        cout<<"sirul nu este fibonnacci\n";

}
void afisare2(int* tab,int n,int x)
{
    for(int i=0;i<n;i++)
        cout<<tab[i]*x<<" ";
}
int main()
{
    int n;
    cout<<"Numarul de elemente : ";
    cin>>n;
    int *tab;
    tab = citire(tab,n);
    afisare(tab,n);
    Fibbonaci(tab,n);
    int x;
    cin>>x;
    afisare2(tab,n,x);
    return 0;
}
