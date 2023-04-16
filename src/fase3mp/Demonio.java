/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;

/**
 *
 * @author d.rubio.2019
 */
public class Demonio extends Esbirro implements IEsbirros{
    private ArrayList<Esbirro> esbirros;
    private boolean tienePacto;
    private Pacto pacto;
    
    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int devolverSalud () {
        int saludTotal = super.devolverSalud();
        if (tieneEsbirros()) {

            for (int i2 = 0; i2 <esbirros.size() ; i2++) {
                Esbirro esbirro = esbirros.get(i2);
                int saludEsbirro = esbirro.devolverSalud();
                saludTotal += saludEsbirro;
             }  
        }
        return saludTotal;
    }
    

    public boolean tieneEsbirros (){
        return esbirros.size() >0;

    }
}
