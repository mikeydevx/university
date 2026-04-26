#include <stdio.h>

int compararEdad(int edad1, int edad2){
    int diferencia = edad1 - edad2;
    
    if (diferencia<0){
        diferencia = diferencia * -1;
    }

    return diferencia; 
}

int main (){
    int edad1; 
    int edad2;
    int resultado;

    printf("Ingresa la edad 1: ");
    scanf("%d", &edad1);
    printf("Ingresa la edad 2: ");
    scanf("%d", &edad2);

    resultado=compararEdad(edad1, edad2);

    printf("La diferencia es: %d", resultado);

    return 0;
}