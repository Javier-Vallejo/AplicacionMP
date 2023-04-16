/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Registro {
    private ManagerUsuarios manager;
    
    public Registro(ManagerUsuarios manager){
        setManager(manager);
    }
    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
    }
     
    public Usuario registrarse(TipoUsuario rol){
        return null;   
    }
    
}
