/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author david
 */
public class Desafio {
    private Jugador jugadorDesafiante;
    private Jugador jugadorDesafiado;
    private int oroApostado;
    public enum State{Validado, NoValidado}
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
