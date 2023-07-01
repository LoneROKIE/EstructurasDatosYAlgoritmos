package Stacks;

public class Pila {

    private int[] elementos;
    private int top; // indice del elemento en la parte superior de la pila

    // este es como el constructor
    public Pila(int capacidad) {
        elementos = new int[capacidad];
        top = -1; // la pila esta vacia inicialmente
    }

    public void RecorrerPila(){
        for(int i =0; i<=top; i++){
            System.out.println("Elemento: "+elementos[i]);
        }
    }
    
    public void empujar(int elemento) {
        if (top == elementos.length - 1) {
            System.out.println("La pila esta llena. No se puede agregar mas datos");
        } else {
            top++;
            elementos[top] = elemento;
        }
    }

    public int Estallar() {
        if (top == -1) {
            System.out.println("La pila esta vacia. No se pueden eliminar datos");
            return -1; // valor sentinela que indica que la pila esta vacia
        } else {
            int elementoEliminado = elementos[top];
            top--;
            return elementoEliminado;
        }
    }
    
    public int pico(){
        if(top ==-1){
            System.out.println("La pila esta vacia. No hay elementos para mostrar");
            return -1; // valor sentinela que indica que la pila esta vacia
        }else{
            return elementos[top]; // devuelve el elemento en la posicion top, que deberia ser la ultima posicion
        }
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public int size(){
        return top+1;
    }
    
}


