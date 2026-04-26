#include <stdio.h>

void calcularCosto(float costoProducto){
    float iva=(float)(costoProducto*0.16);
    float costoBase=(float)(costoProducto - iva);
    printf("Costo iva: %f\n", iva);
    printf("Costo real: %f\n", costoBase);
}


int main(){
    float costoProducto;

    printf("Ingresa el costo del producto: ");
    scanf("%f", &costoProducto);
    
    calcularCosto(costoProducto);


}