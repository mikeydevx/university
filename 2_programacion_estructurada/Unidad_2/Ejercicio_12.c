#include <stdio.h>
int main()
{
    int n, i = 1, tipo;
    float monto, total_global = 0;

    int cMayor1000 = 0, c_500_1000 = 0, cMenores500 = 0;
    float sMayor1000 = 0, s_500_1000 = 0, s_menor_500 = 0;
    float total_alimentos = 0, total_bebidas = 0, total_abarrotes = 0;
    printf("Ingrese la cantidad de ventas del dia: ");
    scanf("%d", &n);
    if (n > 0)
    {
        do
        {
            printf("\n--- Venta %d ---\n", i);
            printf("Monto: ");
            scanf("%f", &monto);
            if (monto > 1000)
            {
                cMayor1000++;
                sMayor1000 += monto;
            }
            else if (monto > 500)
            {
                c_500_1000++;
                s_500_1000 += monto;
            }
            else
            {
                cMenores500++;
                s_menor_500 += monto;
            }
            printf("Categoria (1-Alimentos, 2-Bebidas, 3-Abarrotes): ");
            scanf("%d", &tipo);
            switch (tipo)
            {
            case 1:
                total_alimentos += monto;
                break;
            case 2:
                total_bebidas += monto;
                break;
            case 3:
                total_abarrotes += monto;
                break;
            }
            total_global += monto;
            i++;

        } while (i <= n);
    }
    printf("\n--- RESULTADOS ---\n");
    printf("Ventas mayores 1000: %d (Total: $%.2f)\n", cMayor1000, sMayor1000);
    printf("Ventas entre 501-1000: %d (Total: $%.2f)\n", c_500_1000, s_500_1000);
    printf("Ventas menores o iguales a 500: %d (Total: $%.2f)\n", cMenores500, s_menor_500);
    printf("-------------------\n");
    printf("Alimentos: $%.2f | Bebidas: $%.2f | Abarrotes: $%.2f\n", total_alimentos,
           total_bebidas, total_abarrotes);
    printf("TOTAL GLOBAL: $%.2f\n", total_global);
    return 0;
}