/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class FabricaVampiro extends FabricaPersonajes{
    @Override
    public Personaje crearPersonaje(){
        Vampiro vampiro = new Vampiro();
        return vampiro;
    }
    
}