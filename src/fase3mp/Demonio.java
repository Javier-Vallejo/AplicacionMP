/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class Demonio extends Esbirro implements IEsbirros {

    private ArrayList<Esbirro> esbirros;
    private boolean tienePacto;
    private Pacto pacto;
    private FabricaEsbirros fabricaEsbirros;

    public Demonio(String nombre, int salud) {
        super(nombre, salud);
    }
    
    public void setBooleanPacto (boolean tienePacto) {
        this.tienePacto = tienePacto;
    }

    public void setPacto(Pacto pacto) {
        this.pacto = pacto;
    }

    public void setFabricaEsbirros(FabricaEsbirros fabricaEsbirros) {
        this.fabricaEsbirros = fabricaEsbirros;
    }

    @Override
    public void rellenarPropiedadesEspec() {
        Scanner escanerDemon = new Scanner(System.in);
        
        System.out.println("Tiene pacto su demonio? Si o no");
        String tienePact = escanerDemon.nextLine();
        tienePact = tienePact.toLowerCase().trim();
        if (tienePact.equals("si")) {
            tienePacto = true;
            Pacto pactoDem = new Pacto();
            pacto = pactoDem;
        } else if (tienePact.equals("no")) {
            tienePacto = false;
        }
        System.out.println("Tiene esbirros tu demonio? Si o no");
        String tieneEsbi = escanerDemon.nextLine();
        tieneEsbi = tieneEsbi.toLowerCase().trim();
        if (tieneEsbi.equals("si")) {
            ArrayList<Esbirro> esbirrosDeEsbirro = new ArrayList<>();
            String tipoEsbirro = "";
            while(!tipoEsbirro.equals("salir")){
                System.out.println("De que tipo seran los esbirros, ghoul o demonio. Escriba salir para terminar.");
                tipoEsbirro = escanerDemon.nextLine();
                tipoEsbirro = tipoEsbirro.toLowerCase().trim();
                System.out.println("Introduzca el nombre que le quiere poner al esbirro: ");
                String nombreEsbirro = escanerDemon.nextLine();
                System.out.println("Introduzca la salud del esbirro: ");
                switch (tipoEsbirro) {
                    case "ghoul" -> {
                        int saludGhoul = escanerDemon.nextInt();
                        fabricaEsbirros = new FabricaGhoul();
                        Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludGhoul);
                        ghoul.rellenarPropiedadesEspec();
                        esbirrosDeEsbirro.add(ghoul);
                    }
                    case "demonio" -> { // se le rellenaran sus esbirros de forma recursiva
                        int saludDemonioEsbi = escanerDemon.nextInt();
                        fabricaEsbirros = new FabricaDemonio();
                        Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludDemonioEsbi);
                        demonio.rellenarPropiedadesEspec();
                        esbirrosDeEsbirro.add(demonio);
                    }
                    case "salir" -> {
                        System.out.println("No se aniadiran mas esbirros a " + super.getNombre());
                        esbirros = esbirrosDeEsbirro;
                    }
                    default -> {
                        System.out.println("Nombre de esbirro no correcto");
                    }
                }
            }
        } else if (tieneEsbi.equals("no")) {
            System.out.println("No se aniadiran esbirros a " + super.getNombre());
        }
    }

    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int devolverSalud() {
        int saludTotal = super.devolverSalud();
        if (tieneEsbirros()) {

            for (int i2 = 0; i2 < esbirros.size(); i2++) {
                Esbirro esbirro = esbirros.get(i2);
                int saludEsbirro = esbirro.devolverSalud();
                saludTotal += saludEsbirro;
            }
        }
        return saludTotal;
    }

    public boolean tieneEsbirros() {
        return esbirros.size() > 0;

    }
}
