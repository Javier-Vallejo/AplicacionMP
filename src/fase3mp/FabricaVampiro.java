/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.lang.reflect.Array;

/**
 *
 * @author d.rubio.2019
 */
public class FabricaVampiro extends FabricaPersonajes{
    @Override
    public Personaje crearPersonaje (String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Array[] debilidades,Array[] fortalezas) {
        Vampiro vampiro = new Vampiro(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas);
        return vampiro;
    }
}
