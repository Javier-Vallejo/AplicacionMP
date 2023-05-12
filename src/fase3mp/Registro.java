package fase3mp;


public class Registro {
    private ManagerUsuarios manager;
    
    public Registro(ManagerUsuarios manager){
        setManager(manager);
    }
    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
    }
     
    public Usuario registrarse(TipoUsuario rol){
        return null;   
    }
    
}
