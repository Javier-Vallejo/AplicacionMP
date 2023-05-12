package fase3mp;

import java.util.Scanner;

public class RegistroOperador extends Registro {
    
    public RegistroOperador(ManagerUsuarios manager) {
        super(manager);
    }

    @Override
    public Usuario registrarse(TipoUsuario rol) {

        ManagerUsuarios usuariosSistema = new ManagerUsuarios();
        String nick = null;
        String password = null;
        String nombre = null;
        OperadorSistema operador = null;

        Scanner escanerOperador = new Scanner(System.in);
        System.out.print("Introduzca su nombre: \n");
        nombre = escanerOperador.nextLine();
        System.out.print("Introduzca su nick: \n");
        nick = escanerOperador.nextLine();
        System.out.print("Introduzca su password: \n");
        password = escanerOperador.nextLine();

        if (!usuariosSistema.existeUsuario(nick, password)) {
            operador = super.getManager().CrearOperador(nombre, nick, password, rol, State.noBaneado);
        } else {
            System.out.print("Ya estás registrado en el sistema \n");
        }
        return operador;
    }
}
