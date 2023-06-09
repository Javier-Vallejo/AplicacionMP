/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author juana
 */
public class Combate {
    private Ronda[] rondas;
    private Jugador desafiante;
    private Jugador desafiado;
    private String fecha;
    private String Vencedor;
    private ArrayList<Personaje> jugadoresConEsbirros;
    private int oroGanado;
    private Personaje personaje1;
    private Personaje personaje2;
    private int vida1;
    private int vida2;

    public Combate(Jugador jugDesafiante, Jugador jugDesafiado, int oroApostado) {
        desafiante = jugDesafiante;
        desafiado = jugDesafiado;
        fecha = LocalDate.now().toString();
        oroGanado = oroApostado + 100;
        personaje1 = jugDesafiante.getPersonajeActivo();
        personaje2 = jugDesafiado.getPersonajeActivo();
        vida1 = personaje1.getSalud();
        vida2 = personaje2.getSalud();
    }

    public void setRondas(Ronda[] rondas) {
        this.rondas = rondas;
    }

    public Ronda[] getRondas() {
        return rondas;
    }

    public Jugador getDesafiante() {
        return desafiante;
    }

    public Jugador getDesafiado() {
        return desafiado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVencedor() {
        return Vencedor;
    }

    public ArrayList<Personaje> getJugadoresConEsbirros() {
        return jugadoresConEsbirros;
    }

    public int getOroGanado() {
        return oroGanado;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public int getVida1() {
        return vida1;
    }

    public int getVida2() {
        return vida2;
    }

    public void setDesafiante(Jugador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Jugador desafiado) {
        this.desafiado = desafiado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVencedor(String Vencedor) {
        this.Vencedor = Vencedor;
    }

    public void setJugadoresConEsbirros(ArrayList<Personaje> jugadoresConEsbirros) {
        this.jugadoresConEsbirros = jugadoresConEsbirros;
    }

    public void setOroGanado(int oroGanado) {
        this.oroGanado = oroGanado;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }

    public void setVida1(int vida1) {
        this.vida1 = vida1;
    }

    public void setVida2(int vida2) {
        this.vida2 = vida2;
    }

    public Ronda EmpezarRonda(Personaje per1, Personaje per2, int vida1, int vida2,
            ArrayList<Fortaleza> fortalezasElegidaDesafiante,
            ArrayList<Debilidad> debilidadesElegidaDesafiante,
            ArrayList<Fortaleza> fortalezasElegidaDesafiado,
            ArrayList<Debilidad> debilidadesElegidaDesafiado) {
        Ronda rondaX = new Ronda();
        ArrayList<Integer> potenciales = rondaX.Calculo_Potencial(per1, per2,fortalezasElegidaDesafiante,
         debilidadesElegidaDesafiante,
        fortalezasElegidaDesafiado,
        debilidadesElegidaDesafiado);
        int[] vidasActualizadas = rondaX.CalcularVidaRestante(potenciales, vida1, vida2);
        vida1 = vidasActualizadas[0];
        vida2 = vidasActualizadas[1];

        recalcularPropiedadPersonaje(per1);
        recalcularPropiedadPersonaje(per2);

        rondaX.setPotencialPer1(potenciales.get(0));
        rondaX.setPotencialPer2(potenciales.get(1));
        if (vida1 < 0) {
            vida1 = 0;
        }

        if (vida2 < 0) {
            vida2 = 0;
        }

        setVida1(vida1);
        setVida2(vida2);
        rondaX.setVidaDesafiante(vida1);
        rondaX.setVidaDesafiado(vida2);

        return rondaX;
    }

    private void recalcularPropiedadPersonaje(Personaje personaje) {

        if (personaje instanceof Vampiro) {
            Vampiro vamp = (Vampiro) personaje;
            int sangrePersonaje = vamp.getSangre();
            if (sangrePersonaje < 5) {
                sangrePersonaje = sangrePersonaje + 1;
            }
           
            vamp.setSangre(sangrePersonaje);
            personaje = vamp;
        } else if (personaje instanceof Licantropo) {
            Licantropo licantropo = (Licantropo) personaje;
            int rabia = licantropo.getRabia();
            if (rabia < 5) {
                rabia = rabia + 1;
            } 
            licantropo.setRabia(rabia);
            personaje = licantropo; // no entiendo este ultimo paso
        }

        else if (personaje instanceof Cazador) {
            Cazador Cazador = (Cazador) personaje;
            int voluntad = Cazador.getVoluntad();
            if (voluntad > 0) {
                voluntad = voluntad - 1;
            }
            Cazador.setVoluntad(voluntad);
            personaje = Cazador;
        }

    }

}
