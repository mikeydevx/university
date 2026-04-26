#include <stdio.h>
int main(){
	int tipoHamburguesa;
	int nHamburguesas;
	float total;
	int opcionPago; 
	
	printf("RicaBurguer\n");
	printf("Menu:\n 1.Sencillas\n 2.Dobles\n 3.Triples\n 4.Cubanas\n ");
	
	printf("Ingresa un numero del menu: ");
	scanf("%d", &tipoHamburguesa);
	printf("Ingresa la cantidad de hamburguesas: ");
	scanf("%d", &nHamburguesas);
	
	if(tipoHamburguesa==1){
		total=nHamburguesas * 30;
	}else if(tipoHamburguesa==2){
		total=nHamburguesas  * 40;
	}else if(tipoHamburguesa==3){
		total=nHamburguesas  * 48;
	}else if(tipoHamburguesa==4){
		total=nHamburguesas  * 50;
	}else{
		printf("Opcion no valida;");
	}
	
	printf("Ingresa la forma de pago: ");
	scanf("%d", &opcionPago);
	
	if(opcionPago==1){
		total=(float)total;
	}else if(opcionPago==2){
		total=(float)total*1.05;
	}else{
		printf("Opcion no valida");
	}
	
	printf("El total por %d hamburguesas es: %f", nHamburguesas, total);
	
	
	return 0;
}