/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Esbirro  {
    private String nombre;
    private int salud;
    private Esbirro[] esbirros;


    public int devolverSalud () {
        int saludTotal = salud;
        if (tieneEsbirros()) {

            for (int i2 = 0; i2 <esbirros.length ; i2++) {
                Esbirro esbirro = esbirros[i2];
                int saludEsbirro = esbirro.devolverSalud();
                saludTotal += saludEsbirro;
             }  
        }
        return saludTotal;
    }

    public Esbirro[] devolverEsbirros () {
        return esbirros;
    }
    public boolean tieneEsbirros (){
        return esbirros.length >0;

    }
}
