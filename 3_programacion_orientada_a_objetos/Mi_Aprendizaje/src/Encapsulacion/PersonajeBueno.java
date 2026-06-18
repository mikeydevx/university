
package Encapsulacion;
public class PersonajeBueno {
    //Privado: Nadie fuera de este archivo pude tocar la varible
    private int salud = 100;
    
    //MÉTODO: Es la unica "puerta" para alterar la salud, y tiene reglas. 
    public void recibirDano(int cantidad){
        if (this.salud - cantidad >=0){
            this.salud = this.salud - cantidad;
        }else{
            this.salud = 0; //Evita que la salud sea negativa
        } 
    }
    
    public int getSalud(){
        return this.salud;
    }
    
    
}
