/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class FabricaDemonio extends FabricaEsbirros {
    
    public Esbirro crearEsbirro(String nombre,
    int salud, boolean tienePacto,
    Pacto pacto){
        Demonio demonio = new Demonio(nombre, salud,tienePacto,pacto);
        return demonio;
     }
}
