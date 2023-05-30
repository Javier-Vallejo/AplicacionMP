/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fase3mp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author juana
 */
public class SistemaPrincipalGameTest {

    public SistemaPrincipalGameTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    public Jugador registrarseJugador(ManagerUsuarios manager, TipoUsuario rol, String nick, String password) {
        ManagerUsuarios usuariosSistema = new ManagerUsuarios();
        String nombre = null;
        Jugador jugador = null;

        System.out.print("Introduzca su nombre: \n");
        nombre = "a";
        System.out.print("Introduzca su nick: \n");
        System.out.print("Introduzca su password: \n");
        if (!usuariosSistema.existeUsuario(nick, password)) {
            jugador = manager.CrearJugador(nombre, nick, password, rol, State.noBaneado, 100);
            return jugador;
        } else {
            System.out.print("Ya estás registrado en el sistema \n");
        }

        return jugador;

    }

    public OperadorSistema registrarseOperador(ManagerUsuarios manager, TipoUsuario rol, String nick, String password) {
        ManagerUsuarios usuariosSistema = new ManagerUsuarios();
        String nombre = null;
        OperadorSistema operador2 = null;
        System.out.print("Introduzca su nombre: \n");
        nombre = "a";
        System.out.print("Introduzca su nick: \n");
        System.out.print("Introduzca su password: \n");
        if (!usuariosSistema.existeUsuario(nick, password)) {
            operador2 = manager.CrearOperador(nombre, nick, password, rol, null);
        } else {
            System.out.print("Ya estás registrado en el sistema \n");
        }

        return operador2;
    }

    public void run(int opcionElegida, String nick, String password, String rol) throws IOException {
        ManagerUsuarios manager = new ManagerUsuarios();
        manager.CrearJugador("a", "megaboyJugador", "123", TipoUsuario.OperadorSistema, null,100);

        manager.CrearOperador("a", "megaboy", "123", TipoUsuario.OperadorSistema, null);
        EntidadesActivas entidadesActivas = crearEntidades();
        // entidadesActivas.LeerEntidades();
        // Ranking ranking = new Ranking();
        // ranking.setManager(usuariosSistema);
        // entidadesSistema.leerEsbirros();
        // leerPersonajes("Ficheros/Personajes.txt");
        // manager.LeerUsuarios(entidadesSistema);
        // inicializarHabilidades(entidadesActivas);
        // Scanner escanerMain = new Scanner(System.in);

        System.out.println("Pulse 1 si desea iniciar sesion y 2 si desea registrarse:");
        System.out.println("Pulse 3 si desea salir");
        if (opcionElegida == 1) {
            iniciarSesion(manager, nick, password);
        } else if (opcionElegida == 2) {
            if (registrarse(manager, nick, password, rol)) {
                String opcion = "si";
                // escanerMain.hasNextLine();
                System.out.println("Deseas iniciar sesion? si o no");
                System.out.println("Opcion elegida: "+ opcion);
                // opcion = escanerMain.nextLine().toLowerCase().trim();
                if (!(opcion.equals("si") || opcion.equals("no"))) {
                    System.out.println("Por favor indique si o no");
                    
                }

                if (opcion.equals("si")) {
                    iniciarSesion(manager, nick, password);
                } else if (opcion.equals("no")) {
                    System.out.println("Saliendo del programa ¡Hasta Luego!");
                }

            }
            else {
                System.out.println("Fallo a la hora de registrarse");

            }

        } else if (opcionElegida == 3) {
            System.exit(0);
            System.out.println("Saliendo del programa ¡Hasta Luego!");
        } else {
            System.out.println("Por favor escoja una de las opciones proporcionadas.");
        }

    }

    public OperadorSistema CrearOperador() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        managerUsuarios.CrearJugador("nombre", "A", "a", TipoUsuario.Jugador, null, 100);
        OperadorSistema instance = new OperadorSistema("operador", "ope", "123", TipoUsuario.OperadorSistema,
                managerUsuarios);
        Publisher expResult = new Publisher();
        instance.setNotificador(expResult);
        instance.setManagerUsuarios(managerUsuarios);
        return instance;
    }

    public Cazador CrearCazadorBase() {

        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma[] armas = new Arma[1];
        armas[0] = arma;
        Armadura armadura = new Armadura("armadura", "10", "5");
        Armadura[] armaduras = new Armadura[1];
        armaduras[0] = armadura;
        Esbirro esbirro = new Esbirro("esbirro", 10);
        Esbirro[] esbirros = new Esbirro[1];
        esbirros[0] = esbirro;
        Debilidad debilidad = new Debilidad("debilidad", 0);
        Debilidad[] debilidades = new Debilidad[1];
        debilidades[0] = debilidad;
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        Fortaleza[] fortalezas = new Fortaleza[1];
        fortalezas[0] = fortaleza;
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 3, 3,
                debilidades, fortalezas);
        instance.setVoluntad(10);

        return instance;

    }

    public EntidadesActivas crearEntidades() {
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Fortaleza> expResult = new ArrayList<>();
        Fortaleza fortaleza = new Fortaleza("fortaleza1", 2);
        Fortaleza fortaleza2 = new Fortaleza("fortaleza2", 4);
        expResult.add(fortaleza);
        expResult.add(fortaleza2);
        instance.setFortalezas(expResult);
        ArrayList<Debilidad> debilidades = new ArrayList<>();
        Debilidad debilidad = new Debilidad("debilidad", 2);
        Debilidad debilidad2 = new Debilidad("debilidad2", 4);
        debilidades.add(debilidad);
        debilidades.add(debilidad2);
        instance.setDebilidades(debilidades);
        Cazador cazador = CrearCazadorBase();
        instance.aniadir(cazador);

        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        instance.aniadir(habilidad);

        Ghoul ghoul = new Ghoul("esbirro", 10);
        instance.aniadir(ghoul);

        Arma arma = new Arma("arma", "10", "10", "de2manos");
        ArrayList<Arma> armas = new ArrayList<>();
        armas.add(arma);
        instance.setArmas(armas);

        Armadura armadura = new Armadura("armadura", "10", "5");
        ArrayList<Armadura> armaduras = new ArrayList<>();
        armaduras.add(armadura);
        instance.setArmaduras(armaduras);
        return instance;
    }

    private void iniciarSesion(ManagerUsuarios managerUsuarios, String nick, String password) throws IOException {
        System.out.println("-----Inicio de Sesion-----");
        EntidadesActivas entidadesSistema = crearEntidades();
        Ranking rankingSistema = new Ranking();
        int intentos = 0;
        while (intentos < 3 && managerUsuarios.existeUsuario(nick, password) == false) {
            System.out.println("Introduzca su nick: ");
            System.out.println("Introduzca su password: ");
            if (managerUsuarios.existeUsuario(nick, password) == false && intentos != 2) {
                System.out.println(
                        "Usuario no encontrado. Por favor, asegurese de insertar su usuario y contraseña correctamente.");
            }
            ++intentos;
        }
        if (managerUsuarios.existeUsuario(nick, password) == false) {
            System.out.println("Usuario no encontrado, saliendo del sistema.");
            return;
        } else {
            Usuario usuario = managerUsuarios.obtenerUsuario(nick, password);
            System.out.println("Bienvenido " + usuario.getNick());

            usuario.setManagerUsuarios(managerUsuarios);
            usuario.setEntidades(entidadesSistema);
            if (usuario.getRol() == TipoUsuario.Jugador) {
                Jugador jugador = (Jugador) usuario;
                jugador.setRankingGlobal(rankingSistema);

                Menu menu = new MenuJugador();
                menu.mostrarOpciones();

            } else {
                OperadorSistema operador = (OperadorSistema) usuario;
                usuario.setEntidades(entidadesSistema);

                Menu menu = new MenuOperador();
                menu.mostrarOpciones();

            }

        }
    }

    private boolean registrarse(ManagerUsuarios managerUsuarios, String nick, String password, String rol)
            throws IOException {
        System.out.println("-----Registro-----");
        // escanerRegistro.close();
        OperadorSistema operador = CrearOperador();
        ManagerUsuarios usuariosSistema = managerUsuarios;
        EntidadesActivas entidadesSistema = crearEntidades();

        System.out.print("Desea registrarse como jugador o como operador: \n");
        if (rol.equals("jugador")) {
            // Registro registro = new RegistroJugador(usuariosSistema);
            // Usuario usuario = registro.registrarse(TipoUsuario.Jugador);
            // System.out
            // .println("Ya casi has terminado de registrarte, ahora elige un personaje que
            // luche a tu lado");
            Jugador jugador = registrarseJugador(usuariosSistema, TipoUsuario.Jugador, nick, password);
            if (jugador == null) {
                return false;
            }
            Personaje personajeElegido = CrearCazadorBase();
            jugador.setPersonajeActivo(personajeElegido);
            if (personajeElegido == null) {
                return false;
            }
            return true;
        } else if (rol.equals("operador")) {
            Registro registro = new RegistroOperador(usuariosSistema);
            OperadorSistema operadorCreado = registrarseOperador(usuariosSistema, TipoUsuario.OperadorSistema, nick,
                    password);
            if (operadorCreado == null) {
                return false;
            }
            return true;
        } else {
            System.out.print("Por favor escoja una de las opciones proporcionadas \n");
        }

        return false;
    }

    /**
     * Test of obtenerInstancia method, of class SistemaPrincipalGame.
     */
    @Test
    public void testObtenerInstancia() {
        System.out.println("obtenerInstancia");
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = SistemaPrincipalGame.obtenerInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistema method, of class SistemaPrincipalGame.
     */
    @Test
    public void testGetSistema() {
        System.out.println("getSistema");
        SistemaPrincipalGame instance = null;
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = instance.getSistema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testrunExisteUsuario() throws IOException {
        System.out.println("getSistema");
        SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = instance.getSistema();
        run(1, "megaboy", "123", "operador");
    }

    @Test
    public void testrunNoExisteUsuario() throws IOException {
        System.out.println("getSistema");
        SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = instance.getSistema();
        run(1, "megaboy2", "123", "operador");
    }

    @Test
    public void testrunRegistrasreExitosamente() throws IOException {
        System.out.println("getSistema");
        SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = instance.getSistema();
        run(2, "megaboy2", "123", "operador");
    }

    @Test
    public void testrunRegistrasreErroneamente() throws IOException {
        System.out.println("getSistema");
        SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
        SistemaPrincipalGame expResult = null;
        SistemaPrincipalGame result = instance.getSistema();
        run(2, "megaboy", "123", "operador");
    }




    /*
     * 
     * 
     * 
     */


     @Test
     public void testrunExisteUsuarioJugador() throws IOException {
         System.out.println("getSistema");
         SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
         SistemaPrincipalGame expResult = null;
         SistemaPrincipalGame result = instance.getSistema();
         run(1, "megaboyJugador", "123", "jugador");
     }
 
     @Test
     public void testrunNoExisteUsuarioJugador() throws IOException {
         System.out.println("getSistema");
         SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
         SistemaPrincipalGame expResult = null;
         SistemaPrincipalGame result = instance.getSistema();
         run(1, "megaboy2", "123", "jugador");
     }
 
     @Test
     public void testrunRegistrasreExitosamenteJugador() throws IOException {
         System.out.println("getSistema");
         SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
         SistemaPrincipalGame expResult = null;
         SistemaPrincipalGame result = instance.getSistema();
         run(2, "megaboyJugador2", "123", "jugador");
     }
 
     @Test
     public void testrunRegistrasreErroneamenteJugador() throws IOException {
         System.out.println("getSistema");
         SistemaPrincipalGame instance = SistemaPrincipalGame.obtenerInstancia();
         SistemaPrincipalGame expResult = null;
         SistemaPrincipalGame result = instance.getSistema();
         run(2, "megaboyJugador", "123", "jugador");
     }


    

}
