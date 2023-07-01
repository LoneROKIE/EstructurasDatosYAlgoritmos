
package listasEnlazadas;

/**
 * 
 * @author LoneROKIE
 * 
 * La clase nodo representa un nodo individual en la lista enlazada
 * y contiene un campo para almacenar el dato y una referencia al siguiente
 * nodo.
 * 
 * 
 */

public class Nodo {
    
    public int dato; 
    public Nodo siguiente;
    
    public Nodo(int dato){ 
        this.dato = dato;
        this.siguiente = null;
    }
    
    
}
