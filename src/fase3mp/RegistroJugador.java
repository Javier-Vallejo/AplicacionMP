/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class RegistroJugador extends Registro {
    
    @Override
    public void registrarse(TipoUsuario rol){
        Scanner escanerJugador = new Scanner(System.in);
        System.out.print("Introduzca su nombre: \n");
        String nombre = escanerJugador.nextLine();
        System.out.print("Introduzca su nick: \n");
        String nick = escanerJugador.nextLine();
        System.out.print("Introduzca su password: \n");
        String password = escanerJugador.nextLine();
        super.getManager().CrearJugador(nombre, nick, password, rol, State.noBaneado);
    }
    
}
