package Ejercicio_2_Empleado;

public class Empleado {

    //aqui van las proiedades
    String ID_empleado;
    String Nombre;
    String primerApellido;
    int edad;
    int aniosExperencia;
    double sueldo;

    // Primer metodo (contructor)
    public Empleado(String id, String N, String P, int E, int A) {

        this.ID_empleado = id;
        this.Nombre = N;
        this.primerApellido = P;
        this.edad = E;
        this.aniosExperencia = A;

    }
    
    
    public void calcularSueldo(){
        if(aniosExperencia >= 1 && this.aniosExperencia<=5)this.sueldo=30000; 
        if (this.aniosExperencia>5 && this.aniosExperencia<=10) this.sueldo=40000;
        if(this.aniosExperencia>10 && this.aniosExperencia<=15) this.sueldo=45000;
        if(this.aniosExperencia>15) this.sueldo=50000;
    }
    
    public String mostrarDatos() {

        return "id empleado: " + this.ID_empleado + "\n"
                + "Nombre: " + this.Nombre + "\n"
                + "Primer Apellido: " + this.primerApellido + "\n"
                + "Edad: " + this.edad + "\n"
                + "Anios experencia: " + this.aniosExperencia + "\n"
                + "Sueldo: " + this.sueldo;
    }

}
