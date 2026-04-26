#include <stdio.h>
int main(){
    int cadenaNumeros[10];
    

    for (int i = 0; i < 10; i++)
    {
        printf("Ingresa el numero %i:", (i+1));
        scanf("%d", &cadenaNumeros[i]);
    }
    
    printf("\n");

    for (int i = 9; i <  cadenaNumeros ; i--)
    {
        printf("Cadena invertidad: %d\n", cadenaNumeros[i]);
    }
    
   
    return 0;
}