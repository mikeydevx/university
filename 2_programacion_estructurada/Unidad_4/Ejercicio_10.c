#include <stdio.h>
int main()
{
    int tamanoArreglo;
    int i, j, k = 0;
    printf("Ingresa el tamano del arreglo: ");
    scanf("%d", &tamanoArreglo);

    int arregloA[tamanoArreglo][tamanoArreglo];
    int arregloB[tamanoArreglo][tamanoArreglo];
    int arregloC[tamanoArreglo][tamanoArreglo];

    printf("Ingresa los datos del arreglo A\n");
    for (int i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            printf("Ingresa el dato %d,%d: ", i, j);
            scanf("%d", &arregloA[i][j]);
        }
    }

    printf("Ingresa los datos del arreglo B\n");

    for (i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            printf("Ingresa el dato %d,%d: ", i, j);
            scanf("%d", &arregloB[i][j]);
        }
    }

    for (int i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            arregloC[i][j] = 0;
        }
    }

    for (int i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            for (int k = 0; k < tamanoArreglo; k++)
            {
                arregloC[i][j] += arregloA[i][k] * arregloB[k][j];
            }
        }
    }

    printf("Arreglo A\n");

    for (int i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            printf("%d \t", arregloA[i][j]);
        }
        printf("\n");
    }

    printf("\n");

    printf("Arreglo B\n");

    for (int i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            printf("%d \t", arregloB[i][j]);
        }
        printf("\n");
    }

    printf("\n");
    printf("Arreglo C\n\n");

    for (int i = 0; i < tamanoArreglo; i++)
    {
        for (int j = 0; j < tamanoArreglo; j++)
        {
            printf("%d \t", arregloC[i][j]);
        }
        printf("\n");
    }

    return 0;
}