package fase3mp;

import java.util.Scanner;

public class RegistroJugador extends Registro {

    public RegistroJugador(ManagerUsuarios manager) {
        super(manager);
    }

    @Override
    public Usuario registrarse(TipoUsuario rol) {
        ManagerUsuarios usuariosSistema = new ManagerUsuarios();
        String nick = null;
        String password = null;
        String nombre = null;
        Jugador jugador = null;

        Scanner escanerJugador = new Scanner(System.in);
        System.out.print("Introduzca su nombre: \n");
        nombre = escanerJugador.nextLine();
        System.out.print("Introduzca su nick: \n");
        nick = escanerJugador.nextLine();
        System.out.print("Introduzca su password: \n");
        password = escanerJugador.nextLine();

        if (!usuariosSistema.existeUsuario(nick, password)) {
            jugador = super.getManager().CrearJugador(nombre, nick, password, rol, State.noBaneado, 100);
        } else {
            System.out.print("Ya estás registrado en el sistema \n");
        }

        return jugador;
    }

}
