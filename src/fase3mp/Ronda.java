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
    
    
    
    public ArrayList<Integer> Calculo_Potencial(Personaje per1, Personaje per2){
        ArrayList<Integer> potenciales = new ArrayList<>();
        int danio1 = this.CalcularDanio(per1);
        int defensa1 = this.CalcularDefensa(per1);
        int danio2 = this.CalcularDanio(per2);
        int defensa2 = this.CalcularDefensa(per2);
        
        String[] climas = {"soleado","luna llena"};
        Random randomClima = new Random();
        int numeroClima = (int) (Math.floor(Math.random()*(0-1+1)+1));  // Valor entre M y N, ambos incluidos.
        String tiempoCombate = climas[numeroClima];
        danio1 = comprobarDebilidades(tiempoCombate,per1,danio1,per2);
        danio2 = comprobarDebilidades(tiempoCombate,per2,danio2,per1);


        
        danio1 = comprobarFortalezas( tiempoCombate,  per1,   danio1,  per2);
        danio2 = comprobarFortalezas( tiempoCombate,  per2,   danio2,  per2);

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
    public void CalcularVidaRestante(ArrayList<Integer> potenciales, int vida1, int vida2){
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
        for (int i = 0; i < pot1; i++) {
           //int numero = rand.nextInt(10);
           int dado = (int) (Math.floor(Math.random()*(6-0+1)+0));
           if (dado > 5){
               daño2 = daño2 + 1;
           }
        }
        vida1 = vida1 - daño2;
        vida2 = vida2 - daño1;
        
    }

    public int comprobarDebilidades(String tiempo, Personaje personaje1,  int danio, Personaje personaje2) {

        if (tiempo.equals("soleado") && personaje1 instanceof Vampiro) {
            Debilidad debilidadActivada = personaje1.seleccionarDebilidad(tiempo);
            if (debilidadActivada != null) {
                return danio = danio * debilidadActivada.debilitar();
            }
            
        }
        else if (personaje1 instanceof Cazador && personaje2 instanceof Licantropo) {
            Debilidad debilidadActivada = personaje1.seleccionarDebilidad("Licantropo");
            if (debilidadActivada != null) {
                return danio = danio * debilidadActivada.debilitar();
            }
        }

        else if (personaje1 instanceof Licantropo && personaje2 instanceof Vampiro) {
            Debilidad debilidadActivada = personaje1.seleccionarDebilidad("Licantropo");
            if (debilidadActivada != null) {
                return danio = danio * debilidadActivada.debilitar();
            }
        }

        return danio;

    }

    private int comprobarFortalezas(String tiempo, Personaje personaje1,  int danio, Personaje personaje2) {
        if (tiempo.equals("luna llena") && personaje1 instanceof Licantropo) {
            Fortaleza fortalezaActiva = personaje1.seleccionarFortaleza(tiempo);
            if (fortalezaActiva != null) {
                return danio = danio * fortalezaActiva.Fortalecer();
            }
            
        }
        else if (personaje1 instanceof Cazador && personaje2 instanceof Licantropo) {
            Fortaleza fortalezaActiva = personaje1.seleccionarFortaleza("Licantropo");
            if (fortalezaActiva != null) {
                return danio = danio * fortalezaActiva.Fortalecer();
            }
        }

        else if (personaje1 instanceof Cazador && personaje2 instanceof Vampiro) {
            Fortaleza fortalezaActiva = personaje1.seleccionarFortaleza("Vampiro");
            if (fortalezaActiva != null) {
                return danio = danio * fortalezaActiva.Fortalecer();
            }
        }

        else if (personaje1 instanceof Licantropo && personaje2 instanceof Cazador) {
            Fortaleza fortalezaActiva = personaje1.seleccionarFortaleza("Cazador");
            if (fortalezaActiva != null) {
                return danio = danio * fortalezaActiva.Fortalecer();
            }
        }

        else if (personaje1 instanceof Vampiro && personaje2 instanceof Licantropo) {
            Fortaleza fortalezaActiva = personaje1.seleccionarFortaleza("Licantropo");
            if (fortalezaActiva != null) {
                return danio = danio * fortalezaActiva.Fortalecer();
            }
        }

        return danio;
    }
    
}
