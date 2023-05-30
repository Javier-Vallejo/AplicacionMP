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
public class VampiroTest {
    
    public VampiroTest() {
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
    
    
    public void rellenarPropiedadesEspecSinEscanner (Vampiro vampiro) {
        int antiguaSangre = vampiro.getSangre();
        System.out.println("Valor antiguo de sangre: "+ antiguaSangre);
        
        int valorSangre = 4;
        vampiro.setSangre(valorSangre); 
        System.out.println("Valor nuevo de sangre: "+ vampiro.getSangre());
        assertNotEquals(antiguaSangre,vampiro.getSangre());



        int antiguaEdad = vampiro.getEdad();
        System.out.println("Valor antiguo de edad: "+ antiguaEdad);
        
        int valorEdad = 400;
        vampiro.setEdad(valorEdad); 
        System.out.println("Valor nuevo de edad: "+ vampiro.getEdad());
        assertNotEquals(antiguaEdad,vampiro.getEdad());
    }



    public Vampiro CrearVampiroBase () {

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
        Vampiro instance = new Vampiro("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 5, 5, debilidades, fortalezas); 
        instance.setSangre(5);
        instance.setEdad(100);

        return instance;
    }


    @Test
    public void testRellenarPropiedadesEspec() {
        System.out.println("rellenarPropiedadesEspec");
        Vampiro instance = CrearVampiroBase();
        rellenarPropiedadesEspecSinEscanner(instance);
        
    }
    /**
     * Test of setEdad method, of class Vampiro.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 800;
        Vampiro instance = CrearVampiroBase();
        System.out.println("Edad previa al cambio: " + instance.getEdad());
        instance.setEdad(edad);
        System.out.println("Edad tras el cambio: " + instance.getEdad());
        assertEquals(edad, instance.getEdad());
    }

    /**
     * Test of getEdad method, of class Vampiro.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Vampiro instance = CrearVampiroBase();
        int expResult = 100;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSangre method, of class Vampiro.
     */
    @Test
    public void testGetSangre() {
        System.out.println("getSangre");
        Vampiro instance = CrearVampiroBase();
        int expResult = 5;
        int result = instance.getSangre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSangre method, of class Vampiro.
     */
    @Test
    public void testSetSangre() {
        System.out.println("setSangre");
        int sangre = 2;
        Vampiro instance = CrearVampiroBase();
        System.out.println("Sangre previa al cambio: " + instance.getSangre());
        instance.setSangre(sangre);
        System.out.println("Sangre tras el cambio: " + instance.getSangre());
        assertEquals(sangre, instance.getSangre());
    }

    /**
     * Test of rellenarPropiedadesEspecificas method, of class Vampiro.
     * Este metodo solo pide valores para setearlos, asi que no vemos necesario testearlo
     
    @Test
    public void testRellenarPropiedadesEspecificas() {
        System.out.println("rellenarPropiedadesEspecificas");
        Vampiro instance = null;
        instance.rellenarPropiedadesEspecificas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of clonar method, of class Vampiro.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Vampiro instance = CrearVampiroBase();
        Personaje expResult = instance.clonar();
        assertEquals(expResult.getNombre(), instance.getNombre());
    }
    /**
     * Test of dañoDeSangre method, of class Vampiro.
     */
    @Test
    public void testDañoDeSangre() {
        System.out.println("DanioDeSangre");
        Vampiro instance = CrearVampiroBase();
        //int sangre = instance.getSangre();
        int expResult = 2;
        int result = instance.dañoDeSangre(instance.getSangre());
        assertEquals(expResult, result);
    }

    /**
     * Test of calculoDanio method, of class Vampiro.
     * Recuerda: tienes vampiro con 10 de poder, 10 de daño de arma, 15 por la 
     * disciplina, 2 de sangre por tener sangre a valor 5, y 5 de poder base.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Vampiro instance = CrearVampiroBase();
        int expResult = 42;
        int result = instance.calculoDanio();
        System.out.println("Daño del Vampiro: "+ instance.getNombre() + " activando disciplina: " + instance.calculoDanio());
        assertEquals(expResult, result);
        instance.getHabilidadPersonaje().setLimitante(10);
        //Ahora el daño deberia ser de , 27 no de 48, pues no activamos la disciplina
        System.out.println("Daño del Vampiro: "+ instance.getNombre() + " activando disciplina: " + instance.calculoDanio());
        assertNotEquals(expResult, instance.calculoDanio());
    }

    /**
     * Test of calculoDefensa method, of class Vampiro.
     * El vampiro base tiene una habilidad de defensa de valor 10, una armadura de 
     * valor de defensa 10, y una disciplina que le otorga 10 de defensa
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Vampiro instance = CrearVampiroBase();
        int expResult = 25;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
    }
    
}
