#include <stdio.h>
int main(){
    int antiguedad;
    float sueldo;
    float montoSueldo; 
    float montoBono = 0;
    float bonoAntiguedad = 0;
    float bonoSueldo = 0; 
    float pagoConBono;

    printf("Anios trabajando: ");
    scanf("%d", &antiguedad);
    printf("Sueldo empleado: ");
    scanf("%f", &sueldo);

    if (antiguedad > 2 && antiguedad < 5){ 
        bonoAntiguedad = sueldo * 0.20;
    } else if(antiguedad >= 5){ 
        bonoAntiguedad = sueldo * 0.30;
    }
   
    if(sueldo < 1000){
        bonoSueldo = sueldo * 0.25;
    } else if (sueldo >= 1000 && sueldo <= 3500){ 
        bonoSueldo = sueldo * 0.15;
    } else {
        bonoSueldo = sueldo * 0.10;
    }

    if (bonoSueldo > bonoAntiguedad){
        pagoConBono = sueldo + bonoSueldo;
       
        printf("El monto mayor es el del sueldo: %f\nEl monto con bono es: %f", bonoSueldo, pagoConBono);
    } else {
        pagoConBono = sueldo + bonoAntiguedad;
        
        printf("El monto mayor es el de antiguedad: %f\nEl monto con bono es: %f", bonoAntiguedad, pagoConBono);
    }

    return 0; 
}