#include <stdio.h>
int main()
{

    int tamanoArreglo;
    printf("Ingresa el tamaño del arreglo: ");
    scanf("%d", &tamanoArreglo);

    int arreglo1[tamanoArreglo];
    int arreglo2[tamanoArreglo];
    int arreglo3[2][tamanoArreglo];//[filas] [columnas]

    printf("Ingresa el dato del arrelgo #1\n");

    for (int i = 0; i < tamanoArreglo; i++)
    {
        printf("Ingresa el dato %d: ", i);
        scanf("%d", &arreglo1[i]);
    }

    printf("Ingresa el dato del arrelgo #2\n");

    for (int i = 0; i < tamanoArreglo; i++)
    {
        printf("Ingresa el dato %d: ", i);
        scanf("%d", &arreglo2[i]);
    }

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            arreglo3[i][j] = arreglo1[j];
        }
    }

    for (int i = 1; i < 2; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            arreglo3[i][j] = arreglo2[j];
        }
    }

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            printf("%d \t", arreglo3[i][j]);
        }
        printf("\n");
    }

    return 0;
}