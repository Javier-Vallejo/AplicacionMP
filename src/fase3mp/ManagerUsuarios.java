/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author david
 */
public class ManagerUsuarios {
    private ArrayList<Map> credencialesUsuarios;
    private ArrayList<Usuario> usuariosRegistrados;

    public ManagerUsuarios() {
        credencialesUsuarios = new ArrayList<Map>();
        usuariosRegistrados = new ArrayList<Usuario>();
    }

    public ArrayList<Map> getCredencialesUsuarios() {
        return credencialesUsuarios;
    }

    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
    
    public Jugador CrearJugador(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador){
        //deberia comprobar aqui si existe ya en el sistema el jugador
        if(usuariosRegistrados.isEmpty()){
            Jugador jugador = new Jugador(nombre, nick, password, TipoUsuario.Jugador, estadoObservador);
            guardarUsuario(jugador);
            guardarCredenciales(jugador);
            return jugador;
        }
        else{
            if (existeUsuario(nick,password) == false){
                Jugador jugador = new Jugador(nombre, nick, password, TipoUsuario.Jugador, estadoObservador);
                guardarUsuario(jugador);
                guardarCredenciales(jugador);
                return jugador;
            }
            else{
                System.out.println("Ya estas registrado con estos datos, no puedes volver a hacerlo");
                return null;
            }
        }
    }
    
    public OperadorSistema CrearOperador(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador){
        if(usuariosRegistrados.isEmpty()){
            OperadorSistema operador = new OperadorSistema(nombre, nick, password, rol, estadoObservador);
            guardarUsuario(operador);
            guardarCredenciales(operador);
            return operador;
        }
        else{
            if (existeUsuario(nick,password) == false){
                OperadorSistema operador = new OperadorSistema(nombre, nick, password, rol, estadoObservador);
                guardarUsuario(operador);
                guardarCredenciales(operador);
                return operador;
            }
            else{
                System.out.println("Ya estas registrado con estos datos, no puedes volver a hacerlo");
                return null;
            }
        }
    }
     
    private void guardarUsuario(Usuario usuario){
        usuariosRegistrados.add(usuario);
    }
    
    private void guardarCredenciales(Usuario usuario){
        Map<String, String> credenciales = new HashMap<>();
        credenciales.put(usuario.getNick(), usuario.getPassword());
        credencialesUsuarios.add(credenciales);
    }
    
    public Boolean existeUsuario(String nick, String password){
        for (int j = 0; j < credencialesUsuarios.size(); j++) {
            if ((credencialesUsuarios.get(j).containsKey(nick)) && (credencialesUsuarios.get(j).containsValue(password))){
                return true;
            }   
        }
        return false; 
    }
    public Usuario obtenerUsuario(String nick, String password){
        if (existeUsuario(nick,password)){
            for (int i = 0; i < credencialesUsuarios.size(); i++) {
                if(usuariosRegistrados.get(i).getNick().equals(nick)){
                    return usuariosRegistrados.get(i);
                }
            }            
        }
        return null;
    }
    public void eliminarUsuario(String nick, String password){
        if (existeUsuario(nick , password)){
            for (int i = 0; i == usuariosRegistrados.size(); i++){
                if(usuariosRegistrados.get(i).getNick()== nick){
                    usuariosRegistrados.remove(i);
                }
            }
            for (int i = 0; i == credencialesUsuarios.size(); i++){
                if (credencialesUsuarios.get(i).containsKey(nick)){
                    credencialesUsuarios.remove(i);
                }
            }
        }
    }
}