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
public class OperadorSistema extends Usuario{ 
    private Publisher notificador;

    public OperadorSistema(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador) {
        super(nombre, nick, password, rol, estadoObservador);
    }
    
    private void editarPersonaje(Personaje personaje){
        
    }
    private void aniadirPersonaje(){
        Personaje personajeNuevo = new Personaje();
        super.getEntidades().aniadir(personajeNuevo);
        //guardar nuevo personaje en fichero para persistencia
    }
    private void validarDesafio(){
        Desafio desafio = super.getDesafiosAct().obtenerDesafio();
        System.out.println("Deseas validar o no validar el desafio");
        //habria que meter un escaner
        desafio.setEstado(Desafio.State.Validado);
    }
    
    public void realizarFuncionMenuOperador(int opcion){
        switch (opcion){
            case 1://Darse de baja
                DarseDeBaja(this);
                break;
            case 2://Editar Personaje
                Personaje personaje = super.getEntidades().elegirPersonaje();
                editarPersonaje(personaje);//podria estar en la clase personaje             
                break;
            case 3://Aniadir Personaje
                aniadirPersonaje();
                break;
            case 4://Validar Desafio
                Desafio desafio = super.getDesafiosAct().obtenerDesafio();
                desafio.setEstado(Desafio.State.Validado);//y notificarlo con el observer
                break;
            case 5://Banear Usuario
                Scanner escanerUsuario = new Scanner(System.in);//se podrian mostrar los nicks de todos los jugadores
                System.out.println("Introduzca nick del usuario a banear: ");
                String nick = escanerUsuario.nextLine();
                System.out.println("Introduzca la contrasenia del usuario a banear: ");//se obtendra a partir del jugador que elija
                String password= escanerUsuario.nextLine();
                Usuario usuario = super.getManagerUsuarios().obtenerUsuario(nick, password);
                usuario.setEstadoObservador(State.baneado);
                break;
            case 6://Desbanear Usuario
                Scanner escanerUsu = new Scanner(System.in);
                System.out.println("Introduzca nick del usuario a desbanear: ");
                String nickUsu = escanerUsu.nextLine();
                System.out.println("Introduzca la contrasenia del usuario a desbanear: ");
                String passwordUsu= escanerUsu.nextLine();
                Usuario usu = super.getManagerUsuarios().getUsuariosRegistrados().get(opcion);//habria que ver como elegir al usuario a banear
                usu.setEstadoObservador(State.noBaneado);
                break;
            case 7://Salir
                System.out.println("Cerrando sesion y saliendo");
                System.exit(0);
                break;
        }
    }
}
