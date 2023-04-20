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
        
        String[] climas = {"soleado","luna llena","aniversario cazador"};
        Random randomClima = new Random();
        int nuemroClima = (int) (Math.floor(Math.random()*(0-2+1)+2));  // Valor entre M y N, ambos incluidos.
        String tiempoCombate = climas[nuemroClima];
        /*
         * Aqui faltaria tener en cuenta el tiempo elegido (tiempo Combate) para ver si hay que debilitar o no
         */

        int potencial1 = danio1-defensa2;
        int potencial2 = danio2-defensa1;
        
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
    
}
