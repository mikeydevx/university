package arreglos;

import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int sumaTotal=0;
        int sumaIntermedia=0;    
        int arrelgo[][][] = {{{1, 3, 4 },
                              { 2, 3},
                              {3, 5, 6 ,4}},
            
                              {{2, 5, 6, 2},
                               {1, 3, 4},
                               {3, 4}},
                                  
                               {{4,2},
                                {3, 2, 1},
                                {2,1,1,3}} 
                                };
        
        for (int i = 0; i < arrelgo.length; i++) {
            for (int j = 0; j < arrelgo[i].length; j++) {
                
                for (int k = 0; k < arrelgo[i][j].length; k++) {
                    System.out.print(arrelgo[i][j][k] + "\t");
                    sumaTotal=sumaTotal+arrelgo[i][j][k];
                    if (i==1) {
                        sumaIntermedia=sumaIntermedia+arrelgo[i][j][k];
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        System.out.println("Suma todos elementos: " + sumaTotal);
        System.out.println("Suma intermedia es: " + sumaIntermedia);
        
    }           
}
