
package Colas;
import java.util.LinkedList;
import java.util.Queue; // importamos las colas
public class Banco {
    
    private Queue<Cliente> fila;
    
    public Banco(){
        fila = new LinkedList<>();
    }
    
    public void agregarCliente(Cliente cliente){
        fila.offer(cliente);
        System.out.println("Cliente: "+ cliente.getNumeroTurno() + " agregado a la fila");
    }
    
    public void  atenderCliente(){
        if(fila.isEmpty()){
            System.out.println("No hay clientes en la Fila");
        }else{
            Cliente cliente = fila.poll();
            System.out.println("Atendiendo Cliente "+cliente.getNumeroTurno());
        }
    }
    
  public Queue<Cliente> getFila(){
      return fila;
  }  
    
    
    
    
}
