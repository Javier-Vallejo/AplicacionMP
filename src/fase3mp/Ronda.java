package fase3mp;

import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juana
 */
public class Ronda {

    private int PotencialPer1;
    private int PotencialPer2;
    private int vidaDesafiante;
    private int vidaDesafiado;
    
    
    
    public ArrayList<Integer> Calculo_Potencial(Personaje per1, Personaje per2, ArrayList<Fortaleza> fortalezasElegidasDesafiante,
    ArrayList<Debilidad> debilidadesElegidasDesafiante,
    ArrayList<Fortaleza> fortalezasElegidasDesafiado,
    ArrayList<Debilidad> debilidadesElegidasDesafiado){
        ArrayList<Integer> potenciales = new ArrayList<>();
        int danio1 = this.CalcularDanio(per1);
        int defensa1 = this.CalcularDefensa(per1);
        int danio2 = this.CalcularDanio(per2);
        int defensa2 = this.CalcularDefensa(per2);
        
        String[] climas = {"soleado","luna llena"};
        int numeroClima = (int) (Math.floor(Math.random()*(0-1+1)+1));  // Valor entre M y N, ambos incluidos.
        String tiempoCombate = climas[numeroClima];

        // danio1 = comprobarDebilidades(tiempoCombate,per1,danio1,per2);
        // danio2 = comprobarDebilidades(tiempoCombate,per2,danio2,per1);


        
        // danio1 = comprobarFortalezas( tiempoCombate,  per1,   danio1,  per2);
        // danio2 = comprobarFortalezas( tiempoCombate,  per2,   danio2,  per2);

        for (Debilidad debilidad : debilidadesElegidasDesafiante) {
                danio1 = danio1 - debilidad.debilitar();
        }


        for (Debilidad debilidad : debilidadesElegidasDesafiado) {
            danio2 = danio2 - debilidad.debilitar();
        }

        for (Fortaleza fortaleza : fortalezasElegidasDesafiante) {
            danio1 = danio1 + fortaleza.Fortalecer();
        }

        for (Fortaleza fortaleza : fortalezasElegidasDesafiado) {
            danio2 = danio2 + fortaleza.Fortalecer();
        }
        int potencial1 = danio1-defensa2;
        int potencial2 = danio2-defensa1;

        potenciales.add(potencial1);
        potenciales.add(potencial2);
        
        return potenciales;
    }
    
    private int CalcularDanio(Personaje perX){
        return perX.calculoDanio();
        
    }
    private int CalcularDefensa(Personaje perX){
        return perX.calculoDefensa();
        
    }
    public int[] CalcularVidaRestante(ArrayList<Integer> potenciales, int vida1, int vida2){
        int pot1 = potenciales.get(0);
        int pot2 = potenciales.get(1);
        int daño1 = 0;
        int daño2 = 0;
        
        Random rand = new Random();
        
        for (int i = 0; i < pot1; i++) {
           //int numero = rand.nextInt(10);
           int dado = (int) (Math.floor(Math.random()*(6-0+1)+0));
           if (dado > 5){
               daño1 = daño1 + 1;
           }
        }
        for (int i = 0; i < pot2; i++) {
           //int numero = rand.nextInt(10);
           int dado = (int) (Math.floor(Math.random()*(6-0+1)+0));
           if (dado > 5){
               daño2 = daño2 + 1;
           }
        }
        vida1 = vida1 - daño2;
        vidaDesafiante = vida1;
        vida2 = vida2 - daño1;
        vidaDesafiado = vida2;

        int[] vidasActualizadas = new int[2];
        vidasActualizadas[0] = vidaDesafiante;
        vidasActualizadas[1] = vidaDesafiado;
        
        return vidasActualizadas;
    }

    
    public int getPotencialPer1() {
        return PotencialPer1;
    }
    public void setPotencialPer1(int potencialPer1) {
        PotencialPer1 = potencialPer1;
    }
    public int getPotencialPer2() {
        return PotencialPer2;
    }
    public void setPotencialPer2(int potencialPer2) {
        PotencialPer2 = potencialPer2;
    }

    public int getVidaDesafiante() {
        return vidaDesafiante;
    }

    public void setVidaDesafiante(int vidaDesafiante) {
        this.vidaDesafiante = vidaDesafiante;
    }

    public int getVidaDesafiado() {
        return vidaDesafiado;
    }

    public void setVidaDesafiado(int vidaDesafiado) {
        this.vidaDesafiado = vidaDesafiado;
    }
    
    
    
}
