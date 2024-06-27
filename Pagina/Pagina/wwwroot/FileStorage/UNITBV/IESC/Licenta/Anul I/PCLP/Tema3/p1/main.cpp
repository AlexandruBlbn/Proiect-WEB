#include <iostream>
const  float g=9.8;

using namespace std;
int x;
int main()
{
    float y=23.5685;
    float m;

    x=10;
    cout<<x<<" "<<y<<" "<<&x<<" "<<&y<<" "<<sizeof(x)<<" "<<sizeof(y)<<endl;

    cin>>m;
    cout<<"greutatea :"<<m*g;

    if(m*g>100)
        cout<<"este mai mare de 100N";
    else
        cout<<"este mai mica de 100N";
    return 0;
}
