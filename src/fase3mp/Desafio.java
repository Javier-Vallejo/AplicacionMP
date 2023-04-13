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
    private String nickDesafiado;
    private int oroApostado;
    public enum State{Validado, NoValidado}
    private State estado;

    public String getNickDesafiado() {
        return nickDesafiado;
    }

    public void setNickDesafiado(String nickDesafiado) {
        this.nickDesafiado = nickDesafiado;
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
