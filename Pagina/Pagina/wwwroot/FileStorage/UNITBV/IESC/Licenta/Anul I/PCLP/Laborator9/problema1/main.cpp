#include <iostream>

using namespace std;


/**
Clase si obiecte:
-bazata oe poo/oop
-principii:
         -incapsuklare:contopirea datelor cu codul, obtinand clase protectia datelor.
         -mostenire: pornind de la o clasa, putem crea alte seturi de clase.
         -polimorfismul:intr-o ierarhie de clase , putem avea functii definite in mai multe feluri

         Clasa = tip de date definit de utilizator, care asociaza  unor date un set de functii
         CLASA = DATE + FUNCTII

         Modificatori de acces:
         -public:membrul poate fi accesata de orice functie din domeniu
         -private: membrul poate i accesat doar de functiile membre sau prietene clasei
         -protected: membrul poate fi accesat de functiile membre sau prietene ale clasei, dar si de functiile mebre si prietene ale claselor derivate

 class numeClasa <: listaClasaDeBaza>
 {
 listaMembri
 }<listaVariabile>;
 */



 /**
 exemplu:
  class dreptunghi
 {
     private: int x,y;
     public: void perimetru();
             dreptunghi(); >>constructor
             dreptunghi(int x, int y);  >>constructor
             ~dreptunghi(); >> destructor
 };
  */

  /**
  Membri clasei sunt considerati implicit ca fiind private.
  Pentru definireaa functiilor membre se foloseste operatorul de rezolutie ::
   */

    /**
    void dreptunghi:: perimietru()
    {

    }
     */

    /**
    Accesul la membri sau functiile mebre se face folosind . sau -> (ca si in cazul structurilor sau uniunilor)


    Constructorii si destructorii sunt functii speciale pentru creearea , initializarea, distrugerea obiectelor de tipul unei clase
    Constructorul se apeleaza automat la crearea obiectului
    Destructorul se apeleaza automat la eliminarea obiectului la expirearea timpului de viata.

    Ambele au acelasi nume cu clasa si nu au tip returnat
    Nu pot fii mosteniti
    Constructorul poate avea sau nu parametrii si pot fii supradefiniti
    Deestructorul este precedat ~ si este unic

    exemplu :

    dreptunghi::dreptiunghi()
    {
    x=0;
    y=0;
    }

    Functii prietene
   -ofera acces la membrii private au unei clase
   -nu se mai respecta principiu incapsularii
  friend tip numefunctie(lista parametrii);

         Supradefinirea operatiilor
             tip operator simbolOp(listaParametrii)

    */

class dreptunghi
{
private:
    int x,y;
public:
    dreptunghi();
    dreptunghi(int x,int y);
    ~dreptunghi();
    int aria();
    int perimetru();
    int operator+ (dreptunghi d);

};
dreptunghi::dreptunghi()
{
    x=0;
    y=0;
    cout<<"Constrcutor fara parametri"<<endl;
}

dreptunghi::~dreptunghi()
{
    cout<<"Destructor"<<endl;
}

int dreptunghi::aria()
{
    return x*y;
}

int dreptunghi::perimetru()
{
    return 2*(x+y);
}
dreptunghi::dreptunghi(int x, int y)
{
    this->x=x;
    this->y=y;
}

int dreptunghi::operator+(dreptunghi d)
{
    int suma;
    suma=this->aria() + d.aria();
    return suma;
}
int main()
{
    dreptunghi d1;
    cout<<d1.aria()<<endl;
    cout<<d1.perimetru()<<endl;

    dreptunghi d2(5,4);
    cout<<d2.aria()<<endl;
    cout<<d2.perimetru()<<endl;


    dreptunghi *d3 = new dreptunghi(9,5);
    cout<<d3->aria()<<endl;
    cout<<d3->perimetru()<<endl;
 delete d3;

    dreptunghi *d4= new dreptunghi[5];
    d4[0]=dreptunghi(2,1);
    cout<<d4[0].aria()<<endl;
    delete []d4;

    cout<<"Suma este: " <<d1+d2<<endl;
    return 0;
}
