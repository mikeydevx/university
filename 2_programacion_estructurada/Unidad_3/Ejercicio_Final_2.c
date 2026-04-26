#include <stdio.h>
#include <string.h>
#include <stdbool.h>

// ==========================================
// FUNCIONES AUXILIARES
// ==========================================

int calcularFactorial(int n)
{
    if (n <= 1)
    {
        return 1;
    }
    else
    {
        return n * (calcularFactorial(n - 1));
    }
}

int calcularSumaRecursiva(int n)
{
    if (n <= 1)
    {
        return 1;
    }
    else
    {
        return n + (calcularSumaRecursiva(n - 1));
    }
}

int calcularPotencia(int base, int potencia)
{
    if (potencia <= 0)
    {
        return 1;
    }
    if (potencia == 1)
    {
        return base;
    }
    else
    {
        return base * (calcularPotencia(base, potencia - 1));
    }
}

void invertirCadena(char *cadena, int inicio, int ultimo)
{
    if (ultimo <= inicio)
    {
        return;
    }
    else
    {
        char temporal = cadena[inicio];
        cadena[inicio] = cadena[ultimo];
        cadena[ultimo] = temporal;
        invertirCadena(cadena, inicio + 1, ultimo - 1);
    }
}

bool verificarPalindromo(char *cadena, int inicio, int ultimo)
{

    if (ultimo <= inicio)
    {
        return true;
    }
    else
    {
        if (cadena[inicio] == cadena[ultimo])
        {
            return verificarPalindromo(cadena, inicio + 1, ultimo - 1);
        }
        else
        {
            return false;
        }
    }
}

// ==========================================
// Fuciones principales de cada ejercio
// ==========================================

void ejercicio11()
{
    int n;
    int resultado;
    printf("Ingres el numero: ");
    scanf("%d", &n);

    resultado = calcularFactorial(n);

    printf("El resultado es: %d", resultado);
}
void ejercicio12()
{
    int n;
    int resultado;
    printf("Ingres el numero: ");
    scanf("%d", &n);

    resultado = calcularSumaRecursiva(n);

    printf("El resultado es: %d", resultado);
}
void ejercicio13()
{
    int base;
    int potencia;
    int resultado;

    printf("Ingresa la base: ");
    scanf("%d", &base);
    printf("Ingresa la potencia: ");
    scanf("%d", &potencia);

    resultado = calcularPotencia(base, potencia);

    printf("El resultado es: %d", resultado);
}
void ejercicio14()
{
    char cadena[20];
    printf("Ingresa la cadena: ");
    scanf("%s", &cadena);
    int ultimo = (strlen(cadena)) - 1;
    invertirCadena(cadena, 0, ultimo);
    printf("Cadena invertida: %s", cadena);
}
void ejercicio15()
{
    char cadena[20];
    bool respuesta;
    printf("Ingresa la cadena a verificar: ");
    scanf("%s", &cadena);
    int ultimo = (strlen(cadena)) - 1;
    respuesta = verificarPalindromo(cadena, 0, ultimo);

    if (respuesta == true)
    {
        printf("Es un palindromo");
    }
    else
    {
        printf("No es un palindromo");
    }
}

// ==========================================
// FUNCION PRINCIPAL (MENU)
// ==========================================

int main()
{

    int opcion;

    do
    {
        printf("\n\n=== MENU DE EJERCICIOS ===\n");
        printf("11. Ejercicio 11 (Factoria)\n");
        printf("12. Ejercicio 12 (Suma de numeros)\n");
        printf("13. Ejercicio 13 (Potencia)\n");
        printf("14. Ejercicio 14 (Inversion de caracteres)\n");
        printf("15. Ejercicio 15 (Palindromo)\n");
        printf("0. Para salir\n");

        printf("\nSeleccione una opcion: ");
        scanf("%d", &opcion);

        switch (opcion)
        {
        case 11:
            ejercicio11();
            break;
        case 12:
            ejercicio12();
            break;
        case 13:
            ejercicio13();
            break;
        case 14:
            ejercicio14();
            break;
        case 15:
            ejercicio15();
            break;
        case 0:
            printf("Saliendo del programa...\n");
            printf("Saliste, ejecuta de nuevo si quieres");
            break;
        default:
            printf("Opcion invalida. Intenta de nuevo.");
            break;
        }

    } while (opcion != 0);

    return 0;
}