/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

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

    public Jugador(String nombre, String nick, String password, TipoUsuario rol) {
        super(nombre, nick, password, rol);

        GenerarNumRegistro();
    }

    public Jugador(String nombre, String nick, String password, TipoUsuario rol, int oro) {
        super(nombre, nick, password, rol);
        this.oro = oro;
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

    private void Desafiar() {

    }

    private void AceptaroRechazarDesafio(Desafio desafio) {
        // System.out.println();
        try (Scanner lectura = new Scanner(System.in)) {
            int opcion = lectura.nextInt();

            if (opcion == 1) { // 1 es aceptar el desafio
                Combate combate = new Combate(desafio.getJugadorDesafiante(), this, desafio.getOroApostado());
                ArrayList<Ronda> rondas = new ArrayList<>();
                while ((combate.getVida2() > 0) && (combate.getVida1() > 0)) {
                    Ronda rondaX = combate.EmpezarRonda(combate.getPersonaje1(), combate.getPersonaje2(),
                            combate.getVida1(), combate.getVida2());
                    rondas.add(rondaX);
                }
                // Sujeto a cambios la manera de añadir las rondas a la clase combate
                Ronda[] misRondas = new Ronda[rondas.size()];
                misRondas = rondas.toArray(misRondas);
                combate.setRondas(misRondas);
                // Falta ver en que lista/estructura añadimos la ronda//combate
            }
        }
    }

    private void ConsultarOro() {

    }

    private void ConsultarRanking(Ranking ranking) {

    }

    private void ElegirPersonaje(EntidadesActivas entidades) {

    }

    private void GenerarNumRegistro() {// formato LNNLL
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
        setNumeroRegistro(numRegistro);
    }

    
    public void realizarFuncionMenuJugador(int opcion) {
        switch (opcion) {
            case 1:// Darse de baja
                DarseDeBaja(this);
                System.out.println("Saliendo del sistema.");
                System.exit(0);
            case 2://Registrar Personaje
                if (getPersonajeActivo() != null) {
                    System.out.println("El personaje que elijas sustituira al tuyo.");
                    System.out.println("¿Deseas continuar? Si o No");
                    String opcionSioNO = "";
                    try (Scanner escanerSioNo = new Scanner(System.in)) {
                        while (!(opcionSioNO.equals("SI") == false ^ opcionSioNO.equals("NO") == false)) {
                            System.out.println("¿Deseas continuar? Si o No");
                            opcionSioNO = escanerSioNo.nextLine();
                            opcionSioNO = opcionSioNO.toUpperCase();
                        }
                    }

                    if (opcionSioNO.equals("SI")) {
                        ArrayList<Integer> personaje = super.getEntidades().MostraryElegir("PERSONAJES");
                        setPersonajeActivo(super.getEntidades().elegirPersonaje(personaje.get(0)));// habra que hacer
                                                                                                   // que elegir
                                                                                                   // personaje llame a
                                                                                                   // clone
                    } else if (opcionSioNO.equals("NO")) {
                        System.out.println("Su personaje no se cambiara");
                    }
                } else {
                    ArrayList<Integer> personaje = super.getEntidades().MostraryElegir("PERSONAJES");
                    setPersonajeActivo(super.getEntidades().elegirPersonaje(personaje.get(0)));
                }
                super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                break;
            case 3:// Gestionar Personaje
                if (getPersonajeActivo() == null) {
                    System.out.println("No tienes ningun personaje activo");
                } else {
                    Personaje personaje = getPersonajeActivo();// debo poner un if por si no hay personaje guardado
                    personaje.editarPersonajeJugador(personaje, super.getEntidades());// nuevo metodo
                }
                super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                break;
            case 4:// Dar de baja Personaje
                setPersonajeActivo(null);
                super.getManagerUsuarios().editarUsuarioEnFichero(this.getNick(), this.getPassword());
                break;
            case 5:// Desafiar
                Desafio desafio = new Desafio();
                super.getDesafiosAct().guardarDesafio(desafio);
                break;
            case 6:// Consultar Oro
                System.out.println("Su oro actual es: " + getOro());
                break;
            case 7:// Consultar Ranking
                   // Esto va a cambiar, porque pondremos que el jugador tenga una propiedad
                   // ranking,-
                   // - entonces solo tendremos que actualizar el ranking de vez en cuando, no
                   // crear uno nuevo siempre.
                Ranking ranking = new Ranking();
                ranking.consultarRanking();
                break;
            case 8:// Salir
                System.out.println("Cerrando sesion y saliendo");
                System.exit(0);
                break;
        }
    }

}