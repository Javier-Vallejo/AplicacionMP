/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author d.rubio.2019
 */
public class Jugador extends Usuario {

    private int oro;
    private Publisher notificador;
    private boolean estaBaneado;
    private Personaje personajeActivo;
    private String NumeroRegistro;
    private ManagerUsuarios manager;
    private Ranking rankingGlobal;

    public Jugador(String nombre, String nick, String password, TipoUsuario rol, ManagerUsuarios managerJ) {
        super(nombre, nick, password, rol, managerJ);
        manager = managerJ;
        generarNumRegistro();
        notificador = new Publisher();

    }

    public Jugador(String nombre, String nick, String password, TipoUsuario rol, int oro, ManagerUsuarios managerJ) {
        super(nombre, nick, password, rol, managerJ);
        this.oro = oro;
        manager = managerJ;
        generarNumRegistro();
        notificador = new Publisher();
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public Publisher getNotificador() {
        return notificador;
    }

    public void setNotificador(Publisher notificador) {
        this.notificador = notificador;
    }

    public boolean getEstaBaneado() {
        return estaBaneado;
    }

    public void setEstaBaneado(boolean estaBaneado) {
        this.estaBaneado = estaBaneado;
    }

    public Personaje getPersonajeActivo() {
        return personajeActivo;
    }

    public void setPersonajeActivo(Personaje personajeActivo) {
        this.personajeActivo = personajeActivo;
    }

    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
    }

    public Ranking getRankingGlobal() {
        return rankingGlobal;
    }

    public void setRankingGlobal(Ranking rankingGlobal) {
        this.rankingGlobal = rankingGlobal;
    }

    private void RegistrarPersonaje(Personaje personaje) {

    }

    private void GestionarPersonaje(Personaje personaje) {

    }

    private void DarDeBajaPersonaje(Personaje personaje) {

    }

    private void elegirArmasActivas() {
        Arma[] armasPersonaje = personajeActivo.getArmas();
        System.out.println("Elige el numero del arma o armas que va a tener como activas tu personaje: ");
        System.out.println("(Ten en cuenta que va a ser una de dos manos o dos de una mano)");

        try (Scanner escanerArmas = new Scanner(System.in)) {
            for (int i = 0; i < armasPersonaje.length; i++) {
                System.out.println(
                        i + "_" + armasPersonaje[i].getNombre() + armasPersonaje[i].getTipodeArma().toString());
            }
            System.out.println(armasPersonaje.length + 1 + " Salir");
            int numArmaActiva = 0;
            ArrayList<Arma> armasActivas = new ArrayList<>();// habria que hacer tambien un proceso para que pueda
            // quitarse
            // alguna que tenga activa
            while (numArmaActiva != armasPersonaje.length + 1) {
                numArmaActiva = escanerArmas.nextInt();
                if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de2manos && armasActivas.isEmpty()) {
                    armasActivas.add(armasPersonaje[numArmaActiva]);
                } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                        && armasActivas.isEmpty()) {
                    armasActivas.add(armasPersonaje[numArmaActiva]);
                } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                        && armasActivas.size() == 1) {
                    armasActivas.add(armasPersonaje[numArmaActiva]);
                } else {
                    System.out.println("El arma que intentas establecer como activa no cabe");
                }
            }
            armasPersonaje = (Arma[]) armasActivas.toArray();
            personajeActivo.setArmasActivas(armasPersonaje);
        }
    }

    private void elegirArmaduraActiva() {
        Armadura[] armadurasPersonaje = personajeActivo.getArmaduras();
        System.out.println("Elige el numero de la armadura que va tener activa: ");

        try (Scanner escanerArmaduras = new Scanner(System.in)) {

            for (int i = 0; i < armadurasPersonaje.length; i++) {
                System.out.println(i + "_" + armadurasPersonaje[i].getNombre());
            }
            System.out.println(armadurasPersonaje.length + 1 + " Salir");
            int numArmaduraActiva = 0;
            while (numArmaduraActiva != armadurasPersonaje.length + 1) {
                numArmaduraActiva = escanerArmaduras.nextInt();
            }
            personajeActivo.setArmaduraActiva(armadurasPersonaje[numArmaduraActiva]);
        }
    }

    private void Desafiar(Desafio desafioNuevo) {
        desafioNuevo.setJugadorDesafiante(this);
        ArrayList users = super.getManagerUsuarios().getUsuariosRegistrados();
        Scanner lectura = new Scanner(System.in);
        String eleccionSN = "";
        int elegido = -1;
        while (!eleccionSN.equals("si")) {
            System.out.println(">>>A qué jugador desea enfrentarse? (Ingrese el numero del jugador por favor)<<<");
            for (int i = 0; i < users.size(); i++) {
                Usuario usuarioX = (Usuario) users.get(i);
                if (usuarioX instanceof Jugador) {
                    System.out.println("Jugador " + i + ": " + usuarioX.getNick());
                }
            }
            elegido = lectura.nextInt();
            Usuario usuarioY = (Usuario) users.get(elegido);
            System.out.println("El jugador al que desea enfrentarse es el jugador" + elegido + " ,alias "
                    + usuarioY.getNick() + "? (Por favor indique si o no)");
            lectura = new Scanner(System.in);
            eleccionSN = lectura.nextLine();
            eleccionSN.toLowerCase();
        }
        Jugador jugElegido = (Jugador) users.get(elegido);
        desafioNuevo.setJugadorDesafiado(jugElegido);

        System.out.println("Cuanto oro desea apostar? (Recuerde que puede apostar 0)");
        System.out.println("La cantidad de oro que posee es: " + this.getOro());
        int oro = lectura.nextInt();
        if (oro > this.getOro() || oro < 0) {
            System.out.println("Error, debe ingresar una cantidad de oro que se encuentre en su posesión.");
            System.out.println("Cuanto oro desea apostar? (Recuerde que puede apostar 0)");
            System.out.println("La cantidad de oro que posee es: " + this.getOro());
            oro = lectura.nextInt();
        }
        System.out.println("Su peticion de desafio ha sido almacenada, le deseo mucha suerte en su batalla.");
        desafioNuevo.setOroApostado(oro);
    }

    // COMPROBAR SI DEBERIA SER PUBLICA O ESTA MAL - NECESARIA PUBLICA PARA ANTES
    // DEL MENU
    public void AceptaroRechazarDesafio(Desafio desafio) {
        System.out.println(">>>>>Desea aceptar o rechazar el siguiente desafio? Escriba la opcion numerica<<<<<");
        System.out.println("Desafiante: " + desafio.getJugadorDesafiante().getNick() + " Oro apostado: "
                + desafio.getOroApostado());
        System.out.println("1. Aceptar desafio // 2. Rechazar desafio");
        Scanner lectura = new Scanner(System.in);

        int opcion = lectura.nextInt();

        if (opcion == 1) { // 1 es aceptar el desafio
            ArrayList<Fortaleza> fortalezasElegidaDesafiante = this.getDesafioPendiente().getFElegDesafiante();
            ArrayList<Debilidad> debilidadesElegidaDesafiante = this.getDesafioPendiente().getDElegDesafiante();
            ArrayList<Fortaleza> fortalezasElegidaDesafiado = this.getDesafioPendiente().getFElegDesafiado();
            ArrayList<Debilidad> debilidadesElegidaDesafiado = this.getDesafioPendiente().getDElegDesafiado();

            this.setDesafioPendiente(null);
            // En algun momento hay que suscribir al usuario desafiado y desafiante
            Combate combate = new Combate(desafio.getJugadorDesafiante(), this, desafio.getOroApostado());
            ArrayList<Ronda> rondas = new ArrayList();
            while ((combate.getVida2() > 0) && (combate.getVida1() > 0)) {
                Ronda rondaX = combate.EmpezarRonda(combate.getPersonaje1(), combate.getPersonaje2(),
                        combate.getVida1(), combate.getVida2(), fortalezasElegidaDesafiante,
                         debilidadesElegidaDesafiante,
                         fortalezasElegidaDesafiado,
                        debilidadesElegidaDesafiado);
                rondas.add(rondaX);
            }
            // EMPATE
            if (combate.getVida1() == 0 && combate.getVida2() == 0) {
                combate.setVencedor("EMPATE - NO HUBO NINGÚN GANADOR");
            }
            // Setear el jugador vencedor
            if (combate.getVida1() == 0 && combate.getVida2() > 0) {
                combate.setVencedor(combate.getDesafiado().getNick());
            } else if (combate.getVida2() == 0 && combate.getVida1() > 0) {
                combate.setVencedor(combate.getDesafiante().getNick());
            }

            // Sumar y restar el dinero apostado
            // combate.getVencedor().setOro(combate.getVencedor().getOro() +
            // combate.getOroGanado() + 10);
            // TODO - Restar y sumar el oro a perdedor y ganador
            if (combate.getVencedor().equals(combate.getDesafiante().getNick())) {
                combate.getDesafiado().setOro(combate.getDesafiado().getOro() - combate.getOroGanado());
                combate.getDesafiante().setOro(combate.getDesafiante().getOro() + combate.getOroGanado() + 10);
                if (combate.getDesafiado().getOro() < 0) {
                    combate.getDesafiado().setOro(0);
                }
            } else {
                combate.getDesafiante().setOro(combate.getDesafiante().getOro() - combate.getOroGanado());
                combate.getDesafiado().setOro(combate.getDesafiado().getOro() + combate.getOroGanado() + 10);
                if (combate.getDesafiante().getOro() < 0) {
                    combate.getDesafiante().setOro(0);
                }
            }

            Ronda[] misRondas = new Ronda[rondas.size()];
            misRondas = rondas.toArray(misRondas);
            combate.setRondas(misRondas);
            notificador.suscribirUsuario(combate.getDesafiado());
            notificador.suscribirUsuario(combate.getDesafiante());
            notificador.notificarUsuario(combate);

            notificador.desSuscribirUsuario(combate.getDesafiado());
            notificador.desSuscribirUsuario(combate.getDesafiante());

            // Falta ver en que lista/estructura añadimos la ronda//combate
        } else if (opcion == 2) { // Rechaza el desafio
            this.setOro((int) (this.getOro() - (this.getOro() * 0.1)));
            this.setDesafioPendiente(null);
        }
    }

    private void ElegirPersonaje(EntidadesActivas entidades) {
        // TODO
    }

    // COMPROBAR SI DEBERIA SER PUBLICA O ESTA MAL - NECESARIA PUBLICA PARA ANTES
    // DEL MENU
    public void resultadosCombate(Combate combate) {
        Ronda rondaX;
        System.out.println(">=====RESULTADOS DEL COMBATE=====<");
        System.out.println(">Jugador desafiante: " + combate.getDesafiante().getNick());
        System.out.println(">Jugador desafiado: " + combate.getDesafiado().getNick());
        System.out.println(">Ganador del combate: " + combate.getVencedor());
        System.out.println(">Oro apostado: " + combate.getOroGanado());
        for (int i = 0; i < combate.getRondas().length; i++) {
            rondaX = combate.getRondas()[i];
            System.out.println("-----Ronda " + (i + 1) + ": -----");
            System.out.println("Potencial del jugador Desafiante " + rondaX.getPotencialPer1());
            System.out.println("Potencial del jugador Desafiado " + rondaX.getPotencialPer2());
            System.out.println("Vida Desafiante: " + rondaX.getVidaDesafiante());
            System.out.println("Vida Desafiado: " + rondaX.getVidaDesafiado());
        }
        setCombateRealizado(null);
    }

    private void generarNumRegistro() {// formato LNNLL
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        // ahora genero la primera letra
        char letra1 = letras.charAt(rand.nextInt(letras.length()));
        sb.append(letra1);
        // genero los dos numeros
        for (int i = 0; i < 2; i++) {
            int numero = rand.nextInt(10);
            sb.append(numero);
        }
        // genero las ultimas 2 letras
        char letra2 = letras.charAt(rand.nextInt(letras.length()));
        char letra3 = letras.charAt(rand.nextInt(letras.length()));
        sb.append(letra2);
        sb.append(letra3);
        String numRegistro = sb.toString();
        if (manager.existeNumRegistro(numRegistro)) {
            generarNumRegistro();
        } else {
            setNumeroRegistro(numRegistro);
        }

    }

    public void persistenciaDesafio(Desafio desafio) throws IOException {
        StringBuilder sb = new StringBuilder();
        rellenarStringBuilderDesafio(sb, desafio);
        File file = new File("Ficheros/Desafios.txt");
        FileWriter escritorFich = new FileWriter("Ficheros/Desafios.txt",true);
        //
        /* BufferedWriter bw = new BufferedWriter(escritorFich);
        bw.newLine(); */

        BufferedReader br = new BufferedReader(new FileReader(file));
            if (br.readLine() != null) {
                escritorFich.write("\n");
            }
        br.close();
        escritorFich.write(sb.toString());
       
        
        escritorFich.flush();
    }

    private void rellenarStringBuilderDesafio(StringBuilder sb, Desafio desafio) {

        sb.append("Desafio:");
        sb.append(" ");
        sb.append(desafio.getJugadorDesafiante().getNick());
        sb.append(" ");
        sb.append(desafio.getJugadorDesafiado().getNick());
        sb.append(" ");
        sb.append(desafio.getOroApostado());
        
    }

    public void realizarFuncionMenuJugador(int opcion) throws IOException {
        // manager = super.getManagerUsuarios(); //un if para saber si el usuario tiene
        // algun desafio pendiente que aceptar
        // rankingGlobal = super.getRanking();
        // si lo tiene, ¿hacemos notificar? para que se escriba la informacion del
        // desafio
        /**
         * if (this.getCombateRealizado() != null){
         * this.resultadosCombate(this.getCombateRealizado());
         * this.setCombateRealizado(null);
         * notificador.desSuscribirUsuario(this); } if
         * (this.getDesafioPendiente()!= null){
         * this.AceptaroRechazarDesafio(this.getDesafioPendiente());
         * }
         */
        switch (opcion) {
            case 1:// Darse de baja
                System.out.println("¿Seguro que desea darse de baja?");
                System.out.println("- 1.Si");
                System.out.println("- 2.No");
                int opcionDarseDeBaja = 0;
                Scanner escanerDarseBaja = new Scanner(System.in);
                while (!(opcionDarseDeBaja != 1 ^ opcionDarseDeBaja != 2)) {
                    System.out.println("Por favor, introduzca el numero de la opcion que desea.");
                    opcionDarseDeBaja = escanerDarseBaja.nextInt();
                }

                if (opcionDarseDeBaja == 1) {
                    DarseDeBaja(this);
                    System.out.println("Saliendo del sistema.");
                    System.exit(0);
                } else if (opcionDarseDeBaja == 2) {
                    System.out.println("Volviendo al menu principal.");
                    break;
                }

            case 2:// Registrar Personaje
                if (getPersonajeActivo() != null) {
                    System.out.println("El personaje que elijas sustituira al tuyo.");
                    System.out.println("¿Deseas continuar?");
                    System.out.println("- 1.Si");
                    System.out.println("- 2.No");
                    int opcionSioNO = 0;
                    Scanner escanerSioNo = new Scanner(System.in);
                    while (!(opcionSioNO != 1 ^ opcionSioNO != 2)) {
                        System.out.println("Por favor, introduzca el numero de la opcion que desea.");
                        opcionSioNO = escanerSioNo.nextInt();

                    }

                    if (opcionSioNO == 1) {
                        ArrayList<Integer> personaje = super.getEntidades().MostraryElegir("PERSONAJES");
                        setPersonajeActivo(super.getEntidades().elegirPersonaje(personaje.get(0)));// habra que hacer
                        // que elegir
                        // personaje llame a
                        // clone
                        super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                    } else if (opcionSioNO == 2) {
                        System.out.println("Su personaje no se cambiara.");
                    }
                } else {
                    ArrayList<Integer> personaje = super.getEntidades().MostraryElegir("PERSONAJES");
                    setPersonajeActivo(super.getEntidades().elegirPersonaje(personaje.get(0)));
                    super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                }

                break;
            case 3:// Gestionar Personaje
                if (getPersonajeActivo() == null) {
                    System.out.println("No tienes ningun personaje activo");
                } else {
                    Personaje personaje = getPersonajeActivo();
                    personaje.editarPersonajeJugador(personaje, super.getEntidades());
                }
                super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                break;
            case 4:// Dar de baja Personaje
                setPersonajeActivo(null);
                super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                break;
            case 5:// Desafiar
                Desafio desafio = new Desafio();
                this.Desafiar(desafio);
                // super.getDesafiosAct().guardarDesafio(desafio); Esta linea en teoria sobra
                // porque como operador siempre leemos todos los desafios del fichero
                persistenciaDesafio(desafio);
                break;
            case 6:// Consultar Oro
                System.out.println("Su oro actual es: " + getOro());
                break;
            case 7: // Consultar Ranking
                rankingGlobal.consultarRanking();
                break;
            case 8:// Salir
                System.out.println("Cerrando sesion");
                break;
        }
    }

}
