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
    private Jugador Vencedor;
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

    public Jugador getVencedor() {
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

    public Ronda EmpezarRonda(Personaje per1, Personaje per2, int vida1, int vida2) {
        Ronda rondaX = new Ronda();
        ArrayList<Integer> potenciales = rondaX.Calculo_Potencial(per1, per2);
        rondaX.CalcularVidaRestante(potenciales, vida1, vida2);

        recalcularPropiedadPersonaje(per1); // TODO falta mirar si hay un mejor nombre
        recalcularPropiedadPersonaje(per2);        
        return rondaX;
    }

    private void recalcularPropiedadPersonaje(Personaje personaje) {

        if (personaje instanceof Vampiro) {
            Vampiro vamp = (Vampiro) personaje;
            int sangrePersonaje =  vamp.getSangre();
            sangrePersonaje = sangrePersonaje +1;
            vamp.setSangre(sangrePersonaje);
            personaje = vamp;            
        }
        else if (personaje instanceof Licantropo) {
            Licantropo licantropo = (Licantropo) personaje;
            int rabia =  licantropo.getRabia();
            rabia = rabia +1;
            licantropo.setRabia(rabia);
            personaje = licantropo; //no entiendo este ultimo paso 
        }

        else if(personaje instanceof Cazador) {
            Cazador Cazador = (Cazador) personaje;
            int voluntad =  Cazador.getVoluntad();
            voluntad = voluntad -1;
            Cazador.setVoluntad(voluntad);
            personaje = Cazador;
        }



    }
    
    
    
    
}
