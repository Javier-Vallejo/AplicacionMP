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
    
    public void registrarse(List<String> datos){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = escaner.nextLine();
        datos.add(nombre);
        System.out.println("Introduce tu password");
        String password = escaner.nextLine();
        datos.add(password);
        
    }
    
}
