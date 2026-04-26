#include <stdio.h>
int main(){
    FILE * archivo;
    archivo = fopen ("Archivos TXT/Cancion.txt", "r");
    if (archivo==NULL)
    {
        printf("Error");
        return 1;
    }

    char linea[100];
    while (fgets(linea,sizeof(linea),archivo)!=NULL)
    {
     printf("%s", linea);
    }

    fclose(archivo);
    return 0;
    
    
}