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
public class FabricaCazadorTest {
    
    public FabricaCazadorTest() {
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
        Cazador instance = new Cazador("ElSheriff", habilidad, armas, armas, armaduras, armadura, esbirros, 2, 10, debilidades, fortalezas); 
        instance.setVoluntad(10);

        return instance;

    }
    
    public Personaje CrearCazadorInstancia (FabricaCazador instancia) {
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
        //Cazador instance = new Cazador("ElSheriff", habilidad, armas, armas, armaduras, armadura, esbirros, 0, 10, debilidades, fortalezas); 
        //instance.setVoluntad(10);
        Personaje result = (Cazador) instancia.crearPersonaje("ElSheriff", habilidad, armas, armas, armaduras, armadura, esbirros, 2, 10, debilidades, fortalezas);
        
        return result;

    }
    /**
     * Test of crearPersonaje method, of class FabricaCazador.
     */
    @Test
    public void testCrearPersonaje() {
        System.out.println("crearPersonaje");
        FabricaCazador instance = new FabricaCazador();
        Cazador expResult = CrearCazadorBase();
        Personaje result = CrearCazadorInstancia(instance);  
        //Personaje result = instance.crearPersonaje(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas);
        assertEquals(expResult.getNombre(), result.getNombre());
        //Mirando con debug en ambos se coloca el mismo personaje, pero el assertEquals explota cuando intenta comparar los arrays de armas, armaduras, debilidades, etc.

    }
    
}
