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
public class Licantropo extends Personaje {

    private int rabia;

    public Licantropo(String nombre, Habilidad habilidadPersonaje, Arma[] armas, Arma[] armasActivas,
            Armadura[] armaduras,
            Armadura armaduraActiva, Esbirro[] esbirros, int Salud, int Poder, Debilidad[] debilidades,
            Fortaleza[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder,
                debilidades, fortalezas);
    }

    public void setRabia(int rabia) {
        this.rabia = rabia;
    }

    @Override
    public void rellenarPropiedadesEspecificas() {
        System.out.println("Introduzca el valor de rabia: ");
        try(Scanner escanerlican = new Scanner(System.in);){
            int valorRabia = escanerlican.nextInt();
            rabia = valorRabia;
        }
        
    }

    @Override
    public Personaje clonar() {
        Licantropo licantropoCopia = new Licantropo(super.getNombre(), super.getHabilidadPersonaje(), super.getArmas(),
                super.getArmasActivas(), super.getArmaduras(), super.getArmaduraActiva(), super.getEsbirros(),
                super.getSalud(), super.getPoder(), super.getDebilidades(), super.getFortalezas());
        licantropoCopia.setRabia(rabia);
        return licantropoCopia;
    }

    @Override
    public int calculoDanio() {
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad)
                + activarDon(rabia, "Ataque") + rabia;
    }

    private int activarDon(int rabia, String opcion) {
        Dones dones = (Dones) super.devolverHabilidad();
        int danioBase = super.devolverDañoHabilidad(dones);
        if (rabia >= dones.getLimitante() && opcion.equals("Ataque")) {
            return dones.activar(danioBase, opcion);
        } else if ((rabia >= dones.getLimitante() && opcion.equals("Defensa"))) {
            return dones.activar(danioBase, opcion);
        }
        return 0;
    }

    @Override
    public int calculoDefensa() {
        Dones dones = (Dones) super.devolverHabilidad();
        return super.devolverDefensaArma() + dones.getValorDefensa() + activarDon(rabia, "Defensa");
    }

}