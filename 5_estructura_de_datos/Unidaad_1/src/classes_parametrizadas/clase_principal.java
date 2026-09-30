package classes_parametrizadas;

import java.util.ArrayList;

public class clase_principal {
    public static void main(String[] args) {
//        int val[] = new int[10];//arreglo de 10
//        ArrayList<String> nombre = new ArrayList<>(); //Clase parametrizadas
//        
//        nombre.add("Luis");
//        nombre.add("Paco");
//        nombre.add("Lupe");
//        nombre.add("Pacho");
//        nombre.add("Miguel");
//        nombre.add("Joanna");
//        
//        nombre.remove(3);
//        System.out.println("Dato posicion: " + nombre.get(1));
//        
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(5);
//        
//        Caja<Integer> num2 = new Caja();
//        
//        Caja<Integer> num3 = new Caja(9);
//        
//        System.out.println("Valor de la caja: " + num3.getDato());
    

//    CajaLista <String> listaNombre = new CajaLista<>();
//    
//    listaNombre.Agregar("Miguel");
//    listaNombre.Agregar("Joanna");
//    listaNombre.Agregar("Paco");
//    listaNombre.Agregar("Hugo");
//    
//    listaNombre.eliminar(3);
//    listaNombre.eliminar(4);
//    
//    System.out.println("Elemento 2 es: " +listaNombre.getElemento(1));
    
    CajaDiccionario<String, String> traductor = new CajaDiccionario<>();
    
    traductor.agregar("One", "Uno");
    traductor.agregar("Two", "Dos");
    traductor.agregar("Tree", "Tres");
    traductor.agregar("Four", "Cuatro");
    
        System.out.println("Traduccion de 2: " + traductor.getSignificado("Two"));
     
    CajaDiccionario<Integer, String> parColor = new CajaDiccionario<>();
    
    parColor.agregar(1, "Azul");
    parColor.agregar(2, "Verde"); //El numero no es indice es clave
    
        System.out.println("El color 2 es: " + parColor.getSignificado(2));
    
          
          
    }
}
