#include <stdio.h>

int main() {
    char nombre[100];
    int edad;

    printf("Ingresa tu nombre: ");
    scanf("%99s", nombre); 

    printf("Ingresa tu edad: ");
    scanf("%d", &edad);

    printf("Hola %s tienes la edad de %d\n", nombre, edad);

    return 0;

    
}
