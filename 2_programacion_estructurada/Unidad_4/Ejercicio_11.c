#include <stdio.h> 
int main(){
    FILE *archivo;
    char nota[100]="HOLA ESTE ES MI PRIMER ARCHIVO EN C";
   

    
    archivo = fopen("Archivos TXT/notas.txt", "w");

    if (archivo== NULL){
        printf("Error: No se pudo crear el archivo.\n");
        return 1;
    }  
    //3. Escribir en el archivo usando fprintf
    fprintf(archivo, "Nota: %s", nota);

    //4.Cerrar el archivo
    fclose(archivo);

    printf("Datos guardados exitosamente en registro.txt\n");
    
    
    return 0;
}