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
public class RondaTest {
    
    public RondaTest() {
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



    public Personaje CrearPersonajeBase() {

        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma arma2 = new Arma("arma2", "40", "0", "de2manos");
        Arma[] armasActivas = new Arma[2];

        Arma[] armas = new Arma[1];
        armas[0] = arma;

        armasActivas[0] = arma;
        armasActivas[1] = arma2;

        Armadura armadura = new Armadura("armadura", "10", "5");
        Armadura armadura2 = new Armadura("armadura2", "10", "300");
        Armadura[] armaduras = new Armadura[2];

        armaduras[0] = armadura;
        armaduras[1] = armadura2;

        Esbirro esbirro = new Esbirro("esbirro", 10);
        Esbirro[] esbirros = new Esbirro[1];
        esbirros[0] = esbirro;
        Debilidad debilidad = new Debilidad("debilidad", 0);
        Debilidad[] debilidades = new Debilidad[1];
        debilidades[0] = debilidad;
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        Fortaleza[] fortalezas = new Fortaleza[1];
        fortalezas[0] = fortaleza;
        Licantropo instance = new Licantropo("nombre", habilidad, armas, armasActivas, armaduras, armadura, esbirros,
                3, 10, debilidades, fortalezas);
        instance.setRabia(10);

        return instance;

    }


    public Ronda CrearRonda () {

        Ronda instance = new Ronda();
        Personaje per1 = CrearPersonajeBase();
        per1.setPoder(3);
        Personaje per2 = CrearPersonajeBase();
        per2.setPoder(4);
        int potencial1 = per1.calculoDanio() - per2.calculoDefensa();
        int potencial2 = per2.calculoDanio() - per1.calculoDefensa();
        instance.setPotencialPer1(potencial1);
        instance.setPotencialPer2(potencial2);

        /* Dado que el combate va en factor de un valor aletario suponemos unos valores ficticios en el test de ronda
         *  Suponemos
         */

        instance.setVidaDesafiado(3);
        instance.setVidaDesafiante(1);
        return instance;
        
    }
    /**
     * Test of Calculo_Potencial method, of class Ronda.
     */
    @Test
    public void testCalculo_Potencial() {
        System.out.println("Calculo_Potencial");
        ArrayList<Fortaleza> fortalezasElegidasDesafiante = new ArrayList<>();
        ArrayList<Debilidad> debilidadesElegidasDesafiante = new ArrayList<>();
        ArrayList<Fortaleza> fortalezasElegidasDesafiado = new ArrayList<>();
        ArrayList<Debilidad> debilidadesElegidasDesafiado = new ArrayList<>();
        Ronda instance = CrearRonda();
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(instance.getPotencialPer1());
        expResult.add(instance.getPotencialPer2());
        Personaje per1 = CrearPersonajeBase();
        per1.setPoder(3);
        Personaje per2 = CrearPersonajeBase();
        per2.setPoder(4);
        ArrayList<Integer> result = instance.Calculo_Potencial(per1, per2, fortalezasElegidasDesafiante, debilidadesElegidasDesafiante, fortalezasElegidasDesafiado, debilidadesElegidasDesafiado);
        assertEquals(expResult, result);
        
    }

   

    /**
     * Test of getPotencialPer1 method, of class Ronda.
     */
    @Test
    public void testGetPotencialPer1() {
        System.out.println("getPotencialPer1");
        Ronda instance = CrearRonda();
        int expResult = 63;
        int result = instance.getPotencialPer1();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPotencialPer1 method, of class Ronda.
     */
    @Test
    public void testSetPotencialPer1() {
        System.out.println("setPotencialPer1");
        int potencialPer1 = 64;
        Ronda instance = CrearRonda();
        int potencialAntiguoPer1 = instance.getPotencialPer1();
        instance.setPotencialPer1(potencialPer1);

        assertNotEquals(potencialAntiguoPer1,potencialPer1);
        
    }

    /**
     * Test of getPotencialPer2 method, of class Ronda.
     */
    @Test
    public void testGetPotencialPer2() {
        System.out.println("getPotencialPer2");
        Ronda instance = CrearRonda();
        int expResult = 64;
        int result = instance.getPotencialPer2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPotencialPer2 method, of class Ronda.
     */
    @Test
    public void testSetPotencialPer2() {
        System.out.println("setPotencialPer2");
        int potencialPer2 = 63;
        Ronda instance = CrearRonda();
        int potencialAntiguo = instance.getPotencialPer2();
        instance.setPotencialPer2(potencialPer2);
        assertNotEquals(potencialAntiguo,potencialPer2);
    }

    /**
     * Test of getVidaDesafiante method, of class Ronda.
     */
    @Test
    public void testGetVidaDesafiante() {
        System.out.println("getVidaDesafiante");
        Ronda instance = CrearRonda();
        int expResult = 1;
        int result = instance.getVidaDesafiante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setVidaDesafiante method, of class Ronda.
     */
    @Test
    public void testSetVidaDesafiante() {
        System.out.println("setVidaDesafiante");
        int vidaDesafiante = 3;
        Ronda instance = CrearRonda();
        int vidaAntigua = instance.getVidaDesafiante();
        instance.setVidaDesafiante(vidaDesafiante);
        
        assertNotEquals(vidaDesafiante,vidaAntigua);
    }

    /**
     * Test of getVidaDesafiado method, of class Ronda.
     */
    @Test
    public void testGetVidaDesafiado() {
        System.out.println("getVidaDesafiado");
        Ronda instance = CrearRonda();
        int expResult = 3;
        int result = instance.getVidaDesafiado();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setVidaDesafiado method, of class Ronda.
     */
    @Test
    public void testSetVidaDesafiado() {
        System.out.println("setVidaDesafiado");
        int vidaDesafiado = 4;
        Ronda instance = CrearRonda();
        int vidaAntigua = instance.getVidaDesafiado();
        instance.setVidaDesafiado(vidaDesafiado);

        assertNotEquals(vidaAntigua,vidaDesafiado);
       
    }
    
}
