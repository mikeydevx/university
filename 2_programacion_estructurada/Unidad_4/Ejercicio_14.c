#include <stdio.h>
int main(){
    FILE * archivo;
    archivo = fopen ("Archivos TXT/Cancion.txt", "r");
    if (archivo==NULL)
    {
        printf("Error");
        return 1;
    }

    int contador=0;
    char linea[100];
    while (fgets(linea,sizeof(linea),archivo)!=NULL)
    {

        for (int i = 0; i < strlen(linea); i++)
        {
           if (linea[i]==' '){
            contador = contador + 1;
           }
        }
        

    }

    printf("El archivo tiene: %d",contador+1);

    fclose(archivo);
    return 0;
    
}