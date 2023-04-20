/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Disciplinas extends Habilidad {

    public Disciplinas(String nombre, int valorAtaque, int valorDefensa, int limitante) {
        super(nombre, valorAtaque, valorDefensa, limitante);
    }

    public int activar(String opcion) {
        if (opcion=="Ataque") {
            return 15;
        }
        else if (opcion == "Defensa") {
            return 10;
        }
        return 0;
    }
    
}
