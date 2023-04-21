/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

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
    
    public void run() throws IOException{
        ManagerUsuarios manager = new ManagerUsuarios();
        usuariosSistema = manager;
        //leerUsuarios("usuarios.txt");
        //leerPersonajes("personajes.txt");//habra que hacer un leer Usuarios tambien
        Scanner escaner = new Scanner(System.in);
        String opcionElegida = "";
        while(!(opcionElegida.equals("INICIARSESION")==false ^ opcionElegida.equals("REGISTRARSE")==false)){
            System.out.println("Desea Iniciar Sesion o Registrarse");
            opcionElegida = escaner.nextLine();
            opcionElegida = opcionElegida.replaceAll("\\s","").toUpperCase();
        }
        if (opcionElegida.equals("INICIARSESION")){//Inicio de sesion
            this.iniciarSesion();
            
        }
        else if (opcionElegida.equals("REGISTRARSE")){ //Registro
            this.registrarse();
            Scanner escanerSioNo = new Scanner(System.in);
            String opcion = "";
            while(!(opcion.equals("SI")^ opcion.equals("NO"))){
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
    
    private void iniciarSesion() throws IOException{ 
        System.out.println("-----Inicio de Sesion-----");
        Scanner escanerIniSesion = new Scanner(System.in);
        System.out.println("Introduzca su nick: ");
        String nick = escanerIniSesion.nextLine();
        System.out.println("Introduzca su contrasenia: ");
        String password = escanerIniSesion.nextLine();
        if(usuariosSistema.existeUsuario(nick, password)==false){
            System.out.println("No estas registrado en el sistema");
            return;
        }
        else{
            Usuario usuario = usuariosSistema.obtenerUsuario(nick, password);
            System.out.println("Bienvenido " + usuario.getNick());
            System.out.println("Que deseas hacer: ");
            int eleccionMenu = 0;
            if(usuario.getRol() == TipoUsuario.Jugador){
                Jugador jugador = (Jugador) usuario;
                while(eleccionMenu != 10){//hacer restriccion para que solo meta enteros
                    Menu menu = new MenuJugador();//deberia ponerlo fuera 
                    menu.mostrarOpciones();
                    eleccionMenu = escanerIniSesion.nextInt();
                    jugador.realizarFuncionMenuJugador(eleccionMenu);
                }
            }
            else{
                OperadorSistema operador = (OperadorSistema) usuario;
                while(eleccionMenu != 7){
                    Menu menu = new MenuOperador();
                    menu.mostrarOpciones();
                    eleccionMenu = escanerIniSesion.nextInt();
                    operador.realizarFuncionMenuOperador(eleccionMenu);
                }
            }
        }
        
    }
    
    private void registrarse(){////habria que hacer que devolviera usuario para despues mostrar menu
        System.out.println("-----Registro-----");
        Scanner escanerRegistro = new Scanner(System.in);
        System.out.print("Desea registrarse como jugador o como operador: \n");
        String rol = escanerRegistro.nextLine();//habria que poner un while por si introduce otra cosa
        rol = rol.toLowerCase();
        if(rol.equals("jugador")){
            Registro registro = new RegistroJugador(usuariosSistema); //nuevas clases
            Usuario usuario = registro.registrarse(TipoUsuario.Jugador);
        }
        else if(rol.equals("operador")){
            Registro registro = new RegistroOperador(usuariosSistema);
            Usuario usuario = registro.registrarse(TipoUsuario.OperadorSistema);
        }
    }

    private void leerPersonajes(String fichero)throws FileNotFoundException { //habria que hacer uno para cada tipo de entidad
        File miFichero = new File(fichero);
        Scanner scanner = new Scanner(miFichero);
        while(scanner.hasNextLine()){
            String linea = scanner.nextLine();   
            String [] camposPersonaje = linea.split(";");
            String [] armasLeidas = camposPersonaje[3].split(",");
            ArrayList <Arma> armas = new ArrayList<>();
            for (int i = 0; i < armasLeidas.length; i++) {
                String [] caracteristicaArma = armasLeidas[i].split("|");
                Arma arma = new Arma(caracteristicaArma[0],caracteristicaArma[1],caracteristicaArma[2], caracteristicaArma[3]);
                armas.add(arma);
                Arma[] arrayArmas = (Arma[]) armas.toArray();
            }
            String [] armadurasLeidas = camposPersonaje[5].split(",");
            ArrayList <Armadura> armaduras = new ArrayList<>();
            for (int j = 0; j < armadurasLeidas.length; j++) {
                String [] caracteristicaArmadura = armadurasLeidas[j].split("|");
                Armadura armadura = new Armadura(caracteristicaArmadura[0],caracteristicaArmadura[1],caracteristicaArmadura[2]);
                armaduras.add(armadura);
                Armadura[] arrayArmas = (Armadura[]) armas.toArray();
            }
            String [] esbirrosStr = camposPersonaje[7].split(",");
            if (camposPersonaje[0]=="Vampiro"){
                //Vampiro vampiro = new Vampiro(camposPersonaje[1],camposPersonaje[2], armas, camposPersonaje[4], armaduras, camposPersonaje[6], esbirros, 
                //camposPersonaje[8], camposPersonaje[9], camposPersonaje[10], camposPersonaje[11], camposPersonaje[12],camposPersonaje[13]);
            }
            else if(camposPersonaje[0]=="Cazador"){
                //Cazador cazador = new Cazador(camposPersonaje[1],camposPersonaje[2], armas, camposPersonaje[4], armaduras, camposPersonaje[6], esbirros, 
                //camposPersonaje[8], camposPersonaje[9], camposPersonaje[10], camposPersonaje[11], camposPersonaje[12],camposPersonaje[13]);
            }
            else if(camposPersonaje[0]=="Licantropo"){
                //Licantropo licantropo = new Licantropo(camposPersonaje[1],camposPersonaje[2], armas, camposPersonaje[4], armaduras, camposPersonaje[6], esbirros, 
                //camposPersonaje[8], camposPersonaje[9], camposPersonaje[10], camposPersonaje[11], camposPersonaje[12],camposPersonaje[13]);
            }
        }
    }
    
       
}
