/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Ghoul extends Esbirro implements IEsbirros{
    public Ghoul(String nombre, int salud,int dependencia) {
        super(nombre, salud);
        setDependencia(dependencia);
        }

    private void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

    private int dependencia;
    
    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
