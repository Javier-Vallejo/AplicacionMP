/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Vampiro extends Personaje implements InterfazPersonaje{
    
    private int sangre;

    public Personaje crearPersonaje(){
        return null;
    }

    @Override
    public Personaje clonar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int dañoDeSangre (int sangre) {
        if (sangre >= 5) {
            return 2;
        }
            
        else{
            return 0;
        }
}

    @Override
    public int calculoDanio() {
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad)+ dañoDeSangre(sangre);
    }
    
}
