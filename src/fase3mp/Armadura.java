/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Armadura extends Equipo implements IEquipo {

    public Armadura(String nombre, String potenciadorDanio, String potenciadorDefensa) {
        super.setNombre(nombre);
        int potDanio = Integer.parseInt(potenciadorDanio);
        int potDef = Integer.parseInt(potenciadorDefensa);
        super.setModDanio(potDanio);
        super.setModDefensa(potDef);
    }

    @Override
    public int devolverModificadores() {
        return super.devolverDefensa();
    }

    void editarArmadura(int opcion, String nombre, int potenciador) {
        // hay que decir en la documentacion que esto no estaba se lanzo el test y
        // despues ya se cambió
        // cuando se quiera enseñar que antes no habia nada se descomenta la linea de
        // abajo se ejecuta falla y luego se quita
        // throw new UnsupportedOperationException("Not supported yet."); 
        System.out.println("Que desea editar de la armadura");
        System.out.println("1. Nombre");
        System.out.println("2. Ataque");
        System.out.println("3. Defensa");

        

        switch (opcion) {
            case 1 -> {
    
                super.setNombre(nombre);
            }
            case 2 -> {

                super.setModDanio(potenciador);
            }
            case 3 -> {
                super.setModDefensa(potenciador);
            }

        }

    }
}
