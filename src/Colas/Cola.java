package Colas;

import java.util.LinkedList;

public class Cola {

    private LinkedList<Object> elementos;

    // constructor
    public Cola() {
        elementos = new LinkedList<>();
    }

    public void encolar(Object elemento) {
        elementos.addLast(elemento); //agrega elemento al final de la lista
    }

    public Object desencolar() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia. No se pueden eliminar datos");
            return null; // devuelve null
        } else {
            return elementos.removeFirst(); // elimina el primer elemento
        }
    }

    public Object frente() {
        if(estaVacia()){
            System.out.println("La cola esta vacia. No hay elementos a mostrar");
            return null;
        }else{
            return elementos.getFirst(); // devuelve el primer elemento de la lista
        }
    }
    
    public boolean estaVacia(){
        return elementos.isEmpty();
    }
    
    public int size(){
        return elementos.size();
    }
    
    

}
