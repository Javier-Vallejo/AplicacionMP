/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Licantropo extends Personaje implements InterfazPersonaje{
    
    private int rabia;
    
    public Licantropo (String nombre, Habilidad habilidad, Arma[] armas, Arma[] armaActiva, Armadura[] armaduras, Armadura armaduraActiva, Esbirro[] esbirros, int salud, int poder, Debilidad[] debilidades, Fortaleza[] fortalezas, int rabia){
        
    
    }

    public Personaje crearPersonaje(){
        return null;
    }

    @Override
    public Personaje clonar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    @Override
    public int calculoDanio() {
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad) + habilidadActiva() + rabia;
    }

    private int habilidadActiva() {
        Dones dones  =  (Dones) super.devolverHabilidad();
        int danioBase = super.devolverDañoHabilidad(dones);
        if (rabia >= dones.getLimitante()) {
            return dones.activarDon(danioBase);
        }
        return 0;
    }
    
}