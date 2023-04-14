/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class SistemaPrincipalGame {
    private SistemaPrincipalGame sistema;
    private ManagerUsuarios usuariosSistema;
    /**public Registro registro;*/
    
    
    public SistemaPrincipalGame(){//constructor hay que ver como aplicar singleton
        
    }
    public SistemaPrincipalGame getSistema(){
        return null;
    }
    
    public void run(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Desea Iniciar Sesion o Registrarse");
        String opcionElegida = escaner.nextLine();
        if (opcionElegida == "Iniciar Sesion"){
            this.iniciarSesion();
        }
        else if (opcionElegida == "Registrarse"){
            this.registrarse();
        }
        else{
            System.out.println("Opcion no valida");
        }
        
    }
    
    private void iniciarSesion(){ //habria que hacer que devolviera usuario para despues mostrar menu
        Scanner escanerIniSesion = new Scanner(System.in);
        String nick = escanerIniSesion.nextLine();
        String password = escanerIniSesion.nextLine();
        if(usuariosSistema.existeUsuario(nick, password)==false){
            System.out.println("No estas registrado en el sistema");
        }
        else{
            usuariosSistema.obtenerUsuario(nick, password);
        }
        
    }
    
    private void registrarse(){////habria que hacer que devolviera usuario para despues mostrar menu 
        Scanner escanerRegistro = new Scanner(System.in);
        System.out.print("Desea registrarse como jugador o como operador: \n");
        String rol = escanerRegistro.nextLine();//habria que poner un while por si introduce otra cosa
        if(rol == "jugador"){
            Registro registro = new RegistroJugador();
            registro.registrarse(TipoUsuario.Jugador);
        }
        else if(rol == "operador"){
            Registro registro = new RegistroJugador();
            registro.registrarse(TipoUsuario.OperadorSistema);
        }
        
    }
    
    
    
}
