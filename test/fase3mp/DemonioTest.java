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
public class DemonioTest {
    
    public DemonioTest() {
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
     * Test of setEsbirros method, of class Demonio.
     */

     public Demonio crearDemonio () {

        Demonio instance = new Demonio("demonio", 5);
        boolean tienePacto = true;
        Pacto pacto = new Pacto();
        pacto.setDescripcion("a");
        instance.setPacto(pacto);
        ArrayList<Esbirro> esbirros= new ArrayList<>();
        Esbirro esbirro = new Esbirro("esbirro1", 10);
        esbirros.add(esbirro);
        instance.setEsbirros(esbirros);
        instance.setBooleanPacto(tienePacto);
        FabricaEsbirros fabricaEsbirros = new FabricaDemonio();
        instance.setFabricaEsbirros(fabricaEsbirros);
        EntidadesActivas entidades = new EntidadesActivas();
        instance.setEntidades(entidades);
        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        entidades.aniadir(habilidad);
        return instance;

    }

    @Test
    public void testSetEsbirros() {
        System.out.println("setEsbirros");
        Demonio instance = crearDemonio();
        ArrayList<Esbirro> esbirrosAntiguos = instance.getEsbirros();
        ArrayList<Esbirro> esbirros = new ArrayList<>();
        
        instance.setEsbirros(esbirros);
        assertNotEquals(esbirrosAntiguos,instance.getEsbirros());
    }

    /**
     * Test of setBooleanPacto method, of class Demonio.
     */
    @Test
    public void testSetBooleanPacto() {
        System.out.println("setBooleanPacto");
        boolean tienePacto = false;
        Demonio instance = crearDemonio();
        boolean pactoAntiguo = instance.getTienePacto();
        instance.setBooleanPacto(tienePacto);
        assertNotEquals(pactoAntiguo,instance.getTienePacto());
    }

    /**
     * Test of setPacto method, of class Demonio.
     */
    @Test
    public void testSetPacto() {
        System.out.println("setPacto");
        Pacto pacto = new Pacto();
        Demonio instance = crearDemonio();
        Pacto pactoAntiguo  = instance.getPacto();
        instance.setPacto(pacto);
        assertNotEquals(pactoAntiguo,instance.getPacto());
    }

    /**
     * Test of setFabricaEsbirros method, of class Demonio.
     */
    @Test
    public void testSetFabricaEsbirros() {
        System.out.println("setFabricaEsbirros");
        FabricaEsbirros fabricaEsbirros = new FabricaGhoul();
        Demonio instance = crearDemonio();
        FabricaEsbirros fabricaAntigua = instance.getFabricaEsbirros();
        instance.setFabricaEsbirros(fabricaEsbirros);
        assertNotEquals(fabricaAntigua,instance.getFabricaEsbirros());
    }

    /**
     * Test of getEsbirros method, of class Demonio.
     */
    @Test
    public void testGetEsbirros() {
        System.out.println("getEsbirros");
        Demonio instance = crearDemonio();
        ArrayList<Esbirro> esbirros = new ArrayList<>();
        Esbirro esbirro = new Esbirro("esbirro1", 10);
        esbirros.add(esbirro);
        String expResult = esbirros.get(0).getNombre();
        String result = instance.getEsbirros().get(0).getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTienePacto method, of class Demonio.
     */
    @Test
    public void testGetTienePacto() {
        System.out.println("getTienePacto");
        Demonio instance = crearDemonio();
        boolean expResult = true;
        boolean result = instance.getTienePacto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPacto method, of class Demonio.
     */
    @Test
    public void testGetPacto() {
        System.out.println("getPacto");
        Demonio instance = crearDemonio();
        Pacto pactoExperado = new Pacto();
         pactoExperado.setDescripcion("a");
         String expResult = pactoExperado.getDescripcion();
        Pacto pactoResultado = instance.getPacto();
        String result = pactoResultado.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEntidades method, of class Demonio.
     */
    @Test
    public void testSetEntidades() {
        System.out.println("setEntidades");
        EntidadesActivas entidades = new EntidadesActivas();
        Demonio instance = crearDemonio();
        EntidadesActivas entidadesAntiguas = instance.getEntidades();
        instance.setEntidades(entidades);
        assertNotEquals(entidadesAntiguas,entidades);
    }

    /**
     * Test of rellenarPropiedadesEspec method, of class Demonio.
     */
    /*
     * esta funcion no se deberia probar porque tiene dentro mas de un scanner y sería enorme el proceso de
     *  sacar todo fuera y ponerlo en parametros
     */
   
    @Test
    public void testRellenarPropiedadesEspec() throws Exception {
        System.out.println("rellenarPropiedadesEspec");
        Demonio instance = null;
        instance.rellenarPropiedadesEspec();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVidaRestante method, of class Demonio.
     */

      /*
     * esta funcion no esta implementada
     */
    @Test
    public void testCalcularVidaRestante() {
        System.out.println("calcularVidaRestante");
        Demonio instance = crearDemonio();
        int expResult = 0;
        int result = instance.calcularVidaRestante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverSalud method, of class Demonio.
     */
    @Test
    public void testDevolverSalud() {
        System.out.println("devolverSalud");
        Demonio instance = crearDemonio();
        int expResult = 10;
        /*
         *  10 es su salud base y 15 es su salud total asi que no deberia devolver 10
         */
        int result = instance.getSalud();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of tieneEsbirros method, of class Demonio.
     */
    @Test
    public void testTieneEsbirros() {
        System.out.println("tieneEsbirros");
        Demonio instance = crearDemonio();
        boolean expResult = true;
        boolean result = instance.tieneEsbirros();
        assertEquals(expResult, result);
    }
    
}
