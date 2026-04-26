#include <stdio.h>

int calcularPotencia(int base, int potencia){
    if (potencia<=0){
        return 1;
    }
    if(potencia==1){
        return base;
    }else{
        return base * (calcularPotencia (base, potencia-1));
    }
}

int main(){
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