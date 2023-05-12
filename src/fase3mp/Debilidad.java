package fase3mp;

/**
 *
 * @author d.rubio.2019
 */
public class Debilidad extends Modificador{

    
    public Debilidad(String nombre, int valor) {
        super(nombre, valor);
    }

    public int debilitar () {
        return super.getValor();
    }
}
