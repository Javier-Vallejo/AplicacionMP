/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class FabricaArmas extends FabricaEquipo{

    @Override
    public Equipo crearEquipo(String nombre, String modDanio, String modDefensa) {
         Arma arma = new Arma(nombre, modDanio, modDefensa, modDefensa);
         return arma;

             // por aqui paso los parametros base para crear equipo base. Supongo que para el tipo de si es de una o mas manos
             // habria que hacer como cuando seteamos el valor de sangre o rabia.
    }
     
}
