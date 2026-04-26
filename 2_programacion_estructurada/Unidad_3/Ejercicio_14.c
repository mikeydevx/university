#include <stdio.h>
#include <string.h>
void invertirCadena(char * cadena, int inicio, int ultimo){
    if(ultimo<=inicio){
        return;
    }else{
        char temporal=cadena[inicio];
        cadena[inicio]=cadena[ultimo];
        cadena[ultimo]=temporal;
        invertirCadena(cadena, inicio+1, ultimo-1);
    }
}

int main(){
char cadena[20];
printf("Ingresa la cadena: ");
scanf("%s", &cadena);
int ultimo=(strlen(cadena))-1;
invertirCadena(cadena, 0, ultimo);
printf("Cadena invertida: %s", cadena);
return 0;

} 