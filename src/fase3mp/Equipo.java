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
