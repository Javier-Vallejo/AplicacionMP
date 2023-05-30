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
public class PactoTest {
    
    public PactoTest() {
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
    public Pacto crearPacto(Personaje personaje){
        Pacto instance = new Pacto();
        instance.setDescripcion("pacto");
        instance.setAmo(personaje.getNombre());
        return instance;
    }
    /**
     * Test of getDescripcion method, of class Pacto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Personaje personaje = CrearCazadorBase();
        Pacto instance = crearPacto(personaje);
        String expResult = "pacto";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Pacto.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "pacto_2";
        Pacto instance = crearPacto(CrearCazadorBase());
        String descripcionAntigua = instance.getDescripcion();
        instance.setDescripcion(descripcion);
        assertNotEquals(descripcionAntigua, instance.getAmo());
    }

    /**
     * Test of getAmo method, of class Pacto.
     */
    @Test
    public void testGetAmo() {
        System.out.println("getAmo");
        Personaje personaje = CrearCazadorBase();
        Pacto instance = crearPacto(personaje);
        Personaje expResult = personaje;
        String result = instance.getAmo();
        assertEquals(expResult.getNombre(), result);
    }

    /**
     * Test of setAmo method, of class Pacto.
     */
    @Test
    public void testSetAmo() {
        System.out.println("setAmo");
        Personaje personajeAntiguo = CrearCazadorBase();
        Personaje amo = CrearCazadorBase();
        Pacto instance = crearPacto(personajeAntiguo);
        instance.setAmo(amo.getNombre());
        assertNotEquals(personajeAntiguo, instance.getAmo());
    }
}
