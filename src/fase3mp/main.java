package fase3mp;

import java.io.IOException;

public class main {
    public static void main (String[] args) throws IOException {
        SistemaPrincipalGame sistemaPrincipal = SistemaPrincipalGame.obtenerInstancia();
        sistemaPrincipal.run();
        System.exit(0);
    }
    
}
