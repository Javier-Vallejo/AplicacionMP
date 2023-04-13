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
    @Override
    public Esbirro crearEsbirro(){
        Demonio demonio = new Demonio();
        return demonio;
    }
}
