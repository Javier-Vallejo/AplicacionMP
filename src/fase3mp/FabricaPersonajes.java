package fase3mp;

public abstract class FabricaPersonajes {
    
    public  abstract Personaje  crearPersonaje(String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Debilidad[] debilidades,Fortaleza[] fortalezas);
      
}
