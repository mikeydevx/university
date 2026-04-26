#include <stdio.h>
int main()
{
    float meta;
    float cantidadAhorrar;
    int nSema = 1;
    float sumaAhorro = 0;
    float cantidadFaltante = 0;
    float totalAhorro = 0;
    float promedioAhorro = 0;

    printf("***SISTEMA DE AHORRO***\n");

    do
    {
        printf("Meta: ");
        scanf("%f", &meta);

        if (meta <= 0)
        {
            printf("La meta debe ser mayor a 0, vuelve a intentarlo");
        }
    } while (meta <= 0);

    do
    {

        printf("\nAhorro Semana %d:", nSema);
        scanf("%f", &cantidadAhorrar);
        sumaAhorro = sumaAhorro + cantidadAhorrar;
        nSema = nSema + 1;
        cantidadFaltante = meta - sumaAhorro;
        if (cantidadFaltante >= 0)
        {
            printf("\n(Faltan $%.2f)\n", cantidadFaltante);
        }

        totalAhorro = sumaAhorro;

    } while (sumaAhorro < meta);

    nSema = nSema - 1;
    promedioAhorro = sumaAhorro / nSema;

    printf("Felicidades: Meta alcanzada\n");
    printf("Lo lograste en %d semanas, con un ahorro total de %.2f\n", nSema, totalAhorro);
    printf("Con un promedio cada semana $%.2f", promedioAhorro);

    return 0;
}