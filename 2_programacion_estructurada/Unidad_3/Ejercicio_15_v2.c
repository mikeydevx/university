#include <stdio.h>
#include <string.h>
#include <stdbool.h>
bool voltearCadena(char * cadena, int inicio, int ultimo){
    
char cadenaNueva[20];  
strcpy(cadenaNueva, cadena);  
if(ultimo<=inicio){
    return true;
}else{
    int temporal = cadena[inicio];
    cadena[inicio] = cadena[ultimo];
    cadena[ultimo] = temporal;
    voltearCadena(cadena, inicio+1, ultimo-1);   
}

if(strcmp(cadena, cadenaNueva)==0){
    return true;
}else{
    return false;
}

}

int main(){
    char cadena [20];
    bool resultado; 
    printf ("Ingresa la cadena a verificar: ");
    scanf("%s", &cadena);
    int ultimo=(strlen(cadena))-1;
    resultado = voltearCadena(cadena, 0, ultimo);

    if (resultado==true){
        printf("Es un palindromo");
    }else{
        printf("No es un palindromo");
    }
    

    return 0;
}