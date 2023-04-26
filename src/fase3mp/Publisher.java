/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;

/**
 *
 * @author d.rubio.2019
 */
public class Publisher {

    private ArrayList<Usuario> suscriptores;
    private OperadorSistema operador;

    public void notificarOperador() {

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
    
}
