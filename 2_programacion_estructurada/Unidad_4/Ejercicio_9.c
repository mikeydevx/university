#include <stdio.h>
#include <stdbool.h>
int main()
{

    int nFilas, nColumnas;
    int numero;
    bool esSimetrica = true;
    printf("Ingresa el n Filas: ");
    scanf("%d", &nFilas);
    printf("Ingresa el numero de columnas: ");
    scanf("%d", &nColumnas);

    if (nFilas != nColumnas)
    {
        printf("La matriz no es cuadrada ingresala bien.\n");
        return 0;
    }

    int matrizOriginal[nFilas][nColumnas];
    int matrizTranspuesta[nColumnas][nFilas];

    for (int i = 0; i < nFilas; i++)
    {
        for (int j = 0; j < nColumnas; j++)
        {
            printf("Ingresa el numero en la posicion [%d][%d]: ", i, j);
            scanf("%d", &numero);
            matrizOriginal[i][j] = numero;
        }
    }

    for (int i = 0; i < nFilas; i++)
    {
        for (int j = 0; j < nColumnas; j++)
        {
            matrizTranspuesta[j][i] = matrizOriginal[i][j];
            if (matrizOriginal[i][j] != matrizTranspuesta[j][i])
            {
                esSimetrica = false;
            }
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

    if (esSimetrica)
    {
        printf("\nLa matriz es simetrica.\n");
    }
    else
    {
        printf("\nLa matriz no es simetrica.\n");
    }

    return 0;
}