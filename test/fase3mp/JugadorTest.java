/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juana
 */
public class JugadorTest {

    public JugadorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    public void editarPersonajeJugadorTesteable(Personaje personajeEle, EntidadesActivas entidades, int opcion) {

        // Scanner escanerLectura = new Scanner(System.in);
        System.out.println("Que desea gestionar del personaje:");
        System.out.println("- 1.Elegir Armas Activas");
        System.out.println("- 2.Elegir Armaduras Activas");
        System.out.println("- 3.Salir");
        switch (opcion) {
            case 1 -> {

                List<Arma> listaArmasActivas = Arrays.asList(personajeEle.getArmasActivas());
                ArrayList<Arma> arrayListArmas = new ArrayList<>(listaArmasActivas);
                Arma[] armasPersonaje = personajeEle.getArmas();
                System.out.println(
                        "Seleccione que arma desea activar (Ten en cuenta que va a ser una de dos manos o dos de una mano):");
                System.out.println("Estas son sus armas actuales:");
                personajeEle.MostrarArmas(personajeEle);
                int numArmaActiva = 0;
                numArmaActiva = 1;
                if (!(numArmaActiva == armasPersonaje.length)) {
                    if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de2manos
                            && arrayListArmas.isEmpty()) {
                        arrayListArmas.add(armasPersonaje[numArmaActiva]);
                        System.out.println("Arma " + numArmaActiva + " activada con exito.");
                    } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                            && arrayListArmas.isEmpty()) {
                        arrayListArmas.add(armasPersonaje[numArmaActiva]);
                    } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                            && arrayListArmas.size() == 1
                            && arrayListArmas.contains(armasPersonaje[numArmaActiva]) == false) {
                        arrayListArmas.add(armasPersonaje[numArmaActiva]);
                    } else if (arrayListArmas.contains(armasPersonaje[numArmaActiva])) {
                        System.out.println("Arma ya activa");
                    } else {
                        System.out.println("El arma que intentas establecer como activa no cabe");
                        System.out.println("¿Desea eliminar un arma que ya tenga?");
                        System.out.println("- 1.Si");
                        System.out.println("- 2.No");
                        int eleccion = 2;
                        if (eleccion == 1) {
                            System.out.println("Estas son sus armas Activas");
                            personajeEle.MostrarArmasActivas(personajeEle);
                            eleccion = 1;
                            arrayListArmas.remove(eleccion);
                        } else if (eleccion == 2) {
                            System.out.println(
                                    "El arma que intentas establecer como activa no se activara por falta de hueco.");
                        } else {
                            System.out.println("Por favor, introduzca 1 o 2.");
                        }
                    }
                }

                Arma[] armasActivasPersonaje = arrayListArmas.toArray(new Arma[0]);
                personajeEle.setArmasActivas(armasActivasPersonaje);

            }
            case 2 -> {
                Armadura armadura = personajeEle.getArmaduraActiva();
                Armadura[] listaArmaduras = personajeEle.getArmaduras();
                System.out.println("Seleccione que armadura desea activar");
                System.out.println("Estas son sus armaduras actuales:");
                personajeEle.MostrarArmaduras(personajeEle);
                int armadurasAactivar = 1;
                if (armadurasAactivar < listaArmaduras.length) {
                    armadura = listaArmaduras[armadurasAactivar];
                    personajeEle.setArmaduraActiva(armadura);
                }

            }
            case 3 -> {
                System.out.println("Volviendo a la pantalla del menu del operador");
                System.out.println();
                return;
            }

        }
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

    public void realizarFuncionMenuJugador(Jugador jugador, int opcion, int opcionEditar) {
        switch (opcion) {
            case 2:// Registrar Personaje
                if (jugador.getPersonajeActivo() != null) {
                    System.out.println("El personaje que elijas sustituira al tuyo.");
                    System.out.println("¿Deseas continuar?");
                    System.out.println("- 1.Si");
                    System.out.println("- 2.No");
                    int opcionSioNO = 1;

                    if (opcionSioNO == 1) {
                        ArrayList<Integer> personaje = new ArrayList<>();
                        personaje.add(0);
                        personaje.add(1);
                        Personaje personajeAct = (jugador.getEntidades().elegirPersonaje(personaje.get(0)));
                        jugador.setPersonajeActivo(personajeAct.clonar());
                    } else if (opcionSioNO == 2) {
                        System.out.println("Su personaje no se cambiara.");
                    }
                }
                break;
            case 3:// Gestionar Personaje
                if (jugador.getPersonajeActivo() == null) {
                    System.out.println("No tienes ningun personaje activo");
                } else {
                    Personaje personaje = jugador.getPersonajeActivo();
                    editarPersonajeJugadorTesteable(personaje,jugador.getEntidades(),opcionEditar);
                    // personaje.editarPersonajeJugador(personaje, jugador.getEntidades());
                }
                
                break;
            case 4:// Dar de baja Personaje
                jugador.setPersonajeActivo(null);
                break;
            case 6:// Consultar Oro
                System.out.println("Su oro actual es: " + jugador.getOro());
                break;
            case 7: // Consultar Ranking
                jugador.getRankingGlobal().consultarRanking();
                break;
            case 8:// Salir
                System.out.println("Cerrando sesion");
                break;
        }
    }

    public Desafio CrearDesafio(Jugador desafiante, Jugador desafiado) {
        Desafio instance = new Desafio();
        ArrayList<Fortaleza> result = new ArrayList<>();
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        result.add(fortaleza);
        instance.setFElegDesafiante(result);
        instance.setFElegDesafiado(result);
        ArrayList<Debilidad> debilidades = new ArrayList<>();
        Debilidad debilidad = new Debilidad("debilidad", 0);
        debilidades.add(debilidad);
        instance.setDElegDesafiante(debilidades);
        instance.setDElegDesafiado(debilidades);

        instance.setJugadorDesafiante(desafiante);
        instance.setJugadorDesafiado(desafiado);

        instance.setOroApostado(100);

        instance.setEstado(Desafio.State.Validado);

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
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 4, 10,
                debilidades, fortalezas);
        instance.setVoluntad(10);

        return instance;

    }

    public Jugador crearJugador(Publisher notificador, Personaje personaje, ManagerUsuarios managerUsuarios,
            Ranking ranking) {
        Jugador instance = new Jugador("a", "A", "123", TipoUsuario.Jugador, 10, managerUsuarios);
        instance.setEstaBaneado(false);
        instance.setNotificador(notificador);
        instance.setPersonajeActivo(personaje);
        instance.setNumeroRegistro("1234567");
        instance.setRankingGlobal(ranking);
        return instance;
    }

    /**
     * Test of getOro method, of class Jugador.
     */
    @Test
    public void testGetOro() {
        System.out.println("getOro");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, manager, null);
        int expResult = 10;
        int result = instance.getOro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOro method, of class Jugador.
     */
    @Test
    public void testSetOro() {
        System.out.println("setOro");
        ManagerUsuarios manager = new ManagerUsuarios();
        int oro = 500;
        Jugador instance = crearJugador(null, null, manager, null);
        int oroAntiguo = instance.getOro();
        instance.setOro(oro);
        assertNotEquals(oroAntiguo, instance.getOro());
    }

    /**
     * Test of getNotificador method, of class Jugador.
     */
    @Test
    public void testGetNotificador() {
        System.out.println("getNotificador");
        ManagerUsuarios manager = new ManagerUsuarios();
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, null, manager, null);
        Publisher result = instance.getNotificador();
        assertEquals(notificador, result);
    }

    /**
     * Test of setNotificador method, of class Jugador.
     */
    @Test
    public void testSetNotificador() {
        System.out.println("setNotificador");
        ManagerUsuarios manager = new ManagerUsuarios();
        Publisher notificadorAntiguo = new Publisher();
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificadorAntiguo, null, manager, null);
        instance.setNotificador(notificador);
        assertNotEquals(instance.getNotificador(), notificadorAntiguo);
    }

    /**
     * Test of getEstaBaneado method, of class Jugador.
     */
    @Test
    public void testGetEstaBaneado() {
        System.out.println("getEstaBaneado");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, manager, null);
        boolean expResult = false;
        boolean result = instance.getEstaBaneado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstaBaneado method, of class Jugador.
     */
    @Test
    public void testSetEstaBaneado() {
        System.out.println("setEstaBaneado");
        ManagerUsuarios manager = new ManagerUsuarios();
        boolean estaBaneado = true;
        Jugador instance = crearJugador(null, null, manager, null);
        boolean estadoAntiguo = instance.getEstaBaneado();
        instance.setEstaBaneado(estaBaneado);
        assertNotEquals(estadoAntiguo, instance.getEstaBaneado());
    }

    /**
     * Test of getPersonajeActivo method, of class Jugador.
     */
    @Test
    public void testGetPersonajeActivo() {
        System.out.println("getPersonajeActivo");
        ManagerUsuarios manager = new ManagerUsuarios();
        Personaje expResult = CrearCazadorBase();
        Jugador instance = crearJugador(null, expResult, manager, null);
        Personaje result = instance.getPersonajeActivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPersonajeActivo method, of class Jugador.
     */
    @Test
    public void testSetPersonajeActivo() {
        System.out.println("setPersonajeActivo");
        ManagerUsuarios manager = new ManagerUsuarios();
        Personaje personajeActivoAntiguo = CrearCazadorBase();
        Jugador instance = crearJugador(null, personajeActivoAntiguo, manager, null);
        Personaje personajeActivo = CrearCazadorBase();
        instance.setPersonajeActivo(personajeActivo);
        assertNotEquals(personajeActivoAntiguo, instance.getPersonajeActivo());
    }

    /**
     * Test of getNumeroRegistro method, of class Jugador.
     */
    @Test
    public void testGetNumeroRegistro() {
        System.out.println("getNumeroRegistro");
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, manager, null);
        String expResult = "1234567";
        String result = instance.getNumeroRegistro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumeroRegistro method, of class Jugador.
     */
    @Test
    public void testSetNumeroRegistro() {
        System.out.println("setNumeroRegistro");
        ManagerUsuarios manager = new ManagerUsuarios();
        String NumeroRegistro = "7654321";
        Jugador instance = crearJugador(null, null, manager, null);
        String NumAntiguo = instance.getNumeroRegistro();
        instance.setNumeroRegistro(NumeroRegistro);
        assertNotEquals(NumAntiguo, instance.getNumeroRegistro());
    }

    /**
     * Test of getManager method, of class Jugador.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        ManagerUsuarios expResult = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, expResult, null);
        ManagerUsuarios result = instance.getManager();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManager method, of class Jugador.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        ManagerUsuarios managerAntiguo = new ManagerUsuarios();
        ManagerUsuarios manager = new ManagerUsuarios();
        Jugador instance = crearJugador(null, null, managerAntiguo, null);
        instance.setManager(manager);
        assertNotEquals(managerAntiguo, instance.getManager());
    }

    /**
     * Test of getRankingGlobal method, of class Jugador.
     */
    @Test
    public void testGetRankingGlobal() {
        System.out.println("getRankingGlobal");
        ManagerUsuarios manager = new ManagerUsuarios();
        Ranking expResult = new Ranking();
        Jugador instance = crearJugador(null, null, manager, expResult);
        Ranking result = instance.getRankingGlobal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRankingGlobal method, of class Jugador.
     */
    @Test
    public void testSetRankingGlobal() {
        System.out.println("setRankingGlobal");
        ManagerUsuarios manager = new ManagerUsuarios();
        Ranking rankingAnterior = new Ranking();
        Ranking rankingGlobal = new Ranking();
        ;
        Jugador instance = crearJugador(null, null, manager, rankingAnterior);
        ;
        instance.setRankingGlobal(rankingGlobal);
        assertNotEquals(rankingAnterior, instance.getRankingGlobal());
    }

    public void AceptaroRechazarDesafioSinEscanner(Jugador desafiado, Desafio desafio, int opcion) {
        System.out.println(">>>>>Desea aceptar o rechazar el siguiente desafio? Escriba la opcion numerica<<<<<");
        System.out.println("Desafiante: " + desafio.getJugadorDesafiante().getNick() + " Oro apostado: "
                + desafio.getOroApostado());
        System.out.println("1. Aceptar desafio // 2. Rechazar desafio");
        // Scanner lectura = new Scanner(System.in);

        if (opcion == 1) { // 1 es aceptar el desafio
            ArrayList<Fortaleza> fortalezasElegidaDesafiante = desafiado.getDesafioPendiente().getFElegDesafiante();
            ArrayList<Debilidad> debilidadesElegidaDesafiante = desafiado.getDesafioPendiente().getDElegDesafiante();
            ArrayList<Fortaleza> fortalezasElegidaDesafiado = desafiado.getDesafioPendiente().getFElegDesafiado();
            ArrayList<Debilidad> debilidadesElegidaDesafiado = desafiado.getDesafioPendiente().getDElegDesafiado();

            desafiado.setDesafioPendiente(null);
            // En algun momento hay que suscribir al usuario desafiado y desafiante
            Combate combate = new Combate(desafio.getJugadorDesafiante(), desafiado, desafio.getOroApostado());
            ArrayList<Ronda> rondas = new ArrayList();
            while ((combate.getVida2() > 0) && (combate.getVida1() > 0)) {
                Ronda rondaX = combate.EmpezarRonda(combate.getPersonaje1(), combate.getPersonaje2(),
                        combate.getVida1(), combate.getVida2(), fortalezasElegidaDesafiante,
                        debilidadesElegidaDesafiante,
                        fortalezasElegidaDesafiado,
                        debilidadesElegidaDesafiado);
                rondas.add(rondaX);
            }
            // EMPATE
            if (combate.getVida1() == 0 && combate.getVida2() == 0) {
                combate.setVencedor("EMPATE - NO HUBO NINGÚN GANADOR");
            }
            // Setear el jugador vencedor
            if (combate.getVida1() == 0 && combate.getVida2() > 0) {
                combate.setVencedor(combate.getDesafiado().getNick());
            } else if (combate.getVida2() == 0 && combate.getVida1() > 0) {
                combate.setVencedor(combate.getDesafiante().getNick());
            }

            // Sumar y restar el dinero apostado
            // combate.getVencedor().setOro(combate.getVencedor().getOro() +
            // combate.getOroGanado() + 10);
            // TODO - Restar y sumar el oro a perdedor y ganador
            if (combate.getVencedor().equals(combate.getDesafiante().getNick())) {
                combate.getDesafiado().setOro(combate.getDesafiado().getOro() - combate.getOroGanado());
                combate.getDesafiante().setOro(combate.getDesafiante().getOro() + combate.getOroGanado() + 10);
                if (combate.getDesafiado().getOro() < 0) {
                    combate.getDesafiado().setOro(0);
                }
            } else {
                combate.getDesafiante().setOro(combate.getDesafiante().getOro() - combate.getOroGanado());
                combate.getDesafiado().setOro(combate.getDesafiado().getOro() + combate.getOroGanado() + 10);
                if (combate.getDesafiante().getOro() < 0) {
                    combate.getDesafiante().setOro(0);
                }
            }

            Ronda[] misRondas = new Ronda[rondas.size()];
            misRondas = rondas.toArray(misRondas);
            combate.setRondas(misRondas);
            desafiado.getNotificador().suscribirUsuario(combate.getDesafiado());
            desafiado.getNotificador().suscribirUsuario(combate.getDesafiante());
            desafiado.getNotificador().notificarUsuario(combate);

            desafiado.getNotificador().desSuscribirUsuario(combate.getDesafiado());
            desafiado.getNotificador().desSuscribirUsuario(combate.getDesafiante());

        } else if (opcion == 2) { // Rechaza el desafio
            desafiado.setOro((int) (desafiado.getOro() - (desafiado.getOro() * 0.1)));
            desafiado.setDesafioPendiente(null);
        }
    }

    /**
     * Test of AceptaroRechazarDesafio method, of class Jugador.
     */
    @Test
    public void testAceptarDesafio() {
        System.out.println("AceptaroRechazarDesafio");
        ManagerUsuarios manager = new ManagerUsuarios();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        Personaje personajeDesafiante = CrearCazadorBase();
        personajeDesafiante.setPoder(1);
        Jugador desafiante = crearJugador(notificador, personajeDesafiante, manager, null);
        Desafio desafio = CrearDesafio(desafiante, instance);
        instance.setDesafioPendiente(desafio);
        AceptaroRechazarDesafioSinEscanner(instance, desafio, 1);
    }

    @Test
    public void testRechazarDesafio() {
        System.out.println("AceptaroRechazarDesafio");
        ManagerUsuarios manager = new ManagerUsuarios();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        Personaje personajeDesafiante = CrearCazadorBase();
        personajeDesafiante.setPoder(1);
        Jugador desafiante = crearJugador(notificador, personajeDesafiante, manager, null);
        Desafio desafio = CrearDesafio(desafiante, instance);
        instance.setDesafioPendiente(desafio);
        int oroAntiguo = instance.getOro();
        AceptaroRechazarDesafioSinEscanner(instance, desafio, 2);
        assertNotEquals(oroAntiguo, instance.getOro());
    }

    /**
     * Test of realizarFuncionMenuJugador method, of class Jugador.
     * 3 4 6 7 8
     */
    @Test
    public void testRealizarFuncionMenuJugadorOpcion2() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 2;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        Personaje personajeAntiguo = instance.getPersonajeActivo();
        realizarFuncionMenuJugador(instance, opcion,0);
        assertNotEquals(personajeAntiguo, instance.getPersonajeActivo());

    }

    @Test
    public void testRealizarFuncionMenuJugadorOpcion3Armas() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 3;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        int opcionElegidaArmas = 1;
        realizarFuncionMenuJugador(instance, opcion,opcionElegidaArmas);

    }



    @Test
    public void testRealizarFuncionMenuJugadorOpcion3Armaduras() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 3;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        int opcionElegidaArmaduras = 2;
        realizarFuncionMenuJugador(instance, opcion,opcionElegidaArmaduras);

    }


    @Test
    public void testRealizarFuncionMenuJugadorOpcion4() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 4;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        int opcionElegidaArmaduras = 0;
        realizarFuncionMenuJugador(instance, opcion,opcionElegidaArmaduras);
        assertNull(instance.getPersonajeActivo());
    }


    @Test
    public void testRealizarFuncionMenuJugadorOpcion6() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 6;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        int opcionElegidaArmaduras = 0;
        realizarFuncionMenuJugador(instance, opcion,opcionElegidaArmaduras);
        
    }


    @Test
    public void testRealizarFuncionMenuJugadorOpcion7() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 7;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        Ranking ranking = new Ranking();
        manager.CrearJugador(instance.getNombre(), instance.getNick(), instance.getPassword(), instance.getRol(), instance.getEstadoObservador(), instance.getOro());
        ranking.setManager(manager);
        instance.setRankingGlobal(ranking);
        int opcionElegidaArmaduras = 0;
        realizarFuncionMenuJugador(instance, opcion,opcionElegidaArmaduras);
        
    }


    
    
    @Test
    public void testRealizarFuncionMenuJugadorOpcion8() throws Exception {
        System.out.println("realizarFuncionMenuJugador");
        int opcion = 8;
        ManagerUsuarios manager = new ManagerUsuarios();
        EntidadesActivas entidadesActivas = crearEntidades();
        Personaje result = CrearCazadorBase();
        result.setPoder(5);
        Publisher notificador = new Publisher();
        Jugador instance = crearJugador(notificador, result, manager, null);
        instance.setEntidades(entidadesActivas);
        int opcionElegidaArmaduras = 0;
        realizarFuncionMenuJugador(instance, opcion,opcionElegidaArmaduras);
        
    }




}
