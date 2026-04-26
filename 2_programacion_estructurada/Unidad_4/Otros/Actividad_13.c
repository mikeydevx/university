#include <stdio.h>

int calcularPromedio(int *arregloLatencias)
{
    int promedio=0, suma=0;

    for (int i = 0; i < 24; i++)
    {
        suma += arregloLatencias[i];
    }

    return promedio = suma / 24;
}

int identificarPicoAlto(int *arregloLatencias)
{

    int nMayor = arregloLatencias[0], pMayor = 0;

    for (int i = 0; i < 24; i++)
    {
        if (nMayor < arregloLatencias[i])
        {
            nMayor = arregloLatencias[i];
            pMayor = i;
        }
    }
    return nMayor;
}
int contarHoras(int *arregloLatencias)
{

    int contador = 0;

    for (int i = 0; i < 24; i++)
    {
        if (arregloLatencias[i] < 100)
        {
            contador++;
        }
    }

    return contador;
}

int main()
{

    int arregloLantencias[24];
    int opcion, resultado;

    for (int i = 0; i < 24; i++)
    {
        printf("Ingresa la latencia de la hora %d: ", i);
        scanf("%d", &arregloLantencias[i]);
    }
    printf("\n");

    do
    {
        printf("INGRESA UNA OPCION DEL MENU\n");
        printf("1.Promedio diario\n");
        printf("2.Picos de latencia\n");
        printf("3.Estabilidad\n");
        printf("0.Salir del programa\n");

        printf("\nIngresa la opcion a consultar: ");
        scanf("%d", &opcion);
        switch (opcion)
        {
        case 1:
            resultado = calcularPromedio(arregloLantencias);
            printf("EL promedio es: %d\n", resultado);
            printf("\n");
            break;
        case 2:
            resultado = identificarPicoAlto(arregloLantencias);
            int pMayor;

            for (int i = 0; i < 24; i++)
            {
                if (arregloLantencias[i] == resultado)
                {
                    pMayor = i;
                }
            }

            printf("La latencia mayor es: %d que esta en la posicion %d\n\n", resultado, pMayor);

            break;
        case 3:
            resultado = contarHoras(arregloLantencias);
            printf("EL numero de horas que estuvo el servidor por debajo de 100ms es: %d\n\n", resultado);
            break;
        case 0:
            printf("Saliendo...");
            break;
        default:
            printf("Opcion no valida");
            break;
        }
    } while (opcion != 0);

    return 0;
}