/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class Vampiro extends Personaje{
    
    private int sangre;
    private int edad;
    
    public Vampiro(String nombre, Habilidad habilidadPersonaje, Arma[] armas, Arma[] armasActivas, Armadura[] armaduras,
        Armadura armaduraActiva, Esbirro[] esbirros, int Salud, int Poder, Debilidad[] debilidades,Fortaleza[] fortalezas){           
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades,fortalezas);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSangre() {
        return sangre;
    }

    void setSangre(int sangre) {
        this.sangre = sangre;
    }

    @Override
    public void rellenarPropiedadesEspecificas() {
        try (Scanner escanerVamp = new Scanner(System.in)) {
            System.out.println("Que cantidad de sangre quieres que tenga: ");
            sangre = escanerVamp.nextInt();
            System.out.println("Que edad quieres que tenga: ");
            edad = escanerVamp.nextInt();
        }                    
    }
    
    
    
    
    @Override
    public Personaje clonar() {
        Vampiro vampiroCopia = new Vampiro(super.getNombre(),super.getHabilidadPersonaje(), super.getArmas(), super.getArmasActivas(), super.getArmaduras(), super.getArmaduraActiva(), super.getEsbirros(), super.getSalud(), super.getPoder(), super.getDebilidades(), super.getFortalezas());
        vampiroCopia.setSangre(sangre);
        vampiroCopia.setEdad(edad);
        return vampiroCopia;
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
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad)+ dañoDeSangre(sangre) + activarDisciplina(sangre,"Ataque");
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
