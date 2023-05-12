package fase3mp;

public class Fortaleza extends Modificador{


    public Fortaleza(String nombre, int valor) {
        super(nombre, valor);
    }

    public int Fortalecer () {
        return super.getValor();
    }
    
}
