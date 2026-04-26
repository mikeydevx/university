#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main()
{

    srand(time(NULL));
    int nFilas, nColumnas;
    printf("Ingresa el n Filas: ");
    scanf("%d", &nFilas);
    printf("Ingresa el numero de columnas: ");
    scanf("%d", &nColumnas);

    int matrizOriginal[nFilas][nColumnas];
    int matrizTranspuesta[nColumnas][nFilas];

    for (int i = 0; i < nFilas; i++)
    {
        for (int j = 0; j < nColumnas; j++)
        {
            matrizOriginal[i][j] = rand() % 100;
        }
    }

    for (int i = 0; i < nFilas; i++)
    {
        for (int j = 0; j < nColumnas; j++)
        {
            matrizTranspuesta[j][i] = matrizOriginal[i][j];
        }
    }

    printf("\nOrginal\n");

    for (int i = 0; i < nFilas; i++)
    {
        for (int j = 0; j < nColumnas; j++)
        {
            printf("%d \t", matrizOriginal[i][j]);
        }
        printf("\n\n");
    }

    printf("\nTranspuesta\n");

    for (int i = 0; i < nColumnas; i++)
    {
        for (int j = 0; j < nFilas; j++)
        {
            printf("%d \t", matrizTranspuesta[i][j]);
        }
        printf("\n");
    }
}