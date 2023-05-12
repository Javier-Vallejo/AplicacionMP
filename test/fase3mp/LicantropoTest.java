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

/**
 *
 * @author juana
 */
public class LicantropoTest {
    
    public LicantropoTest() {
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
    
    public Licantropo CrearLicantropoBase () {

        Habilidad habilidad = new Habilidad("garrasToFUertes", 10, 10, 0);
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
        Licantropo instance = new Licantropo("ElQueNoEsEdward", habilidad, armas, armas, armaduras, armadura, esbirros, 5, 5, debilidades, fortalezas); 
        instance.setRabia(3);

        return instance;
    }

    /**
     * Test of getRabia method, of class Licantropo.
     */
    @Test
    public void testGetRabia() {
        System.out.println("getRabia");
        Licantropo instance = CrearLicantropoBase();
        int expResult = 2;
        int result = instance.getRabia();
        //Nuestra rabia base es 3, así que este test falla aposta
        assertNotEquals(expResult, result);
        assertEquals(3, result);
    }

    /**
     * Test of setRabia method, of class Licantropo.
     */
    @Test
    public void testSetRabia() {
        System.out.println("setRabia");
        int rabia = 0;
        Licantropo instance = CrearLicantropoBase();
        System.out.println("Rabia previa al cambio: " + instance.getRabia());
        instance.setRabia(rabia);
        System.out.println("Rabia tras el set: " + instance.getRabia());
    }

    /**
     * Test of rellenarPropiedadesEspecificas method, of class Licantropo.
    *Se trata de una funcion en la que se setean los valores introducidos en teclado,
    * por lo que no vemos necesidad de testearla teniendo las funciones previas
    @Test
    public void testRellenarPropiedadesEspecificas() {
        System.out.println("rellenarPropiedadesEspecificas");
        Licantropo instance = null;
        instance.rellenarPropiedadesEspecificas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of clonar method, of class Licantropo.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Licantropo instance = CrearLicantropoBase();
        Personaje expResult = CrearLicantropoBase();
        Personaje result = instance.clonar();
        assertEquals(expResult.getNombre(), result.getNombre());
        System.out.println("Nombre de la habilidad del Licantropo: " + instance.getNombre() + " = " + instance.getHabilidadPersonaje().getNombre());
        assertNotEquals("GarrasTOFUERTOTAS", result.getHabilidadPersonaje().getNombre());
    }

    /**
     * Test of calculoDanio method, of class Licantropo.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Licantropo instance = CrearLicantropoBase();
        int expResult = 48;
        int result = instance.calculoDanio();
        System.out.println("Danio activando el Don: " + result);
        assertEquals(expResult, result);
        instance.getHabilidadPersonaje().setLimitante(4);
        result = instance.calculoDanio();
        //El daño se reduce en 20 por no activar el don, pasa de 48 a 28
        int exp2 = 28;
        System.out.println("Danio NO activando el don: " + result);
        assertNotEquals(expResult, result);
        assertEquals(exp2, result);
    }

    /**
     * Test of calculoDefensa method, of class Licantropo.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Licantropo instance = CrearLicantropoBase();
        int expResult = 30;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
    }
    
}
