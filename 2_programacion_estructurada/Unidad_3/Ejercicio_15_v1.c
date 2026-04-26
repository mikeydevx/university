#include <stdio.h>
#include <string.h>
#include <stdbool.h>
bool verificarPalindromo(char *cadena, int inicio, int ultimo)
{

    if (ultimo <= inicio)
    {
        return true;
    }
    else
    {
        if (cadena[inicio] == cadena[ultimo])
        {
            return verificarPalindromo(cadena, inicio + 1, ultimo - 1);
        }
        else
        {
            return false;
        }
    }
}
int main()
{
    char cadena[20];
    bool respuesta;
    printf("Ingresa la cadena a verificar: ");
    scanf("%s", &cadena);
    int ultimo = (strlen(cadena)) - 1;
    respuesta = verificarPalindromo(cadena, 0, ultimo);
   

    if (respuesta == true)
    {
        printf("Es un palindromo");
    }
    else
    {
        printf("No es un palindromo");
    }

     return 0;
}