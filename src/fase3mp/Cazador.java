/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Cazador extends Personaje{
    
    private int voluntad ;


    public Cazador (String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Debilidad[] debilidades,Fortaleza[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder,debilidades,fortalezas);
    }

    @Override
    public Personaje clonar() {
        Cazador cazadorCopia = new Cazador(super.getNombre(),super.getHabilidadPersonaje(), super.getArmas(), super.getArmasActivas(), super.getArmaduras(), super.getArmaduraActiva(), super.getEsbirros(), super.getSalud(), super.getPoder(), super.getDebilidades(), super.getFortalezas());
        return cazadorCopia;
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

    private void setVoluntad (int voluntad) {
        this.voluntad = voluntad;
    }
    
}
