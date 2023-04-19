/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Equipo {
    private String nombre;
    private int modDanio;
    private int modDefensa;

/* 
    public Equipo (String nombre,
     int modDanio,
     int modDefensa) {
        setNombre(nombre);
        setModDanio(modDanio);
        setModDefensa(modDefensa);


        en la creacion de armas no se tiene mucho en cuenta el constructor del padre así que lo creo pero lo dejo comentado 
        porque si no da error
    } */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModDanio() {
        return modDanio;
    }

    public void setModDanio(int modDanio) {
        this.modDanio = modDanio;
    }

    public int getModDefensa() {
        return modDefensa;
    }

    public void setModDefensa(int modDefensa) {
        this.modDefensa = modDefensa;
    }
    
    
    
    public int devolverAtaque () {
        return modDanio;
    }

    public int devolverDefensa () {
        return modDefensa;
    }
}
