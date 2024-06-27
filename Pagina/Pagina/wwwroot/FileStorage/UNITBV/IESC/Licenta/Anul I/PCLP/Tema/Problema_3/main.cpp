#include <iostream>
#include <cstring>


 /**Scrieți un program care citește o linie de text de la tastatură și calculează numărul de cuvinte în
  linie și numărul de apariții ale fiecarei litere. Un cuvânt este prin definiție orice șir de litere care este
  delimitat fie de blank, tab, newline, '.' (punct), ',' (virgula) sau de începutul liniei. Presupunem că linia de text
   introdusă conține numai litere, blank-uri, tab-uri, virgule și puncte. Literele mari și mici se consideră a fi aceeași literă.
    Afișați literele în ordine alfabetică și listați numai acele litere care apar în linia de text introdusă. De exemplu dacă linia de text introdusa este:
Azi e sambata
atunci va fi afisat:
3 cuvinte
a 4
b 1
e 1
i 1
m 1
s 1
t 1
z 1
*/
using namespace std;

int fr[36];
int main()
{
    char a[100];
    int nr=0;
    cin.getline(a,101);
    char *p=strtok(a," ,.!?");
    while(p)
    {
        nr++;
        for(int i=0;i<strlen(p);i++)
        {if(p[i]>='A' && p[i]<='Z')
                fr[p[i]-65]++;
                if(p[i]>='a' && p[i]<='z')
                fr[p[i]-97]++;
        }
        p=strtok(NULL," ,.!?");
    }
    cout<<nr<<" cuvinte";
    cout<<endl;

    for(int i=0;i<36;i++)
        if(fr[i])
    cout<<char(i+97)<<" = "<<fr[i]<<endl;

    return 0;
}
