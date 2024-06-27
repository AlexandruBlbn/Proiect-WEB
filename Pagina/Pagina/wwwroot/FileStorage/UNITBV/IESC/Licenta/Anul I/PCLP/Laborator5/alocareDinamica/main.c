#include <stdio.h>
#include <stdlib.h>


/** Alocare dinamica de memorie

    functiile specifice se gasesc in <stdlib.h> si in <alloc.h>

    void* malloc(size_t nr_octeti);
    void* calloc(int nr_element,size_t nr_octeti_ptr_un_element);
    void* realloc(void* ptr, size_t marime);

    daca una dintre functiile de mai sus nu poate aloca memorie atunci returneaza NULL

    eliberarea de memorie se face folosind functia free:
    void free(void* ptr);


 */


int main()
{
    float *p;
    p = malloc(15*sizeof(float));
    if(p==NULL)
    {
        printf("\nAlocare imposibila");
        return 0;
    }
    else
    {
        printf("\nS-au alocat %d octeti",15*sizeof(float));
    }

    free(p);
    p= calloc(15,sizeof(float));
    if(p==NULL)
    {
        printf("\nAlocare imposibila");
        return 0;
    }
    else
    {
        printf("\nS-au alocat %d octeti",16*sizeof(float));
    }
    free(p);

    return 0;
}
