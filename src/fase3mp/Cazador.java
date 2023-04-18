/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.lang.reflect.Array;

/**
 *
 * @author d.rubio.2019
 */
public class Cazador extends Personaje implements InterfazPersonaje{
    
    private int voluntad ;


    public Cazador (String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Array[] debilidades,Array[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder,debilidades,fortalezas);

        setVoluntad(voluntad);
    }

    @Override
    public Personaje clonar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculoDanio() {
        
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad) + voluntad;

    }

    @Override
    public int calculoDefensa() {
        Habilidad habilidad = devolverHabilidad();
        return  super.devolverDefensaArma() + habilidad.getValorDefensa();
    }

    private void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }
    
}
