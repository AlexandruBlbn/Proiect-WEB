#include <iostream>

/* Creati o enumerare care defineste zilele saptamanii. Afisati in ce zi a saptamanii pica o data citita de la tastatura din luna noiembrie a anului curent
(1 noiembrie 2021 = Luni )

*/

using namespace std;
int main()
{
    typedef enum {Luni, Marti, Miercuri, Joi, Vineri, Sambata, Duminica} zile;

    cout<<"Data: ";
    int zi;
    cin>>zi;

    if(zi<1 || zi>30)
    {
        cout<<"Nu este o data calendaristica";
    }
    else
    {
        switch(zi%7)
        {
        case Luni:
            cout<<zi<<" noimebrie 201 = Luni";
        case Marti:
            cout<<zi<<" noimebrie 201 = Marti";
        case Miercuri:
            cout<<zi<<" noimebrie 201 = Miercuri";
        case Joi:
            cout<<zi<<" noimebrie 201 = Joi";
        case Vineri:
            cout<<zi<<" noimebrie 201 = Vineri";
        case Sambata:
            cout<<zi<<" noimebrie 201 = Sambata";
        case Duminica:
            cout<<zi<<" noimebrie 201 = Duminica";
        }
    }




return 0;
}
