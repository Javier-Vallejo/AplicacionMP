/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fase3mp;

import java.io.IOException;

/**
 *
 * @author david
 */
public class main {
    public static void main (String[] args) throws IOException {
        SistemaPrincipalGame sistemaPrincipal = SistemaPrincipalGame.obtenerInstancia();
        sistemaPrincipal.run();
        System.exit(0);
    }
    
}
