/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Debilidad extends Modificador{

    
    public Debilidad(String nombre, int valor) {
        super(nombre, valor);
    }

    public int debilitar () {
        return super.getValor();
    }
}
