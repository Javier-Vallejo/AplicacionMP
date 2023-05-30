package fase3mp;

import java.util.Scanner;

public class Cazador extends Personaje{
    
    private int voluntad ;


    public void rellenarPropiedadesEspecificas() {
        System.out.println("Introduzca el valor de voluntad: ");
        Scanner escanerCazador = new Scanner(System.in);

        int nuevaVoluntad = escanerCazador.nextInt();
        voluntad = nuevaVoluntad;
    }

    public Cazador (String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Debilidad[] debilidades,Fortaleza[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder,debilidades,fortalezas);
    }

    @Override
    public Personaje clone() {
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

    public void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }

    public int getVoluntad() {
        return voluntad;
    }
    
}
