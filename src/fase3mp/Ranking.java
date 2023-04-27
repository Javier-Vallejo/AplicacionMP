/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author d.rubio.2019
 */
class Ranking {

    public ManagerUsuarios manager;
    public ArrayList<Map<Integer, String>> ordenados;

    public void consultarRanking() {
        Map<Integer, String> ranking = new HashMap<>();
        ordenados = new ArrayList<Map<Integer, String>>();
        ArrayList<Jugador> rankingG = new ArrayList<>();
        Usuario user;
        Jugador jugador;
        ArrayList<Usuario> lista = manager.getUsuariosRegistrados();
        for (int i = 0; i < lista.size(); i++) {
            user = (Usuario) lista.get(i);
            if (user.getRol() == TipoUsuario.Jugador) {
                jugador = (Jugador) user;
                rankingG.add(jugador);
                //ranking.put(jugador.getOro(), user.getNick());
                //ordenados.add(ranking);
            }
        }
        
        rankingG.sort(new ComparadorDeJugadores());
        System.out.println("====RANKING ACTUAL====");
        for (int i = 0; i < rankingG.size(); i++){
           System.out.println("Nick: "+ rankingG.get(i).getNick() + " --- Puntuacion: " + rankingG.get(i).getOro()); 
        }
        System.out.println("====================");
       /** Collections.reverse(ordenados);
        
        TreeMap<Integer, String> sorted = new TreeMap<>();
        sorted.putAll((Map<? extends Integer, ? extends String>) ordenados.get(0));
        System.out.println("--Aquí tiene el ranking actual del juego--");
        /**for (int j = 0; j < sorted.size(); j++) {
            System.out.println(sorted.values());
            System.out.println(sorted.keySet());
        }
        
        System.out.println(sorted.values());
        System.out.println(sorted.keySet());*/
    }

    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
    }

    public ArrayList<Map<Integer, String>> getOrdenados() {
        return ordenados;
    }

    public void setOrdenados(ArrayList<Map<Integer, String>> ordenados) {
        this.ordenados = ordenados;
    }

}

class ComparadorDeJugadores implements Comparator<Jugador>{
    ComparadorDeJugadores(){
        
    }
    
    @Override
    public int compare(Jugador user1, Jugador user2){
        return Integer.compare(user2.getOro(), user1.getOro());
    }
}
/*Asi? */
 /*
 * class Ranking {
    public ManagerUsuarios manager;
    public ArrayList<Map<Integer, String>> ordenados;
    
    public void consultarRanking() {
        Map<Integer, String> ranking = new HashMap<>();
        Usuario user;
        Jugador jugador;
        ArrayList<Usuario> lista = manager.getUsuariosRegistrados();
        for (int i = 0; i < lista.size(); i++) {
            user = lista.get(i);
            if (user.getRol() == TipoUsuario.Jugador) {
                jugador = (Jugador) user;
                ranking.put(jugador.getOro(), user.getNick());
            }
        }
        
        Map<Integer, String> sorted = new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(ranking);
        
        System.out.println("--Aquí tiene el ranking actual del juego--");
        int count = 0;
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println(entry.getValue() + " - " + entry.getKey());
            count++;
            if (count == 10) {
                break;
            }
        }
    }
}

 */
