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
public class Ghoul extends Esbirro implements IEsbirros {

    private int dependencia;

    public Ghoul(String nombre, int salud) {
        super(nombre, salud);

    }

    @Override
    public void rellenarPropiedadesEspec() {
        Scanner escanerGhoul = new Scanner(System.in);
        System.out.println("Introduzca el valor de dependencia: ");
        int valorDependencia = escanerGhoul.nextInt();
        dependencia = valorDependencia;
    }

    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

}
