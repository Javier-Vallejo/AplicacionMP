/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class OperadorSistema extends Usuario {

    private Publisher notificador;

    ManagerUsuarios manager = super.getManagerUsuarios();

    public OperadorSistema(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador) {
        super(nombre, nick, password, rol, estadoObservador);
    }

    private void aniadirPersonaje() throws IOException {
        File ficheroPersonajes = new File("Personajes.txt");
        try (Scanner lectura = new Scanner(System.in)) {
            System.out.println("Escriba el nombre del personaje:");
            String nombreCarac = lectura.nextLine();
            // armas
            System.out.println("Escriba los numeros de las armas que quiere que tenga su personaje: ");
            ArrayList<Integer> armasEleg = super.getEntidades().MostraryElegir("ARMAS");
            Arma[] armasPersonaje = new Arma[armasEleg.size()];
            for (int i = 0; i < armasEleg.size(); i++) {
                armasPersonaje[i] = super.getEntidades().elegirArma(armasEleg.get(i));
            }
            // armas activas
            System.out.println("Elige el numero del arma o armas que va a tener como activas: ");
            System.out.println("(Ten en cuenta que va a ser una de dos manos o dos de una mano)");
            for (int i = 0; i < armasPersonaje.length; i++) {
                System.out.println(
                        i + "_" + armasPersonaje[i].getNombre() + armasPersonaje[i].getTipodeArma().toString());
            }
            System.out.println(armasPersonaje.length + 1 + " Salir");
            int numArmaActiva = 0;
            ArrayList<Arma> armasActivas = new ArrayList<>();
            while (numArmaActiva != armasPersonaje.length + 1) {
                numArmaActiva = lectura.nextInt();
                if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de2manos && armasActivas.isEmpty()) {
                    armasActivas.add(armasPersonaje[numArmaActiva]);
                } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                        && armasActivas.isEmpty()) {
                    armasActivas.add(armasPersonaje[numArmaActiva]);
                } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                        && armasActivas.size() == 1) {
                    armasActivas.add(armasPersonaje[numArmaActiva]);
                } else {
                    System.out.println("El arma que intentas establecer como activa no cabe");
                }
            }
            Arma[] armasActivasPersonaje = armasActivas.toArray(new Arma[2]);

            // armaduras
            System.out.println("Escriba el numero de la armadura que quiere que tenga su personaje: ");
            ArrayList<Integer> armadurasEleg = super.getEntidades().MostraryElegir("ARMADURAS");
            Armadura[] armadurasPersonaje = new Armadura[armadurasEleg.size()];
            for (int i = 0; i < armadurasEleg.size(); i++) {
                armadurasPersonaje[i] = super.getEntidades().elegirArmadura(armasEleg.get(i));
            }
            // armadura activa
            System.out.println("Elige el numero de la armadura que va tener activa: ");
            for (int i = 0; i < armadurasPersonaje.length; i++) {
                System.out.println(i + "_" + armadurasPersonaje[i].getNombre());
            }
            System.out.println(armadurasPersonaje.length + 1 + " Salir");
            int numArmaduraActiva = 0;
            while (numArmaduraActiva != armadurasPersonaje.length + 1) {
                numArmaduraActiva = lectura.nextInt();
            }
            Armadura armaduraActivaPersonaje = armadurasPersonaje[numArmaduraActiva];
            // fortaleza
            System.out.println("Escriba el numero de la/las fortaleza/fortalezas que quiere que tenga su personaje: ");
            ArrayList<Integer> fortalezasEleg = super.getEntidades().MostraryElegir("FORTALEZAS");
            Fortaleza[] fortalezasPersonaje = new Fortaleza[fortalezasEleg.size()];
            for (int i = 0; i < fortalezasEleg.size(); i++) {
                fortalezasPersonaje[i] = super.getEntidades().elegirFortaleza(fortalezasEleg.get(i));
            }
            // debilidad
            System.out.println("Escriba el numero de la/las debilidad/debilidades que quiere que tenga su personaje: ");
            ArrayList<Integer> debilidadesEleg = super.getEntidades().MostraryElegir("DEBILIDADES");
            Debilidad[] debilidadesPersonaje = new Debilidad[debilidadesEleg.size()];
            for (int i = 0; i < debilidadesEleg.size(); i++) {
                debilidadesPersonaje[i] = super.getEntidades().elegirDebilidad(debilidadesEleg.get(i));
            }

            // salud personaje
            System.out.println("Escriba la salud del personaje: [Limitada entre 1 y 5]");
            int saludPersonaje = lectura.nextInt();
            while (saludPersonaje < 1 && saludPersonaje > 5) {
                System.out.println("El valor de salud debe estar entre 1 y 5");
                System.out.println("Por favor introduzca el valor de nuevo: ");
                saludPersonaje = lectura.nextInt();
            }
            // poder personaje
            System.out.println("Escriba el poder del personaje: [Limitado entre 1 y 5]");
            int poderPersonaje = lectura.nextInt();
            while (poderPersonaje < 1 && poderPersonaje > 5) {
                System.out.println("El valor de poder debe estar entre 1 y 5");
                System.out.println("Por favor introduzca el valor de nuevo: ");
                poderPersonaje = lectura.nextInt();
            }

            // habilidad
            System.out.println("Escriba el numero de la habilidad que quiere que tenga su personaje: ");
            int habilidadElegida = super.getEntidades().MostraryElegirHabilidad();
            Habilidad habilidadPersonaje = super.getEntidades().getHabilidades().get(habilidadElegida);

            // Esbirros
            FabricaEsbirros fabricaEsbirros = super.getFabricaEsbirros();
            String tipoEsbirro = "";
            ArrayList<Esbirro> esbirrosPers = new ArrayList<>();
            while (!tipoEsbirro.equals("salir")) {
                System.out.println("Escriba el tipo de esbirro que desea introducirle: ");
                System.out.println("Las opciones son Humano, Ghoul y Demonio. Escriba salir para terminar.");
                tipoEsbirro = lectura.nextLine();
                tipoEsbirro = tipoEsbirro.toLowerCase().trim();
                System.out.println("Introduzca el nombre que le quiere poner al esbirro: ");
                String nombreEsbirro = lectura.nextLine();
                System.out.println("Introduzca la salud del esbirro: ");
                int saludEsbirro = lectura.nextInt();
                switch (tipoEsbirro) { // se deberia poder elegir si crear nuevos esbirros o elegir algunos del sistema
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
                    case "salir" -> {
                        System.out.println("Esbirros elegidos.");
                    }
                    default -> {
                        System.out.println("Nombre de esbirro no correcto");
                    }
                }
            }
            Esbirro[] esbirrosPersonaje = (Esbirro[]) esbirrosPers.toArray();

            System.out.println("Que tipo de personaje desea crear? - Escriba el numero de su tipo:");
            System.out.println("1. Licantropo --- 2. Vampiro --- 3.Cazador");
            // habria que poner un while por si mete otro valor
            Integer leido = lectura.nextInt();

            try (FileWriter escritorFich = new FileWriter(ficheroPersonajes)) {
                FabricaPersonajes fabricaPersonajes = super.getFabricaPersonajes();

                switch (leido) {
                    // cada tipo de personaje integrará su propia habilidad
                    case 1: // creamos un licantropo
                        fabricaPersonajes = new FabricaLicantropo();
                        Licantropo licanNuevo = (Licantropo) fabricaPersonajes.crearPersonaje(nombreCarac,
                                habilidadPersonaje,
                                armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                                esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                                fortalezasPersonaje);
                        licanNuevo.rellenarPropiedadesEspecificas();
                        super.getEntidades().aniadir(licanNuevo);
                        escritorFich.write(""); // habra que convertir las propiedades que no sean string
                        break;
                    case 2: // creamos un vampiro
                        fabricaPersonajes = new FabricaVampiro();
                        Vampiro vampNuevo = (Vampiro) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje,
                                armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                                esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                                fortalezasPersonaje);
                        vampNuevo.rellenarPropiedadesEspecificas();
                        super.getEntidades().aniadir(vampNuevo);
                        escritorFich.write("");
                        break;
                    case 3: // creamos un cazador
                        fabricaPersonajes = new FabricaCazador();
                        Cazador cazNuevo = (Cazador) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje,
                                armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                                esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                                fortalezasPersonaje);
                        super.getEntidades().aniadir(cazNuevo);
                        escritorFich.write("");
                        break;
                }
                // super.getEntidades().aniadir(licanNuevo); Esta linea hay que ver como
                // integrarla en cada case.
                // guardar nuevo personaje en fichero para persistencia
            }
        }
    }

    private void validarDesafio(Desafio desafio) {

        try (Scanner scanner = new Scanner(System.in)) {
            int eleccion = 0;
            // Sacamos las fortalezas y debilidades de los personajes desafiados y
            // desafiantes
            Debilidad[] debilidadesDesafiante = desafio.getJugadorDesafiante().getPersonajeActivo().getDebilidades();
            Fortaleza[] fortalezasDesafiante = desafio.getJugadorDesafiante().getPersonajeActivo().getFortalezas();
            Debilidad[] debilidadesDesafiado = desafio.getJugadorDesafiado().getPersonajeActivo().getDebilidades();
            Fortaleza[] fortalezasDesafiado = desafio.getJugadorDesafiado().getPersonajeActivo().getFortalezas();

            // arraylist donde se guardaran los resultados:
            ArrayList<Fortaleza> FElegDesafiante = new ArrayList<>();
            ArrayList<Fortaleza> FElegDesafiado = new ArrayList<>();
            ArrayList<Debilidad> DElegDesafiante = new ArrayList<>();
            ArrayList<Debilidad> DElegDesafiado = new ArrayList<>();

            // mostramos debilidades por pantalla del desafiantes
            listarDebilidades(debilidadesDesafiante);
            System.out.println("Escoja los números de las debilidades del Jugador desafiante deseas: ");
            // el operador elige debilidades y las guarda
            while (eleccion != debilidadesDesafiante.length + 1) { // habra que comprobar que no elija una debilidad o
                                                                   // fortaleza 2 veces
                eleccion = scanner.nextInt();
                DElegDesafiante.add(debilidadesDesafiante[eleccion]);
            }
            // mostramos fortalezas por pantalla del desafiantes
            listarFortalezas(fortalezasDesafiante);
            System.out.println("Escoja los números de las fortalezas del Jugador desafiante que desea: ");
            // el operador elige fortalezas y las guarda
            while (eleccion != fortalezasDesafiante.length + 1) { // habra que comprobar que no elija una debilidad o
                                                                  // fortaleza 2 veces
                eleccion = scanner.nextInt();
                FElegDesafiante.add(fortalezasDesafiante[eleccion]);
            }
            // mostramos debilidades por pantalla del desafiado
            listarDebilidades(debilidadesDesafiado);
            System.out.println("Escoja los números de las debilidades del Jugador desafiado que desea: ");
            while (eleccion != debilidadesDesafiante.length + 1) { // habra que comprobar que no elija una debilidad o
                                                                   // fortaleza 2 veces
                eleccion = scanner.nextInt();
                DElegDesafiado.add(debilidadesDesafiado[eleccion]);
            }
            // mostramos fortalezas por pantalla del desafiado
            listarFortalezas(fortalezasDesafiado);
            System.out.println("Escoja los números de las fortalezas del Jugador desafiado que desea: ");
            // el operador elige fortalezas y las guarda
            while (eleccion != fortalezasDesafiado.length + 1) { // habra que comprobar que no elija una debilidad o
                                                                 // fortaleza 2 veces
                eleccion = scanner.nextInt();
                FElegDesafiado.add(fortalezasDesafiado[eleccion]);
            }

            // comprobar oro desafiado
            int oro = desafio.getOroApostado();
            int oroDesafiado = desafio.getJugadorDesafiado().getOro();
            System.out.println("Oro del usuario que ha sido desafiado: " + oroDesafiado);
            System.out.println("Oro apostado: " + oro);

            // ahora el operador decide si validar o no el desafio:
            String validacion = null;
            System.out.println("Deseas validar o no validar el desafio: SI/NO");
            while (!validacion.equals("SI") || !validacion.equals("NO")) {
                validacion = scanner.nextLine();
                if (validacion.equals("SI")) { // habria que hacer que se cambie a mayus lo que escriba para que da igual que pona si, Si, o SI
                    desafio.setEstado(Desafio.State.Validado);
                } else if (!validacion.equals("SI") || !validacion.equals("NO")) {
                    System.out.println("Por favor, intraduzca 'Si' si quiere validar el desafio o 'No' si quiere rechazarlo");
                }
            }
        }
    }

    public void realizarFuncionMenuOperador(int opcion) throws IOException {

        ArrayList<Usuario> usuarioEle = manager.getUsuariosRegistrados();
        // insertar variables duplicadas en las opciones de banear y desbanear?
        switch (opcion) {
            case 1:// Darse de baja
                DarseDeBaja(this);
                break;
            case 2:// Editar Personaje
                ArrayList<Integer> personajeEle = super.getEntidades().MostraryElegir("PERSONAJES");// se podria hacer
                                                                                                    // que entidades de
                                                                                                    // usuario fuera
                                                                                                    // publico
                Personaje personaje = super.getEntidades().elegirPersonaje(personajeEle.get(0));// para que lo hereden
                                                                                                // los hijos sin tener
                                                                                                // que hacer get
                personaje.editarPersonaje();
                for (int i = 0; i < manager.getUsuariosRegistrados().size(); i++) { // esto
                    if (manager.getUsuariosRegistrados().get(i) instanceof Jugador jugador) {
                        if (jugador.getPersonajeActivo().getNombre().equals(personaje.getNombre())) {
                            jugador.setPersonajeActivo(personaje.clonar()); // por polimorfismo se ejecutara el clonar
                                                                            // del personaje especifico
                        }
                    }
                }
                break;
            case 3:// Aniadir Personaje
                aniadirPersonaje();
                break;
            case 4:// Validar Desafio
                Desafio desafio = super.getDesafiosAct().obtenerDesafio();
                validarDesafio(desafio);// y notificarlo con el observer
                break;
            case 5:// Banear Usuario
                imprimirListaUsuariosDesbaneados(usuarioEle);
                Scanner escanerUsuario = new Scanner(System.in);// se podrian mostrar los nicks de todos los jugadores
                System.out.println("Introduzca el numero del usuario que desea banear: ");
                Integer numero = escanerUsuario.nextInt();
                Usuario usuario = usuarioEle.get(numero);
                System.out.println("¿Esta seguro de que quier desbanear al usuario " + usuario.getNick() + "?");
                System.out.println("Pulse 1 si asi es, en caso contrario pulse culaquier otro numero");
                Integer opc = escanerUsuario.nextInt();
                if (opc == 1) {
                    usuario.setEstadoObservador(State.baneado);
                }
                /*
                 * Creo que lo sig no haria falta pero por si acaso lo dejo:
                 * String nick = usuario.getNick();
                 * String password = usuario.getPassword();
                 * Usuario usuario = super.getManagerUsuarios().obtenerUsuario(nick, password);
                 */
                break;
            case 6:// Desbanear Usuario
                imprimirListaUsuariosBaneados(usuarioEle);
                Scanner escanerUsu = new Scanner(System.in);// se podrian mostrar los nicks de todos los jugadores
                System.out.println("Introduzca el numero del usuario que desea banear: ");
                Integer num = escanerUsu.nextInt();
                Usuario usu = usuarioEle.get(num);// habria que ver como elegir al usuario a banear
                System.out.println("¿Esta seguro de que quier desbanear al usuario " + usu.getNick() + "?");
                System.out.println("Pulse 1 si asi es, en caso contrario pulse culaquier otro numero");
                Integer op = escanerUsu.nextInt();
                if (op == 1) {
                    usu.setEstadoObservador(State.noBaneado);
                }
                break;
            case 7:// Salir
                System.out.println("Cerrando sesion y saliendo");
                System.exit(0);
                break;
        }
    }

    public void imprimirListaUsuariosDesbaneados(ArrayList<Usuario> usuarioEle) {
        for (int i = 0; i < usuarioEle.size(); i++) {
            Usuario usuario = usuarioEle.get(i);
            State estadoUsuario = usuario.getEstadoObservador();
            if (estadoUsuario.equals(State.noBaneado)) {
                System.out.println(i + "-" + usuario.getNick());
            }
        }
    }

    public void imprimirListaUsuariosBaneados(ArrayList<Usuario> usuarioEle) {
        for (int i = 0; i < usuarioEle.size(); i++) {
            Usuario usuario = usuarioEle.get(i);
            State estadoUsuario = usuario.getEstadoObservador();
            if (estadoUsuario.equals(State.baneado)) {
                System.out.println(i + "-" + usuario.getNick());
            }
        }
    }

    public void listarDebilidades(Debilidad[] d) {

        for (int i = 0; i < d.length; i++) {
            Debilidad debilidad = d[i];
            System.out.println(i + ":" + debilidad.getNombre());
        }
    }

    public void listarFortalezas(Fortaleza[] f) {

        for (int i = 0; i < f.length; i++) {
            Fortaleza fortaleza = f[i];
            System.out.println(i + ":" + fortaleza.getNombre());
        }
    }

    public Publisher getNotificador() {
        return notificador;
    }

    public void setNotificador(Publisher notificador) {
        this.notificador = notificador;
    }

    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
    }

}
