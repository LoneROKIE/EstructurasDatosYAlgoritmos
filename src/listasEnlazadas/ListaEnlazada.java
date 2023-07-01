
package listasEnlazadas;

/**
 *
 * @author LoneROKIE
 * 
 * La clase ListaEnlazada es la implementacion de la lista enlazada.
 * Tiene un campo para la cabeza de la lista y un campo para almacenar el 
 * tamanio de la lista. La lista se construye inicialmente con la cabeza
 * establecida como 'null' y un tamanio de 0.
 * 
 */
public class ListaEnlazada {
    
    private Nodo cabeza;
    private int tamanio;
    
    public ListaEnlazada(){
        cabeza = null;
        tamanio = 0;
    }
    
    public void agregar(int dato){
        /*
        El método agregar(int dato) se encarga de agregar un nuevo nodo al final
        de la lista. Si la lista está vacía, el nuevo nodo se convierte en la 
        cabeza. En caso contrario, se recorre la lista hasta llegar al último 
        nodo y se establece el siguiente nodo como el nuevo nodo.
        */
        Nodo nuevoNodo = new Nodo(dato);
        
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            Nodo nodoActual = cabeza;
            while(nodoActual.siguiente != null){
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
        tamanio++;
    }
    
    public void imprimir(){
        /*
        Recorre e imprime todos los nodos de la lista enlazada
        */
        Nodo nodoActual = cabeza;
        while(nodoActual != null){
            System.out.println(nodoActual.dato);
            nodoActual = nodoActual.siguiente;
        }
    }
    
    public int obtenerTamanio(){
        /*
        obtiene el tamanio de la lista
        */
        return tamanio;
    }
}
