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

import java.util.Random;

/**
 *
 * @author juana
 */
public class PersonajeTest {

    public PersonajeTest() {
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
     * Test of getNombre method, of class Personaje.
     */

    public Arma[] iniciarArmasNuevas() {
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma arma2 = new Arma("arma2", "400", "0", "de2manos");
        Arma[] expResult = new Arma[2];
        expResult[0] = arma;
        expResult[1] = arma2;
        return expResult;
    }

    public Armadura[] iniciarArmadurasNuevas() {
        Armadura armadura = new Armadura("armadura", "10", "5");
        Armadura armadura2 = new Armadura("armadura2Nueva", "0", "30000");
        Armadura[] armaduras = new Armadura[2];

        armaduras[0] = armadura;
        armaduras[1] = armadura2;
        return armaduras;
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
                0, 10, debilidades, fortalezas);
        instance.setRabia(10);

        return instance;

    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personaje instance = CrearPersonajeBase();
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Personaje.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nombre2";
        Personaje instance = CrearPersonajeBase();
        String nombreAntiguo = instance.getNombre();
        instance.setNombre(nombre);
        assertNotEquals(nombreAntiguo, nombre);
    }

    /**
     * Test of getHabilidadPersonaje method, of class Personaje.
     */
    @Test
    public void testGetHabilidadPersonaje() {
        System.out.println("getHabilidadPersonaje");
        Personaje instance = CrearPersonajeBase();
        Habilidad expResult = new Habilidad("habilidad", 10, 10, 0);
        instance.setHabilidadPersonaje(expResult);
        Habilidad result = instance.getHabilidadPersonaje();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHabilidadPersonaje method, of class Personaje.
     */
    @Test
    public void testSetHabilidadPersonaje() {
        System.out.println("setHabilidadPersonaje");
        Habilidad habilidadPersonaje = new Habilidad("habilidad", 40, 10, 0);
        ;
        Personaje instance = CrearPersonajeBase();
        Habilidad habilidadAntigua = instance.devolverHabilidad();
        instance.setHabilidadPersonaje(habilidadPersonaje);
        assertNotEquals(habilidadAntigua, habilidadPersonaje);

    }

    /**
     * Test of getArmas method, of class Personaje.
     */
    @Test
    public void testGetArmas() {
        System.out.println("getArmas");
        Personaje instance = CrearPersonajeBase();
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma[] expResult = new Arma[1];
        expResult[0] = arma;
        instance.setArmas(expResult);
        Arma[] result = instance.getArmas();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setArmas method, of class Personaje.
     */
    @Test
    public void testSetArmas() {
        System.out.println("setArmas");
        Personaje instance = CrearPersonajeBase();
        Arma[] armasAntiguas = instance.getArmas();
        Arma arma = new Arma("arma", "30", "10", "de2manos");
        Arma[] expResult = new Arma[1];
        expResult[0] = arma;
        instance.setArmas(expResult);
        assertNotSame(expResult, armasAntiguas);

    }

    /**
     * Test of getArmasActivas method, of class Personaje.
     */
    @Test
    public void testGetArmasActivas() {
        System.out.println("getArmasActivas");
        Personaje instance = CrearPersonajeBase();
        Arma[] expResult = iniciarArmasNuevas();
        instance.setArmasActivas(expResult);
        assertArrayEquals(expResult, instance.getArmasActivas());

    }

    /**
     * Test of setArmasActivas method, of class Personaje.
     */
    @Test
    public void testSetArmasActivas() {
        System.out.println("setArmasActivas");
        Personaje instance = CrearPersonajeBase();
        Arma[] armasActivasAntiguas = instance.getArmasActivas();
        Arma[] expResult = iniciarArmasNuevas();
        instance.setArmasActivas(expResult);
        assertNotEquals(armasActivasAntiguas, expResult);
    }

    /**
     * Test of getArmaduras method, of class Personaje.
     */
    @Test
    public void testGetArmaduras() {
        System.out.println("getArmaduras");
        Personaje instance = CrearPersonajeBase();
        Armadura[] expResult = iniciarArmadurasNuevas();
        instance.setArmaduras(expResult);
        assertArrayEquals(expResult, instance.getArmaduras());

    }

    /**
     * Test of setArmaduras method, of class Personaje.
     */
    @Test
    public void testSetArmaduras() {
        System.out.println("setArmaduras");
        Personaje instance = CrearPersonajeBase();
        Armadura[] armaduras = instance.getArmaduras();
        Armadura[] nuevasArmaduras = iniciarArmadurasNuevas();

        instance.setArmaduras(nuevasArmaduras);

        assertNotEquals(armaduras, nuevasArmaduras);

    }

    /**
     * Test of getArmaduraActiva method, of class Personaje.
     */
    @Test
    public void testGetArmaduraActiva() {
        System.out.println("getArmaduraActiva");
        Personaje instance = CrearPersonajeBase();
        Armadura expResult = new Armadura("armadura", "10", "5");
        ;
        Armadura result = instance.getArmaduraActiva();
        assertEquals(expResult.getNombre(), result.getNombre());

    }

    /**
     * Test of setArmaduraActiva method, of class Personaje.
     */
    @Test
    public void testSetArmaduraActiva() {
        System.out.println("setArmaduraActiva");
        Personaje instance = CrearPersonajeBase();
        Armadura armaduraActivaAntigua = instance.getArmaduraActiva();
        Armadura nuevaArmadura = new Armadura("armaduraNueva", "10", "5");
        ;

        instance.setArmaduraActiva(nuevaArmadura);
        assertNotEquals(armaduraActivaAntigua, nuevaArmadura);
    }

    /**
     * Test of getEsbirros method, of class Personaje.
     */
    @Test
    public void testGetEsbirros() {
        System.out.println("getEsbirros");
        Personaje instance = CrearPersonajeBase();
        Esbirro esbirro = new Esbirro("esbirro", 10);
        Esbirro[] expResult = new Esbirro[1];
        expResult[0] = esbirro;
        instance.setEsbirros(expResult);
        assertArrayEquals(expResult, instance.getEsbirros());

    }

    /**
     * Test of setEsbirros method, of class Personaje.
     */
    @Test
    public void testSetEsbirros() {
        System.out.println("setEsbirros");
        Personaje instance = CrearPersonajeBase();
        Esbirro[] esbirrosAntiguos = instance.getEsbirros();
        Esbirro esbirro = new Esbirro("esbirro", 10);
        Esbirro[] esbirros = new Esbirro[1];
        esbirros[0] = esbirro;
        instance.setEsbirros(esbirros);
        assertNotEquals(esbirrosAntiguos, esbirros);
    }

    /**
     * Test of getSalud method, of class Personaje.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Personaje instance = CrearPersonajeBase();
        int expResult = 0;
        int result = instance.getSalud();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSalud method, of class Personaje.
     */
    @Test
    public void testSetSalud() {
        System.out.println("setSalud");

        int nuevaSalud = 10;
        Personaje instance = CrearPersonajeBase();
        int saludAntigua = instance.getSalud();
        instance.setSalud(nuevaSalud);
        assertNotEquals(nuevaSalud,saludAntigua);

    }

    /**
     * Test of getPoder method, of class Personaje.
     */
    @Test
    public void testGetPoder() {
        System.out.println("getPoder");
        Personaje instance = CrearPersonajeBase();
        int expResult = 10;
        int result = instance.getPoder();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPoder method, of class Personaje.
     */
    @Test
    public void testSetPoder() {
        System.out.println("setPoder");
        int nuevoPoder = 5;
        Personaje instance = CrearPersonajeBase();
        int poderAntiguo = instance.getPoder();
        instance.setPoder(nuevoPoder);
        assertNotEquals(nuevoPoder,poderAntiguo);
    }

    /**
     * Test of getDebilidades method, of class Personaje.
     */
    @Test
    public void testGetDebilidades() {
        System.out.println("getDebilidades");
        Personaje instance = CrearPersonajeBase();
        Debilidad debilidad = new Debilidad("debilidadNueva", 0);
        Debilidad[] expResult = new Debilidad[1];
        expResult[0] = debilidad;
        instance.setDebilidades(expResult);
        Debilidad[] result = instance.getDebilidades();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setDebilidades method, of class Personaje.
     */
    @Test
    public void testSetDebilidades() {
        System.out.println("setDebilidades");
        Personaje instance = CrearPersonajeBase();
        Debilidad[] debilidadesAntiguas = instance.getDebilidades();
        Debilidad debilidad = new Debilidad("debilidadNueva", 0);
        Debilidad[] debilidadesNuevas = new Debilidad[1];
        debilidadesNuevas[0] = debilidad;
        
        instance.setDebilidades(debilidadesNuevas);
        assertNotEquals(debilidadesAntiguas,debilidadesNuevas);
    }

    /**
     * Test of getFortalezas method, of class Personaje.
     */
    @Test
    public void testGetFortalezas() {
        System.out.println("getFortalezas");
        Personaje instance = CrearPersonajeBase();
        Fortaleza fortaleza = new Fortaleza("fortaleza", 4);
        Fortaleza[] expResult = new Fortaleza[1];
        expResult[0] = fortaleza;
        instance.setFortalezas(expResult);
        Fortaleza[] result = instance.getFortalezas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setFortalezas method, of class Personaje.
     */
    @Test
    public void testSetFortalezas() {
        System.out.println("setFortalezas");
        Personaje instance = CrearPersonajeBase();
        Fortaleza[] fortalezasAntiguas = instance.getFortalezas();
        Fortaleza fortaleza = new Fortaleza("fortaleza", 2);
        Fortaleza[] fortalezasNuevas = new Fortaleza[1];
        fortalezasNuevas[0] = fortaleza;
        instance.setFortalezas(fortalezasNuevas);
        assertNotEquals(fortalezasAntiguas[0].Fortalecer(), fortalezasNuevas[0].Fortalecer());
        
    }

    /**
     * Test of devolverPoder method, of class Personaje.
     */
    @Test
    public void testDevolverPoder() {
        System.out.println("devolverPoder");
        Personaje instance = CrearPersonajeBase();
        int expResult = 10;
        int result = instance.devolverPoder();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of devolverHabilidad method, of class Personaje.
     */
    @Test
    public void testDevolverHabilidad() {
        System.out.println("devolverHabilidad");
        Personaje instance = CrearPersonajeBase();
        Habilidad expResult = new Habilidad("habilidadCaso2", 10, 10, 0);
        Habilidad result = instance.getHabilidadPersonaje();
        assertEquals(expResult.getValorAtaque(), result.getValorAtaque());
    }

    /**
     * Test of devolverDañoArma method, of class Personaje.
     */
    @Test
    public void testDevolverDañoArma() {
        System.out.println("devolverAtaqueTotalArmas");
        Personaje instance = CrearPersonajeBase();
        int expResult = 50;
        int result = instance.devolverDañoArma();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of devolverDefensaArma method, of class Personaje.
     */
    @Test
    public void testDevolverDefensaArma() {
        System.out.println("devolverDefensaArma");
        Personaje instance = CrearPersonajeBase();
        int expResult = 5;
        int result = instance.devolverDefensaArma();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculoDanio method, of class Personaje.
     */
    @Test
    public void testCalculoDanio() {
        System.out.println("calculoDanio");
        Personaje instance = CrearPersonajeBase();
        int expResult = 100;
        int result = instance.calculoDanio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculoDefensa method, of class Personaje.
     */
    @Test
    public void testCalculoDefensa() {
        System.out.println("calculoDefensa");
        Personaje instance = CrearPersonajeBase();
        int expResult = 30;
        int result = instance.calculoDefensa();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculoVida method, of class Personaje.
     */
    @Test
    public void testCalculoVida() {
        System.out.println("calculoVida");
        Personaje instance = CrearPersonajeBase();
        int expResult = 10;
        int result = instance.calculoVida();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of MostrarArmas method, of class Personaje.
     */
    @Test
    public void testMostrarArmas() {
        System.out.println("MostrarArmas");
        Personaje instance = CrearPersonajeBase();
        instance.MostrarArmas(instance);
        
    }

    /**
     * Test of MostrarArmasActivas method, of class Personaje.
     */
    @Test
    public void testMostrarArmasActivas() {
        System.out.println("MostrarArmasActivas");
        Personaje instance = CrearPersonajeBase();
        instance.MostrarArmasActivas(instance);
        
    }

    /**
     * Test of MostrarArmaduras method, of class Personaje.
     */
    @Test
    public void testMostrarArmaduras() {
        System.out.println("MostrarArmaduras");
        Personaje instance = CrearPersonajeBase();
        instance.MostrarArmaduras(instance);
        
    }

    /**
     * Test of MostrarDebilidades method, of class Personaje.
     */
    @Test
    public void testMostrarDebilidades() {
        System.out.println("MostrarDebilidades");
        Personaje instance = CrearPersonajeBase();
        instance.MostrarDebilidades(instance);
        
    }

    /**
     * Test of MostrarFortalezas method, of class Personaje.
     */
    @Test
    public void testMostrarFortalezas() {
        System.out.println("MostrarFortalezas");
        Personaje instance = CrearPersonajeBase();
        instance.MostrarFortalezas(instance);
        
    }


    /**
     * Test of devolverDañoHabilidad method, of class Personaje.
     */
    @Test
    public void testDevolverDañoHabilidad() {
        System.out.println("devolverAtaqueHabilidad");
        Personaje instance = CrearPersonajeBase();
        Habilidad habilidad = instance.getHabilidadPersonaje();
        int result = instance.devolverDañoHabilidad(habilidad);
        int expResult = 10;
        assertEquals(expResult, result);
    }

    /**
     * Test of clonar method, of class Personaje.
     */
    @Test
    public void testClonar() {
        System.out.println("clonar");
        Personaje instance = CrearPersonajeBase();
        Personaje expResult = instance.clonar();
        assertEquals(expResult.getNombre(), instance.getNombre());
        assertEquals(expResult.getArmaduraActiva(), instance.getArmaduraActiva());
        assertArrayEquals(expResult.getArmaduras(), instance.getArmaduras());
        assertArrayEquals(expResult.getArmas(), instance.getArmas());
        assertArrayEquals(expResult.getArmasActivas(), instance.getArmasActivas());
        assertArrayEquals(expResult.getFortalezas(), instance.getFortalezas());
        assertArrayEquals(expResult.getDebilidades(), instance.getDebilidades());
        assertArrayEquals(expResult.getEsbirros(), instance.getEsbirros());
        assertArrayEquals(expResult.getEsbirros(), instance.getEsbirros());
        assertEquals(expResult.getPoder(), instance.getPoder());
        assertEquals(expResult.getSalud(), instance.getSalud());
        assertEquals(expResult.getHabilidadPersonaje(), instance.getHabilidadPersonaje());


        
    }

    

    

}
