#include <stdio.h>
#include <stdlib.h>

int main (){

    FILE *archivo;
    archivo = fopen("Archivos TXT/numeros.txt", "r");

    if (archivo==NULL){
        printf("ERROR");
        return 1;
    }

    char linea[4];
    int contador=0, suma=0;
    float promedio=0; 

    while (fgets(linea, sizeof(linea), archivo)!=NULL)
    {
        printf("%s", linea);
        suma=suma+atoi(linea); //ascii to int
        contador=contador+1;
    }

    promedio=suma/contador;

    printf("La suma es: %d\n EL promedio es: %.2f", suma, promedio);

    fclose(archivo);

    return 0;
    
    
    
}