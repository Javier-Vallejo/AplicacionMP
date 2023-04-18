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
public class Vampiro extends Personaje implements InterfazPersonaje{
    
    public Vampiro(String nombre, Habilidad habilidadPersonaje, Arma[] armas, Arma[] armasActivas, Armadura[] armaduras,
            Armadura armaduraActiva, Esbirro[] esbirros, int Salud, int Poder, Array[] debilidades,
            Array[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades,
                fortalezas);
        
                
        
    }




    




    private int sangre;

    private void setSangre(int sangre) {

        this.sangre = sangre;
    }

    @Override
    public Personaje clonar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int dañoDeSangre (int sangre) {
        if (sangre >= 5) {
            return 2;
        }
            
        else{
            return 0;
        }
}

    @Override
    public int calculoDanio() {
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad)+ dañoDeSangre(sangre) + activarDisciplina(sangre,"Defensa");
    }

    private int activarDisciplina(int sangre, String opcion) {
        Disciplinas disciplina  =  (Disciplinas) super.devolverHabilidad();

        if (sangre >= disciplina.getLimitante() && opcion.equals("Ataque")) {
                return disciplina.activar(opcion);
        }

        else if (sangre >= disciplina.getLimitante() && opcion.equals("Defensa")) {
                return disciplina.activar(opcion);
        }

        return 0;
    }

    


    @Override
    public int calculoDefensa() {
        Disciplinas disciplina  =  (Disciplinas) super.devolverHabilidad();
        return  super.devolverDefensaArma() + disciplina.getValorDefensa() + activarDisciplina(sangre,"Defensa");
    }
    
}
