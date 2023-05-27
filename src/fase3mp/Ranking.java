package fase3mp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
            }
        }
        
        rankingG.sort(new ComparadorDeJugadores());
        System.out.println("====RANKING ACTUAL====");
        for (int i = 0; i < rankingG.size(); i++){
           System.out.println("Nick: "+ rankingG.get(i).getNick() + " --- Puntuacion: " + rankingG.get(i).getOro()); 
        }
        System.out.println("====================");

    }

    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
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
