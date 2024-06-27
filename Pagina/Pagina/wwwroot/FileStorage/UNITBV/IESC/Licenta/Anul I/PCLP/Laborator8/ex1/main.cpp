#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream f("date.in");
    ofstream g("date.out");
    int x;
    while(!f.eof())
    {
     f>>x;
     if(x>0)
        g<<x<<" ";
    }
    f.close();
    g.close();
    return 0;
}
