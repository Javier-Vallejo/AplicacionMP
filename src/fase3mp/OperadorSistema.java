/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Locale;
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
    private void aniadirPersonaje() throws IOException{
        File ficheroPersonajes = new File("Personajes.txt");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre del personaje:");
        String nombreCarac = lectura.nextLine();
        //armas
        System.out.println("Escriba los numeros de las armas que quiere que tenga su personaje: ");
        ArrayList<Integer> armasEleg = super.getEntidades().MostraryElegir("ARMAS");
        Arma[] armasPersonaje = new Arma[armasEleg.size()];
        for (int idx = 0; idx < armasEleg.size(); idx++) {
            armasPersonaje[idx] = super.getEntidades().elegirArma(armasEleg.get(idx));
        }
        //armaduras
        System.out.println("Escriba el numero de la armadura que quiere que tenga su personaje: ");
        ArrayList<Integer> armadurasEleg = super.getEntidades().MostraryElegir("ARMADURAS");
        Armadura[] armadurasPersonaje = new Armadura[armadurasEleg.size()];
        for (int i = 0; i < armadurasEleg.size(); i++) {
            armadurasPersonaje[i] = super.getEntidades().elegirArmadura(armasEleg.get(i));   
        }
         
        //habra que meter en entidades activas los esbirros tambien para poder mostrarle y elija
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
        

        System.out.println("Escriba el nombre de la habilidad");
        String nombre  = lectura.nextLine();
        System.out.println("Escriba el poder que se obtiene de base de la habilidad");
        int poderHabilidad = lectura.nextInt();
        System.out.println("Escriba la defensa que se obtiene de base de la habilidad");
        int defensaHabilidad = lectura.nextInt();
        System.out.println("Escriba el limitante para poder activar la habilidad");
        int limitante = lectura.nextInt();

        Habilidad habilidadPersonaje = new Habilidad(nombre, poderHabilidad, defensaHabilidad, limitante);

        //Falta recabar la informacion respecto a las debilidades y fortalezas
        //habra que poner las debilidades y fortalezas en entidades activas
        
        System.out.println("Que tipo de personaje desea crear? - Escriba el numero de su tipo:");
        System.out.println("1. Licantropo --- 2. Vampiro --- 3.Cazador");
        //habria que poner un while por si mete otro valor
        Integer leido = lectura.nextInt();
        
        FileWriter escritorFich = new FileWriter(ficheroPersonajes); //escritor en fichero
        FabricaPersonajes fabricaPersonajes = super.getFabricaPersonajes();
        Debilidad[] debilidades =  new Debilidad[2];

        Fortaleza[] fortalezas = new Fortaleza[2];
        switch (leido){
            //cada tipo de personaje integrará su propia habilidad
            case 1: //creamos un licantropo
                fabricaPersonajes = new FabricaLicantropo();
                //Licantropo licanNuevo = fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje, armasPersonaje, armasPersonaje, armadurasPersonaje, armadurasPersonaje, null, 0, 0, debilidades, fortalezas);
                //System.out.println("Que cantidad de rabia quieres que tenga: ");
                //int cantidadRabia = lectura.nextInt();
                //licanNuevo.setRabia(cantidadRabia);
                //super.getEntidades().aniadir(licanNuevo);
                escritorFich.write(""); //habra que convertir las propiedades que no sean string
                break;
            case 2: // creamos un vampiro
                fabricaPersonajes = new FabricaVampiro();
                //Vampiro vampNuevo = fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje, armasPersonaje, armasPersonaje, armadurasPersonaje, armaduraActiva, esbirros, 0, 0, debilidades, fortalezas, 0);
                //System.out.println("Que cantidad de sangre quieres que tenga: ");
                //int cantidadSangre = lectura.nextInt();
                //vampNuevo.setCantidadSangre(cantidadSangre);
                //System.out.println("Que edad quieres que tenga: ");
                //int edad = lectura.nextInt();
                //vampNuevo.setEdad(edad);
                //super.getEntidades().aniadir(vampNuevo);
                escritorFich.write("");
                break;
            case 3: //creamos un cazador 
                fabricaPersonajes = new FabricaCazador();
                //super.getEntidades().aniadir(cazNuevo);
                escritorFich.write("");
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
                //aniadirPersonaje();
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
