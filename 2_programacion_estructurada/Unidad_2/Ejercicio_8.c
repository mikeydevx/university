#include <stdio.h>
int main(){
	
	
	int tope;
	int i;
	
	
	printf("Indica el limite: ");
	scanf("%d", &tope);
	
	for(i=0; i<=tope; i=i+2 ){
		printf("%d\n", i);
		
	}
	
	printf("Termino");
	
	return 0; 
}