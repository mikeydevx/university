#include <stdio.h>
int main()
{
    int cantidadNumeros;
    int escalar;

    printf("Ingresa el tamano del arreglo: ");
    scanf("%d", &cantidadNumeros);

    int arreglo1[cantidadNumeros];
    int arreglo2[cantidadNumeros];

    for (int i = 0; i < cantidadNumeros; i++)
    {
        printf("Ingresa el numero posion %d: ", i);
        scanf("%d", &arreglo1[i]);
    }

    printf("\nIngresa el escalar: ");
    scanf("%d", &escalar);

    for (int i = 0; i < cantidadNumeros; i++)
    {
        arreglo2[i] = arreglo1[i] * escalar;
    }

    printf("\nDatos arreglo 1\n\n");
    for (int i = 0; i < cantidadNumeros; i++)
    {
        printf("Posicion %d es: %d\n", i, arreglo1[i]);
    }
    printf("\nDatos arreglo 2 escalado\n\n");
    for (int i = 0; i < cantidadNumeros; i++)
    {
        printf("Posicion %d es: %d\n", i, arreglo2[i]);
    }

    return 0;
}