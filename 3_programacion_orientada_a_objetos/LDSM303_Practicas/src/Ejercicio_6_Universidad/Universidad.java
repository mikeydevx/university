package Ejercicio_6_Universidad;

public class Universidad {

    private String Nombre;
    private int Pos;
    private String Url;

    public Universidad() {

    }

    public Universidad(String N, String U, int P) {
        this.Nombre = N;
        this.Url = U;
        this.Pos = P;
    }

    public void setNombre(String N) {
        this.Nombre = N;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setUrl(String U) {
        this.Url = U;
    }

    public String getUrl() {
        return this.Url;
    }

    public String getMatricula() {
        return this.Url;
    }

    public void setPos(int P) {
        this.Pos = P;
    }

    public int getPos() {
        return this.Pos;
    }

}
