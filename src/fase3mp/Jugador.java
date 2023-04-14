/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Jugador extends Usuario{
    private int oro;
    private Publisher notificador;
    private boolean estaBaneado;
    private Personaje personajeActivo;

    
    public Jugador(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador) {
        super(nombre, nick, password, rol, estadoObservador);
        if(estadoObservador == State.noBaneado){
            this.setEstaBaneado(false);
        }
        else{
            this.setEstaBaneado(true);
        }
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
    
}
