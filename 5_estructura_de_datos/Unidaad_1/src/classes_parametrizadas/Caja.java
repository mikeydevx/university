package classes_parametrizadas;

public class Caja<T> {
    private T dato;
    
    public Caja(){
      
    }
    
    public Caja(T dato) {
        this.dato = dato;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }
    
    
}
