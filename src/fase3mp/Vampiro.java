package fase3mp;

import java.util.Scanner;

public class Vampiro extends Personaje {

    private int sangre;
    private int edad;

    public Vampiro(String nombre, Habilidad habilidadPersonaje, Arma[] armas, Arma[] armasActivas, Armadura[] armaduras,
            Armadura armaduraActiva, Esbirro[] esbirros, int Salud, int Poder, Debilidad[] debilidades,
            Fortaleza[] fortalezas) {
        super(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder,
                debilidades, fortalezas);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public int getSangre() {
        return sangre;
    }

    void setSangre(int sangre) {
        this.sangre = sangre;
    }

    @Override
    public void rellenarPropiedadesEspecificas() {
        Scanner escanerVamp = new Scanner(System.in);
        System.out.println("Que cantidad de sangre quieres que tenga: ");
        sangre = escanerVamp.nextInt();
        escanerVamp.nextLine(); 
        System.out.println("Que edad quieres que tenga: ");
        Scanner escanerVampEdad = new Scanner(System.in);
        edad = escanerVampEdad.nextInt();
        escanerVampEdad.nextLine();
        
        
                            
    }

    @Override
    public Personaje clonar() {
        Vampiro vampiroCopia = new Vampiro(super.getNombre(), super.getHabilidadPersonaje(), super.getArmas(),
                super.getArmasActivas(), super.getArmaduras(), super.getArmaduraActiva(), super.getEsbirros(),
                super.getSalud(), super.getPoder(), super.getDebilidades(), super.getFortalezas());
        vampiroCopia.setSangre(sangre);
        vampiroCopia.setEdad(edad);
        return vampiroCopia;
    }

    public int dañoDeSangre(int sangre) {
        if (sangre >= 5) {
            return 2;
        }

        else {
            return 0;
        }
    }

    @Override
    public int calculoDanio() {
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverPoder() + super.devolverDañoArma() + super.devolverDañoHabilidad(habilidad)
                + dañoDeSangre(sangre) + activarDisciplina(sangre, "Ataque");
    }

    private int activarDisciplina(int sangre, String opcion) {
        Habilidad habilidad = super.devolverHabilidad();
        String nombre = habilidad.getNombre();
        int ataque = habilidad.getValorAtaque();
        int defensa = habilidad.getValorDefensa();
        int limitante = habilidad.getLimitante();
        Disciplinas disciplina = new Disciplinas(nombre, ataque, defensa, limitante);

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
        Habilidad habilidad = super.devolverHabilidad();
        return super.devolverDefensaArma() + habilidad.getValorDefensa() + activarDisciplina(sangre, "Defensa");
    }

}
