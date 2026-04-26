#include <stdio.h>
int main()
{
    int nAlumnos, nNotas;
    float sumaCali = 0, promedio=0;
    printf("Ingresa el numero de alumnos: ");
    scanf("%d", &nAlumnos);
    printf("Ingresa el numero de notas: ");
    scanf("%d", &nNotas);

    float matriz[nAlumnos][nNotas];
    float arregloPromedios[nAlumnos];

    for (int i = 0; i < nAlumnos; i++) // filas
    {

        printf("Ingresa las notas del alumno: %i\n", i+1);

        for (int j = 0; j < nNotas; j++) // columnas
        {
            printf("Ingresa la nota #%i: ", j+1);
            scanf("%f", &matriz[i][j]);
        }
    }

    printf("\n");

    for (int i = 0; i < nAlumnos; i++) // filas
    {
        sumaCali = 0;
        for (int j = 0; j < nNotas; j++) // columnas
        {
            sumaCali = sumaCali + matriz[i][j];
            promedio = sumaCali / nNotas;
        }
        arregloPromedios[i] = promedio;
    }

    sumaCali = 0;

    for (int i = 0; i < nAlumnos; i++)
    {

        printf("Promedio alumno #%d es: %.1f\n", i+1, arregloPromedios[i]);
        sumaCali = sumaCali + arregloPromedios[i];
        promedio = sumaCali / nAlumnos;
    }

    printf("EL promedio de todos es: %.1f\n", promedio);
}