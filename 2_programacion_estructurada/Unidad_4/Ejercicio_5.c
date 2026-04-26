#include <stdio.h>
#include <string.h>

int comparar(char arreglo[10][15], char fruta[]) {
    int pos = -1;
    int i, j;

    for (i = 0; i < 10; i++) {
        int tamP1 = strlen(arreglo[i]);
        int tamP2 = strlen(fruta);

        if (tamP1 == tamP2) {
            for (j = 0; j < tamP1; j++) {
                if (arreglo[i][j] != fruta[j]) {
                    break;
                }
            }

            if (j == tamP1) {
                pos = i;
                break;
            }
        }
    }

    return pos;
}

int main() {
    char fruta[15];
    char arreglo[10][15];
    int i, comparacion;

    for (i = 0; i < 10; i++) {
        printf("Ingresa la fruta #%d: ", i + 1);
        scanf("%s", arreglo[i]);
    }

    printf("Indica la fruta a buscar: ");
    scanf("%s", fruta);

    comparacion = comparar(arreglo, fruta);

    if (comparacion >= 0)
        printf("Si existe\n");
    else
        printf("No existe\n");

    return 0;
}