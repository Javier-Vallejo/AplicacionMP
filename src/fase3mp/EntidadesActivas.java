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
public class EntidadesActivas {
    private ArrayList<Personaje> personajes;
    private ArrayList<Arma> armas;
    private ArrayList<Armadura> armaduras;
    
    public void aniadir(Object objeto){
        //comprobar de que clase es objeto y meterlo en su respectiva lista
        if(objeto instanceof Personaje){
            Personaje personaje = (Personaje) objeto;
            personajes.add(personaje);
        }
        else if(objeto instanceof Arma){
            Arma arma = (Arma) objeto;
            armas.add(arma);
        }
        else if(objeto instanceof Armadura){
            Armadura armadura = (Armadura) objeto;
            armaduras.add(armadura);
        }
    }
    public Personaje elegirPersonaje(){
        return null;
    }
    public Arma elegirArma(){
        return null;
    }
    
    public Armadura elegirArmadura(){
        return null;
    }
}
