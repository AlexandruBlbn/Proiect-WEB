#include <iostream>
#include <fstream>
#include <conio.h>
#include <string.h>
using namespace std;

int main()
{
    fstream f ;
    f.open("date.txt", ios::in);
    if(f.is_open())
    {
        char nume[25], prenume[25];
        int i=0;
        while(!f.eof())
        {
            i++;
            if(i%10==0)
                getch();
            f>>nume>>prenume;
            cout<<nume<<" "<<prenume<<endl;
        }
        cout<<"Numarul de persoane este:"<<i;
        char numec[25];
        cout<<endl<<"Nume cautat: ";
        cin>>numec;
        f.close();
        f.open("date.txt", ios::in);
        int gasit=0;

        while(!f.eof())
        {
            f>>nume>>prenume;
            if(strcmp(nume, numec)==0)
                cout<<nume<<" "<<prenume<<endl,gasit=1;
        }
        if(gasit==0)
            cout<<"nu exista";
        f.close();
    }

    return 0;
}
