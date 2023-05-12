package fase3mp;

public class FabricaHumano extends FabricaEsbirros {
    @Override
    public Esbirro crearEsbirro(String nombre, int salud) {
        Humano humano = new Humano(nombre, salud);
        return humano;
    }
}
