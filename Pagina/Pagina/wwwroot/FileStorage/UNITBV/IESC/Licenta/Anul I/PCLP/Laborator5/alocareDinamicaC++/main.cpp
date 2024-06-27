#include <iostream>



/** Alocare dinamica de memorie in c++:

    In c++ alocarea de memorie se face folosind new
    var_ptr= new tip_date;
    var_ptr= new tip_date(alocare initiala);
    var_ptr=new tip_date[dim];

    In cazul in care nu s-a putut aloca memorie, rezultatul este NULL

    Eliberarea de memorie se face foloind delete;
    delete var_ptr;
    delete []var_ptr;
 */

using namespace std;

int main()
{

    float *p;
    p=new float[50];
    if(p==NULL)
        cout<<"Alocare imposibila";
    else
        cout<<"Alocare reusita";


    delete []p;
    cout<<endl;

    //alocare dinamica matrici varianta 1

    int *mat;
    mat=new int[2*3];
    if(mat==NULL)
        cout<<"Alocare imposibia";
    else
        cout<<"Alocare reusita";
    delete []mat;
    cout<<endl;
    //alocare dinamica matrici varianta 2

    int **mat2;

    mat2=new int*[2];
    int i;
    for(i=0;i<2;i++)
        mat2[i]=new int[3];

    //eliberare memorie pentru matrici

    for(i=0;i<2;i++)
        delete []mat2[i];
    delete []mat2;

    return 0;
}
