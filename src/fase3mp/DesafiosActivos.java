/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class DesafiosActivos {
    private ArrayList<Desafio> desafios;
    
    public void guardarDesafio(Desafio desafio){
        desafios.add(desafio);
    }
    public Desafio obtenerDesafio(){ //devolvera el desafio mas antiguo
        Desafio desafioDev = desafios.get(0); 
        desafios.remove(0);
        return desafioDev;    
    }
    
}
