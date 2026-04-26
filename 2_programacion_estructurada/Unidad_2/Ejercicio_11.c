#include <stdio.h>
int main(){
    float cantidad;
    float tasa;
    int nAnios;
    float rendimientoA=0;
    float rendimientoT=0;

    printf("Cantidad a invertir: ");
    scanf("%f", &cantidad);
    printf("Tasa actual: ");
    scanf("%f", &tasa);
    printf("Anios: ");
    scanf("%d", &nAnios);
    
    for (int i = 1; i <= nAnios; i++)
    {
        rendimientoA=(cantidad*tasa)/100;
        printf("El rediminto del anio: %d es: %f\n", i, rendimientoA);
        cantidad=cantidad+ rendimientoA;
        rendimientoT=rendimientoT+ rendimientoA;
    }

    printf("El rendimineto total de la inversion es: %f", rendimientoT);
    

    return 0;
}