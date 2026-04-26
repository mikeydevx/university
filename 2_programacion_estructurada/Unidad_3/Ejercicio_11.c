#include <stdio.h>
int calcularFactorial(int n){
    if (n<=1){
        return 1;
    }else{
        return n*(calcularFactorial(n-1));
    }
}

int main(){
    int n;
    int resultado;
    printf("Ingres el numero: ");
    scanf("%d", &n);

    resultado = calcularFactorial(n);

    printf("El resultado es: %d", resultado);

}