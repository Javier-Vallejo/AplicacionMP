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
    

    private void aniadirPersonaje() throws IOException{
        File ficheroPersonajes = new File("Personajes.txt");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre del personaje:");
        String nombreCarac = lectura.nextLine();
        //armas
        System.out.println("Escriba los numeros de las armas que quiere que tenga su personaje: ");
        ArrayList<Integer> armasEleg = super.getEntidades().MostraryElegir("ARMAS");
        Arma[] armasPersonaje = new Arma[armasEleg.size()];
        for (int i = 0; i < armasEleg.size(); i++) {
            armasPersonaje[i] = super.getEntidades().elegirArma(armasEleg.get(i));
        }
        //armas activas
        System.out.println("Elige el numero del arma o armas que va a tener como activas: ");
        System.out.println("(Ten en cuenta que va a ser una de dos manos o dos de una mano)");
        for (int i = 0; i < armasPersonaje.length; i++) {
            System.out.println(i + "_" + armasPersonaje[i].getNombre()+ armasPersonaje[i].getTipodeArma().toString());    
        }
        System.out.println(armasPersonaje.length+1 + " Salir");
        int numArmaActiva = 0;
        ArrayList<Arma> armasActivas = new ArrayList<>();
        while(numArmaActiva != armasPersonaje.length+1){
            numArmaActiva = lectura.nextInt();
            if(armasPersonaje[numArmaActiva].getTipodeArma()== Arma.tipoArma.de2manos && armasActivas.isEmpty()){
                armasActivas.add(armasPersonaje[numArmaActiva]);
            }
            else if(armasPersonaje[numArmaActiva].getTipodeArma()== Arma.tipoArma.de1mano && armasActivas.isEmpty()){
                armasActivas.add(armasPersonaje[numArmaActiva]);
            }
            else if(armasPersonaje[numArmaActiva].getTipodeArma()== Arma.tipoArma.de1mano && armasActivas.size()==1){
                armasActivas.add(armasPersonaje[numArmaActiva]);
            }
            else{
                System.out.println("El arma que intentas establecer como activa no cabe");
            }
        }
        Arma[] armasActivasPersonaje = armasActivas.toArray(new Arma[2]);
        
        //armaduras
        System.out.println("Escriba el numero de la armadura que quiere que tenga su personaje: ");
        ArrayList<Integer> armadurasEleg = super.getEntidades().MostraryElegir("ARMADURAS");
        Armadura[] armadurasPersonaje = new Armadura[armadurasEleg.size()];
        for (int i = 0; i < armadurasEleg.size(); i++) {
            armadurasPersonaje[i] = super.getEntidades().elegirArmadura(armadurasEleg.get(i));   
        }
        //armadura activa
        System.out.println("Elige el numero de la armadura que va tener activa: ");
        for (int i = 0; i < armadurasPersonaje.length; i++) {
            System.out.println(i + "_" + armadurasPersonaje[i].getNombre());    
        }
        System.out.println(armadurasPersonaje.length+1 + " Salir");
        int numArmaduraActiva = 0;
        while(numArmaduraActiva != armadurasPersonaje.length+1){
            numArmaduraActiva = lectura.nextInt();
        }
        Armadura armaduraActivaPersonaje = armadurasPersonaje[numArmaduraActiva];
        //fortaleza
        System.out.println("Escriba el numero de la/las fortaleza/fortalezas que quiere que tenga su personaje: ");
        ArrayList<Integer> fortalezasEleg = super.getEntidades().MostraryElegir("FORTALEZAS");
        Fortaleza[] fortalezasPersonaje = new Fortaleza[fortalezasEleg.size()];
        for (int i = 0; i < fortalezasEleg.size(); i++) {
            fortalezasPersonaje[i] = super.getEntidades().elegirFortaleza(fortalezasEleg.get(i));   
        }
        //debilidad
        System.out.println("Escriba el numero de la/las debilidad/debilidades que quiere que tenga su personaje: ");
        ArrayList<Integer> debilidadesEleg = super.getEntidades().MostraryElegir("DEBILIDADES");
        Debilidad[] debilidadesPersonaje = new Debilidad[debilidadesEleg.size()];
        for (int i = 0; i < debilidadesEleg.size(); i++) {
            debilidadesPersonaje[i] = super.getEntidades().elegirDebilidad(debilidadesEleg.get(i));   
        }
        
        //salud personaje
        System.out.println("Escriba la salud del personaje: [Limitada entre 1 y 5]");       
        int saludPersonaje = lectura.nextInt();
        while (saludPersonaje < 1 && saludPersonaje > 5){
            System.out.println("El valor de salud debe estar entre 1 y 5");
            System.out.println("Por favor introduzca el valor de nuevo: ");
            saludPersonaje = lectura.nextInt();
        }
        //poder personaje
        System.out.println("Escriba el poder del personaje: [Limitado entre 1 y 5]");
        int poderPersonaje = lectura.nextInt();
        while (poderPersonaje < 1 && poderPersonaje > 5){
            System.out.println("El valor de poder debe estar entre 1 y 5");
            System.out.println("Por favor introduzca el valor de nuevo: ");
            poderPersonaje = lectura.nextInt();
        }
        
        //habilidad
        System.out.println("Escriba el numero de la habilidad que quiere que tenga su personaje: ");
        int habilidadElegida = super.getEntidades().MostraryElegirHabilidad();
        Habilidad habilidadPersonaje = super.getEntidades().getHabilidades().get(habilidadElegida);
        
        //Esbirros
        FabricaEsbirros fabricaEsbirros = super.getFabricaEsbirros();
        String tipoEsbirro = "";
        ArrayList<Esbirro> esbirrosPers = new ArrayList<>();
        while(!tipoEsbirro.equals("salir")){
            System.out.println("Escriba el tipo de esbirro que desea introducirle: ");
            System.out.println("Las opciones son Humano, Ghoul y Demonio. Escriba salir para terminar.");
            tipoEsbirro = lectura.nextLine();
            tipoEsbirro = tipoEsbirro.toLowerCase().trim();
            System.out.println("Introduzca el nombre que le quiere poner al esbirro: ");
            String nombreEsbirro = lectura.nextLine();
            System.out.println("Introduzca la salud del esbirro: ");
            int saludEsbirro = lectura.nextInt();
            switch (tipoEsbirro) { //se deberia poder elegir si crear nuevos esbirros o elegir algunos del sistema
                case "humano" -> {
                    fabricaEsbirros = new FabricaHumano();
                    Humano humano = (Humano) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                    humano.rellenarPropiedadesEspec();
                    esbirrosPers.add(humano);
                }
                case "ghoul" -> {
                    fabricaEsbirros = new FabricaGhoul();
                    Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                    ghoul.rellenarPropiedadesEspec();
                    esbirrosPers.add(ghoul);
                }
                case "demonio" -> {
                    fabricaEsbirros = new FabricaDemonio();
                    Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                    demonio.setFabricaEsbirros(super.getFabricaEsbirros());
                    demonio.rellenarPropiedadesEspec();
                    esbirrosPers.add(demonio);
                }
                default -> {
                    System.out.println("Nombre de esbirro no correcto");
                }
            }
        }
        Esbirro[] esbirrosPersonaje = (Esbirro[]) esbirrosPers.toArray();
        
        System.out.println("Que tipo de personaje desea crear? - Escriba el numero de su tipo:");
        System.out.println("1. Licantropo --- 2. Vampiro --- 3.Cazador");
        //habria que poner un while por si mete otro valor
        Integer leido = lectura.nextInt();
        
        FileWriter escritorFich = new FileWriter(ficheroPersonajes); //escritor en fichero
        FabricaPersonajes fabricaPersonajes = super.getFabricaPersonajes();

        switch (leido){
            //cada tipo de personaje integrará su propia habilidad
            case 1: //creamos un licantropo
                fabricaPersonajes = new FabricaLicantropo();
                Licantropo licanNuevo = (Licantropo) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje, armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje, esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje, fortalezasPersonaje);
                licanNuevo.rellenarPropiedadesEspecificas();
                super.getEntidades().aniadir(licanNuevo);
                escritorFich.write(""); //habra que convertir las propiedades que no sean string
                break;
            case 2: // creamos un vampiro
                fabricaPersonajes = new FabricaVampiro();
                Vampiro vampNuevo = (Vampiro) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje, armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje, esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje, fortalezasPersonaje);
                vampNuevo.rellenarPropiedadesEspecificas();
                super.getEntidades().aniadir(vampNuevo);
                escritorFich.write("");
                break;
            case 3: //creamos un cazador 
                fabricaPersonajes = new FabricaCazador();
                Cazador cazNuevo = (Cazador) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje, armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje, esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje, fortalezasPersonaje);
                super.getEntidades().aniadir(cazNuevo);
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
        //LLamada al ¿publisher? para notificar al usuario.....
        //Devuelve ese objeto desafio a el usuario desafiado
    }
    
    public void realizarFuncionMenuOperador(int opcion) throws IOException{
        switch (opcion){
            case 1://Darse de baja
                DarseDeBaja(this);
                break;
            case 2://Editar Personaje
                ArrayList<Integer> personajeEle = super.getEntidades().MostraryElegir("PERSONAJES");//se podria hacer que entidades de usuario fuera publico
                Personaje personaje = super.getEntidades().elegirPersonaje(personajeEle.get(0));//para que lo hereden los hijos sin tener que hacer get
                personaje.editarPersonaje();
                ManagerUsuarios manager = super.getManagerUsuarios();
                for (int i = 0; i < manager.getUsuariosRegistrados().size(); i++) { //esto
                    if (manager.getUsuariosRegistrados().get(i) instanceof Jugador jugador){
                        if(jugador.getPersonajeActivo().getNombre().equals(personaje.getNombre())){
                            jugador.setPersonajeActivo(personaje.clonar()); //por polimorfismo se ejecutara el clonar del personaje especifico
                        }
                    }    
                }
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
