
package Stacks;


public class TestPila {
    
    
    public static void main(String[] args) {
        
        Pila pila = new Pila(4);
        
        pila.empujar(1);
        pila.empujar(10);
        pila.empujar(11);
        pila.empujar(12);
        System.out.println("Pila Recorrida con los valores dados");
        pila.RecorrerPila();
        System.out.println("Pila Recorrida despuesd de eliminar el valor Top");
        pila.Estallar();
        pila.RecorrerPila();
        
        
        
    }
    
    
    
}
