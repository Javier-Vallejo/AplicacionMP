/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author david
 */
public class Usuario implements UsuariosANotificar{
    
    private String nombre;
    private String nick;
    private String password;
    private TipoUsuario rol;
    private State estadoObservador; //que es????
    private EntidadesActivas entidades;
    private DesafiosActivos desafiosAct;
    private ManagerUsuarios managerUsuarios;
    
    
    public Usuario(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador){//habria que pasarle un objeto ranking
        setNombre(nombre);
        setNick(nick);
        setPassword(password);
        setRol(rol);
        setEstadoObservador(estadoObservador);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }

    public State getEstadoObservador() {
        return estadoObservador;
    }

    public void setEstadoObservador(State estadoObservador) {
        this.estadoObservador = estadoObservador;
    }

    public EntidadesActivas getEntidades() {
        return entidades;
    }

    public void setEntidades(EntidadesActivas entidades) {
        this.entidades = entidades;
    }

    public DesafiosActivos getDesafiosAct() {
        return desafiosAct;
    }

    public void setDesafiosAct(DesafiosActivos desafiosAct) {
        this.desafiosAct = desafiosAct;
    }

    public ManagerUsuarios getManagerUsuarios() {
        return managerUsuarios;
    }

    public void setManagerUsuarios(ManagerUsuarios managerUsuarios) {
        this.managerUsuarios = managerUsuarios;
    }
    
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void DarseDeBaja(Usuario usuario){
        managerUsuarios.eliminarUsuario(usuario.getNick(), usuario.getPassword());    
    }
    
}