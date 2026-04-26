#include <stdio.h>

int main(){

    int numeros[2][2]={1,3,2,4};
    int suma=0; 

    for (int i = 0; i < 2; i++)
    {
        suma += numeros[i][1-0];
    }
    

    printf("Suma: %d", suma )
;
}