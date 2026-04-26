#include <stdio.h>
float ConvertirFahrenheit(int celsius){
    float resultadoFahrenheit= (float) (celsius * 9/5) + 32;
    return resultadoFahrenheit;
}

float ConvertirKelvin(int celsius){
    return celsius + 273.18;
}

int main(){
    int celsius;
    int opcion;
    float resultado=0;
    
    printf("Ingresa los grados celsius: ");
    scanf("%d", &celsius);

    printf("1. Grados Fahrenheit\n");
    printf("2. Grados Kelvin\n");
    printf("Ingresa una opcion: ");
    scanf("%d", &opcion);

    switch (opcion)
    {
    case 1:
        resultado=ConvertirFahrenheit(celsius);
        printf("Los grados celsius a grados Fahrenheit es: %f", resultado);
        break;
    case 2:
        resultado=ConvertirKelvin(celsius);
        printf("Los grados celsius a grados Kelvin es: %f", resultado);
        break;
    default:
        printf("Opcion no valida");
        break;
    }

    

    return 0; 
}