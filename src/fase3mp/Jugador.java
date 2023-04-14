/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Random;

/**
 *
 * @author d.rubio.2019
 */
public class Jugador extends Usuario{
    private int oro;
    private Publisher notificador;
    private boolean estaBaneado;
    private Personaje personajeActivo;
    private String NumeroRegistro;

    
    public Jugador(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador) {
        super(nombre, nick, password, rol, estadoObservador);
        if(estadoObservador == State.noBaneado){
            this.setEstaBaneado(false);
        }
        else{
            this.setEstaBaneado(true);
        }
        GenerarNumRegistro();
    }
    
    
    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public Publisher getNotificador() {
        return notificador;
    }

    public void setNotificador(Publisher notificador) {
        this.notificador = notificador;
    }

    public boolean getEstaBaneado() {
        return estaBaneado;
    }

    public void setEstaBaneado(boolean estaBaneado) {
        this.estaBaneado = estaBaneado;
    }

    public Personaje getPersonajeActivo() {
        return personajeActivo;
    }

    public void setPersonajeActivo(Personaje personajeActivo) {
        this.personajeActivo = personajeActivo;
    }

    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }
    
    

    
    private void RegistrarPersonaje(Personaje personaje){
        
    }
    private void GestionarPersonaje(Personaje personaje){
        
    }
    private void DarDeBajaPersonaje(Personaje personaje){
        
    }
    private void ElegirArmasyArmaduras(Arma arma, Armadura armadura){
        
    }
    private void Desafiar(){
        
    }
    private void AceptaroRechazarDesafio(Desafio desafio){
        
    }
    private void ConsultarOro(){
        
    }
    private void ConsultarRanking(Ranking ranking){
        
    }
    private void ElegirPersonaje(EntidadesActivas entidades){
        
    }
    
    private void GenerarNumRegistro(){//formato LNNLL
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        //ahora genero la primera letra 
        char letra1 = letras.charAt(rand.nextInt(letras.length()));
        sb.append(letra1);
        //genero los dos numeros
        for (int i = 0; i < 2; i++) {
           int numero = rand.nextInt(10);
           sb.append(numero);
        }   
        //genero las ultimas 2 letras
        char letra2 = letras.charAt(rand.nextInt(letras.length()));
        char letra3 = letras.charAt(rand.nextInt(letras.length()));
        sb.append(letra2);
        sb.append(letra3);
        String numRegistro = sb.toString();
        setNumeroRegistro(numRegistro);
    }
    
}
