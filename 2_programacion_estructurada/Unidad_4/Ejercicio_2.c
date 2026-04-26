#include <stdio.h>
int main (){
    int nCalificaciones; 
    float suma=0, promedio;
    

    printf("Ingresa el numero de calificaciones a capturar: ");
    scanf("%i", &nCalificaciones);

    float calificaciones[nCalificaciones];

    for ( int i = 0; i < nCalificaciones; i++)
    {
        printf("Ingresa la calificaciones %d: ", (i+1));
        scanf("%f", &calificaciones[i]);
    }

    for (int i = 0; i < nCalificaciones; i++)
    {
        suma=suma+calificaciones[i];
    }

    promedio= suma/nCalificaciones;
    printf("El promedio es: %f", promedio);
    
    return 0;
}