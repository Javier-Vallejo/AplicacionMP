/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.IOException;

/**
 *
 * @author d.rubio.2019
 */
public class Esbirro  {
    private String nombre;
    private int salud;
    
    public Esbirro(String nombre, int salud) {      
        setNombre(nombre);
        setSalud(salud);

    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    public void rellenarPropiedadesEspec() throws IOException{
        
    }
    

    
    
    
    
}
