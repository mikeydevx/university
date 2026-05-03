package Ejercicio_1;


public class Persona {
   
  //propiedades
    private String Nombre;
    private int Edad;

    //construtor (es un metodo)
    public Persona(String n, int e){
        this.Nombre = n;
        this.Edad = e;
    }

    //comportamiento para el objeto
    public int meses() {
        return this.Edad * 12;
    }

    public int dias() {
        return this.Edad * 365;
    }

    public int horas() {
        return this.dias() * 24;
    }

    public int minutos() {
        return this.horas() * 60;
    }

    public int segundos() {
        return this.minutos() * 60;
    }

    public String mostrarDatos() {
        return "Nombre----->" + this.Nombre + "\n"
                + "Edad----->" + this.Edad + "\n"
                + "Meses----->" + this.meses() + "\n"
                + "Dias----->" + this.dias() + "\n"
                + "Horas----->" + this.horas() + "\n"
                + "Minutos----->" + this.minutos() + "\n"
                + "Segundos----->" + this.segundos();

    }
}
