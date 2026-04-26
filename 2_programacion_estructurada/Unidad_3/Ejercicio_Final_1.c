#include <stdio.h>

// ==========================================
// FUNCIONES AUXILIARES
// ==========================================

// Ejercicio 1
int sumar_ej1(int n1, int n2)
{
    return n1 + n2;
}
int restar_ej1(int n1, int n2)
{
    return n1 - n2;
}
int multiplicar_ej1(int n1, int n2)
{
    return n1 * n2;
}
float dividir_ej1(int n1, int n2)
{
    return (float)n1 / n2;
}

// Ejercicio 2
int calcularMenor_ej2(int n1, int n2)
{
    if (n1 < n2)
        return n1;
    else
        return n2;
}

// Ejercicio 3
int calcularMenor_ej3(int n1, int n2)
{
    if (n1 < n2)
        return n1;
    else
        return n2;
}
int calcularMayor_ej3(int n1, int n2)
{
    if (n1 > n2)
        return n1;
    else
        return n2;
}

// Ejercicio 4
float ConvertirFahrenheit_ej4(int celsius)
{
    return (float)(celsius * 9 / 5) + 32;
}
float ConvertirKelvin_ej4(int celsius)
{
    return celsius + 273.18;
}

// Ejercicio 5
float convertirPulgadas_ej5(float centimentros)
{
    return (float)(centimentros / 2.54);
}
float convertirPies_ej5(float centimetros)
{
    return (float)(centimetros / 30.48);
}

// Ejercicio 6
void calcularCosto_ej6(float costoProducto)
{
    float iva = (float)(costoProducto * 0.16);
    float costoBase = (float)(costoProducto - iva);
    printf("Costo iva: %f\n", iva);
    printf("Costo real: %f\n", costoBase);
}

// Ejercicio 7
int compararEdad_ej7(int edad1, int edad2)
{
    int diferencia = edad1 - edad2;
    if (diferencia < 0)
    {
        diferencia = diferencia * -1;
    }
    return diferencia;
}

// Ejercicio 8
void asignarDia_ej8(int numero)
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

// Ejercicio 9
int sumaNumeros_ej9(int numero)
{
    int suma = 0;
    for (int i = 1; i <= 4; i++)
    {
        suma = suma + (numero % 10);
        numero = (int)(numero / 10);
    }
    return suma;
}

// Ejercicio 10
int validarPrimo_ej10(int numero)
{
    int primo = 0;
    for (int i = 2; i < numero; i++)
    {
        if ((numero % i) == 0)
        {
            return primo;
        }
    }
    primo = 1;
    return primo;
}

// ==========================================
// Fuciones principales de cada ejercio
// ==========================================

void ejercicio1()
{
    int n1, n2, opcion;
    int resultado = 0;
    float resultado2 = 0;

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
        resultado = sumar_ej1(n1, n2);
        printf("El resultado es: %d", resultado);
        break;
    case 2:
        resultado = restar_ej1(n1, n2);
        printf("El resultado es: %d", resultado);
        break;
    case 3:
        resultado = multiplicar_ej1(n1, n2);
        printf("El resultado es: %d", resultado);
        break;
    case 4:
        resultado2 = dividir_ej1(n1, n2);
        printf("El resultado es: %f", resultado2);
        break;
    default:
        printf("Opcion no valida");
        break;
    }
}

void ejercicio2()
{
    int n1;
    int n2;
    int resultado = 0;

    printf("Ingresa el numero 1: ");
    scanf("%d", &n1);

    printf("Ingresa el numero 2: ");
    scanf("%d", &n2);

    resultado = calcularMenor_ej2(n1, n2);

    printf("El menor es: %d", resultado);
}

void ejercicio3()
{
    int n1;
    int n2;
    int resultado = 0;
    int resultado2 = 0;

    printf("Ingresa el numero 1: ");
    scanf("%d", &n1);

    printf("Ingresa el numero 2: ");
    scanf("%d", &n2);

    resultado = calcularMenor_ej3(n1, n2);
    resultado2 = calcularMayor_ej3(n1, n2);

    printf("El menor es: %d\n", resultado);
    printf("El mayor es: %d\n", resultado2);
}

void ejercicio4()
{
    int celsius;
    int opcion;
    float resultado = 0;

    printf("Ingresa los grados celsius: ");
    scanf("%d", &celsius);

    printf("1. Grados Fahrenheit\n");
    printf("2. Grados Kelvin\n");
    printf("Ingresa una opcion: ");
    scanf("%d", &opcion);

    switch (opcion)
    {
    case 1:
        resultado = ConvertirFahrenheit_ej4(celsius);
        printf("Los grados celsius a grados Fahrenheit es: %f", resultado);
        break;
    case 2:
        resultado = ConvertirKelvin_ej4(celsius);
        printf("Los grados celsius a grados Kelvin es: %f", resultado);
        break;
    default:
        printf("Opcion no valida");
        break;
    }
}

void ejercicio5()
{
    float centimetros;
    float resultado = 0;
    int opcion;

    printf("Ingresa los centimetros: ");
    scanf("%f", &centimetros);

    printf("1.Pulgadas\n");
    printf("2.Pies\n");
    printf("Ingresa la opcion: ");
    scanf("%d", &opcion);

    switch (opcion)
    {
    case 1:
        resultado = convertirPulgadas_ej5(centimetros);
        printf("La conversion de cm a pulgadas es: %f", resultado);
        break;
    case 2:
        resultado = convertirPies_ej5(centimetros);
        printf("La conversion de cm a pies es: %f", resultado);
        break;

    default:
        printf("Opcion no valida");
        break;
    }
}

void ejercicio6()
{
    float costoProducto;

    printf("Ingresa el costo del producto: ");
    scanf("%f", &costoProducto);

    calcularCosto_ej6(costoProducto);
}

void ejercicio7()
{
    int edad1;
    int edad2;
    int resultado;

    printf("Ingresa la edad 1: ");
    scanf("%d", &edad1);
    printf("Ingresa la edad 2: ");
    scanf("%d", &edad2);

    resultado = compararEdad_ej7(edad1, edad2);

    printf("La diferencia es: %d", resultado);
}

void ejercicio8()
{
    int numero;

    printf("Ingresa el numero: ");
    scanf("%d", &numero);

    asignarDia_ej8(numero);
}

void ejercicio9()
{
    int numero;
    int resultado = 0;

    printf("Ingresa un numero de 4 digitos no mas: ");
    scanf("%d", &numero);

    if (numero >= 1000 && numero <= 9999)
    {
        resultado = sumaNumeros_ej9(numero);
        printf("El resultado es: %d", resultado);
    }
    else
    {
        printf("El numero no es de 4 digitos, vuelve a intentarlo");
    }
}

void ejercicio10()
{
    int numero;
    int resultado;
    printf("Ingresa el numero: ");
    scanf("%d", &numero);
    resultado = validarPrimo_ej10(numero);

    if (resultado == 1)
    {
        printf("Es primo\n");
    }
    else
    {
        printf("No es primo\n");
    }

    printf("El resultado es: %d", resultado);
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
        printf("1. Ejercicio 1 (Calculadora basica)\n");
        printf("2. Ejercicio 2 (Detectar menor)\n");
        printf("3. Ejercicio 3 (Mayor y menor)\n");
        printf("4. Ejercicio 4 (Conversor temperatura\n   .Faherenheit\n   .Kelvin)\n");
        printf("5. Ejercicio 5 (Conversor medidas de longitud\n   .Pulgadas\n   .Pies)\n");
        printf("6. Ejercicio 6 (Calculo de IVA)\n");
        printf("7. Ejercicio 7 (Diferencia de edades)\n");
        printf("8. Ejercicio 8 (Dias de la semana)\n");
        printf("9. Ejercicio 9 (Suma de digitos)\n");
        printf("10. Ejercicio 10 (Numeros primos)\n");
        printf("0. Salir\n");
        printf("Selecciona una opcion: ");
        scanf("%d", &opcion);
        printf("\n");

        switch (opcion)
        {
        case 1:
            ejercicio1();
            break;
        case 2:
            ejercicio2();
            break;
        case 3:
            ejercicio3();
            break;
        case 4:
            ejercicio4();
            break;
        case 5:
            ejercicio5();
            break;
        case 6:
            ejercicio6();
            break;
        case 7:
            ejercicio7();
            break;
        case 8:
            ejercicio8();
            break;
        case 9:
            ejercicio9();
            break;
        case 10:
            ejercicio10();
            break;
        case 0:
            printf("Saliendo del programa...\n");
            printf("Saliste, ejecuta de nuevo si quieres");
            break;
        default:
            printf("Opcion invalida. Intenta de nuevo.");
        }
    } while (opcion != 0);

    return 0;
}