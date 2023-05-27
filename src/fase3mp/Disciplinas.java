package fase3mp;

public class Disciplinas extends Habilidad {

    public Disciplinas(String nombre, int valorAtaque, int valorDefensa, int limitante) {
        super(nombre, valorAtaque, valorDefensa, limitante);
    }

    public int activar(String opcion) {
        if (opcion=="Ataque") {
            return 15;
        }
        else if (opcion == "Defensa") {
            return 10;
        }
        return 0;
    }
    
}
