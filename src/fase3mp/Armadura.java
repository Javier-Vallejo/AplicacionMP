/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author david
 */
public class Armadura extends Equipo implements IEquipo{
    
    public Armadura(String nombre, String potenciadorDanio, String potenciadorDefensa){
        super.setNombre(nombre);
        int potDanio = Integer.parseInt(potenciadorDanio);
        int potDef = Integer.parseInt(potenciadorDefensa);
        super.setModDanio(potDanio);
        super.setModDefensa(potDef);
    }

    @Override
    public int devolverModificadores() {
        return super.devolverDefensa();
    }

    void editarArmadura() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
    
}
