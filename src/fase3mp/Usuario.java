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
    private FabricaPersonajes fabricaPersonajes;//habra que pasarselo en el constructor tambien
    private FabricaEsbirros fabricaEsbirros;
    private Desafio desafioPendiente;
    private Combate combateRealizado;
    private Ranking ranking;
    
    public Usuario(String nombre, String nick, String password, TipoUsuario rol, ManagerUsuarios manager){//habria que pasarle un objeto ranking
        setNombre(nombre);
        setNick(nick);
        setPassword(password);
        setRol(rol);
        setDesafioPendiente(null);
        setCombateRealizado(null);
        setManagerUsuarios(manager);
       // Desafio desafio = new Desafio();
        desafiosAct = new DesafiosActivos();
        setDesafiosAct(desafiosAct);
    }

    public FabricaEsbirros getFabricaEsbirros() {
        return fabricaEsbirros;
    }

    public Desafio getDesafioPendiente() {
        return desafioPendiente;
    }

    public void setDesafioPendiente(Desafio desafioPendiente) {
        this.desafioPendiente = desafioPendiente;
    }

    public Combate getCombateRealizado() {
        return combateRealizado;
    }

    public void setCombateRealizado(Combate combateRealizado) {
        this.combateRealizado = combateRealizado;
    }
    
    public FabricaPersonajes getFabricaPersonajes() {
        return fabricaPersonajes;
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

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }
    
    
    @Override
    public void update(Object objeto) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (objeto instanceof Desafio desafio){
            //System.out.println("Recibes un desafio: Quieres hacerlo?");
            setDesafioPendiente(desafio);
        } else if(objeto instanceof Combate combate){
            //System.out.println("Recibes el combate, muestra cada ronda");
            setCombateRealizado(combate);
        }
    }
    
    public void DarseDeBaja(Usuario usuario){
        //if (usuario instanceof OperadorSistema){
        managerUsuarios.eliminarUsuario(usuario.getNick(), usuario.getPassword());    
        //} else if (usuario instanceof Jugador){
            //SmanagerUsuarios.eliminarUsuario(nick, password);
        //}
            
    }

    
    
}
