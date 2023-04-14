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
        leerPersonajes("a.txt");
        Scanner escaner = new Scanner(System.in);
        System.out.println("Desea Iniciar Sesion o Registrarse");
        String opcionElegida = escaner.nextLine();
        while(opcionElegida != "Iniciar Sesion" || opcionElegida != "Registrarse"){
            System.out.println("Desea Iniciar Sesion o Registrarse");
            opcionElegida = escaner.nextLine();
        }
        if (opcionElegida.equals("Iniciar Sesion")){
            Usuario usuario = this.iniciarSesion();
            System.out.println("Bienvenido " + usuario.getNick());
            System.out.println("Que deseas hacer: ");
            if(usuario.getRol() == TipoUsuario.Jugador){
                Menu menu = new MenuJugador();
                menu.mostrarOpciones();
            }
            else{
                Menu menu = new MenuOperador();
                menu.mostrarOpciones();
            }
        }
        else if (opcionElegida == "Registrarse"){
            this.registrarse();
            Scanner escanerSioNo = new Scanner(System.in);
            String opcion = "";
            while(opcion != "SI" || opcionElegida != "NO"){
                System.out.println("¿Desas iniciar sesion? si o no");
                opcion = escanerSioNo.nextLine();
                opcion = opcion.toUpperCase();
            }
            if (opcion.equals("SI")){
                iniciarSesion();
            }
            else if(opcion.equals("NO")){
                System.exit(0);
            }            
        }
        
        
        
        
    }
    
    private Usuario iniciarSesion(){ //habria que hacer que devolviera usuario para despues mostrar menu
        System.out.println("-----Inicio de Sesion-----");
        Scanner escanerIniSesion = new Scanner(System.in);
        String nick = escanerIniSesion.nextLine();
        String password = escanerIniSesion.nextLine();
        if(usuariosSistema.existeUsuario(nick, password)==false){
            System.out.println("No estas registrado en el sistema");
        }
        else{
            Usuario usuario = usuariosSistema.obtenerUsuario(nick, password);
            return usuario; 
        }
        return null;
        
    }
    
    private void registrarse(){////habria que hacer que devolviera usuario para despues mostrar menu
        System.out.println("-----Registro-----");
        Scanner escanerRegistro = new Scanner(System.in);
        System.out.print("Desea registrarse como jugador o como operador: \n");
        String rol = escanerRegistro.nextLine();//habria que poner un while por si introduce otra cosa
        if(rol == "jugador"){
            Registro registro = new RegistroJugador();
            Usuario usuario = registro.registrarse(TipoUsuario.Jugador);
        }
        else if(rol == "operador"){
            Registro registro = new RegistroJugador();
            Usuario usuario = registro.registrarse(TipoUsuario.OperadorSistema);
        }
    }

    private void leerPersonajes(String fichero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    
}
