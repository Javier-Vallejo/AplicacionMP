/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Comprobante {

    public int confirmarNumero(int opcionElegida) {
        Scanner escanerMain = new Scanner(System.in);
        int option = 0;
        boolean esNumero;
        do {
            try {
                option = escanerMain.nextInt();
                opcionElegida = option;
                esNumero = true;

            } catch (InputMismatchException ime) {
                System.out.println(">> Disculpe, ingrese un numero de la lista mostrada");
                escanerMain.nextLine();
                esNumero = false;
            }
        } while (!esNumero);
        return opcionElegida;
    }

}
