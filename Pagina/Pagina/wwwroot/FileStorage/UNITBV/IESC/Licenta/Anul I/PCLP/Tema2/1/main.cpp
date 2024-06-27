#include <iostream>


/** Să se definească o structură ce reprezintă un număr complex (partea reală și partea imaginară).
z = a + b*i; a = partea reala, b = partea imaginara
Să se creeze funcții pentru citirea unui astfel de număr, pentru afișarea unui număr complex.
Să se creeze o funcție care calculează diferența a două numere complexe.
z1 = a1 - b1*i;
z2 = a2 - b2*i;
z1 - z2 = (a1 - a2) + (b1 - b2) * i;
Să se definească în funcția main() un tablou de n elemente de tip complex (numărul de elemente n și valorile numerelor complexe se vor citi de la tastatură).
Să se afișeze diferența dintre primele 2 numerelor complexe din tablou.
Să se afișeze pătratul fiecărui număr complex din tablou.
z = a + b*i;
z2 = (a2 – b2) + (2*a*b)*i;

 */

using namespace std;

 struct real
   {
       float a;
       float b;
   };
void citire(real &x,real &y)
{
    cin>>x.a>>x.b>>y.a>>y.b;
}
int main()
{
   real nr1;
   real nr2;
   citire(nr1,nr2);
   cout<<"Diferenta este : "<<nr1.a-nr2.a;
   if(nr1.b-nr2.b>0)
    cout<<"+"<<nr2.b-nr1.b<<"i";
   else
   cout<<"-"<<nr2.b-nr1.b<<"i";
   cout<<endl;

struct tablou
{
    float a1;
    float b1;
}s[100];
int n;
cin>>n;
for(int i=0;i<n;i++)
    cin>>s[i].a1>>s[i].b1;
cout<<"Diferenta dintre primele doua nr este : "<<s[0].a1-s[1].a1;
   if(s[0].b1-s[1].b1>0)
    cout<<"+"<<s[0].b1-s[1].b1<<"i";
   else
   cout<<s[0].b1-s[1].b1<<"i";
   cout<<endl;

   for(int i=0;i<n;i++)
   {
       cout<<s[0].a1*s[0].a1-(s[0].b1*s[0].b1);
       if((s[0].a1<0 && s[0].b1>0) || (s[0].a1>0 && s[0].b1<0) )
        cout<<2*s[0].a1*s[0].b1<<"i";
       else
        cout<<"+"<<2*s[0].a1*s[0].b1<<"i";
       cout<<endl;
   }




    return 0;
}
