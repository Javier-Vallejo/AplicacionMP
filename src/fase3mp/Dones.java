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

public Dones(String nombre, int valorAtaque, int valorDefensa, int limitante) {
                super(nombre, valorAtaque, valorDefensa, limitante);
        }

public int activar(int valor, String opcion) {
        if ( opcion == "Ataque") {
                return valor +10;
        }
        else if (opcion == "Defensa") {
                return valor + 5;
        }

        return 0;

}
    
}
