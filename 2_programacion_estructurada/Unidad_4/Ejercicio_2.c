#include <stdio.h>
#include <stdlib.h>

int main() {
    int nCalificaciones;
    float suma = 0, promedio;

    printf("Ingresa el numero de calificaciones a capturar: ");
    scanf("%d", &nCalificaciones);

    if (nCalificaciones <= 0) {
        printf("El numero de calificaciones debe ser mayor que 0.\n");
        return 1;
    }

    float *calificaciones = (float *)malloc(nCalificaciones * sizeof(float));

    for (int i = 0; i < nCalificaciones; i++) {
        printf("Ingresa la calificacion %d: ", i + 1);
        scanf("%f", &calificaciones[i]);
    }

    for (int i = 0; i < nCalificaciones; i++) {
        suma = suma + calificaciones[i];
    }

    promedio = suma / nCalificaciones;

    printf("El promedio es: %.2f\n", promedio);

    return 0;
}