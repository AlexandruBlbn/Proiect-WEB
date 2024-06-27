#include <iostream>

using namespace std;

class persoana
{
private:
    string nume;
    char* prenume;
    int varsta;
public:
    persoana();
    persoana(string n,char *p, int v);
    ~persoana();
    void afisare();
};
persoana::persoana()
{
    nume="";
    prenume= new char[25];
    varsta=0;
}
persoana::persoana(string n,char *p, int v)
{
  nume=n;
  prenume=p;
  varsta=v;
}
persoana::~persoana()
{
    delete prenume;
}
void persoana::afisare()
{
    cout<<prenume<<" "<<nume<<", "<<varsta<<endl;
}
class student: public persoana
{
private:
    int an;
    string grupa;
public:
    student(string n, char *p, int v , int an,string g);
    ~student();
    void afisare();
    friend void colegi(student s1,student s2);

};
student::student(string n, char *p, int v , int a, string g):persoana(n,p,v)
{
    an=a;
    grupa=g;
}
student::~student()
{

}
void student::afisare()
{
    persoana::afisare();
    cout<<an<<", "<<grupa <<endl;
}

void colegi(student s1,student s2)
{
    if(s1.grupa==s2.grupa)
        cout<<"nu sunt colegi"<<endl;
    else
        cout<<"nu sunt colegi"<<endl;
}
int main()
{
   string n;
   char *p=new char[25];
   int v;
   cout<<"Nume:";
   cin>>n;
   cout<<"Prenume:";
   cin>>p;
   cout<<"Varsta:";
   cin>>v;
   persoana p1(n,p,v);
   p1.afisare();
   int an;
   string gr;
   cout<<"Nume:";
   cin>>n;
   cout<<"Prenume:";
   cin>>p;
   cout<<"Varsta:";
   cin>>v;
   cout<<"An:";
   cin>>an;
   cout<<"Grupa:";
   cin>>gr;
   student s1(n,p,v,an,gr);
   s1.afisare();
  cout<<"Nume:";
   cin>>n;
   cout<<"Prenume:";
   cin>>p;
   cout<<"Varsta:";
   cin>>v;
   cout<<"An:";
   cin>>an;
   cout<<"Grupa:";
   cin>>gr;
   student s2(n,p,v,an,gr);
   colegi(s1,s2);

   delete p;
    return 0;
}
