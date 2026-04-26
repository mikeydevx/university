#include <stdio.h>
int sumaNumeros(int numero){
    int suma=0; 

    for (int i=1; i<=4; i++){
        suma=suma + (numero%10);
        numero=(int)(numero/10);
    }

    return suma;
}


int main(){

    int numero; 
    int resultado=0;
    
    printf("Ingresa un numero de 4 digitos no mas: ");
    scanf("%d", &numero);

    if(numero >= 1000 && numero <=9999){
       resultado = sumaNumeros(numero);
       printf("El resultado es: %d", resultado);
    }else{
        printf("El numero no es de 4 digitos, vuelve a intentarlo");
    }

    return 0; 
}