#include <iostream>



/**
    Cititi de la tastatura 3 valori reale
    Creati u functie care verifica daca ele pot fi laturile unui triunghi,daca da, atunci verificati daca triunghiul dreptenghic sau echilateral,daca nu ,afisati un mesaj corespunzator

 */

using namespace std;
void afisare(float a,float b,float c)
{
    int ok=0;
    if(a+b>c && b+c>a && c+a>b)
    {
        cout<<"sunt laturile unui tringhi\n";
        ok=1;
    }
    else
        cout<<"nu sunt laturile unui  triunghi\n";

    if(ok==1)
    {
        if(a==b && b==c)
            cout<<"tringhiul este echilateral";
        if((a*a==b*b+c*c) || (b*b==c*c+a*a) || (c*c==b*b+a*a))
            cout<<"triunghiul este dreptunghic";
    }
}
int main()
{
    float a,b,c;
    cin>>a>>b>>c;
    afisare(a,b,c);
    return 0;
}
