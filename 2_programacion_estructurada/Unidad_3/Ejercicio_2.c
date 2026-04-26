#include <stdio.h>
int calcularMenor(int n1, int n2){
    if(n1<n2){
        return n1;
    }else{
        return n2;
    }

}

int main(){
    int n1;
    int n2; 
    int resultado=0;

    printf("Ingresa el numero 1: ");
    scanf("%d", &n1);

    printf("Ingresa el numero 2: ");
    scanf("%d", &n2);

    resultado=calcularMenor(n1, n2); 

    printf("El menor es: %d", resultado);
}
