/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author david
 */
public class Arma extends Equipo implements IEquipo{

    void editarArma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public enum tipoArma{de1mano, de2manos}
    private tipoArma tipodeArma;
    
    @Override
    public int devolverModificadores(int opcion) {
        if (opcion == 1 ){
            return super.devolverAtaque();
        }

        else if (opcion == 2) {
            return super.devolverDefensa();
        }
        return 0;
    }
    
    
}
