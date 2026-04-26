#include <stdio.h>
int main(){
    
    int semilla1=0;
    int semilla2=1;
    int semilla3=0;
    int numero;


    printf("Ingresa el numero: ");
    scanf("%d", &numero);

    if(numero>=1){
    
    for(int i=0; i<=numero; i++){
    semilla3=semilla1+semilla2;
    printf("%d, ", semilla1, semilla2, semilla3);
    
    semilla1=semilla2;
    semilla2=semilla3;

    }
    
    }else{
        printf("No se puede generar una serie con ese valor");
    }

    return 0;
}