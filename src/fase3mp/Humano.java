/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class Humano extends Esbirro implements IEsbirros {
    public enum nivelLealtad{ALTA, NORMAL, BAJA};
    private nivelLealtad lealtad;
    
    public Humano(String nombre, int salud) {
        super(nombre, salud);
        
    }

    @Override
    public void rellenarPropiedadesEspec() {
        Scanner escanerhuman = new Scanner(System.in);
        String nivelLeal = "";
        while(! nivelLeal.equals("alta")||! nivelLeal.equals("normal")||! nivelLeal.equals("baja")){
            System.out.println("Que nivel de lealtad quieres que tenga. Alta, normal o baja");
            nivelLeal = escanerhuman.nextLine();
            nivelLeal = nivelLeal.toLowerCase().trim();
            switch (nivelLeal) {
                case "alta" -> {
                    lealtad = nivelLealtad.ALTA;
                }
                case "normal" -> {
                    lealtad = nivelLealtad.NORMAL;
                }
                case "baja" -> {
                    lealtad = nivelLealtad.BAJA;
                }
                default -> {
                    System.out.println("Valor no correcto");
                }
            }
        }
    }
    
    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
