/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public abstract class FabricaEsbirros {
    public Esbirro crearEsbirro(String nombre,
    int salud,boolean tienePacto,
    Pacto pacto,int dependencia, Humano.nivelLealtad lealtad){
        System.out.println("Escoja el tipo de esbirro a crear");
        Scanner escanerTipo = new Scanner(System.in);
        String tipoPersonaje = escanerTipo.nextLine();
        escanerTipo.close();
        switch(tipoPersonaje) { 
            case "Demonio":FabricaDemonio fabricaDemonio = new FabricaDemonio();
            return fabricaDemonio.crearEsbirro(nombre,salud,tienePacto,pacto);
            
            case "Ghoul":FabricaGhoul fabricaGhoul = new FabricaGhoul();
            return fabricaGhoul.crearEsbirro(nombre, salud,dependencia);
        
            case "Humano":FabricaHumano fabricaHumano = new FabricaHumano();
            return fabricaHumano.crearEsbirro(nombre,salud,lealtad);
    }   

        return null;
    }
    
}
