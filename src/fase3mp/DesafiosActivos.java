package fase3mp;

import java.util.ArrayList;

public class DesafiosActivos {

    
    public DesafiosActivos() {
        desafios = new ArrayList<Desafio>();
    }
    private ArrayList<Desafio> desafios;
    
    public void guardarDesafio(Desafio desafio){
        desafios.add(desafio);
    }
    public Desafio obtenerDesafio(){ 
        if(!desafios.isEmpty()) { //devolvera el desafio mas antiguo
            Desafio desafioDev = desafios.get(0); 
            desafios.remove(0);
            return desafioDev; 
    
        }
        return null;                            
          
    }
    
}
