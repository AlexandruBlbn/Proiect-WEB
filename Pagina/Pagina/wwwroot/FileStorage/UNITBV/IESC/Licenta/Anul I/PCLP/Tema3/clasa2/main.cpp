#include <iostream>

/**
Creați o clasa care definește o Persoană, prin nume, prenume, nickname, vârstă. Clasa mai conține constructori, destructori, funcție pentru afișarea datelor și supradefinirea operatorului +,
care returnează suma vârstelor a doua persoane.
În funcția main(), se vor citi datele unei familii de n persoane, se vor afișa datele și se va afișa suma vârstelor primului si ultimului membru al familiei.
clasa Persoana
{
private:
nume (sir de caractere);
prenume (sir de caractere);
nickname (sir de caractere);
varsta (intreg);
public:
constructor;
destructor;
void afiseaza();
int operator +(Persoana);
};
Exemplu:
n = 4
nume 0: Popescu
prenume 0: Mihai
nickname 0: tata
varsta 0: 30
nume 1: Popescu
prenume 1: Andreea
nickname 1: mama
varsta 1: 29
nume 2: Popescu
prenume 2: Alexandru
nickname 2: fratele
varsta 2: 5
nume 3: Popescu
prenume 3: Gabriela
nickname 3: sora
varsta 3: 2
Mihai Popescu, tata, 30 ani
Andreea Popescu, mama, 29 ani
Alexandru Popescu, fratele, 5 ani
Gabriela Popescu, sora, 2 ani
Suma varstelor este: 32 ani
 */

using namespace std;
class persoana
{
private:
    string nume;
    string prenume;
    string nickname;
    int varsta;
public:
    persoana();
    persoana(string n,string p,string ni,int v);
    ~persoana();
    void afisare();
    int operator+ (persoana d);
    int getvarsta();

};
persoana::persoana()
{
    nume="";
    prenume="";
    nickname="";
    varsta=0;
}
persoana::persoana(string n,string p,string ni,int v)
{
    nume=n;
    prenume=p;
    nickname=ni;
    varsta=v;
}
persoana::~persoana()
{

}
void persoana::afisare()
{
    cout<<nume<<" "<<prenume<<" "<<nickname<<" "<<varsta;
}
int persoana::operator+(persoana d)
{
    int suma=0;
    suma=this->varsta+d.varsta;
    return suma;
}
int persoana::getvarsta()
{
    return varsta;
}
int main()
{
    string nume,prenume,nickname;
    int varsta;
    cin>>nume>>prenume>>nickname>>varsta;
    persoana d0(nume,prenume,nickname,varsta);
    d0.afisare();
    cin>>nume>>prenume>>nickname>>varsta;
    persoana d1(nume,prenume,nickname,varsta);
    cout<<"Suma este "<<d0+d1<<endl;
    cout<<"n persoane"<<endl;
    int n;
    cin>>n;
    int suma=0;
    persoana a[n];
    for(int i=0;i<n;i++)
    {
        cin>>nume>>prenume>>nickname>>varsta;
        a[i]=persoana(nume,prenume,nickname,varsta);
        if(i==0)
            suma=suma+a[i].getvarsta();
        if(i==n-1)
            suma=suma+a[i].getvarsta();
    }
    cout<<"Suma primului si al ultimei perosane este: "<<suma;



    return 0;
}
