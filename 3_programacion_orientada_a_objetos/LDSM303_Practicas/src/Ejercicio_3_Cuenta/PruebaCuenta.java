package Ejercicio_3_Cuenta;
public class PruebaCuenta {
    
    public static void main(String[] args) {
       Cuenta c1 = new Cuenta("1001", "Miguel", 100000);
       Cuenta c2 = new Cuenta("1002", "Angel",10000 );
       Cuenta c3 = new Cuenta("1003", "Juan", 2000); 
       
        System.out.println(c1.mostrarDatos() +"\n");
        System.out.println(c2.mostrarDatos() + "\n");
        System.out.println(c3.mostrarDatos()+ "\n");
        
        c1.depositoCuenta(5000);
        c2.depositoCuenta(10000);
        c3.depositoCuenta(200);
        
        System.out.println("----Deposito----");
        
        System.out.println(c1.mostrarDatos() +"\n");
        System.out.println(c2.mostrarDatos() + "\n");
        System.out.println(c3.mostrarDatos()+ "\n");
        
        System.out.println("---Retiro---");
        
        c1.retiroCuenta(100000);
        c2.retiroCuenta(10000);
        c3.retiroCuenta(2400);
        
        System.out.println(c1.mostrarDatos() +"\n");
        System.out.println(c2.mostrarDatos() + "\n");
        System.out.println(c3.mostrarDatos()+ "\n");
        
    }
    
    
    
}
