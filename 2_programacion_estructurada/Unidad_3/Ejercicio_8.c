#include <stdio.h>

void asignarDia(int numero)
{
    switch (numero)
    {
    case 1:
        printf("Lunes");
        break;
    case 2:
        printf("Martes");
        break;
    case 3:
        printf("Miercoles");
        break;
    case 4:
        printf("Jueves");
        break;
    case 5:
        printf("Viernes");
        break;
    case 6:
        printf("Sabado");
        break;
    case 7:
        printf("Domingo");
        break;

    default:
        printf("Numero no valido");
        break;
    }
}

int main()
{
    int numero; 

    printf("Ingresa el numero: ");
    scanf("%d", &numero);

    asignarDia(numero);

    return 0;
}
