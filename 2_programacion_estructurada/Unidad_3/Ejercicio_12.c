#include <stdio.h>
int calcularSumaRecursiva(int n){
    if (n<=1){
        return 1;
    }else{
        return n+(calcularSumaRecursiva(n-1));
    }
}

int main(){
    int n;
    int resultado;
    printf("Ingres el numero: ");
    scanf("%d", &n);

    resultado = calcularSumaRecursiva(n);

    printf("El resultado es: %d", resultado);

}