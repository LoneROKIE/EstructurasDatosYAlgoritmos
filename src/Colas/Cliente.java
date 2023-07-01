
package Colas;


public class Cliente {
    private static int numeroTurnoActual = 1;
    private int numeroTurno;
    
    public Cliente(){
        numeroTurno = numeroTurnoActual++;
    }
    
    public int getNumeroTurno(){
        return numeroTurno;
    }
    
    
    
}
