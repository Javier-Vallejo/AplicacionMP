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
    private Array[] esbirros;
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
        return 0;
    }
}
