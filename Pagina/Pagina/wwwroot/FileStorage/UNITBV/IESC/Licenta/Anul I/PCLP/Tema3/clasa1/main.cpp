#include <iostream>




/**
1. Să se definească clasa Student, având membrii: nume, prenume și un tablou de 8 elemente, reprezentând notele la cursurile din primul semestru.
Se cere definirea constructorilor și destructorului necesari, a unei funcții de afișare a datelor în consolă și a unei funcții care calculează media studentului având în vedere că fiecărui curs îi
 corespunde un număr de credite:
int credite[] = {6, 4, 5, 2, 4, 2, 3, 4};
media = nota1*credite1 + nota2*𝑐𝑟𝑒𝑑𝑖𝑡𝑒2 + … + 𝑛𝑜𝑡𝑎8*𝑐𝑟𝑒𝑑𝑖𝑡𝑒830.
În funcția main(), se cere definirea a doua obiecte de tipul Student, citirea de la tastatură a datelor pentru cei 2 studenți, afișarea informațiilor și afișarea mediei pentru fiecare student.
*/
using namespace std;

class student
{
private:
    string nume;
    string prenume;
    float note[8];
public:
    student();
    ~student();
    student(string n,string p,float no[]);
    void afisare();
    int suma(float note[],float credite[]);
};
student::student()
{
    nume="";
    prenume="";
    for(int i=0;i<8;i++)
        note[i]=0;
}
student::student(string n,string p,float no[] )
{
    nume=n;
    prenume=p;
    for (int i=0;i<8;i++)
        note[i]=no[i];
}
student::~student()
{

}
void student::afisare()
{
    cout<<nume<<" "<<prenume<<" ";
    for(int i=0;i<8;i++)
        cout<<note[i]<<" ";
}
int student::suma(float note[],float credite[])
{
    float s=0;
    for(int i=0;i<8;i++)
        s=s+(note[i]*credite[i]);
    return  s;
}
int main()
{
    float credite[] = {6, 4, 5, 2, 4, 2, 3, 4};
    string nume,prenume;
    float note[8];
    cin>>nume>>prenume;
    for(int i=0;i<8;i++)
        cin>>note[i];
    student s1(nume,prenume,note);
    s1.afisare();
    cout<<endl;
    cout<<"Media studentului este "<<(float)s1.suma(note,credite)/30;
     cin>>nume>>prenume;
    for(int i=0;i<8;i++)
        cin>>note[i];
    student s2(nume,prenume,note);
    s2.afisare();
    cout<<endl;
    cout<<"Media studentului este "<<(float)s2.suma(note,credite)/30;

    return 0;
}
