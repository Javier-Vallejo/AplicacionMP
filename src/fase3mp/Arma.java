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
    public enum tipoArma{de1mano, de2manos}
    private tipoArma tipodeArma;

    public tipoArma getTipodeArma() {
        return tipodeArma;
    }

    public void setTipodeArma(tipoArma tipodeArma) {
        this.tipodeArma = tipodeArma;
    }
    
    public Arma(String nombre, String potenciadorDanio, String potenciadorDefensa, String tipoDeArma) {
        super.setNombre(nombre);
        int potDanio = Integer.parseInt(potenciadorDanio);
        int potDef = Integer.parseInt(potenciadorDefensa);
        if(tipoDeArma.equals("de1mano")){
            tipodeArma = tipoArma.de1mano;
        }
        else if(tipoDeArma.equals("de2manos")){
            tipodeArma = tipoArma.de2manos;
        }
        super.setModDanio(potDanio);
        super.setModDefensa(potDef);
    }

    void editarArma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public int devolverModificadores() {
        return super.devolverAtaque();
    }
    
    
}
