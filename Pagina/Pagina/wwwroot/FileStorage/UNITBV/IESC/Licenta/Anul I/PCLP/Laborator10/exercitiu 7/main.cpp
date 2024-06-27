#include <iostream>
#include <fstream>
using namespace std;

class locuinta
{
private:
    string tip;
    float mp;
    int camere;
public:
    ~locuinta()
    locuinta(string t,float m,int c);
    locuinta();
    void afisare();
    float mpMedie();
};

locuinta:: locuinta()
{
    tip=" ";
    mp=0;
    camere=0;
}
locuinta::locuinta(string t, float m int c)
{
    tip=t;
    mp=m;
    camere=c;
}
locuinta::~locuinta()
{

}

void locuinta:: afisare()
{
    cout<<tip<<" "<<mp<<" "<<camere<<endl;
}
float locuinta:: mpMedie()
{
    return mp/camere;
}
int main()
{

    ofstream f("locuinte.txt");
    int n;
    cout<<"nr loc";
    cin>>n;
    locuinte loc[n];
    for(int i=0;i<n;i++)
    {
        string tip;
        float mp;
        int camere;
        loc[i]=locuinta(tip,mp,camere)
        f<<tip<<" "<<mp<<" "<<camere<<endl;
    }

    for(int i=0;i<n;i++)
    {
        loc[i].afisare();
        cout<<"mp med:"<<loc[i].mpMedie();
    }
    f.close();
    return 0;
}
