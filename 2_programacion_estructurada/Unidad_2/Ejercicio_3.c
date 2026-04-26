#include <stdio.h>
int main(){
	int nCita;
	int costoCita;
	int costoTotal;
	
	printf("Ingresa el numero de cita: ");
	scanf("%i", &nCita);
	
	if (nCita>=1 && nCita<=3 ){
		costoCita=200;
		costoTotal=nCita*200;
	}else if(nCita<=5){
		costoCita=150;
		costoTotal=((nCita - 3)*150) + 600;
	}else if(nCita<=8){
		costoCita=100;
		costoTotal=((nCita - 5)*100) + 900;
	}else{
		costoCita=50;
		costoTotal=((nCita-8)*50) + 1200;
	}
	
	
	
	printf("El costo de la cita %d es: %d \nEl total es: %d", nCita, costoCita, costoTotal); 
	
	
	return 0;
}