/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Random;
import java.util.Scanner;

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
        if(estadoObservador == State.noBaneado){//cambiar
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
    public void realizarFuncionMenuJugador(int opcion){
        switch (opcion){
            case 1://Darse de baja
                DarseDeBaja(this);
                break;
            case 2://Registrar Personaje
                //no se bien que es
                break;
            case 3://Gestionar Personaje
                if(getPersonajeActivo() == null){
                    System.out.println("No tienes ningun personaje activo");
                }
                else{
                    Personaje personaje = getPersonajeActivo();//debo poner un if por si no hay personaje guardado
                    personaje.editarPersonaje();//nuevo metodo
                }
                break;
            case 4://Dar de baja Personaje
                setPersonajeActivo(null);
                break;
            case 5://Elegir Armas y Armadura
                Arma arma = super.getEntidades().elegirArma();
                arma.editarArma();//deberia ser guardarlo en tus armas
                Armadura armadura = super.getEntidades().elegirArmadura();
                armadura.editarArmadura();
                break;
            case 6://Desafiar
                Desafio desafio = new Desafio();
                super.getDesafiosAct().guardarDesafio(desafio);
                break;
            case 7://Consultar Oro
                System.out.println("Su oro actual es: " + getOro());
                break;
            case 8://Consultar Ranking
                //hay que hacerlo con la clase nueva ranking
                break;
            case 9://Elegir Personaje
                if(getPersonajeActivo() != null){
                    System.out.println("El personaje que elijas sustituira al tuyo.");
                    System.out.println("¿Deseas continuar? Si o No");
                    String opcionSioNO = "";
                    Scanner escanerSioNo = new Scanner(System.in);
                    while(opcionSioNO != "SI" || opcionSioNO != "NO"){
                        System.out.println("¿Desas iniciar sesion? si o no");
                        opcionSioNO = escanerSioNo.nextLine();
                        opcionSioNO = opcionSioNO.toUpperCase();
                    }
                    if (opcionSioNO.equals("SI")){
                        setPersonajeActivo(super.getEntidades().elegirPersonaje());
                    }
                    else if(opcionSioNO.equals("NO")){
                        System.out.println("Su personaje no se cambiara");
                    }            
                }
                else{
                    setPersonajeActivo(super.getEntidades().elegirPersonaje());
                }
                break;
            case 10://Salir
                System.out.println("Cerrando sesion y saliendo");
                System.exit(0);
                break;
        }
    }
    
}
