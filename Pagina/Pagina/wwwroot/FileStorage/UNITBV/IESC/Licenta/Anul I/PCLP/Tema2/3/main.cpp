#include <iostream>

/**
Creați un tip de date definit de utilizator pentru un dreptunghi (lungime și lățime).
Afișați perimetrul și aria pentru un dreptunghi ale căror date sunt citite de la tastatură.
Perimetru: P = 2*L + 2*l;
Aria: A = L*l;
 */

using namespace std;

int main()
{
struct dreptunghi
{
    float l,L;
};
dreptunghi x;
cin>>x.l>>x.L;
cout<<"Perimetru = "<<2*(x.l+x.L);
cout<<endl;
cout<<"Aria = "<<x.l*x.L;
    return 0;
}
