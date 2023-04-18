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
        
        Random rand = new Random();
        
        for (int i = 0; i < 2; i++) {
           int numero = rand.nextInt(10);
        }
        
    }
    
}
