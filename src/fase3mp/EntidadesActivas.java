/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class EntidadesActivas {
    private ArrayList<Personaje> personajes;
    private ArrayList<Arma> armas;
    private ArrayList<Armadura> armaduras;
    private ArrayList<Fortaleza> fortalezas;
    private ArrayList<Debilidad> debilidades;

    public ArrayList<Fortaleza> getFortalezas() {
        return fortalezas;
    }

    public ArrayList<Debilidad> getDebilidades() {
        return debilidades;
    }
    
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
    public Personaje elegirPersonaje(int eleccion){
        return personajes.get(eleccion);
    }
    public Arma elegirArma(int eleccion){
        return armas.get(eleccion);
    }
    
    public Armadura elegirArmadura(int eleccion){
        return armaduras.get(eleccion);
    }
    
    public Fortaleza elegirFortaleza(int eleccion) {
        return fortalezas.get(eleccion);
    }
    
    public Debilidad elegirDebilidad(int eleccion) {
        return debilidades.get(eleccion);
    }
    
    public ArrayList<Integer> MostraryElegir(String objetoMostrar){//se podrian poner if para controlar que meta un numero 
        Scanner escaner = new Scanner(System.in);//en el rango correcto
        if (objetoMostrar.equals("PERSONAJES")){
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println("Personaje " + i + personajes.get(i));
            }
            System.out.println((personajes.size()+1)+" Salir");
            int personajeEle = escaner.nextInt();
            ArrayList<Integer> personajesElegidos = new ArrayList<>();
            personajesElegidos.add(personajeEle);
            return personajesElegidos;      
        }
        else if (objetoMostrar.equals("ARMAS")){
            int armaEle = 0;
            for (int i = 0; i < armas.size(); i++) {
                System.out.println("Arma " + i + armas.get(i).getNombre());
            }
            System.out.println((armas.size()+1)+" Salir");
            while(armaEle != armas.size()+1){//habria que limitar para que no acepte enteros mayores que el size
                armaEle = escaner.nextInt();
                ArrayList<Integer> armasElegidas = new ArrayList<>();
                armasElegidas.add(armaEle);
                return armasElegidas;
            }
        }
        else if (objetoMostrar.equals("ARMADURAS")){
            int armaduraEle = 0;
            for (int i = 0; i < armaduras.size(); i++) {
                System.out.println("Armadura " + i + armaduras.get(i).getNombre());
            }
            System.out.println((armaduras.size()+1)+" Salir");
            while(armaduraEle != armaduras.size()+1){
                armaduraEle = escaner.nextInt();
                ArrayList<Integer> armadurasElegidas = new ArrayList<>();
                armadurasElegidas.add(armaduraEle);
                return armadurasElegidas;
            }
        }
        else if (objetoMostrar.equals("FORTALEZAS")){
            int fortalezaEle = 0;
            for (int i = 0; i < fortalezas.size(); i++) {
                System.out.println("Fortaleza "+ i + fortalezas.get(i).getNombre());
            System.out.println((fortalezas.size()+1)+" Salir");
            while(fortalezaEle != fortalezas.size()+1){
                fortalezaEle = escaner.nextInt();
                ArrayList<Integer> fortalezasElegidas = new ArrayList<>();
                fortalezasElegidas.add(fortalezaEle);
                return fortalezasElegidas;
            }
            
        }
        }
        else {
           System.out.println("No existe el contenido "+ objetoMostrar);
           return null;
        }
        return null;
    }


}
