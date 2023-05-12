package fase3mp;

public class FabricaArmaduras extends FabricaEquipo{

    @Override
    public Equipo crearEquipo(String nombre, String modDanio, String modDefensa) {
        Armadura armadura = new Armadura(nombre, modDanio, modDefensa);
         return armadura;

    }

    
}
