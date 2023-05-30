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
public class RegistroOperadorTest {

    public RegistroOperadorTest() {
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

    public void registrarse(OperadorSistema operador, TipoUsuario rol) {
        ManagerUsuarios usuariosSistema = new ManagerUsuarios();
        String nick = null;
        String password = null;
        String nombre = null;

        System.out.print("Introduzca su nombre: \n");
        nombre = "a";
        System.out.print("Introduzca su nick: \n");
        nick = "a";
        System.out.print("Introduzca su password: \n");
        password = "123";
        if (!usuariosSistema.existeUsuario(nick, password)) {
            operador.getManager().CrearOperador(nombre, nick, password, rol, null);
        } else {
            System.out.print("Ya estás registrado en el sistema \n");
        }

    }

    public OperadorSistema CrearOperador() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        managerUsuarios.CrearJugador("nombre", "A", "a", TipoUsuario.Jugador, null, 100);
        OperadorSistema instance = new OperadorSistema("operador", "ope", "123", TipoUsuario.OperadorSistema,
                managerUsuarios);
        Publisher expResult = new Publisher();
        instance.setNotificador(expResult);
        instance.setManagerUsuarios(managerUsuarios);
        return instance;
    }

    /**
     * Test of registrarse method, of class RegistroOperador.
     */
    @Test
    public void testRegistrarse() {
        System.out.println("registrarse");
        TipoUsuario rol = TipoUsuario.OperadorSistema;
        OperadorSistema operador = CrearOperador();
        ManagerUsuarios managerUsuarios = operador.getManager();
        RegistroOperador instance = new RegistroOperador(managerUsuarios);
        int tamañoAntiguo = managerUsuarios.getUsuariosRegistrados().size();
        registrarse(operador, rol);
        int tamañoNuevo = managerUsuarios.getUsuariosRegistrados().size();
        assertNotEquals(tamañoAntiguo, tamañoNuevo);
    }




    @Test
    public void testRegistrarseConUsuarioIgualGuardado() {
        System.out.println("registrarse");
        TipoUsuario rol = TipoUsuario.OperadorSistema;
        OperadorSistema operador = CrearOperador();
        ManagerUsuarios managerUsuarios = operador.getManager();
        RegistroOperador instance = new RegistroOperador(managerUsuarios);
        managerUsuarios.CrearOperador("a", "a", "123", rol, null);
        int tamañoAntiguo = managerUsuarios.getUsuariosRegistrados().size();
        registrarse(operador, rol);
        int tamañoNuevo = managerUsuarios.getUsuariosRegistrados().size();
        assertEquals(tamañoAntiguo, tamañoNuevo);
    }

}
