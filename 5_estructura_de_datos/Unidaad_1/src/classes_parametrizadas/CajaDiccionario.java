
package classes_parametrizadas;

import java.util.HashMap;

public class CajaDiccionario <P, S>{
    
    HashMap<P, S> direccioando = new HashMap<>();

    
    public void agregar(P palabra, S significado){
        direccioando.put(palabra, significado);
    }
    
    public S getSignificado(P palabra){
        return direccioando.get(palabra); //Regresa el valor y no la palabra
    }
    
}
