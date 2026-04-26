#include <stdio.h>
int main(){
	
	float promedio;
	float suma;
	int nAlumnos;
	float cali;
	int i;
	char nivelCompetencia;
	
	printf("Ingresa el numero de cali a capturar: ");
	scanf("%d", &nAlumnos);
	
	for (i=1; i<=nAlumnos; i++){
		printf("Ingresa la cali %i: ", i);
		scanf("%f", &cali);
		suma= suma + cali;
	}
	
	promedio= suma/ nAlumnos; 
	 
	
	if(promedio==10){
		nivelCompetencia='E'; 
	}else if(promedio>=9 && promedio<10){
		nivelCompetencia='A';
	}else if(promedio>=8 && promedio<9){
		nivelCompetencia='B';
	}else if(promedio>=7 && promedio<8){
		nivelCompetencia='R';
	}else{
		nivelCompetencia='N';
	}
	
	printf("\nEl promedio es: %.2f \nNivel de competencia: %c", promedio, nivelCompetencia );
	
	
	return 0;
}