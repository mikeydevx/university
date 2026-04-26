#include <stdio.h>
int sumar(int n1, int n2)
{    
    return n1 +n2;
}
int restar(int n1, int n2)
{
    return n1-n2;
}

int multiplicar(int n1, int n2)
{
    return n1*n2;
}

float dividir(int n1, int n2)
{
    float r=(float)n1/n2;
    return r;
}

int main(){
    int n1, n2, opcion;
    int resultado=0;
    float resultado2=0;

    printf("Ingresa el numero 1: ");
    scanf("%d", &n1);
    printf("Ingresa el numero 2: ");
    scanf("%d", &n2);

    printf("1. Suma, 2.Resta, 3.Multiplicacion, 4.Division\n");
    printf("Que quieres hacer: ");
    scanf("%d", &opcion);

    switch (opcion)
    {
    case 1:
        resultado=sumar(n1, n2);
        printf("El resultado es: %d", resultado);
        break;
    case 2:
        resultado=restar(n1, n2);
        printf("El resultado es: %d", resultado);
        break;
    case 3:
        resultado=multiplicar(n1, n2);
        printf("El resultado es: %d", resultado);
        break;
    case 4:
        resultado2=dividir(n1, n2);
        printf("El resultado es: %f", resultado2);
        break;
    
    default:
        break;
    }

    
    
}