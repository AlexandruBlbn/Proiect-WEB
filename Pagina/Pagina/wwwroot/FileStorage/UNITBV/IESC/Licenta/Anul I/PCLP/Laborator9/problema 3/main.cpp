#include <iostream>
/// creati clasa angajat care contine infromatii depre in aganajt (nume prenume departamen si anaangajare).afisare an angajare
///un functia main cititi date pentru n angajati si care este cel mai vechi angajat
using namespace std;


class angajat
{
   private:
       string nume;
       string prenume;
       string departament;
       int an;
   public:
    angajat(string n,string p,string d,int m);
    angajat();
    ~angajat();
    void afisare();
    int getan();

};

angajat::angajat()
{
    nume="";
    prenume="";
    departament="";
    an=1924;
}
angajat::angajat(string n,string p,string d, int m)
{
  nume=n;
  prenume=p;
  departament=d;
  an=m;
}
angajat::~angajat()
{

}
void angajat::afisare()
{
    cout<<prenume<<" "<<nume<<", "<<departament<<", "<<an<<endl;
}
int angajat::getan()
{
    return an;
}

int main()
{
    int n;
    cin>>n;
    angajat *a= new angajat[n];
int     minim=2022;
    for(int i=0;i<n;i++)
    {
        string nume,prenume,departament;
        int an;
        cin>>nume>>prenume>>departament>>an;
        a[i]=angajat(nume,prenume,departament,an);
        a[i].afisare();
        if(a[i].getan()<minim)
            minim=a[i].getan();
    }
    cout<<minim;
    delete[]a;
    return 0;
}
