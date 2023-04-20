/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Humano extends Esbirro implements IEsbirros {
    public Humano(String nombre, int salud) {
        super(nombre, salud);
        
    }

    public enum nivelLealtad{ALTA, NORMAL, BAJA};
    private nivelLealtad lealtad;
    
    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
