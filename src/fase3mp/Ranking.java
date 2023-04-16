/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author d.rubio.2019
 */
class Ranking {
    
    public ManagerUsuarios manager;
    public ArrayList<Map> ordenados;
    
    public void consultarRanking() {
        Map<Integer, String> ranking = new HashMap<>();
        Usuario user;
        Jugador jugador;
        ArrayList lista = manager.getUsuariosRegistrados();
        for (int i = 0; i < lista.size(); i++) {

            user = (Usuario) lista.get(i);
            if (user.getRol() == TipoUsuario.Jugador) {
                jugador = (Jugador) user;
                ranking.put(jugador.getOro(), user.getNick());
                ordenados.add(ranking);
            }
        TreeMap<Integer, String> sorted = new TreeMap<>();
        sorted.putAll((Map<? extends Integer, ? extends String>) ordenados);
            System.out.println("--Aquí tiene el ranking actual del juego--");            
            for (int j = 0; j < 10; j++) {
                System.out.println(sorted.get(j));
            }
        }
    }
}
