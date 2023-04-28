/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Desafio {
    private Jugador jugadorDesafiante;
    private Jugador jugadorDesafiado;
    private int oroApostado;
    private ArrayList<Fortaleza> FElegDesafiante = new ArrayList<>();
    private ArrayList<Fortaleza> FElegDesafiado = new ArrayList<>();
    private ArrayList<Debilidad> DElegDesafiante = new ArrayList<>();
    private ArrayList<Debilidad> DElegDesafiado = new ArrayList<>();



    

    public ArrayList<Fortaleza> getFElegDesafiante() {
        return FElegDesafiante;
    }



    public ArrayList<Fortaleza> getFElegDesafiado() {
        return FElegDesafiado;
    }



    public ArrayList<Debilidad> getDElegDesafiante() {
        return DElegDesafiante;
    }



    public ArrayList<Debilidad> getDElegDesafiado() {
        return DElegDesafiado;
    }



    public void setFElegDesafiante(ArrayList<Fortaleza> fElegDesafiante) {
        FElegDesafiante = fElegDesafiante;
    }

    

    public void setFElegDesafiado(ArrayList<Fortaleza> fElegDesafiado) {
        FElegDesafiado = fElegDesafiado;
    }

    public void setDElegDesafiante(ArrayList<Debilidad> dElegDesafiante) {
        DElegDesafiante = dElegDesafiante;
    }

    public void setDElegDesafiado(ArrayList<Debilidad> dElegDesafiado) {
        DElegDesafiado = dElegDesafiado;
    }

    public enum State {
        Validado, NoValidado
    }

    private State estado;

    public Jugador getJugadorDesafiante() {
        return jugadorDesafiante;
    }

    public void setJugadorDesafiante(Jugador jugadorDesafiante) {
        this.jugadorDesafiante = jugadorDesafiante;
    }

    public Jugador getJugadorDesafiado() {
        return jugadorDesafiado;
    }

    public void setJugadorDesafiado(Jugador jugadorDesafiado) {
        this.jugadorDesafiado = jugadorDesafiado;
    }

    public int getOroApostado() {
        return oroApostado;
    }

    public void setOroApostado(int oroApostado) {
        this.oroApostado = oroApostado;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

}
