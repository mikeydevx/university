package Ejercicio_3_Cuenta;
public class PruebaCuenta_2 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        
        c1.setnumeroCuenta("1001");
        c1.settitular("Miguel");
        c1.setsaldoCuenta(10000);
        c1.setnumeroCuenta("1002");
        
        System.out.println(c1.mostrarDatos());
    }
}
