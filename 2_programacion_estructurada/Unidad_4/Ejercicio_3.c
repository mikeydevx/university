#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
int cantidadNumeros;
srand(time(NULL));

printf("Ingresa la cantidad de numeros que quieres generar: ");
scanf("%d", &cantidadNumeros);

int arregloNumeros[cantidadNumeros];

for (int i = 0; i < cantidadNumeros; i++)
{
    
    arregloNumeros[i]=rand()%100;
    printf("El numero en la posicion %d es: %d\n", i, arregloNumeros[i]);
}

int nMayor=arregloNumeros[0], pMayor=0;

for (int i = 0; i < cantidadNumeros; i++)
{
    if(nMayor<arregloNumeros[i]){
        nMayor=arregloNumeros[i];
        pMayor=i;
    }
}

printf("El numero mayor es: %d que esta en la posicion %d", nMayor, pMayor);


    return 0;
}