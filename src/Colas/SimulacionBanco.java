
package Colas;


public class SimulacionBanco {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        //Agregar 5 cliente a la fila
        for(int i=0; i<5; i++){
            Cliente cliente = new Cliente();
            banco.agregarCliente(cliente);
        }
        
        //atender al siguiente cliente de la fila
        banco.atenderCliente();
        
        //agregar otros 3 cliente a la fila
        for(int i=0; i<3; i++){
            Cliente cliente = new Cliente();
            banco.agregarCliente(cliente);
        }
        
       //atender a los clientes restantes
       while(!banco.getFila().isEmpty()){
        banco.atenderCliente();
    }
        
        
        
    }
    
    
}
