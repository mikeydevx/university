package Pregunta_26_a;

public class Empleado {

    private int id;
    private String nombre;
    private String departamento;

    public Empleado() {

    }

    ;
    
    public Empleado(int id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }
    
    public String mostrarDatos() {
        return "ID: " + this.getId() + "\n" +
               "Nombre: " + this.getNombre() + "\n" +
               "Departamento: " + this.getDepartamento();
    }

}