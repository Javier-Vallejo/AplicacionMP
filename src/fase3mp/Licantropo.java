package fase3mp;

import java.util.Scanner;

public class Licantropo extends Personaje {

    private int rabia;

    public Licantropo(String nombre, Habilidad habilidadPersonaje, Arma[] armas, Arma[] armasActivas,
            Armadura[] armaduras,
            Armadura armaduraActiva, Esbirro[] esbirros, int Salud, int Poder, Debilidad[] debilidades,
            Fortaleza[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder,
                debilidades, fortalezas);
    }

    public int getRabia() {
        return rabia;
    }

    public void setRabia(int rabia) {
        this.rabia = rabia;
    }

    @Override
    public void rellenarPropiedadesEspecificas() {
        System.out.println("Introduzca el valor de rabia: ");
        Scanner escanerlican = new Scanner(System.in);

        int valorRabia = escanerlican.nextInt();
        rabia = valorRabia;

    }

    @Override
    public Personaje clone() {
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
        Habilidad habilidad = super.devolverHabilidad();
        String nombre = habilidad.getNombre();
        int ataque = habilidad.getValorAtaque();
        int defensa = habilidad.getValorDefensa();
        int limitante = habilidad.getLimitante();
        Dones don = new Dones(nombre, ataque, defensa, limitante);
        int danioBase = super.devolverDañoHabilidad(don);
        if (rabia >= don.getLimitante() && opcion.equals("Ataque")) {
            return don.activar(danioBase, opcion);
        } else if ((rabia >= don.getLimitante() && opcion.equals("Defensa"))) {
            return don.activar(defensa, opcion);
        }
        return 0;
    }

    @Override
    public int calculoDefensa() {
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverDefensaArma() + habilidad.getValorDefensa() + activarDon(rabia, "Defensa");
    }

}
