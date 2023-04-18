/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Dones extends Habilidad {

public int activar(int danio, String opcion) {
        if ( opcion == "Ataque") {
                return danio +10;
        }
        else if (opcion == "Defensa") {
                return 25;
        }

        return 0;

}
    
}
