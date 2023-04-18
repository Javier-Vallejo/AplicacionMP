/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public abstract class FabricaPersonajes {
    
    public  Personaje crearPersonaje(String nombre,Habilidad habilidadPersonaje,Arma[] armas,Arma[] armasActivas,Armadura[] armaduras, 
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Array[] debilidades,Array[] fortalezas, int propiedadExtra) {

        /*
         * Esta fabrica tiene las propiedades de un personaje base como parametros y una extra generica que luego se utiliza para generar el personaje concreto
         * Es decir esa propiedad extra luego en la fabrica concreta se interpretara como sangre si es una fabrica de vampiros, rabia si es de licantropos o voluntad si es de cazadores
         * Pero como a priori no sabes de que va a ser la he llamado propiedadExtra
         * 
         */

         /*
          * Para que se utilizen variables que luego se pasen a las fabricas concretas he tenido que pasarselas de base como parametros a la fabrica de personajes mas generica
          * Me suena que era una manera decente y que el profe dijo que mejor esto que ir tu escribiendo a mano los valores de cada personaje
          * Además de que creo recordar que de esta manera es mas facil testear (incluso recuerdo de hace 2 años de MP que si usa el metodo de escribir el scanner no te dejaba hacer testing por algun motivo)
          Aunque es muy posible que se puedan mejorar estas fabricas
          */


        System.out.println("Escoja el tipo de personaje a crear");
        Scanner escanerTipo = new Scanner(System.in);
        String tipoPersonaje = escanerTipo.nextLine();
        escanerTipo.close();
        switch(tipoPersonaje) { 
            case "Cazador":FabricaCazador fabricaCazador = new FabricaCazador();
            return fabricaCazador.crearPersonaje(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas,propiedadExtra);
                       
            
            case "Licantropo":FabricaLicantropo fabricaLicantropo = new FabricaLicantropo();
            return fabricaLicantropo.crearPersonaje(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas,propiedadExtra);
        
            case "Vampiro":FabricaVampiro fabricaVampiro = new FabricaVampiro();
            return fabricaVampiro.crearPersonaje(nombre, habilidadPersonaje, armas, armasActivas, armaduras, armaduraActiva, esbirros, Salud, Poder, debilidades, fortalezas,propiedadExtra);
    }   
      return null;
}
}