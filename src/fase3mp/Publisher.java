package fase3mp;

import java.util.ArrayList;

public class Publisher {

    private ArrayList<Usuario> suscriptores;
    private OperadorSistema operador;
    
    public Publisher() {
        suscriptores = new ArrayList<>();
    }
    public void suscribirUsuario(Usuario usuario){
        suscriptores.add(usuario);
    }
    public void desSuscribirUsuario(Usuario usuario){
        suscriptores.remove(usuario);
    }
    public void notificarUsuario(Object objetoX){
        for (Usuario sus: suscriptores){
            sus.update(objetoX);
        }
    }

    public ArrayList<Usuario> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(ArrayList<Usuario> suscriptores) {
        this.suscriptores = suscriptores;
    }

    public OperadorSistema getOperador() {
        return operador;
    }

    public void setOperador(OperadorSistema operador) {
        this.operador = operador;
    }

    

}
