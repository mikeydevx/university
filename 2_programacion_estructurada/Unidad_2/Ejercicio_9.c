#include <stdio.h>
int main(){

 int tabla;
 int resultado;
 int i=1;

 printf("Ingresa la tabla: ");
 scanf("%d", &tabla);

 while (i<=10)
 {
    resultado=tabla*i;
    printf("%d * %d = %d\n", tabla, i, resultado);
    i++;
 }
 

    return 0; 
}