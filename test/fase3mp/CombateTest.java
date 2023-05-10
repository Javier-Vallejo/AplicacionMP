/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class CombateTest {
    
    public CombateTest() {
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

    /**
     * Test of setRondas method, of class Combate.
     */

     public Cazador CrearCazadorBase () {

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
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 3, 3, debilidades, fortalezas); 
        instance.setVoluntad(10);

        return instance;

    }


    public Combate crearCombate() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador jugadorA = new Jugador("a", "A", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        Jugador jugadorB = new Jugador("B", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        Cazador cazador = CrearCazadorBase();
        cazador.setPoder(5);
        Cazador cazador2 = CrearCazadorBase();
        jugadorA.setPersonajeActivo(cazador);
        jugadorB.setPersonajeActivo(cazador2);
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(cazador);
        personajes.add(cazador2);
        Combate instance = new Combate(jugadorA, jugadorB, 100);
        instance.setFecha("10/05/2023");
        
        /*
         *  se asimila que en este test de combate al crear 2 cazadores iguales y leugo darle mas poder al desfiante
         * el ganador es el jugador desafiante
         */

        instance.setJugadoresConEsbirros(personajes);
        instance.setVencedor("A");
        instance.setVida1(3);
        instance.setVida2(1);
        return instance;
    }

    @Test
    public void testSetRondas() {
        System.out.println("setRondas");
        Ronda[] rondas = new Ronda[1];
        Ronda[] rondasVacias = new Ronda[1];
        Ronda ronda = new Ronda();
        ronda.setPotencialPer1(10);
        ronda.setPotencialPer2(10);
        rondas[0] = ronda;
        Combate instance = crearCombate();
        instance.setRondas(rondas);
        assertNotEquals(instance.getRondas(),rondasVacias);
        
    }

    /**
     * Test of getRondas method, of class Combate.
     */
    @Test
    public void testGetRondas() {
        System.out.println("getRondas");
        Combate instance = crearCombate();
        Ronda[] rondas = new Ronda[1];
        Ronda ronda = new Ronda();
        ronda.setPotencialPer1(10);
        ronda.setPotencialPer2(10);
        rondas[0] = ronda;
        instance.setRondas(rondas);
        Ronda[] result = instance.getRondas();
        Ronda[] expResult = rondas;
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of getDesafiante method, of class Combate.
     */
    @Test
    public void testGetDesafiante() {
        System.out.println("getDesafiante");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Combate instance = crearCombate();
        Jugador expResult = new Jugador("a", "A", "123",TipoUsuario.Jugador , 0, managerUsuarios);;
        Jugador result = instance.getDesafiante();
        assertEquals(expResult.getNick(), result.getNick());
       
    }

    /**
     * Test of getDesafiado method, of class Combate.
     */
    @Test
    public void testGetDesafiado() {
        System.out.println("getDesafiado");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Combate instance = crearCombate();
        Jugador expResult = new Jugador("B", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);;
        Jugador result = instance.getDesafiado();
        assertEquals(expResult.getNick(), result.getNick());
    }

    /**
     * Test of getFecha method, of class Combate.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Combate instance = crearCombate();
        String expResult = "10/05/2023";
        String result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVencedor method, of class Combate.
     */
    @Test
    public void testGetVencedor() {
        System.out.println("getVencedor");
        Combate instance = crearCombate();
        String expResult = "A";
        String result = instance.getVencedor();
        assertEquals(expResult, result);
    }
        

    /**
     * Test of getJugadoresConEsbirros method, of class Combate.
     */
    @Test
    public void testGetJugadoresConEsbirros() {
        System.out.println("getJugadoresConEsbirros");
        Combate instance = crearCombate();
        ArrayList<Personaje> expResult = null;
        ArrayList<Personaje> result = instance.getJugadoresConEsbirros();
        assertNotEquals(expResult, result);
        /*
         * Se comprueba que se crea un combate simepre que haya personajes dentro
         */
    }

    /**
     * Test of getOroGanado method, of class Combate.
     */
    @Test
    public void testGetOroGanado() {
        System.out.println("getOroGanado");
        Combate instance = crearCombate();
        int expResult = 200;
        /*
         * se esperan 200 porque la propiedad del combate "OroGanado"
         *   es  apostado + 100 de beneficio extra
         */
        int result = instance.getOroGanado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPersonaje1 method, of class Combate.
     */
    @Test
    public void testGetPersonaje1() {
        System.out.println("getPersonaje1");
        Combate instance = crearCombate();
        int expResult = 5;
        int result = instance.getPersonaje1().getPoder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersonaje2 method, of class Combate.
     */
    @Test
    public void testGetPersonaje2() {
        System.out.println("getPersonaje2");
        Combate instance = crearCombate();
        int expResult = 3;
        int result = instance.getPersonaje2().getPoder();
        assertEquals(expResult, result);
    }

    /*
     *  Para comporbar que los gets funcionan bien
     * LO  compruebo  en los valores en los que se diferencian al crear el combate de base
     * Es decir el cazador 1 tiene 5 y por eso su get deberia dar 5
     * Y el cazador 2 tiene 3
     * Asi que get Personaje1 deberia comprobar que ese get me devuelve el ataque del personaje 1 (5)
     * Y el 2 el del otro cazador (3)
     */

    /**
     * Test of getVida1 method, of class Combate.
     */
    @Test
    public void testGetVida1() {
        System.out.println("getVida1");
        Combate instance = crearCombate();
        int expResult = 3;
        int result = instance.getVida1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVida2 method, of class Combate.
     */
    @Test
    public void testGetVida2() {
        System.out.println("getVida2");
        Combate instance = crearCombate();
        int expResult = 1;
        int result = instance.getVida2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDesafiante method, of class Combate.
     */
    @Test
    public void testSetDesafiante() {
        System.out.println("setDesafiante");
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Combate instance = crearCombate();
        Jugador desafianteAntiguo = instance.getDesafiante();
        Jugador desafiante = new Jugador("B", "b", "123",TipoUsuario.Jugador , 0, managerUsuarios);;
        
        instance.setDesafiante(desafiante);
        assertNotEquals(desafianteAntiguo,desafiante);
        
    }

    /**
     * Test of setDesafiado method, of class Combate.
     */
    @Test
    public void testSetDesafiado() {
        System.out.println("setDesafiado");
        Combate instance = crearCombate();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador desafiadoAntiguo = instance.getDesafiado();
        Jugador desafiado = new Jugador("a", "A", "123",TipoUsuario.Jugador , 0, managerUsuarios);
        
        
        instance.setDesafiado(desafiado);
        assertNotEquals(desafiadoAntiguo,desafiado);
    }

    /**
     * Test of setFecha method, of class Combate.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Combate instance = crearCombate();
        String fechaAntigua = instance.getFecha();
        String fecha = "11/05/1999";
       
        instance.setFecha(fecha);
        
        assertNotEquals(instance.getFecha(),fechaAntigua);
        
    }

    /**
     * Test of setVencedor method, of class Combate.
     */
    @Test
    public void testSetVencedor() {
        System.out.println("setVencedor");
        Combate instance = crearCombate();
        String antiguoVencedor = instance.getVencedor();
        String Vencedor = "B";
        
        instance.setVencedor(Vencedor);
        assertNotEquals(instance.getVencedor(),antiguoVencedor);
    }

    /**
     * Test of setJugadoresConEsbirros method, of class Combate.
     */
    @Test
    public void testSetJugadoresConEsbirros() {
        System.out.println("setJugadoresConEsbirros");
        Combate instance = crearCombate();
        ArrayList<Personaje> personajesAntiguos = instance.getJugadoresConEsbirros();
        ArrayList<Personaje> jugadoresConEsbirros = new ArrayList<>();
        
        instance.setJugadoresConEsbirros(jugadoresConEsbirros);
       assertNotEquals(personajesAntiguos,jugadoresConEsbirros);
    }

    /**
     * Test of setOroGanado method, of class Combate.
     */
    @Test
    public void testSetOroGanado() {
        Combate instance = crearCombate();
        int antiguoOroGando = instance.getOroGanado();
        System.out.println("setOroGanado");
        int oroGanado = 990;
        
        instance.setOroGanado(oroGanado);
        assertNotEquals(instance.getOroGanado(),antiguoOroGando);
    }

    /**
     * Test of setPersonaje1 method, of class Combate.
     */
    @Test
    public void testSetPersonaje1() {
        System.out.println("setPersonaje1");
        Personaje personaje1 = CrearCazadorBase();
        personaje1.setPoder(4);
        Combate instance = crearCombate();
        Personaje personaje1Antiguo = instance.getPersonaje1();
        instance.setPersonaje1(personaje1);
        assertNotEquals(personaje1Antiguo,personaje1);
    }

    /**
     * Test of setPersonaje2 method, of class Combate.
     */
    @Test
    public void testSetPersonaje2() {
        System.out.println("setPersonaje2");
        Personaje personaje1 = CrearCazadorBase();
        personaje1.setPoder(4);
        Combate instance = crearCombate();
        Personaje personaje2Antiguo = instance.getPersonaje2();
        instance.setPersonaje2(personaje1);
        assertNotEquals(personaje2Antiguo,personaje1);
    }

    /**
     * Test of setVida1 method, of class Combate.
     */
    @Test
    public void testSetVida1() {
        System.out.println("setVida1");
        int vida1 = 4;
        Combate instance = crearCombate();
        int vidaAntigua = instance.getVida1();
        instance.setVida1(vida1);
        assertNotEquals(instance.getVida1(),vidaAntigua);
    }

    /**
     * Test of setVida2 method, of class Combate.
     */
    @Test
    public void testSetVida2() {
        System.out.println("setVida2");
        int vida2 = 4;
        Combate instance = crearCombate();
        int vida2Antigua = instance.getVida2();
        instance.setVida2(vida2);
        assertNotEquals(instance.getVida2(),vida2Antigua);
    }

    /**
     * Test of EmpezarRonda method, of class Combate.
     */
    @Test
    public void testEmpezarRonda() {
        System.out.println("EmpezarRonda");
        Combate instance = crearCombate();
        Personaje per1 = instance.getPersonaje1();
        Personaje per2 = instance.getPersonaje2();;
        int vida1 = instance.getVida1();
        int vida2 = instance.getVida2();
        ArrayList<Fortaleza> fortalezasElegidaDesafiante = new ArrayList<>();
        ArrayList<Debilidad> debilidadesElegidaDesafiante = new ArrayList<>();
        ArrayList<Fortaleza> fortalezasElegidaDesafiado = new ArrayList<>();
        ArrayList<Debilidad> debilidadesElegidaDesafiado = new ArrayList<>();
        int expResult = 0;
        Ronda ronda = instance.EmpezarRonda(per1, per2, vida1, vida2, fortalezasElegidaDesafiante, debilidadesElegidaDesafiante, fortalezasElegidaDesafiado, debilidadesElegidaDesafiado);
        int result = ronda.getVidaDesafiado();
        /*
         *  El empezar ronda una de las cosas que colmprueba al final es que si una vida es negativa la setea 0
         * Para que luego no haya errores al terminar
         * Entonces una de las comprobaciones que se debem hacer es:
         * que si se da el caso de que una vida es negativa se ponga a 0
         */
        assertEquals(expResult, result);
    }
    

    @Test
    public void testEmpezarRondaPotencial() {
        System.out.println("EmpezarRonda");
        Combate instance = crearCombate();
        Personaje per1 = instance.getPersonaje1();
        Personaje per2 = instance.getPersonaje2();
        int vida1 = instance.getVida1();
        int vida2 = instance.getVida2();
        ArrayList<Fortaleza> fortalezasElegidaDesafiante = new ArrayList<>();
        ArrayList<Debilidad> debilidadesElegidaDesafiante = new ArrayList<>();
        ArrayList<Fortaleza> fortalezasElegidaDesafiado = new ArrayList<>();
        ArrayList<Debilidad> debilidadesElegidaDesafiado = new ArrayList<>();
        int expResult = per1.calculoDanio() - per2.calculoDefensa();
        Ronda ronda = instance.EmpezarRonda(per1, per2, vida1, vida2, fortalezasElegidaDesafiante, debilidadesElegidaDesafiante, fortalezasElegidaDesafiado, debilidadesElegidaDesafiado);
        int result = ronda.getPotencialPer1();
        /*
         *  Otra cosa que se puede comprobar es que se calcule bien el potencial de los personajes 
         *  Para esto en un lado lo calculas manuealmente como ataque de personaje 1 menos defensa de personaje 2
         *  Esto de aquí es: int expResult = per1.calculoDanio() - per2.calculoDefensa();
         * Y compruebas que este valor es el mismo que luego se establece en la ronda como el potencial del priemro
         * Y esto es: int result = ronda.getPotencialPer1();
         */
        assertEquals(expResult, result);
    }
}
