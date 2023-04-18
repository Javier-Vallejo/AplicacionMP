/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.lang.reflect.Array;

import fase3mp.Arma.tipoArma;
import fase3mp.Humano.nivelLealtad;

/**
 *
 * @author d.rubio.2019
 */
public class FabricaCazador extends FabricaPersonajes{
    
    
    public Personaje crearPersonaje(String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Array[] debilidades,Array[] fortalezas){
        
        Cazador cazador = new Cazador(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas);
        return cazador;
    }
    
}
