/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.lang.reflect.Array;

/**
 *
 * @author david
 */
public class Personaje { //a lo mejor habria que hacer que fueran ArrayList
    private String nombre;
    private Habilidad habilidadPersonaje;
    private Array[] armas;
    private Array[] armasActivas;
    private Array[] armaduras;
    private Armadura armaduraActiva;
    private Esbirro[] esbirros;
    private int Salud;
    private int Poder;
    private Array[] debilidades;
    private Array[] fortalezas;
    
    
    public int calculoDanio(){
        return 0;
    }
    
    public int calculoDefensa(){
        return 0;
    }
    
    public int calculoVida(){
        //Esbirro[ ] esbirros = new Esbirro[10];  //Array de 4 elementos


        int vidaPersonaje = this.Salud;
        int saludTotal = 0;
        saludTotal +=vidaPersonaje;
        for (int i = 0; i < 2; i++) {
            Esbirro esbirro = esbirros[i];
            int saludEsbirro = esbirro.devolverSalud();
            saludTotal += saludEsbirro;          
         } 
        return saludTotal;
    }

    void editarPersonaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
