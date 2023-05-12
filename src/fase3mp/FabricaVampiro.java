package fase3mp;

public class FabricaVampiro extends FabricaPersonajes{
    @Override
    public Personaje crearPersonaje (String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Debilidad[] debilidades,Fortaleza[] fortalezas) {
        Vampiro vampiro = new Vampiro(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas);
        return vampiro;
    }
}
