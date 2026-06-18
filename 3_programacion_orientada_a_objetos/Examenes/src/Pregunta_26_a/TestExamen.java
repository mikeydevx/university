package Pregunta_26_a;

public class TestExamen {

    public static void main(String[] args) {
        
        Empleado emp = new Empleado(101, "Carlos Lopez", "Sistemas");
        System.out.println(emp.mostrarDatos());
        System.out.println();

        Programador prog = new Programador(102, "Ana Perez", "Desarrollo", "Java", 5);
        System.out.println(prog.mostrarDatos());
        
    }

}