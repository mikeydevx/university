package arreglos;

/**
 *
 * @author mavel
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        // Definición de una variable
        int a;

        // Asignación de valor
        a = 5;

        // Arreglo = variable que administra un grupo de datos

        // Definición clásica de un arreglo
        int b[] = new int[5];

        // Podemos separar la definición en 2 partes
        int c[];          // 1a parte: definición de la variable
        c = new int[5];   // 2a parte: definición del tamaño

        // Otra forma de definir un arreglo,
        // creándolo a partir de los datos
        int d[] = {1, 2, 3, 4, 5}; // Arreglo de tamaño 5

        // Ejemplo 2: definición de arreglo desde sus datos
        String utiles[] = {"Lapiz", "Pluma", "Libro"};

        for (int i = 0; i < 3; i++) {
            System.out.println(utiles[i]);
        }

        // Arreglos de dos dimensiones
        // Una dimensión se mueve en columnas
        // Dos dimensiones: renglones y columnas
        // Es importante el orden: renglones, columnas

        int e[][] = new int[3][2]; // 3 renglones x 2 columnas

        // 2a forma de creación de arreglo de dos dimensiones
        int f[][];        // Creación de la variable
        f = new int[3][2];

        // 3a forma: creación directamente con datos
        int g[][] = {
            {1, 2, 3, 4},
            {3, 2, 1, 0},
            {4, 1, 2, 1}
        };
        
        //Creando arrelgo irregular, desde los datos
        
        int h[][] ={{1,2,3,4,5},
                    {1, 2,3},
                    {1,2,3,4,5,6}};
        
        //creando el arreglo irregular, en 2 partes
        //1a parte definiendo la variable arreglo
        int j[][];
        //definimos los tamaños que desea el usuario
        j = new int [3][]; // definimos filas
        j[0] = new int[4]; // 4 columnas a fila 1
        j[1] = new int[2]; // 2 columnas a fila 2 
        j[2] = new int[5]; // 5 columnas a fila 3
        
        // definir arrelgo tipo cubo (3 dimensiones)
        int k[][][]; //definimos variable array array cubo
        // definimos tamaños de caras
        k = new int[2][][];
        k[0] = new int[3][]; //3 filas para cara 0
        k[0][0] = new int[4]; // 4 columnas fila 1
        k[0][1] = new int[3]; // 4 columnas fila 2
        k[0][2]= new int[2]; // 2 columnas, fila 3 cara 1
        
        k[1] = new int[3][]; // cara fondo tiene 3 rgs
        k[1][0]= new int [2];
        k[1][1] = new int[5];
        k[1][2] = new int[4];
        
        //asignamos datos, se supone que los pedimos
        k[0][1][2]= 7; 
        k[1][1][3]=6;
        k[1][2][3]=3;
        
        //Ejemplo de recorrido
        int m[][][] = {{{1, 2, 3, 4, 5},
                        {1, 2, 3},
                        {1, 2, 3, 5, 5, 6}},
            
                        {{7, 2, 3, 4},
                        {8, 2},
                        {9, 2, 3, 4, 5}}};
        
        
        //mostramos los datos del cubo
         

        for (int i = 0; i < m.length; i++) { //longitud de caras del cubo
            for (int l = 0; l<m[i].length; l++) {// longitud de filas de cada cara
                for (int n = 0; n<m[i][l].length; n++) { // longitud de columnas de cada reglon
                    System.out.print(m[i][l][n] + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}