#include <stdio.h>
#include <string.h>
int main(){

    FILE * archivo;
    archivo=fopen("Archivos TXT/usuarios.txt", "a");
    if (archivo==NULL)
    {
        printf("Error al crear archivo");
        return 1;
    }

    char nombre[200];
    char edad [3];
    char ciudad[10];
    char mensaje[65];

    
    printf("Ingresa nombre: ");
    scanf("%s", &nombre);
    mensaje[0]="\0";
    printf("Ingresa edad: ");
    scanf("%s", &edad);
    printf("Ingresa ciudad: ");
    scanf("%s", &ciudad);

    strcat(mensaje, nombre);
    strcat(mensaje, "   ");
    strcat(mensaje, edad);
    strcat(mensaje, "   ");
    strcat(mensaje, ciudad);
    strcat(mensaje, "\n");

    fprintf(archivo, "%s", mensaje);

    printf("Datos guardados");
    
    fclose(archivo);

    return 0;
    

}