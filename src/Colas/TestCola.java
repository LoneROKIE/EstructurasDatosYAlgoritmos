
package Colas;

import java.util.Iterator;


public class TestCola {
    
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        cola.encolar(10);
        cola.encolar(100);
        cola.encolar(200);
        
        //iterar cola
        while(!cola.estaVacia()){
            Object elemento = cola.frente();
            System.out.println("Elemento: "+ elemento);
            cola.desencolar();
        }
        
    }
}
