/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_parametrizadas;

import java.util.ArrayList;

/**
 *
 * @author mavel
 */
public class CajaLista<T> {

    ArrayList<T> lista = new ArrayList<>();

    public void Agregar(T elemento) {
        lista.add(elemento);
    }

    public T getElemento(int index) {
        if (getTamanio() > index) {
            return lista.get(index);
        } else {
            return null;
        }
    }

    public int getTamanio() {
        return lista.size();
    }

    public boolean eliminar(int index) {
        if (getTamanio() > index) {
            lista.remove(index);
            return true;
        } else {
            return false;
        }
    }

}
