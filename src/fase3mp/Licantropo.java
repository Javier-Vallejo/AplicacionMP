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
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad) + activarDon(rabia,"Ataque") + rabia;
    }

    private int activarDon(int rabia, String opcion) {
        Dones dones  =  (Dones) super.devolverHabilidad();
        int danioBase = super.devolverDañoHabilidad(dones);
        if (rabia >= dones.getLimitante() && opcion == "Ataque") {
            return dones.activar(danioBase,opcion);
        }
        else if ((rabia >= dones.getLimitante() && opcion == "Defensa")) {
            return dones.activar(danioBase,opcion);
        }
        return 0;
    }

    @Override
    public int calculoDefensa() {
        Dones dones = (Dones) super.devolverHabilidad();
        return  super.devolverDefensaArma() + dones.getValorDefensa() + activarDon(rabia,"Defensa");
    }
    
}