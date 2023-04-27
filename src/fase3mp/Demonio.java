/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author d.rubio.2019
 */
public class Demonio extends Esbirro implements IEsbirros {

    private ArrayList<Esbirro> esbirros;
    private boolean tienePacto;
    private Pacto pacto;
    private FabricaEsbirros fabricaEsbirros;
    private EntidadesActivas entidades;

    public Demonio(String nombre, int salud) {
        super(nombre, salud);
    }

    public void setBooleanPacto(boolean tienePacto) {
        this.tienePacto = tienePacto;
    }

    public void setPacto(Pacto pacto) {
        this.pacto = pacto;
    }

    public void setFabricaEsbirros(FabricaEsbirros fabricaEsbirros) {
        this.fabricaEsbirros = fabricaEsbirros;
    }

    public ArrayList<Esbirro> getEsbirros() {
        return esbirros;
    }

    public boolean getTienePacto() {
        return tienePacto;
    }

    public Pacto getPacto() {
        return pacto;
    }

    public void setEntidades(EntidadesActivas entidades) {
        this.entidades = entidades;
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
            int eleccionEsbirro = 0;
            while (eleccionEsbirro != 4) {
                System.out.println("Desea aniadir esbirros que esten en el sistema o crear nuevos: ");
                System.out.println("1-Aniadir conjunto de esbirros sistema ");
                System.out.println("2-Crear nuevos "); //// habra que añadirlos a entidades activas
                System.out.println("3-Aniadir un esbirro del sistema");
                System.out.println("4-Salir");
                eleccionEsbirro = escanerDemon.nextInt();
                switch (eleccionEsbirro) {
                    case 1 -> {
                        // habria que contemplar la opcion de que elija solo un esbirro
                        ArrayList<Integer> esbirrosEle = entidades.MostraryElegir("ESBIRROS");
                        for (int i = 0; i < esbirrosEle.size(); i++) {
                            esbirros.add(entidades.obtenerEsbirro(esbirrosEle.get(i)));
                        }
                    }
                    case 2 -> {
                        ArrayList<Esbirro> esbirrosDeEsbirro = new ArrayList<>();
                        String tipoEsbirro = "";
                        while (!tipoEsbirro.equals("salir")) {
                            System.out.println("Va a crear un nuevo esbirro");
                            System.out.println(
                                    "De que tipo seran los esbirros, ghoul o demonio. Escriba salir para terminar.");
                            escanerDemon.nextLine();
                            tipoEsbirro = escanerDemon.nextLine();
                            tipoEsbirro = tipoEsbirro.toLowerCase().trim();
                            if (!(tipoEsbirro.equals("salir"))) {
                                System.out.println("Introduzca el nombre que le quiere poner al esbirro: ");
                                String nombreEsbirro = escanerDemon.nextLine();
                                System.out.println("Introduzca la salud del esbirro: ");
                                switch (tipoEsbirro) {
                                    case "ghoul" -> {
                                        int saludGhoul = escanerDemon.nextInt();
                                        fabricaEsbirros = new FabricaGhoul();
                                        Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludGhoul);
                                        ghoul.rellenarPropiedadesEspec();
                                        entidades.aniadir(ghoul);
                                        esbirrosDeEsbirro.add(ghoul);
                                    try {
                                        entidades.GuardarEsbirroFichero(ghoul);
                                    } catch (IOException ex) {
                                        Logger.getLogger(Demonio.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    }
                                    case "demonio" -> { // se le rellenaran sus esbirros de forma recursiva
                                        int saludDemonioEsbi = escanerDemon.nextInt();
                                        fabricaEsbirros = new FabricaDemonio();
                                        Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsbirro,saludDemonioEsbi);        
                                        demonio.rellenarPropiedadesEspec();
                                        entidades.aniadir(demonio);
                                        esbirrosDeEsbirro.add(demonio);
                                    try {
                                        entidades.GuardarEsbirroFichero(demonio);
                                    } catch (IOException ex) {
                                        Logger.getLogger(Demonio.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    }
                                    default -> {
                                        System.out.println("Nombre de esbirro no correcto");
                                    }
                                }
                            } else {
                                System.out.println("No se aniadiran mas esbirros a " + super.getNombre());
                                esbirros = esbirrosDeEsbirro;
                            }

                        }
                    }
                    case 3 -> {
                        ArrayList<Integer> esbirroEle = entidades.MostraryElegir("ESBIRRO");
                        esbirros.add(entidades.obtenerEsbirro(esbirroEle.get(0)));
                    }
                    case 4 -> {
                        break;
                    }
                    default -> {
                        System.out.println("Opcion no valida");
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
