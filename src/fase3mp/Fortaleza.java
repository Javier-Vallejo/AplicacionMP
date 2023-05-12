/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Fortaleza extends Modificador{


    public Fortaleza(String nombre, int valor) {
        super(nombre, valor);
    }

    public int Fortalecer () {
        return super.getValor();
    }
    
}
