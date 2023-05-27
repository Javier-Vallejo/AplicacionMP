package fase3mp;

public class Debilidad extends Modificador{

    
    public Debilidad(String nombre, int valor) {
        super(nombre, valor);
    }

    public int debilitar () {
        return super.getValor();
    }
}
