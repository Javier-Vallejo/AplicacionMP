/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

/**
 *
 * @author david
 */
public class MenuOperador extends Menu {

    @Override
    public void mostrarOpciones(){
        System.out.println("1.Darse de baja");
        System.out.println("2.Editar Personaje");
        System.out.println("3.Aniadir Personaje");
        System.out.println("4.Validar Desafio");
        System.out.println("5.Banear Usuario");//a lo mejor viene bien un array de usuarios baneados en managerUsuarios
        System.out.println("6.Desbanear Usuario");
        System.out.println("7.Salir");
        System.out.println("Elija el numero por favor");
    }
    
}
