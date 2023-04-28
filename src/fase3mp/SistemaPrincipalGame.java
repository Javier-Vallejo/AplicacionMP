/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 *
 * @author david
 */
public class SistemaPrincipalGame {

    private static SistemaPrincipalGame sistema;
    private ManagerUsuarios usuariosSistema;
    private EntidadesActivas entidadesSistema;
    private Ranking rankingSistema;

    /**
     * public Registro registro;
     */
    private SistemaPrincipalGame() {// constructor hay que ver como aplicar singleton
    }

    public static SistemaPrincipalGame obtenerInstancia() {//singleton
        if (sistema == null) {
            sistema = new SistemaPrincipalGame();
        }
        return sistema;
    }

    public SistemaPrincipalGame getSistema() {//no se para que esta
        return null;
    }

    public void run() throws IOException {
        ManagerUsuarios manager = new ManagerUsuarios();
        usuariosSistema = manager;
        Publisher publisher = new Publisher();
        //leerUsuarios("usuarios.txt");
        //leerPersonajes("personajes.txt");//habra que hacer un leer Usuarios tambien
        //leerDebilidadesYFortalezas("debilidadesyfortalezas.txt");
        EntidadesActivas entidadesActivas = new EntidadesActivas();
        entidadesActivas.LeerEntidades();
        entidadesSistema = entidadesActivas;
        Ranking ranking = new Ranking();
        rankingSistema = ranking;
        rankingSistema.setManager(usuariosSistema);
        //entidadesSistema.leerEsbirros();
        //leerPersonajes("Ficheros/Personajes.txt");//habra que hacer un leer Usuarios tambien
        manager.LeerUsuarios(entidadesSistema);
        // leerDebilidadesYFortalezas("debilidadesyfortalezas.txt");
        inicializarHabilidades(entidadesActivas);
        Scanner escanerMain = new Scanner(System.in);
        int opcionElegida = 0;
        int option = 0;
        boolean esNumero;
        //while ((opcionElegida != 1 ^ opcionElegida != 2 ^ opcionElegida!= 3)) {
        while (!(opcionElegida == 3)) {
            System.out.println("=====Bienvenido al servicio de MP Wars=====");
            System.out.println("Pulse 1 si desea iniciar sesion, 2 si desea registrarse y 3 si desea salir del sistema:");

            do {
                try {
                    System.out.println("=====Bienvenido al servicio de MP Wars=====");
                    System.out.println("Pulse 1 si desea iniciar sesion, 2 si desea registrarse y 3 si desea salir del sistema:");
                    option = escanerMain.nextInt();
                    //Hacer con el numero lo que quiera
                    opcionElegida = option;
                    System.out.println("He visto que sabes introducir numeros canelo");
                    esNumero = true;

                } catch (InputMismatchException ime) {
                    System.out.println("Disculpe, ingrese un numero");
                    esNumero = false;
                }
            } while (!esNumero);

            opcionElegida = escanerMain.nextInt();
            if (opcionElegida == 1) {
                iniciarSesion();
            } else if (opcionElegida == 2) {
                registrarse();
                String opcion = "";
                while (!(opcion.equals("si") ^ opcion.equals("no"))) {
                    // escanerMain.hasNextLine();
                    System.out.println("Deseas iniciar sesion? si o no");
                    opcion = escanerMain.nextLine().toLowerCase().trim();
                    if (!(opcion.equals("si") || opcion.equals("no"))) {
                        System.out.println("Por favor indique si o no");
                    }
                }
                if (opcion.equals("si")) {
                    iniciarSesion();
                } else if (opcion.equals("no")) {
                    System.out.println("Saliendo del programa ¡Hasta Luego!");
                }

            } else if (opcionElegida == 3) {
                System.out.println(">> Hasta la vista!! GG EZ");
                return;
            } else {
                System.out.println("");
                System.out.println(">> Por favor escoja una de las opciones proporcionadas.");
                System.out.println("");
            }

        }
    }

    private void iniciarSesion() throws IOException {
        Scanner escIniSes = new Scanner(System.in);
        System.out.println("-----Inicio de Sesion-----");
        int intentos = 0;
        String nick = "";
        String password = "";
        while (intentos < 3 && usuariosSistema.existeUsuario(nick, password) == false) {
            System.out.println("Introduzca su nick: ");
            nick = escIniSes.nextLine();
            System.out.println("Introduzca su password: ");
            password = escIniSes.nextLine();
            if (usuariosSistema.existeUsuario(nick, password) == false && intentos != 2) {
                System.out.println("Usuario no encontrado. Por favor, asegurese de insertar su usuario y contraseña correctamente.");
            }
            ++intentos;
        }
        if (usuariosSistema.existeUsuario(nick, password) == false) {
            System.out.println("Usuario no encontrado, saliendo del sistema.");
            return;
        } else {
            Usuario usuario = usuariosSistema.obtenerUsuario(nick, password);
            System.out.println("Bienvenido " + usuario.getNick());

            int eleccionMenu = 0;
            usuario.setManagerUsuarios(usuariosSistema);
            usuario.setEntidades(entidadesSistema);
            if (usuario.getRol() == TipoUsuario.Jugador) {
                Jugador jugador = (Jugador) usuario;
                jugador.setRankingGlobal(rankingSistema);
                while (eleccionMenu != 8) {// hacer restriccion para que solo meta enteros
                    if (jugador.getCombateRealizado() != null) {
                        jugador.resultadosCombate(jugador.getCombateRealizado());
                    }
                    if (jugador.getDesafioPendiente() != null) {
                        jugador.AceptaroRechazarDesafio(jugador.getDesafioPendiente());
                    }
                    Menu menu = new MenuJugador();// deberia ponerlo fuera
                    menu.mostrarOpciones();
                    eleccionMenu = escIniSes.nextInt();
                    jugador.realizarFuncionMenuJugador(eleccionMenu);
                }
            } else {
                OperadorSistema operador = (OperadorSistema) usuario;
                usuario.setEntidades(entidadesSistema);
                while (eleccionMenu != 7) {
                    Menu menu = new MenuOperador();
                    menu.mostrarOpciones();
                    eleccionMenu = escIniSes.nextInt();
                    operador.realizarFuncionMenuOperador(eleccionMenu);
                }
            }
        }

    }

    private void registrarse() throws IOException {//// habria que hacer que devolviera usuario para despues mostrar menu
        System.out.println("-----Registro-----");
        Scanner escanerRegistro = new Scanner(System.in);
        String rol = "";
        // escanerRegistro.close();
        while (!(rol.equals("operador") ^ rol.equals("jugador"))) {
            System.out.print("Desea registrarse como jugador o como operador: \n");
            rol = escanerRegistro.nextLine();// habria que poner un while por si introduce otra cosa
            rol = rol.toLowerCase();
            if (rol.equals("jugador")) {
                Registro registro = new RegistroJugador(usuariosSistema); // nuevas clases
                Usuario usuario = registro.registrarse(TipoUsuario.Jugador);
                System.out.println("Ya casi has terminado de registrarte, ahora elige un personaje que luche a tu lado");
                ArrayList<Integer> personajes = entidadesSistema.MostraryElegir("PERSONAJES");

                Personaje personajeElegido = entidadesSistema.elegirPersonaje(personajes.get(0));
                Jugador jugador = (Jugador) usuario;
                if (personajeElegido == null) {
                    return;
                }
                jugador.setPersonajeActivo(personajeElegido);
                System.out.println("Se te ha guardado el personaje");
                jugador.setOro(100);
                usuariosSistema.guardarUsuariosFichero(usuario);
            } else if (rol.equals("operador")) {
                Registro registro = new RegistroOperador(usuariosSistema);
                Usuario usuario = registro.registrarse(TipoUsuario.OperadorSistema);
                usuariosSistema.guardarUsuariosFichero(usuario);
            } else {
                System.out.print("Por favor escoja una de las opciones proporcionadas \n");
            }
        }
    }

    private void leerPersonajes(String fichero) throws FileNotFoundException { // habria que hacer uno para cada tipo de
        // entidad
        File miFichero = new File(fichero);
        Scanner scanner = new Scanner(miFichero);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] camposPersonaje = linea.split(";");
            //gaurdo la habilidad
            String[] camposHabilidad = camposPersonaje[2].split("/");
            Habilidad habilidad = new Habilidad(camposHabilidad[0], Integer.parseInt(camposHabilidad[1]), Integer.parseInt(camposHabilidad[2]), Integer.parseInt(camposHabilidad[3]));
            //guardo las armas
            String[] armasLeidas = camposPersonaje[3].split(",");
            ArrayList<Arma> armas = new ArrayList<>();
            for (int i = 0; i < armasLeidas.length; i++) {
                String[] caracteristicaArma = armasLeidas[i].split("/");
                Arma arma = new Arma(caracteristicaArma[0], caracteristicaArma[1], caracteristicaArma[2], caracteristicaArma[3]);
                armas.add(arma);
            }
            Arma[] arrayArmas = armas.toArray(new Arma[0]);
            //guardo armas activas
            String[] armasActivasLeidas = camposPersonaje[4].split(",");
            ArrayList<Arma> armasActivas = new ArrayList<>();
            for (int i = 0; i < armasLeidas.length; i++) {
                String[] caracteristicaArmaActiva = armasActivasLeidas[i].split("/");
                Arma arma = new Arma(caracteristicaArmaActiva[0], caracteristicaArmaActiva[1], caracteristicaArmaActiva[2], caracteristicaArmaActiva[3]);
                armasActivas.add(arma);
            }
            Arma[] arrayArmasActivas = armasActivas.toArray(new Arma[0]);
            //guardo armaduras
            String[] armadurasLeidas = camposPersonaje[5].split(",");
            ArrayList<Armadura> armaduras = new ArrayList<>();
            for (int j = 0; j < armadurasLeidas.length; j++) {
                String[] caracteristicaArmadura = armadurasLeidas[j].split("/");
                Armadura armadura = new Armadura(caracteristicaArmadura[0], caracteristicaArmadura[1],
                        caracteristicaArmadura[2]);
                armaduras.add(armadura);
            }
            Armadura[] arrayArmaduras = armaduras.toArray(new Armadura[0]);
            //guardo armadura activa
            String[] camposArmaduraActiva = camposPersonaje[6].split("/");
            Armadura armaduraActiva = new Armadura(camposArmaduraActiva[0], camposArmaduraActiva[1], camposArmaduraActiva[2]);
            //guardo esbirros
            String[] esbirrosLeidos = camposPersonaje[7].split(",");
            ArrayList<Esbirro> esbirros = new ArrayList<>();
            for (int i = 0; i < esbirrosLeidos.length; i++) {//habria que cambiar la forma de leer los esbirros para hacerlo igual que se guardan
                String[] caracteristicaEsbirro = esbirrosLeidos[i].split("/");
                String nombreEsb = caracteristicaEsbirro[0];
                int saludEsb = Integer.parseInt(caracteristicaEsbirro[1]);
                String tipoEsb = caracteristicaEsbirro[2];
                Esbirro esbirro = entidadesSistema.devolverEsbirro(nombreEsb, saludEsb, tipoEsb);
                esbirros.add(esbirro);
            }
            Esbirro[] arrayEsbirros = esbirros.toArray(new Esbirro[0]);
            //guardo salud
            int salud = Integer.parseInt(camposPersonaje[8]);
            //guardo poder
            int poder = Integer.parseInt(camposPersonaje[9]);
            //guardo debilidades
            String[] debilidadesLeidas = camposPersonaje[10].split(",");
            ArrayList<Debilidad> debilidades = new ArrayList<>();
            for (int i = 0; i < debilidadesLeidas.length; i++) {
                String[] caracteristicaDebilidades = debilidadesLeidas[i].split("/");
                Debilidad debilidad = new Debilidad(caracteristicaDebilidades[0], Integer.parseInt(caracteristicaDebilidades[1]));
                debilidades.add(debilidad);
            }
            Debilidad[] arrayDebilidades = debilidades.toArray(new Debilidad[0]);
            //guardar fortalezas
            //guardo debilidades
            String[] fortalezasLeidas = camposPersonaje[11].split(",");
            ArrayList<Fortaleza> fortalezas = new ArrayList<>();
            for (int i = 0; i < fortalezasLeidas.length; i++) {
                String[] caracteristicaFortalezas = debilidadesLeidas[i].split("/");
                Fortaleza fortaleza = new Fortaleza(caracteristicaFortalezas[0], Integer.parseInt(caracteristicaFortalezas[1]));
                fortalezas.add(fortaleza);
            }
            Fortaleza[] arrayFortalezas = fortalezas.toArray(new Fortaleza[0]);
            //creo personaje
            if (camposPersonaje[0].equals("vampiro")) {
                Vampiro vampiro = new Vampiro(camposPersonaje[1], habilidad, arrayArmas,
                        arrayArmasActivas, arrayArmaduras, armaduraActiva, arrayEsbirros,
                        salud, poder, arrayDebilidades,
                        arrayFortalezas);
                entidadesSistema.aniadir(vampiro);
            } else if (camposPersonaje[0] == "Cazador") {
                Cazador cazador = new Cazador(camposPersonaje[1], habilidad, arrayArmas,
                        arrayArmasActivas, arrayArmaduras, armaduraActiva, arrayEsbirros,
                        salud, poder, arrayDebilidades,
                        arrayFortalezas);
                entidadesSistema.aniadir(cazador);
            } else if (camposPersonaje[0] == "Licantropo") {
                Licantropo licantropo = new Licantropo(camposPersonaje[1], habilidad, arrayArmas,
                        arrayArmasActivas, arrayArmaduras, armaduraActiva, arrayEsbirros,
                        salud, poder, arrayDebilidades,
                        arrayFortalezas);
                entidadesSistema.aniadir(licantropo);
            }
        }

    }

    private void inicializarHabilidades(EntidadesActivas entidadesActivas) {
        Habilidad habilidadVampiro = new Habilidad("ChuparSangre", 4, 4, 3);
        Habilidad habilidadLicantropo = new Habilidad("GolpeDeRabia", 7, 2, 1);
        Habilidad habilidadCazador = new Habilidad("Cazar", 6, 6, 0);

        entidadesActivas.aniadir(habilidadVampiro);
        entidadesActivas.aniadir(habilidadLicantropo);
        entidadesActivas.aniadir(habilidadCazador);
    }

}
