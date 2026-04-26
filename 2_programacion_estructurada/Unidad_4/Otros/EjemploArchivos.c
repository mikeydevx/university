#include <stdio.h> 
int main(){
    FILE *archivo;
    char nombre[50];
    float promedio;

    //1.abrir el archivo en modo escritura ("w")
    archivo = fopen("registro.txt", "w");

    if (archivo== NULL){
        printf("Error: No se pudo crear el archivo.\n");
        return 1;
    }

    //2. SOlicitar datos al usuario
    printf("Ingresa nombre del alumno: ");
    scanf("%s", nombre);
    printf("Ingrese promedio: ");
    scanf("%f", &promedio);
    
    //3. Escribir en el archivo usando fprintf
    fprintf(archivo, "Alumno: %s | Promedio %.2f\n", nombre, promedio);

    //4.Cerrar el archivo
    fclose(archivo);

    printf("Datos guardados exitosamente en registro.txt\n");
    
    
    return 0;
}