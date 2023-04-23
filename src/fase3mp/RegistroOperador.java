/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class RegistroOperador extends Registro {

    public RegistroOperador(ManagerUsuarios manager) {
        super(manager);
    }

    @Override
    public Usuario registrarse(TipoUsuario rol){
        
        ManagerUsuarios usuariosSistema = new ManagerUsuarios();
        String nick = null;
        String password = null;
        String nombre = null;
        OperadorSistema operador  = null;

        try (Scanner escanerOperador = new Scanner(System.in)) {
            while (!usuariosSistema.existeUsuario(nick, password)) {
                System.out.print("Introduzca su nombre: \n");
                nombre = escanerOperador.nextLine();
                System.out.print("Introduzca su nick: \n");
                nick = escanerOperador.nextLine();
                System.out.print("Introduzca su password: \n");
                password = escanerOperador.nextLine();
                operador = super.getManager().CrearOperador(nombre, nick, password, rol, State.noBaneado);
            }
        }

        return operador;
    }    
}
