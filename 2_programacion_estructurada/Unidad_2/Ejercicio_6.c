#include <stdio.h>

int main()
{

    char respuesta;
    int horasEstancia;
    int tipoVehiculo;
    int costoTarifa=0;
    char respuesta2;
    int totalPagar=0;
    int descuento=0;
    int cargoExtra=0;

    printf("El vehiculo tiene reporte de robo? (s/n): ");
    scanf("%c", &respuesta);

    if (respuesta == 's')
    {
        printf("BLOQUEO DE SALIDA");
        return 0;
    }
    else if (respuesta == 'n')
    {
        printf("CONTINUA\n");
    }
    else
    {
        printf("Respuesta no valida");
        return 0;
    }

    printf("Ingresa las horas de estancia: ");
    scanf("%d", &horasEstancia);

    if (horasEstancia <= 2)
    {
        costoTarifa = 30;
    }
    else
    {
        costoTarifa = 30 + (horasEstancia - 2) * 15;
    }

    printf("Ingrese tipo de vehículo (1-Moto, 2-Auto, 3-Van): ");
    scanf("%d", &tipoVehiculo);

    if (tipoVehiculo == 1)
    {
        cargoExtra = 0;
    }
    else if (tipoVehiculo == 2)
    {
        cargoExtra = 10;
    }
    else if (tipoVehiculo == 3)
    {
        cargoExtra = 25;
    }
    else
    {
        printf("Tipo de vehiculo invalido");
    }

    printf("Cuentas con tarjeta de descuento: ");
    scanf(" %c", &respuesta2);

    totalPagar = (costoTarifa + cargoExtra);

    if (respuesta2 == 's')
    {
        if (totalPagar > 100)
        {
            descuento = totalPagar * 0.20;
        }
        else if (totalPagar <= 100)
        {
            descuento = totalPagar * 0.10;
        }
    }
    else if (respuesta2 == 'n')
    {
        descuento = 0;
    }

    totalPagar = (costoTarifa + cargoExtra) - descuento;

    printf("Costo base por tiempo: %d\n", costoTarifa);
    printf("Cargo por tipo vehiculo: %d\n", cargoExtra);
    printf("Descuento aplicado: %d\n", descuento);
    printf("TOTAL A PAGAR: %d\n", totalPagar);

    return 0;
}