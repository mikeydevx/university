
package Encapsulacion;

public class PruebaJuego {
    
    public static void main(String[] args) {
        
        System.out.println("--- PRUEBA ESTRUCTURADA (MALA) ---");
        PersonajeMalo heroe1 = new PersonajeMalo();
        // Un error lógico: Alguien de tu equipo pone salud negativa por accidente.
        heroe1.salud = -5000; 
        System.out.println("Salud heroe 1 (Arruinada): " + heroe1.salud);


        System.out.println("\n--- PRUEBA POO (BUENA) ---");
        PersonajeBueno heroe2 = new PersonajeBueno();
        // Usamos la vía oficial. El objeto aplica sus reglas.
        heroe2.recibirDano(5000); 
        System.out.println("Salud heroe 2 (Protegida): " + heroe2.getSalud());

        
        // RETO PARA TU EDITOR: 
        // Quita las dos diagonales de la siguiente línea y mira lo que hace NetBeans:
        // heroe2.salud = -5000; 
    }
    
}
