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
    
    public ArrayList<Map> getCredencialesUsuarios() {
        return credencialesUsuarios;
    }

    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
    
    public Usuario CrearUsuario(String nombre, String password){
        Usuario usuario = new Usuario();
        return usuario;
    }
    
    public void guardarUsuario(Usuario usuario){
        usuariosRegistrados.add(usuario);      
    }
    
    public void guardarCredenciales(Usuario usuario){
        Map<String, String> credenciales = new HashMap<>();
        credenciales.put(usuario.getNick(), usuario.getPassword());
        credencialesUsuarios.add(credenciales);
    }
    
    public Boolean existeUsuario(String nick, String password){
        for (int i = 0; i == credencialesUsuarios.size(); i++){
            if (credencialesUsuarios.get(i).containsKey(nick) && credencialesUsuarios.get(i).containsValue(password)){
                return true;
            }
        }
        return false;  
    }
    public Usuario obtenerUsuario(String nick, String password){
        if (existeUsuario(nick,password)){
            for (int i = 0; i == usuariosRegistrados.size(); i++){
                if(usuariosRegistrados.get(i).getNick()== nick){
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
