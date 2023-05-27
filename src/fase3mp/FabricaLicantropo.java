package fase3mp;

public class FabricaLicantropo extends FabricaPersonajes{
    @Override
    public Personaje crearPersonaje (String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Debilidad[] debilidades,Fortaleza[] fortalezas) {
        Licantropo licantropo = new Licantropo(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas);
        return licantropo;
    
}
}
