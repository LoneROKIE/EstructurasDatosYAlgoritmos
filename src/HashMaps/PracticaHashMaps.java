
package HashMaps;

import java.util.HashMap;
import java.util.Map;


public class PracticaHashMaps {
    
    public static void main(String[] args) {
        
     String cadena = "Hola como estas Hola bien y tu ? genial gracias gracias a ti si jeje genial verdad si todo genial jeje";
     
     String[] textoSeparado = cadena.split("\\s+");
     
     HashMap<String,Integer> mapa = new HashMap<>();
     
     for(String textoS : textoSeparado){
         textoS.toLowerCase();
         // si la palabra ya esta en el mapa, incrementa su conteo
         if(mapa.containsKey(textoS)){
             int count = mapa.get(textoS);
             mapa.put(textoS, count+1);
         }else{
             // si la palabra no esta en el mapa agregala con un conteo
             mapa.put(textoS, 1);
         }
         
     }
     
     // imprime las palabras y sus conteos
     for(String palabra : mapa.keySet()){
         int count = mapa.get(palabra);
         System.out.println(palabra+": "+count);
     }
      
    }
}
