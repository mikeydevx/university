package Pregunta_26_a;

public class Programador extends Empleado {

    private String lenguaje;
    private int aniosExperiencia;

    public Programador() {

    }

    ;
    
    public Programador(int id, String nombre, String departamento, String lenguaje, int aniosExperiencia) {
        super(id, nombre, departamento);
        this.lenguaje = lenguaje;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return this.lenguaje;
    }

    public void setAnosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAnosExperiencia() {
        return this.aniosExperiencia;
    }
    
    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\n" +
               "Lenguaje de programacion: " + this.getLenguaje() + "\n" +
               "Anios de experiencia: " + this.getAnosExperiencia();
    }

}