/**
 Tipuri de date definite de utilizator:
 declaratia typedef
 enumerare
 strcutra
 campurile de biti
 uniunea
 ENUMERAREA
 =ansamblu de constante intregi , asocitate unui indicator
 enum nume_nume{id_elem1<=const>,id_elem2,....}<lista_varabile;
 sau
 typedef enum{id_elem1<=const>,id_elem2,....} nume_enumeratie;

 STRUCTURA DE DATE
 =colectie de date cu nume comun
 struct nume_structura
 {
 tip_element nume_element;
 tip_element2 nume_elem2;
 }lista_variab;

 typedef struct
 {
 tip_elem 1 nume_elem1;
 ...
 }nume_struct;

 ELEMENTELE structurii se numesc campuri membri ai structurii;
 Membri pot fi de orice tip de date, exceptand tipul structurii de date
 */
#include <iostream>

using namespace std;

/**int main()
{
    cout<<"Exemplificare enumerare:"<<endl;

    enum culoare{rosu,albastru,verde,galben};

    culoare cul= albastru;
    cout<<"Codul pentru culoarea albastru este"<<" "<<cul;

    typedef enum {a,b,c=5,d,e,f=d+e}alfabet;

    alfabet litera=c;
    cout<<"Codul pentru a"<<" "<<a<<" "<<" Codul pentru c"<<" "<<litera;
    return 0;
}
*/
int main()
{
    cout<<"exemplificare structuri de date"<<endl;

    struct student{
        char* nume;
        char prenume[25];
        int nrMatricol;
    };

    student s1 = {"Popescu","Andreaa",155} ;
    cout<<"Studentul este: "<<s1.nume<<" "<<s1.prenume<<"cu nr "<<s1.nrMatricol<<endl;


    return 0;
}
