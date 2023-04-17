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
public abstract class Personaje { //a lo mejor habria que hacer que fueran ArrayList
    private String nombre;
    private Habilidad habilidadPersonaje;
    private Arma[] armas;
    private Arma[] armasActivas;
    private Armadura[] armaduras;
    private Armadura armaduraActiva;
    private Esbirro[] esbirros;
    private int Salud;
    private int Poder;
    private Array[] debilidades;
    private Array[] fortalezas;
    
    public int devolverPoder  () {
        return Poder;
    }

    public Habilidad devolverHabilidad  () {
        return habilidadPersonaje;
    }

    public int devolverDañoArma () {
        int dañoArma = 0;
        for (int i = 0; i < armasActivas.length; i++) {
              dañoArma += armasActivas[i].devolverModificadores();     
         } 
        return dañoArma;
    }


    public int devolverDefensaArma () {
        
        return armaduraActiva.devolverModificadores();
    }

    public abstract int calculoDanio();

    public abstract int calculoDefensa();

    
    public int calculoVida(){

        int vidaPersonaje = this.Salud;
        int saludTotal = 0;
        saludTotal +=vidaPersonaje;
        for (int i = 0; i < esbirros.length; i++) {
            Esbirro esbirro = esbirros[i];
            int saludEsbirro = esbirro.devolverSalud();
            saludTotal += saludEsbirro;          
         } 
        return saludTotal;
    }

    void editarPersonaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int devolverDañoHabilidad(Habilidad habilidad) {
        return habilidad.getValorAtaque();
    }
}
