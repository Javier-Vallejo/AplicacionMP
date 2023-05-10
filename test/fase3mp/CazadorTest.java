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

import fase3mp.Humano.nivelLealtad;

import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class CazadorTest {
    
    public CazadorTest() {
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
     * Test of clonar method, of class Cazador.
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
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 0, 10, debilidades, fortalezas); 
        instance.setVoluntad(10);

        return instance;

    }


    @Test
    public void testClonar() {
        System.out.println("clonar");
        Cazador instance = CrearCazadorBase();
        Personaje expResult = instance.clonar();
        assertEquals(expResult.getNombre(), instance.getNombre());
    }

    /**
     * Test of calculoDanio method, of class Cazador.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Cazador instance = CrearCazadorBase();
        int result = 10;
        /*
         *  No debe dar solo 10 porque tiene 10 de base + 10 de arma + 10 de habiliad
         * Asi que la comprobacion es de que de todo el ataque total en lugar de solo 10
         */
        int expResult = instance.calculoDanio();
        assertNotEquals(expResult, result);

    }

    /**
     * Test of calculoDefensa method, of class Cazador.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Cazador instance = CrearCazadorBase();
        int result = 5;
        /*
         *  No debe dar solo 5 porque tiene 5 de arma + 10 de habiliad
         * Ocurre lo mismo que con ataque pero con su defensa
         */
        int expResult = instance.calculoDefensa();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setVoluntad method, of class Cazador.
     */
    @Test
    public void testSetVoluntad() {
        System.out.println("setVoluntad");
        int voluntad = 0;
        Cazador instance = CrearCazadorBase();
        instance.setVoluntad(voluntad);
        int resultadoEsperado = 0;
        assertEquals(instance.getVoluntad(),resultadoEsperado);
    }

    /**
     * Test of getVoluntad method, of class Cazador.
     */
    @Test
    public void testGetVoluntad() {
        System.out.println("getVoluntad");
        Cazador instance = CrearCazadorBase();
        int expResult = 10;
        int result = instance.getVoluntad();
        assertEquals(expResult, result);
       
    }
    
}
