#include <stdio.h>

int main(){
    int modelo;
    int talla;
    float costoTela;
    int lote;
    float costoMaterial=0;
    float manoDeObra=0;
    float costoVentaP=0;
    float gananciaP=0;
    float costoProdL=0;
    float gananciaL=0;
    
    printf("Indica el modelo: ");
    scanf("%d", &modelo);
    printf("Indica la talla: 32 34 36: ");
    scanf("%d", &talla);
    printf("Indica el costo por metro de la tela: ");
    scanf("%f", &costoTela);
    printf("Indica el numero de piezas para el lote:");
    scanf("%d", &lote);
	
	printf("\n");

    switch (modelo)
    {
    case 1:
        costoMaterial=costoTela*1.50;
        manoDeObra=costoMaterial*0.80;
        break;
    case 2:
    	costoMaterial = costoTela*1.80;
    	manoDeObra=costoMaterial*0.95;
    	break;
    default:

    printf("El modelo no existe\n");
	return 0;
    }

    if(talla==36){
        manoDeObra=manoDeObra*1.03;
    }

	float costoProduccion= costoMaterial + manoDeObra;
    gananciaP= costoProduccion *0.30;
    costoVentaP= costoProduccion + gananciaP;
    
    costoProdL= costoProduccion * lote;
    gananciaL=gananciaP*lote;

	printf("Costo material: %f\n", costoMaterial);
	printf("Costo mano de obra: %f\n", manoDeObra);
	printf("Ganancia producto: %f\n", gananciaP);
	printf("Costo venta: %f\n", costoVentaP);
	printf("Costo producto: %f\n", costoProdL);
	printf("Ganancia: %f\n", gananciaL);
	
	
	

    return 0;
}