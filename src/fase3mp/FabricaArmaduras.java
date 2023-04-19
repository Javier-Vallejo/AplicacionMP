/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class FabricaArmaduras extends FabricaEquipo{

    @Override
    public Equipo crearEquipo(String nombre, String modDanio, String modDefensa) {
        Armadura armadura = new Armadura(nombre, modDanio, modDefensa);
         return armadura;

    }

    
}
