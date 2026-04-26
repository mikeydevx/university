#include <stdio.h>

float convertirPulgadas(float centimentros){
    float resultado= (float)(centimentros/2.54);
    return resultado;
}

float convertirPies(float centimetros){
    float resultado=(float)(centimetros/30.48);
    return resultado;
}

int main(){

    float centimetros;
    float resultado=0;
    int opcion; 

    printf("Ingresa los centimetros: ");
    scanf("%f", &centimetros);

    printf("1.Pulgadas\n");
     printf("2.Pies\n");
     printf("Ingresa la opcion: ");
     scanf("%d", &opcion);

    switch (opcion)
    {
    case 1:
        resultado=convertirPulgadas(centimetros);
        printf("La conversion de cm a pulgadas es: %f", resultado);
        break;
    case 2:
        resultado=convertirPies(centimetros);
        printf("La conversion de cm a pies es: %f", resultado);
        break;
    
    default:
        printf("Opcion no valida");
        break;
    }

return 0;
}