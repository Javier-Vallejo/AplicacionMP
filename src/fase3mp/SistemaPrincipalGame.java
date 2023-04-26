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

/**
 *
 * @author david
 */
public class SistemaPrincipalGame {

    private SistemaPrincipalGame sistema;
    private ManagerUsuarios usuariosSistema;
    private EntidadesActivas entidadesSistema;

    /**
     * public Registro registro;
     */
    public SistemaPrincipalGame() {// constructor hay que ver como aplicar singleton

    }

    public SistemaPrincipalGame getSistema() {
        return null;
    }

    public void run() throws IOException {
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = new EntidadesActivas();
        entidadesActivas.LeerEntidades();
        entidadesSistema = entidadesActivas;
        manager.LeerUsuarios(entidadesSistema);
        usuariosSistema = manager;
        //leerUsuarios("usuarios.txt");
        leerPersonajes("Ficheros/Personajes.txt");//habra que hacer un leer Usuarios tambien
        // leerDebilidadesYFortalezas("debilidadesyfortalezas.txt");
        inicializarHabilidades(entidadesActivas);
        Scanner escanerMain = new Scanner(System.in);
        String opcionElegida = "";
        while (!(opcionElegida.equals("iniciarsesion") == false ^ opcionElegida.equals("registrarse") == false)) {
            System.out.println("Desea iniciar sesion o registrarse");
            opcionElegida = escanerMain.nextLine().replaceAll("\\s", "").toLowerCase();
            if (opcionElegida.equals("iniciarsesion")) {
                iniciarSesion();
            } else if (opcionElegida.equals("registrarse")) {
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

            } else {
                System.out.println("Por favor escoja una de las opciones proporcionadas");
            }

        }
    }

    private void iniciarSesion() throws IOException {
        Scanner escIniSes = new Scanner(System.in);
        System.out.println("-----Inicio de Sesion-----");
        System.out.println("Introduzca su nick: ");
        String nick = escIniSes.nextLine();
        System.out.println("Introduzca su contrasenia: ");
        String password = escIniSes.nextLine();
        if (usuariosSistema.existeUsuario(nick, password) == false) {
            System.out.println("No estas registrado en el sistema");
            return;
        } else {
            Usuario usuario = usuariosSistema.obtenerUsuario(nick, password);
            System.out.println("Bienvenido " + usuario.getNick());
            System.out.println("Que deseas hacer: ");
            int eleccionMenu = 0;
            if (usuario.getRol() == TipoUsuario.Jugador) {
                Jugador jugador = (Jugador) usuario;
                while (eleccionMenu != 10) {// hacer restriccion para que solo meta enteros
                    Menu menu = new MenuJugador();// deberia ponerlo fuera
                    menu.mostrarOpciones();
                    eleccionMenu = escIniSes.nextInt();
                    jugador.realizarFuncionMenuJugador(eleccionMenu);
                }
            } else {
                OperadorSistema operador = (OperadorSistema) usuario;
                operador.setManagerUsuarios(usuariosSistema);
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
                jugador.setPersonajeActivo(personajeElegido);
                System.out.println("Se te ha guardado el persoanje");
                guardarUsuarios(usuario);
            } else if (rol.equals("operador")) {
                Registro registro = new RegistroOperador(usuariosSistema);
                Usuario usuario = registro.registrarse(TipoUsuario.OperadorSistema);
                guardarUsuarios(usuario);
            } else {
                System.out.print("Por favor escoja una de las opciones proporcionadas \n");
            }
        }
    }

    private void guardarUsuarios(Usuario usuario) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (usuario instanceof Jugador) {
            sb.append("jugador");
        } else if (usuario instanceof OperadorSistema) {
            sb.append("operador");
        }
        sb.append(";");
        sb.append(usuario.getNombre());
        sb.append(";");
        sb.append(usuario.getNick());
        sb.append(";");
        sb.append(usuario.getPassword());
        sb.append(";");
        if (usuario instanceof Jugador) {
            Jugador jugador = (Jugador) usuario;
            sb.append(jugador.getNumeroRegistro());
            sb.append(";");
            Integer oro = jugador.getOro();
            sb.append(oro.toString());
            sb.append(";");
            Boolean estaBaneado = jugador.getEstaBaneado();
            sb.append(estaBaneado.toString());
            sb.append(";");
            Personaje personaje = jugador.getPersonajeActivo();
            if (personaje instanceof Vampiro) {
                sb.append("vampiro-");
            } else if (personaje instanceof Licantropo) {
                sb.append("licantropo-");
            } else if (personaje instanceof Cazador) {
                sb.append("cazador-");
            }
            sb.append(personaje.getNombre());
            sb.append("-");
            sb.append(personaje.getHabilidadPersonaje().getNombre());
            sb.append("/");
            sb.append(personaje.getHabilidadPersonaje().getLimitante());
            sb.append("/");
            sb.append(personaje.getHabilidadPersonaje().getValorAtaque());
            sb.append("/");
            sb.append(personaje.getHabilidadPersonaje().getValorDefensa());
            sb.append("-");
            // armas
            Arma[] armas = personaje.getArmas();
            for (int i = 0; i < armas.length; i++) {
                sb.append(armas[i].getNombre());
                sb.append("/");
                sb.append(armas[i].getModDanio());
                sb.append("/");
                sb.append(armas[i].getModDefensa());
                sb.append("/");
                sb.append(armas[i].getTipodeArma().toString());
                sb.append(",");
            }
            // armas activas
            sb.append("-");
            armas = personaje.getArmasActivas();
            for (int i = 0; i < armas.length; i++) {
                sb.append(armas[i].getNombre());
                sb.append("/");
                sb.append(armas[i].getModDanio());
                sb.append("/");
                sb.append(armas[i].getModDefensa());
                sb.append("/");
                sb.append(armas[i].getTipodeArma().toString());
                sb.append(",");
            } // se me guarda una barrita de mas
            sb.append("-");
            // armaduras
            Armadura[] armaduras = personaje.getArmaduras();
            for (int i = 0; i < armaduras.length; i++) {
                sb.append(armaduras[i].getNombre());
                sb.append("/");
                sb.append(armaduras[i].getModDanio());
                sb.append("/");
                sb.append(armaduras[i].getModDefensa());
                sb.append(",");
            }
            sb.append("-");
            // armadura activa
            sb.append(personaje.getArmaduraActiva().getNombre());
            sb.append("/");
            sb.append(personaje.getArmaduraActiva().getModDanio());
            sb.append("/");
            sb.append(personaje.getArmaduraActiva().getModDefensa());
            sb.append("-");
            // esbirros
            Esbirro[] esbirros = personaje.getEsbirros();
            escribirEsbirrosdeEsbirro(esbirros, sb);
            sb.append("-");
            // salud
            sb.append(personaje.getSalud());
            sb.append("-");
            // poder
            sb.append(personaje.getPoder());
            sb.append("-");
            // debilidades
            Debilidad[] debilidades = personaje.getDebilidades();
            for (int i = 0; i < debilidades.length; i++) {
                sb.append(debilidades[i].getNombre());
                sb.append("/");
                sb.append(debilidades[i].getValor());
                sb.append("|");
            }
            sb.append("-");
            // fortalezas
            Fortaleza[] fortalezas = personaje.getFortalezas();
            for (int i = 0; i < fortalezas.length; i++) {
                sb.append(fortalezas[i].getNombre());
                sb.append("/");
                sb.append(fortalezas[i].getValor());
                sb.append("|");
            }
            sb.append("-");
            if (personaje instanceof Vampiro vamp) {
                sb.append(vamp.getSangre());
                sb.append("-");
                sb.append(vamp.getEdad());
            } else if (personaje instanceof Licantropo lican) {
                sb.append(lican.getRabia());
            } else if (personaje instanceof Cazador cazador) {
                sb.append(cazador.getVoluntad());
            }
        }
        File file = new File("Ficheros/Usuarios.txt");
        FileWriter escritor = new FileWriter(file, true);
        escritor.write(sb.toString());
        escritor.flush();
    }

    private void escribirEsbirrosdeEsbirro(Esbirro[] esbirros, StringBuilder sb) {
        // recursividad
        for (int i = 0; i < esbirros.length; i++) {
            sb.append(esbirros[i].getNombre());
            sb.append("/");
            sb.append(esbirros[i].getSalud());
            sb.append("/");
            if (esbirros[i] instanceof Ghoul) {
                Ghoul ghoul = (Ghoul) esbirros[i];
                sb.append(ghoul.getDependencia());
                sb.append("|");// separara cada esbirro con |
            } else if (esbirros[i] instanceof Humano) {
                Humano humano = (Humano) esbirros[i];
                sb.append(humano.getLealtad());
                sb.append("|");
            } else if (esbirros[i] instanceof Demonio) {
                Demonio demonio = (Demonio) esbirros[i];
                if (demonio.getTienePacto()) {
                    sb.append("si");
                    sb.append("/");
                    sb.append(demonio.getPacto().getAmo().getNombre());
                    sb.append("/");
                } else {
                    sb.append("no");
                    sb.append("/");
                    sb.append("null");
                    sb.append("/");
                }
                sb.append("|");
                ArrayList<Esbirro> esbirrosDeEsbirro = demonio.getEsbirros();
                for (int j = 0; j < esbirrosDeEsbirro.size(); j++) {
                    escribirEsbirrosdeEsbirro(esbirros, sb); // recursividad
                }
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
            for (int i = 0; i < esbirrosLeidos.length; i++) {
                String[] caracteristicaEsbirro = esbirrosLeidos[i].split("/");
                Esbirro esbirro = new Esbirro(caracteristicaEsbirro[0], Integer.parseInt(caracteristicaEsbirro[1]));
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
