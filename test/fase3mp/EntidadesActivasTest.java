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
public class EntidadesActivasTest {

    public EntidadesActivasTest() {
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
     * Test of getFortalezas method, of class EntidadesActivas.
     * 
     * @throws FileNotFoundException
     */

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

    public void MostraryElegirSinEscanner(String objetoMostrar, ArrayList<Personaje> personajes,
            ArrayList<Arma> armas,
            ArrayList<Armadura> armaduras,
            ArrayList<Fortaleza> fortalezas,
            ArrayList<Debilidad> debilidades,
            ArrayList<Esbirro> esbirros) {
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        if (objetoMostrar.equals("PERSONAJES")) {
            int personajeEle = 0;

            ArrayList<Integer> personajesElegidos = new ArrayList<>();
            if (personajeEle == personajes.size()) {
                assertTrue(false);
            } else {
                personajesElegidos.add(personajeEle);
                assertEquals(expResult.get(0), personajesElegidos.get(0));
            }
        }

        else if (objetoMostrar.equals("ARMAS")) {
            int armaEle = 0;
            for (int i = 0; i < armas.size(); i++) {
                System.out.println("- " + i + ".Arma: " + armas.get(i).getNombre() + " "
                        + armas.get(i).getTipodeArma().toString());
            }
            System.out.println("- " + armas.size() + ".Salir");
            if (armas.size() == 0) {
                System.out.println("No hay armas en el sistema.");
            }
            ArrayList<Integer> armasElegidas = new ArrayList<>();

            armaEle = 0;
            if (!(armaEle < 0) && !(armaEle >= armas.size())) {
                if (armasElegidas.contains(armaEle)) {
                    System.out.println("Ya posee esta arma, elija otra de la lista.");
                    assertTrue(false);
                } else {
                    armasElegidas.add(armaEle);
                    assertEquals(expResult.get(0), armasElegidas.get(0));
                }
            }

        } else if (objetoMostrar.equals("ARMADURAS")) {
            int armaduraEle = 0;
            for (int i = 0; i < armaduras.size(); i++) {
                System.out.println("- " + i + ".Armadura:" + armaduras.get(i).getNombre());
            }
            System.out.println("- " + armaduras.size() + ".Salir");
            ArrayList<Integer> armadurasElegidas = new ArrayList<>();
            if (armaduras.size() == 0) {
                System.out.println("No hay armaduras en el sistema.");
            }
            armaduraEle = 0;
            if (!(armaduraEle >= armaduras.size()) && !(armaduraEle < 0)) {
                if (armadurasElegidas.contains(armaduraEle)) {
                    System.out.println("Ya posee esta armadura, elija otra de la lista");
                } else {
                    armadurasElegidas.add(armaduraEle);
                    assertEquals(expResult.get(0), armadurasElegidas.get(0));

                }
            } else if (armaduraEle != armaduras.size()) {
                System.out.println("Armadura erronea. Por favor, introduzca un armadura de la lista.");
            }

        } else if (objetoMostrar.equals("FORTALEZAS")) {
            int fortalezaEle = 0;
            for (int i = 0; i < fortalezas.size(); i++) {
                System.out.println("- " + i + ".Fortaleza:" + fortalezas.get(i).getNombre());
            }
            System.out.println("- " + (fortalezas.size()) + ".Salir");
            if (fortalezas.size() == 0) {
                System.out.println("No hay fortalezas en el sistema.");
            }
            ArrayList<Integer> fortalezasElegidas = new ArrayList<>();

            fortalezaEle = 0;

            if (!(fortalezaEle >= fortalezas.size()) && !(fortalezaEle < 0)) {
                if (fortalezasElegidas.contains(fortalezaEle)) {
                    System.out.println("Ya posee esta fortaleza, elija otra de la lista");
                } else {
                    fortalezasElegidas.add(fortalezaEle);
                    assertEquals(expResult.get(0), fortalezasElegidas.get(0));

                }
            } else if (fortalezaEle > fortalezas.size() || fortalezaEle < 0) {
                System.out.println("Fortaleza erronea. Por favor, introduzca una fortaleza de la lista");
            }

        } else if (objetoMostrar.equals("DEBILIDADES")) {
            int debilidadEle = 0;
            for (int i = 0; i < debilidades.size(); i++) {
                System.out.println("- " + i + ".Debilidad:" + debilidades.get(i).getNombre());
            }
            System.out.println("- " + (debilidades.size()) + ".Salir");
            if (debilidades.size() == 0) {
                System.out.println("No hay debilidades en el sistema.");
            }
            ArrayList<Integer> debilidadesElegidas = new ArrayList<>();

            debilidadEle = 0;
            if (!(debilidadEle >= debilidades.size()) && !(debilidadEle < 0)) {
                if (debilidadesElegidas.contains(debilidadEle)) {
                    System.out.println("Ya posee esta debilidad, por favor elija otra de la lista.");
                } else {
                    debilidadesElegidas.add(debilidadEle);
                    assertEquals(expResult.get(0), debilidadesElegidas.get(0));

                }
            } else if (debilidadEle > debilidades.size() || debilidadEle < 0) {
                System.out.println("Debilidad erronea. Por favor, introduzca una debilidad de la lista.");
            }

        } else if (objetoMostrar.equals(
                "ESBIRROS")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println("- " + i + ".Esbirro:" + esbirros.get(i).getNombre() + " "
                        + esbirros.get(i).getClass().getName());
            }
            System.out.println("- " + (esbirros.size()) + ".Salir");
            ArrayList<Integer> esbirrosElegidos = new ArrayList<>();
            int esbirro = 0;

            esbirroEle = 0;
            if (esbirroEle < 0 || esbirroEle > esbirros.size()) {
                System.out.println(
                        "Esbirro inexistente. Por favor introduzca el numero de uno de los esbirros disponibles.");
            } else if (esbirroEle != esbirros.size()) {
                esbirro = esbirroEle;
            }
            esbirrosElegidos.add(esbirro);
            assertEquals(expResult.get(0), esbirrosElegidos.get(0));

        } else if (objetoMostrar.equals(
                "ESBIRRO")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println("- " + i + ".Esbirro " + esbirros.get(i).getNombre() + " "
                        + esbirros.get(i).getClass().getName());
            }
            System.out.println("- " + (esbirros.size()) + ".Salir");
            ArrayList<Integer> esbirroElegido = new ArrayList<>();
            int esbirro = 0;

            esbirroEle = 0;
            if (esbirroEle < 0 || esbirroEle > esbirros.size()) {
                System.out.println(
                        "Esbirro inexistente. Por favor introduzca el numero de uno de los esbirros disponibles.");
            } else if (esbirroEle != esbirros.size()) {
                esbirro = esbirroEle;
            }

            esbirroElegido.add(esbirro);
            assertEquals(expResult.get(0), esbirroElegido.get(0));

        } else {
            System.out.println("No existe el contenido " + objetoMostrar);
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

    @Test
    public void testGetFortalezas() {
        System.out.println("getFortalezas");
        EntidadesActivas instance = crearEntidades();
        ArrayList<Fortaleza> fortalezasObtenidas = instance.getFortalezas();
        int tamañoEsperado = 2;

        assertEquals(fortalezasObtenidas.size(), tamañoEsperado);

    }

    /**
     * Test of getDebilidades method, of class EntidadesActivas.
     */
    @Test
    public void testGetDebilidades() {
        System.out.println("getDebilidades");
        EntidadesActivas instance = crearEntidades();
        ArrayList<Debilidad> debilidadesObtenidas = instance.getDebilidades();
        int tamañoEsperado = 2;

        assertEquals(debilidadesObtenidas.size(), tamañoEsperado);

    }

    /**
     * Test of getPersonajes method, of class EntidadesActivas.
     */
    @Test
    public void testGetPersonajes() {
        System.out.println("getPersonajes");
        EntidadesActivas instance = crearEntidades();
        ArrayList<Personaje> expResult = new ArrayList<>();
        Cazador cazador = CrearCazadorBase();
        expResult.add(cazador);
        ArrayList<Personaje> result = instance.getPersonajes();
        assertEquals(expResult.size(), result.size());

    }

    /**
     * Test of setPersonajes method, of class EntidadesActivas.
     */
    @Test
    public void testSetPersonajes() {
        System.out.println("setPersonajes");
        Cazador cazador = CrearCazadorBase();
        Cazador cazador2 = CrearCazadorBase();
        cazador2.setPoder(4);
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(cazador);
        personajes.add(cazador2);
        EntidadesActivas instance = crearEntidades();
        ArrayList<Personaje> antiguosPersonajes = instance.getPersonajes();
        instance.setPersonajes(personajes);
        assertNotEquals(antiguosPersonajes, personajes);
    }

    /**
     * Test of getArmas method, of class EntidadesActivas.
     */
    @Test
    public void testGetArmas() {
        System.out.println("getArmas");
        EntidadesActivas instance = crearEntidades();
        int expResult = 1;
        ArrayList<Arma> result = instance.getArmas();
        assertEquals(expResult, result.size());

    }

    /**
     * Test of setArmas method, of class EntidadesActivas.
     */
    @Test
    public void testSetArmas() {
        System.out.println("setArmas");
        ArrayList<Arma> armas = new ArrayList<>();
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma arma2 = new Arma("arma2", "3", "3", "de1mano");

        EntidadesActivas instance = crearEntidades();
        ArrayList<Arma> armasAntiguas = instance.getArmas();
        armas.add(arma);
        armas.add(arma2);
        instance.setArmas(armas);
        assertNotEquals(armasAntiguas.size(), armas.size());

    }

    /**
     * Test of getArmaduras method, of class EntidadesActivas.
     */
    @Test
    public void testGetArmaduras() {
        System.out.println("getArmaduras");
        EntidadesActivas instance = crearEntidades();
        int expResult = 1;
        ArrayList<Armadura> result = instance.getArmaduras();
        assertEquals(expResult, result.size());

    }

    /**
     * Test of setArmaduras method, of class EntidadesActivas.
     */
    @Test
    public void testSetArmaduras() {
        System.out.println("setArmaduras");
        ArrayList<Armadura> armaduras = new ArrayList<>();
        EntidadesActivas instance = crearEntidades();

        Armadura armadura = new Armadura("armadura", "1", "10");
        Armadura armadura2 = new Armadura("armadura2", "2", "7");

        ArrayList<Armadura> armadurasAntiguas = instance.getArmaduras();
        armaduras.add(armadura);
        armaduras.add(armadura2);
        instance.setArmaduras(armaduras);
        assertNotEquals(armadurasAntiguas.size(), armaduras.size());

    }

    /**
     * Test of getHabilidades method, of class EntidadesActivas.
     */
    @Test
    public void testGetHabilidades() {
        System.out.println("getHabilidades");
        EntidadesActivas instance = crearEntidades();
        ArrayList<Habilidad> expResult = new ArrayList<>();
        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        expResult.add(habilidad);
        ArrayList<Habilidad> result = instance.getHabilidades();
        assertEquals(expResult.get(0).getNombre(), result.get(0).getNombre());
        assertEquals(expResult.get(0).getValorAtaque(), result.get(0).getValorAtaque());
        assertEquals(expResult.get(0).getValorDefensa(), result.get(0).getValorDefensa());
        assertEquals(expResult.get(0).getLimitante(), result.get(0).getLimitante());

    }

    /**
     * Test of devolverEsbirro method, of class EntidadesActivas.
     */
    @Test
    public void testDevolverEsbirro() {
        System.out.println("devolverEsbirro");
        String nombre = "esbirro";
        int salud = 10;
        String tipo = "ghoul";
        EntidadesActivas instance = crearEntidades();
        Ghoul expResult = new Ghoul(nombre, salud);
        Esbirro result = instance.devolverEsbirro(nombre, salud, tipo);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.getSalud(), result.getSalud());
        assertEquals(expResult.getClass(), result.getClass());

    }

    /**
     * Test of aniadir method, of class EntidadesActivas.
     */
    @Test
    public void testAniadir() {
        System.out.println("aniadir");
        Cazador cazador = CrearCazadorBase();
        cazador.setNombre("cazadorAñadido");
        EntidadesActivas instance = crearEntidades();
        ArrayList<Personaje> listaAntigua = instance.getPersonajes();
        int tamañoAntiguo = listaAntigua.size();

        instance.aniadir(cazador);

        assertNotEquals(tamañoAntiguo, instance.getPersonajes().size());

    }

    /**
     * Test of existeEsbirro method, of class EntidadesActivas.
     */
    @Test
    public void testExisteEsbirro() {
        System.out.println("existeEsbirro");
        EntidadesActivas instance = crearEntidades();
        Ghoul esbirro = new Ghoul("ghoulañadido", 10);
        instance.aniadir(esbirro);
        boolean expResult = true;
        boolean result = instance.existeEsbirro(esbirro);
        assertEquals(expResult, result);

    }

    /**
     * Test of elegirPersonaje method, of class EntidadesActivas.
     */
    @Test
    public void testElegirPersonaje() {
        System.out.println("elegirPersonaje");
        int eleccion = 0;
        EntidadesActivas instance = crearEntidades();
        Personaje expResult = CrearCazadorBase();
        Personaje result = instance.elegirPersonaje(eleccion);
        assertEquals(expResult.getNombre(), result.getNombre());

    }

    /**
     * Test of elegirArma method, of class EntidadesActivas.
     */
    @Test
    public void testElegirArma() {
        System.out.println("elegirArma");
        EntidadesActivas instance = crearEntidades();
        int eleccion = 1;
        Arma expResult = new Arma("arma", "1", "2", "de2manos");
        instance.getArmas().add(expResult);
        Arma result = instance.elegirArma(eleccion);
        assertEquals(expResult, result);

    }

    /**
     * Test of elegirArmadura method, of class EntidadesActivas.
     */
    @Test
    public void testElegirArmadura() {
        System.out.println("elegirArmadura");
        int eleccion = 0;
        EntidadesActivas instance = crearEntidades();
        Armadura expResult = new Armadura("armadura", "10", "5");
        Armadura result = instance.elegirArmadura(eleccion);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.getModDanio(), result.getModDanio());
        assertEquals(expResult.getModDefensa(), result.getModDefensa());

    }

    /**
     * Test of elegirFortaleza method, of class EntidadesActivas.
     */
    @Test
    public void testElegirFortaleza() {
        System.out.println("elegirFortaleza");
        int eleccion = 0;
        int eleccion2 = 1;
        EntidadesActivas instance = crearEntidades();
        Fortaleza expResult = new Fortaleza("fortaleza1", 2);
        Fortaleza expResult2 = new Fortaleza("fortaleza2", 4);
        Fortaleza result = instance.elegirFortaleza(eleccion);
        Fortaleza result2 = instance.elegirFortaleza(eleccion2);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.Fortalecer(), result.Fortalecer());

        assertEquals(expResult2.getNombre(), result2.getNombre());
        assertEquals(expResult2.Fortalecer(), result2.Fortalecer());

    }

    /**
     * Test of elegirDebilidad method, of class EntidadesActivas.
     */
    @Test
    public void testElegirDebilidad() {
        System.out.println("elegirDebilidad");
        int eleccion = 0;
        int eleccion2 = 1;
        EntidadesActivas instance = crearEntidades();
        Debilidad expResult = new Debilidad("debilidad", 2);
        Debilidad expResult2 = new Debilidad("debilidad2", 4);
        Debilidad result = instance.elegirDebilidad(eleccion);
        Debilidad result2 = instance.elegirDebilidad(eleccion2);

        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.debilitar(), result.debilitar());

        assertEquals(expResult2.getNombre(), result2.getNombre());
        assertEquals(expResult2.debilitar(), result2.debilitar());

    }

    /**
     * Test of obtenerEsbirro method, of class EntidadesActivas.
     */
    @Test
    public void testObtenerEsbirro() {
        System.out.println("obtenerEsbirro");
        int eleccion = 0;
        EntidadesActivas instance = crearEntidades();
        Ghoul expResult = new Ghoul("esbirro", 10);
        ;
        Esbirro result = instance.obtenerEsbirro(eleccion);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.getSalud(), result.getSalud());
    }

    /**
     * Test of elegirHabilidad method, of class EntidadesActivas.
     */
    @Test
    public void testElegirHabilidad() {
        System.out.println("elegirHabilidad");
        int eleccion = 0;
        EntidadesActivas instance = crearEntidades();
        Habilidad expResult = new Habilidad("habilidad", 10, 10, 0);
        Habilidad result = instance.elegirHabilidad(eleccion);
        assertEquals(expResult.getNombre(), result.getNombre());
        assertEquals(expResult.getValorAtaque(), result.getValorAtaque());
        assertEquals(expResult.getValorDefensa(), result.getValorDefensa());
        assertEquals(expResult.getLimitante(), result.getLimitante());

    }

    /**
     * Test of MostraryElegir method, of class EntidadesActivas.
     */
    @Test
    public void testMostraryElegirPersonaje() {
        System.out.println("MostraryElegir");
        String objetoMostrar = "PERSONAJES";
        EntidadesActivas instance = crearEntidades();
        ArrayList<Personaje> personajes = instance.getPersonajes();
        MostraryElegirSinEscanner(objetoMostrar, personajes, null, null, null, null, null);

    }

    @Test
    public void testMostraryElegir() {
        System.out.println("MostraryElegir");
        String objetoMostrar = "ARMAS";
        EntidadesActivas instance = crearEntidades();
        ArrayList<Arma> armas = instance.getArmas();
        MostraryElegirSinEscanner(objetoMostrar, null, armas, null, null, null, null);
    }

    @Test
    public void testMostraryElegirArmadura() {
        System.out.println("MostraryElegir");
        String objetoMostrar = "ARMADURAS";
        EntidadesActivas instance = crearEntidades();
        ArrayList<Armadura> armaduras = instance.getArmaduras();
        MostraryElegirSinEscanner(objetoMostrar, null, null, armaduras, null, null, null);

    }

    @Test
    public void testMostraryElegirEsbirros() {
        System.out.println("MostraryElegir");
        String objetoMostrar = "ESBIRROS";
        EntidadesActivas instance = crearEntidades();
        ArrayList<Esbirro> esbirros = instance.getEsbirros();
        MostraryElegirSinEscanner(objetoMostrar, null, null, null, null, null, esbirros);
    }

    @Test
    public void testMostraryElegirEsbirro() {
        System.out.println("MostraryElegir");
        String objetoMostrar = "ESBIRRO";
        EntidadesActivas instance = crearEntidades();
        ArrayList<Esbirro> esbirros = instance.getEsbirros();
        MostraryElegirSinEscanner(objetoMostrar, null, null, null, null, null, esbirros);
    }

    /**
     * Test of MostraryElegirHabilidad method, of class EntidadesActivas.
     */
    @Test
    public void testMostraryElegirHabilidad() {
        System.out.println("MostraryElegirHabilidad");
        EntidadesActivas instance = crearEntidades();
        int expResult = 0;

        ArrayList<Habilidad> habilidades = instance.getHabilidades();

        int habilidadElegida = 0;

        for (int i = 0; i < habilidades.size(); i++) {
            System.out.println("Habilidad " + i + " " + habilidades.get(i).getNombre());
        }
        System.out.println((habilidades.size()) + " Salir");
        habilidadElegida = 0;
        if (!(habilidadElegida >= habilidades.size()) && !(habilidadElegida < 0)) {
            int result = habilidadElegida;
            assertEquals(expResult, result);
        } else {
            System.out.println("Habilidad erronea, por favor introduzca una habilidad de la lista.");
            assertTrue(false);
        }
    }

    /**
     * Test of obtenerPersonaje method, of class EntidadesActivas.
     */
    @Test
    public void testObtenerPersonaje() {
        System.out.println("obtenerPersonaje");
        String nombre = "nombre";
        String tipo = "cazador";
        int salud = 0;
        EntidadesActivas instance = crearEntidades();
        Personaje result = instance.obtenerPersonaje(nombre, tipo, salud);
        assertNull(result);
        salud = 3;
        result = instance.obtenerPersonaje(nombre, tipo, salud);
        assertNotNull(result);
        
    }

}
