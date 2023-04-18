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
    Armadura armaduraActiva,Esbirro[] esbirros,int Salud,int Poder,Array[] debilidades,Array[] fortalezas) {


        System.out.println("Escoja el tipo de personaje a crear");
        Scanner escanerTipo = new Scanner(System.in);
        String tipoPersonaje = escanerTipo.nextLine();
        escanerTipo.close();
        switch(tipoPersonaje) { 
            
    }   
      return null;
}
}