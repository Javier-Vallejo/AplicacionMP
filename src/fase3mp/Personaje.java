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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habilidad getHabilidadPersonaje() {
        return habilidadPersonaje;
    }

    public void setHabilidadPersonaje(Habilidad habilidadPersonaje) {
        this.habilidadPersonaje = habilidadPersonaje;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public void setArmas(Arma[] armas) {
        this.armas = armas;
    }

    public Arma[] getArmasActivas() {
        return armasActivas;
    }

    public void setArmasActivas(Arma[] armasActivas) {
        this.armasActivas = armasActivas;
    }

    public Armadura[] getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(Armadura[] armaduras) {
        this.armaduras = armaduras;
    }

    public Armadura getArmaduraActiva() {
        return armaduraActiva;
    }

    public void setArmaduraActiva(Armadura armaduraActiva) {
        this.armaduraActiva = armaduraActiva;
    }

    public Esbirro[] getEsbirros() {
        return esbirros;
    }

    public void setEsbirros(Esbirro[] esbirros) {
        this.esbirros = esbirros;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public Array[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(Array[] debilidades) {
        this.debilidades = debilidades;
    }

    public Array[] getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(Array[] fortalezas) {
        this.fortalezas = fortalezas;
    }
    
    
    
    
    public int devolverPoder  () {
        return Poder;
    }

    public Habilidad devolverHabilidad  () {
        return habilidadPersonaje;
    }

    public int devolverDañoArma () {
        int dañoArma = 0;
        for (int i = 0; i < armasActivas.length; i++) {
              dañoArma += armasActivas[i].devolverAtaque();     
         } 
        return dañoArma;
    }


    public abstract int calculoDanio();

    public int calculoDefensa(){
        return 0;
    }
    
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
