/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.Locale;
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
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre del personaje:");
        String nombreCarac = lectura.nextLine();
        
        System.out.println("Escriba los numeros de las armas que quiere que tenga su personaje: ");
        ArrayList<Integer> armasEleg = super.getEntidades().MostraryElegir("ARMAS");
        Arma[] armasPersonaje = new Arma[armasEleg.size()];
        for (int idx = 0; idx < armasEleg.size(); idx++) {
            
        }
 
        }
        int armaduraChar = -1;
        while (armaduraChar > super.getEntidades().getArmaduras().size() && armaduraChar < 0) {
            System.out.println("Escriba el numero de la armadura que quiere que tenga su personaje:");
            super.getEntidades().MostraryElegir("ARMADURA");
            armaduraChar = lectura.nextInt(); 
        }
        
        System.out.println("Escriba la salud del personaje: [Limitada entre 1 y 5]");       
        int saludChar = lectura.nextInt();
        while (saludChar < 1 && saludChar > 5){
            System.out.println("El valor de salud debe estar entre 1 y 5");
            System.out.println("Por favor introduzca el valor de nuevo: ");
            saludChar = lectura.nextInt();
        }        
        System.out.println("Escriba el poder del personaje: [Limitado entre 1 y 5]");
        int poderChar = lectura.nextInt();
        while (poderChar < 1 && poderChar > 5){
            System.out.println("El valor de poder debe estar entre 1 y 5");
            System.out.println("Por favor introduzca el valor de nuevo: ");
            poderChar = lectura.nextInt();
        }
        
        //Falta recabar la informacion respecto a las debilidades y fortalezas
        
        
        System.out.println("Que tipo de personaje desea crear? - Escriba el numero de su tipo:");
        System.out.println("1. Licantropo --- 2. Vampiro --- 3.Cazador");
        
        Integer leido = lectura.nextInt();
        switch (leido){
            //cada tipo de personaje integrará su propia habilidad
            case 1: //creamos un licantropo
                //Personaje licanNuevo = new Licantropo(nombreChar, etc);
                //super.getEntidades().aniadir(licanNuevo);
                
                break;
            case 2: // creamos un vampiro
                Personaje vampNuevo = new Vampiro();
                super.getEntidades().aniadir(vampNuevo);
                break;
            case 3: //creamos un cazador 
                Personaje cazNuevo = new Cazador();
                super.getEntidades().aniadir(cazNuevo);
                break;
        }
        //super.getEntidades().aniadir(licanNuevo); Esta linea hay que ver como integrarla en cada case.
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
                ArrayList<Integer> personajeEle = super.getEntidades().MostraryElegir("PERSONAJES");
                Personaje personaje = super.getEntidades().elegirPersonaje(personajeEle.get(0));
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
