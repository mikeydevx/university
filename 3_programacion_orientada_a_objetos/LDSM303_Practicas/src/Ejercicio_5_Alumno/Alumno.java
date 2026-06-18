package Ejercicio_5_Alumno;
public class Alumno {
    private String Matricula;
    private String Nombre;
    private String Grupo;
    private String Carrera;
    
    public Alumno(){
        
    }
    
    public Alumno(String m, String n, String g, String c){
        this.Matricula=m;
        this.Nombre=n;
        this.Grupo=g;
        this.Carrera=c;   
    }
    
    public void setMatricula(String m){
        this.Matricula=m;
    }
    
    public  String getMatricula(){
        return this.Matricula;
    }
    
    public void setNombre(String n){
        this.Nombre=n;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setGrupo(String c){
        this.Grupo=c;
    }
    
    public String getGrupo(){
        return  this.Grupo;
    }
    
    public void setCarrera(String c){
        this.Carrera=c;
    }
    
    public String getCarrera(){
        return this.Carrera;
    }
    
    
    public String mostrarDatos() {
        return this.getMatricula() + "      "
                + this.getNombre() + "     "
                + this.getGrupo() + "      "
                + this.getCarrera() + "\n";
    }
}
