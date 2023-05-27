package fase3mp;

public class FabricaGhoul extends FabricaEsbirros {
    @Override
    public Esbirro crearEsbirro(String nombre, int salud) {
        Ghoul ghoul = new Ghoul(nombre, salud);
        return ghoul;
    }
}
