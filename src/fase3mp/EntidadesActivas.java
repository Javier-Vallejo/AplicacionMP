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

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Armadura> getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(ArrayList<Armadura> armaduras) {
        this.armaduras = armaduras;
    }
    
    
    
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
    public void Mostrar(String objetoMostrar){
       if (objetoMostrar.equals("PERSONAJES")){
           for (int i = 0; i < personajes.size(); i++) {
               System.out.println("Personaje " + i + personajes.get(i));
           }
       }
       else if (objetoMostrar.equals("ARMAS")){
           for (int i = 0; i < armas.size(); i++) {
               System.out.println("Arma " + i + armas.get(i));
           }
           
       }
       else if (objetoMostrar.equals("ARMADURAS")){
           for (int i = 0; i < armaduras.size(); i++) {
               System.out.println("Armadura " + i + armaduras.get(i));
           }
           
       }
       else {
           System.out.println("No existe el contenido "+ objetoMostrar);
       }
    }
}
