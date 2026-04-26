#include <stdio.h>

int validarPrimo(int numero){
    int primo = 0;
    for(int i=2; i<numero; i++){
        if((numero%i)==0){
            return primo;
        }
    }

    primo=1;
    return primo;
}


int main(){
    int numero;
    int resultado; 
    printf("Ingresa el numero: ");
    scanf("%d", &numero);
    resultado=validarPrimo(numero);

    if(resultado==1){
        printf("Es primo\n");
    }else{
        printf("No es primo\n");
    }
    
    printf("El resultado es: %d", resultado);

    return 0;
}