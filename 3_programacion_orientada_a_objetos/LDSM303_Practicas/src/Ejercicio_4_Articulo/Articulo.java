package Ejercicio_4_Articulo;

public class Articulo {

    private String IDarticulo;
    private String Descripcion;
    private int existencia;
    private int precio;

    public Articulo() {

    }

    public Articulo(String i, String d, int e, int p) {
        this.IDarticulo = i;
        this.Descripcion = d;
        this.existencia = e;
        this.precio = p;
    }

    public void setIDarticulo(String i) {
        this.IDarticulo = i;
    }

    public String getIDarticulo() {
        return this.IDarticulo;
    }

    public void setDescripcion(String d) {
        this.Descripcion = d;
    }

    public String getIDescripcion() {
        return this.Descripcion;
    }

    public void setExistencia(int e) {
        this.existencia = e;
    }

    public int getExistencia() {
        return this.existencia;
    }

    public void setPrecio(int p) {
        this.precio = p;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void ventaArticulo(int c) {
        if (c > existencia) {

        } else {
            this.existencia -= c;
        }
    }
    
    public String mostrarDatos(){
        return "ID_Articulo: " + this.getIDarticulo() + "\n" +
                "Descripcion: " + this.getIDescripcion() + "\n" + 
                "Existencia: " + this.getExistencia()  + "\n" +
                "Precio: " + this.precio + "\n";
    }

}
