#include <stdio.h>

int calcularPromedio(int *arregloLatencias) {
    int promedio=0, suma=0;
    for (int i = 0; i < 24; i++) {
        suma += arregloLatencias[i];
    }
    return promedio = suma / 24;
}

int identificarPicoAlto(int *arregloLatencias) {
    int nMayor = arregloLatencias[0], pMayor = 0;
    for (int i = 0; i < 24; i++) {
        if (nMayor < arregloLatencias[i]) {
            nMayor = arregloLatencias[i];
            pMayor = i;
        }
    }
    return nMayor;
}

int contarHoras(int *arregloLatencias) {
    int contador = 0;
    for (int i = 0; i < 24; i++) {
        if (arregloLatencias[i] < 100) {
            contador++;
        }
    }
    return contador;
}

// Nueva función
void guardarRegistroArchivo(int *arregloLatencias, char *fecha) {
    FILE *archivo = fopen("registros.txt", "a"); 
    
    if (archivo == NULL) {
        printf("Error al crear o abrir el archivo.\n");
        return;
    }

    // Línea 1: Fecha del reporte
    fprintf(archivo, "Fecha del reporte: %s\n", fecha);

    // Línea 2: Los 24 valores
    fprintf(archivo, "Latencias: ");
    for (int i = 0; i < 24; i++) {
        fprintf(archivo, "%d ", arregloLatencias[i]);
    }
    fprintf(archivo, "\n");

    // Línea 3: Resultados estadísticos
    int prom = calcularPromedio(arregloLatencias);
    int pico = identificarPicoAlto(arregloLatencias);
    int estables = contarHoras(arregloLatencias);
    fprintf(archivo, "Promedio: %d, Pico: %d, Horas estables: %d\n", prom, pico, estables);

    // Línea 4: Salto de línea
    fprintf(archivo, "\n");

    fclose(archivo);
}

int main() {
    int arregloLantencias[24];
    int opcion, resultado;
    char fecha[30]; // Variable para almacenar la fecha

    // Ingreso de la fecha
    printf("Ingresa la fecha del reporte (ej. 14/05/2026): ");
    scanf(" %[^\n]", fecha); 
    printf("\n");

    // Ingreso de las latencias
    for (int i = 0; i < 24; i++) {
        printf("Ingresa la latencia de la hora %d: ", i);
        scanf("%d", &arregloLantencias[i]);
    }
    printf("\n");

    // Guardado en archivo
    guardarRegistroArchivo(arregloLantencias, fecha);
    printf("Datos guardados en registros.txt exitosamente.\n\n");

    do {
        printf("INGRESA UNA OPCION DEL MENU\n");
        printf("1.Promedio diario\n");
        printf("2.Picos de latencia\n");
        printf("3.Estabilidad\n");
        printf("0.Salir del programa\n");

        printf("\nIngresa la opcion a consultar: ");
        scanf("%d", &opcion);
        
        switch (opcion) {
        case 1:
            resultado = calcularPromedio(arregloLantencias);
            printf("EL promedio es: %d\n\n", resultado);
            break;
        case 2:
            resultado = identificarPicoAlto(arregloLantencias);
            int pMayor = 0;
            for (int i = 0; i < 24; i++) {
                if (arregloLantencias[i] == resultado) {
                    pMayor = i;
                }
            }
            printf("La latencia mayor es: %d que esta en la posicion %d\n\n", resultado, pMayor);
            break;
        case 3:
            resultado = contarHoras(arregloLantencias);
            printf("EL numero de horas por debajo de 100ms es: %d\n\n", resultado);
            break;
        case 0:
            printf("Saliendo...\n");
            break;
        default:
            printf("Opcion no valida\n");
            break;
        }
    } while (opcion != 0);

    return 0;
}