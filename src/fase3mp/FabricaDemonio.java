package fase3mp;

public class FabricaDemonio extends FabricaEsbirros {
    @Override
    public Esbirro crearEsbirro(String nombre, int salud) {
        Demonio demonio = new Demonio(nombre, salud);
        return demonio;
    }
}
