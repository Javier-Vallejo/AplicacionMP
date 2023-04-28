/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;

import fase3mp.Arma.tipoArma;

/**
 *
 * @author d.rubio.2019
 */
public class OperadorSistema extends Usuario {

    private Publisher notificador;
    private ManagerUsuarios manager;
    private EntidadesActivas entidades;

    public OperadorSistema(String nombre, String nick, String password, TipoUsuario rol, ManagerUsuarios manager) {
        super(nombre, nick, password, rol, manager);
        this.manager = manager;
        entidades = super.getEntidades();
    }

    public Publisher getNotificador() {
        return notificador;
    }

    public void setNotificador(Publisher notificador) {
        this.notificador = notificador;
    }

    public ManagerUsuarios getManager() {
        return manager;
    }

    public void setManager(ManagerUsuarios manager) {
        this.manager = manager;
    }

    public Arma CrearArma(String nombre, String modDanio, String modDefensa, String tipoArma) throws IOException {
        Arma arma = new Arma(nombre, modDanio, modDefensa, modDefensa);// como ha dejado pasar dos strings si son
                                                                       // enteros
        if (tipoArma.equals("1mano")) {
            arma.setTipodeArma(Arma.tipoArma.de1mano);
        } else if (tipoArma.equals("2manos")) {
            arma.setTipodeArma(Arma.tipoArma.de2manos);
        } else {
            arma.setTipodeArma(null);
        }
        super.getEntidades().aniadir(arma);
        StringBuilder sb = new StringBuilder();
        rellenarStringBuilderArma(sb, arma);
        FileWriter escritorFich = new FileWriter("Ficheros/Entidades.txt");
        escritorFich.write(sb.toString());
        return arma;
    }

    private void rellenarStringBuilderArma(StringBuilder sb, Arma arma) {
        sb.append("arma");
        sb.append(" ");
        sb.append(arma.getNombre());
        sb.append(" ");
        sb.append(arma.getModDanio());
        sb.append(" ");
        sb.append(arma.getModDefensa());
        sb.append(" ");
        sb.append(arma.getTipodeArma().toString());
    }

    public Armadura CrearArmadura(String nombre, String modDanio, String modDefensa) throws IOException {
        Armadura armadura = new Armadura(nombre, modDanio, modDefensa);
        super.getEntidades().aniadir(armadura);
        StringBuilder sb = new StringBuilder();
        rellenarStringBuilderArmadura(sb, armadura);
        FileWriter escritorFich = new FileWriter("Ficheros/Entidades.txt");
        escritorFich.write(sb.toString());
        return armadura;
    }

    private void rellenarStringBuilderArmadura(StringBuilder sb, Armadura armadura) {
        sb.append("armadura");
        sb.append(" ");
        sb.append(armadura.getNombre());
        sb.append(" ");
        sb.append(armadura.getModDanio());
        sb.append(" ");
        sb.append(armadura.getModDefensa());
        sb.append(" ");
    }

    private void aniadirPersonaje() throws IOException {
        File ficheroPersonajes = new File("Ficheros/Personajes.txt");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre del personaje:");
        String nombreCarac = lectura.nextLine();
        // armas

        System.out.println("Desea crear un arma de 0 o elegirla del sistema: ");
        System.out.println("1- Crearla ");
        System.out.println("2- Elegirla de las que hay en el sistema");
        Scanner lecturaArma = new Scanner(System.in);
        int opcionArma = lecturaArma.nextInt();
        lecturaArma.close();
        ArrayList<Arma> mochilaArmasPersonaje = new ArrayList<>();// habria que hacer el array de armas actual a
                                                                  // arraylist, lo añades y vuelves a array normal
        /*
         * Si hay que añadirle un arma a su mochila primero se deberia considerar su
         * tamaño, de primeras he pensado
         * que tenga el tamaño de la lista de armas que haya en entidas activas
         * Luego si le das a escoger de las que ya hay, ese tamaño se recalculará con
         * el:
         * armasPersonaje = new Arma[armasEleg.size()]; O al menos debería.
         * De momento esa es mi interpretación. Y ya dentro de eso el meterle un arma ya
         * creada se la asignnara en la posicion 0. Si no os chola ya lo rediseñais como
         * veais.
         * Con armaaduras es el mismo caso.
         * En ambas se debería insertar bien tanto en fichero como en entidades.
         * EN el fichero me he fijado que su formato es con espacios así que así deberia
         * andar buenardo.
         * Quizás rentaria que fuera un arrayList
         * Y así es mas como "añadir el arma"
         */
        switch (opcionArma) {
            case 1 -> {
                Scanner lecturaValoresArma = new Scanner(System.in);
                System.out.println("Escriba el nombre del arma");
                String nombre = lecturaValoresArma.nextLine();
                System.out.println("Escriba su ataque");
                String danio = lecturaValoresArma.nextLine();
                System.out.println("Escriba su defensa");
                String defensa = lecturaValoresArma.nextLine();
                System.out.println("Escriba si es de 1 o 2 manos");
                String tipo = lecturaValoresArma.nextLine();
                Arma arma = CrearArma(nombre, danio, defensa, tipo);
                lecturaValoresArma.close();
                mochilaArmasPersonaje.add(arma);
            }

            case 2 -> {
                System.out.println("Escriba los numeros de las armas que quiere que tenga su personaje: ");
                ArrayList<Integer> armasEleg = super.getEntidades().MostraryElegir("ARMAS");
                // Arma[] armasPersonajeArray = mochilaArmasPersonaje.toArray(new
                // Arma[armasEleg.size()]);

                for (int i = 0; i < armasEleg.size(); i++) {
                    // armasPersonajeArray[i] = super.getEntidades().elegirArma(armasEleg.get(i));
                    mochilaArmasPersonaje.add(super.getEntidades().elegirArma(armasEleg.get(i)));
                }
            }

        }
        Arma[] armasPersonaje = mochilaArmasPersonaje.toArray(new Arma[0]);
        // armas activas
        System.out.println("Elige el numero del arma o armas que va a tener como activas: ");
        System.out.println("(Ten en cuenta que va a ser una de dos manos o dos de una mano)");

        for (int i = 0; i < armasPersonaje.length; i++) {
            System.out.println(i + "_" + armasPersonaje[i].getNombre() + armasPersonaje[i].getTipodeArma().toString());
        }
        System.out.println(armasPersonaje.length + " Salir");
        int numArmaActiva = 0;
        ArrayList<Arma> armasActivas = new ArrayList<>();
        while (numArmaActiva != armasPersonaje.length) {
            numArmaActiva = lectura.nextInt();
            if (!(numArmaActiva == armasPersonaje.length)) {
                if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de2manos
                        && armasActivas.isEmpty()) {
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
        }
        Arma[] armasActivasPersonaje = armasActivas.toArray(new Arma[0]);

        // armaduras

        System.out.println("Desea crear una armadura de 0 o elegirla del sistema: ");
        System.out.println("1- Crear la armadura ");
        System.out.println("2- Elegir armaduras del sistema");
        ArrayList<Armadura> mochilaArmadurasPersonaje = new ArrayList<>();
        Scanner lecturaArmadura = new Scanner(System.in);
        int opcionArmadura = lecturaArmadura.nextInt();
        lecturaArmadura.close();

        switch (opcionArmadura) {
            case 1 -> {

                Scanner lecturaValoresArmadura = new Scanner(System.in);
                System.out.println("Escriba el nombre de la armadura");
                String nombre = lecturaValoresArmadura.nextLine();
                System.out.println("Escriba su ataque");
                String danio = lecturaValoresArmadura.nextLine();
                System.out.println("Escriba su defensa");
                String defensa = lecturaValoresArmadura.nextLine();
                Armadura armadura = CrearArmadura(nombre, danio, defensa);
                mochilaArmadurasPersonaje.add(armadura);
                lecturaValoresArmadura.close();

            }

            case 2 -> {
                System.out.println("Escriba el numero de la armadura que quiere que tenga su personaje: ");
                ArrayList<Integer> armadurasEleg = super.getEntidades().MostraryElegir("ARMADURAS");
                // Armadura[] armadurasArrayPersonaje = new Armadura[armadurasEleg.size()];
                for (int i = 0; i < armadurasEleg.size(); i++) {
                    // armadurasArrayPersonaje[i] =
                    // super.getEntidades().elegirArmadura(armadurasEleg.get(i));
                    mochilaArmadurasPersonaje.add(super.getEntidades().elegirArmadura(armadurasEleg.get(i)));
                }
            }

        }
        Armadura[] armadurasPersonaje = mochilaArmadurasPersonaje.toArray(new Armadura[0]);

        // armadura activa
        System.out.println("Elige el numero de la armadura que va tener activa: ");
        for (int i = 0; i < armadurasPersonaje.length; i++) {
            System.out.println(i + "_" + armadurasPersonaje[i].getNombre());
        }
        System.out.println(armadurasPersonaje.length + " Salir");
        int numArmaduraActiva = 0;
        Armadura armaduraActivaPersonaje = null;
        while (numArmaduraActiva != armadurasPersonaje.length) {
            numArmaduraActiva = lectura.nextInt();
            if (!(numArmaduraActiva == armadurasPersonaje.length)) {
                armaduraActivaPersonaje = armadurasPersonaje[numArmaduraActiva];
            }
        }
        // fortaleza
        System.out.println("Escriba el numero de la/las fortaleza/fortalezas que quiere que tenga su personaje: ");
        ArrayList<Integer> fortalezasEleg = super.getEntidades().MostraryElegir("FORTALEZAS");
        Fortaleza[] fortalezasPersonaje = new Fortaleza[fortalezasEleg.size()];
        for (int i = 0; i < fortalezasEleg.size(); i++) {
            fortalezasPersonaje[i] = super.getEntidades().elegirFortaleza(fortalezasEleg.get(i));
        }
        // debilidad
        System.out.println("Escriba el numero de la/las debilidad/debilidades que quiere que tenga su personaje: ");
        ArrayList<Integer> debilidadesEleg = super.getEntidades().MostraryElegir("DEBILIDADES");
        Debilidad[] debilidadesPersonaje = new Debilidad[debilidadesEleg.size()];
        for (int i = 0; i < debilidadesEleg.size(); i++) {
            debilidadesPersonaje[i] = super.getEntidades().elegirDebilidad(debilidadesEleg.get(i));
        }

        // salud personaje
        System.out.println("Escriba la salud del personaje: [Limitada entre 1 y 5]");
        int saludPersonaje = lectura.nextInt();
        while (saludPersonaje < 1 && saludPersonaje > 5) {
            System.out.println("El valor de salud debe estar entre 1 y 5");
            System.out.println("Por favor introduzca el valor de nuevo: ");
            saludPersonaje = lectura.nextInt();
        }
        // poder personaje
        System.out.println("Escriba el poder del personaje: [Limitado entre 1 y 5]");
        int poderPersonaje = lectura.nextInt();
        while (poderPersonaje < 1 && poderPersonaje > 5) {
            System.out.println("El valor de poder debe estar entre 1 y 5");
            System.out.println("Por favor introduzca el valor de nuevo: ");
            poderPersonaje = lectura.nextInt();
        }

        // habilidad
        System.out.println("Escriba el numero de la habilidad que quiere que tenga su personaje: ");
        int habilidadElegida = super.getEntidades().MostraryElegirHabilidad();
        Habilidad habilidadPersonaje = super.getEntidades().getHabilidades().get(habilidadElegida);

        // Esbirros
        FabricaEsbirros fabricaEsbirros = super.getFabricaEsbirros();
        ArrayList<Esbirro> esbirrosPers = new ArrayList<>();
        int eleccionEsbirro = 0;
        while (eleccionEsbirro != 4) {
            System.out.println("Desea elegir esbirros que esten en el sistema o crear nuevos: ");
            System.out.println("1-Aniadir conjunto del sistema ");
            System.out.println("2-Crear nuevos "); // habra que añadirlos a entidades activas
            System.out.println("3-Aniadir un esbirro del sistema");
            System.out.println("4-Salir");
            eleccionEsbirro = lectura.nextInt();
            switch (eleccionEsbirro) {
                case 1 -> {
                    ArrayList<Integer> esbirros = super.getEntidades().MostraryElegir("ESBIRROS");
                    for (int i = 0; i < esbirros.size(); i++) {
                        esbirrosPers.add(super.getEntidades().obtenerEsbirro(esbirros.get(i)));
                    }
                }
                case 2 -> {
                    String tipoEsbirro = "";
                    while (!tipoEsbirro.equals("salir")) {
                        System.out.println("Va a crear un nuevo esbirro");
                        System.out.println("Escriba el tipo de esbirro que desea introducirle: ");
                        System.out.println("Las opciones son Humano, Ghoul y Demonio. Escriba salir para terminar.");
                        lectura.nextLine();
                        tipoEsbirro = lectura.nextLine();
                        tipoEsbirro = tipoEsbirro.toLowerCase().trim();
                        if (!(tipoEsbirro.equals("salir"))) {
                            System.out.println("Introduzca el nombre que le quiere poner al esbirro: ");
                            String nombreEsbirro = lectura.nextLine();
                            System.out.println("Introduzca la salud del esbirro: ");
                            int saludEsbirro = lectura.nextInt();

                            switch (tipoEsbirro) { // se deberia poder elegir si crear nuevos esbirros o elegir
                                                   // algunos del sistema
                                case "humano" -> {
                                    fabricaEsbirros = new FabricaHumano();
                                    Humano humano = (Humano) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                                    humano.rellenarPropiedadesEspec();
                                    super.getEntidades().aniadir(humano);
                                    esbirrosPers.add(humano);
                                    super.getEntidades().GuardarEsbirroFichero(humano);
                                }
                                case "ghoul" -> {
                                    fabricaEsbirros = new FabricaGhoul();
                                    Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                                    ghoul.rellenarPropiedadesEspec();
                                    super.getEntidades().aniadir(ghoul);
                                    esbirrosPers.add(ghoul);
                                    super.getEntidades().GuardarEsbirroFichero(ghoul);
                                }
                                case "demonio" -> {
                                    fabricaEsbirros = new FabricaDemonio();
                                    Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsbirro,
                                            saludEsbirro);
                                    demonio.setFabricaEsbirros(super.getFabricaEsbirros());
                                    demonio.setEntidades(super.getEntidades());
                                    demonio.rellenarPropiedadesEspec();
                                    super.getEntidades().aniadir(demonio);
                                    esbirrosPers.add(demonio);
                                    super.getEntidades().GuardarEsbirroFichero(demonio);
                                }
                                default -> {
                                    System.out.println("Nombre de esbirro no correcto");
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    ArrayList<Integer> esbirroEle = super.getEntidades().MostraryElegir("ESBIRRO");
                    esbirrosPers.add(super.getEntidades().obtenerEsbirro(esbirroEle.get(0)));
                }
                case 4 -> {
                    System.out.println("No se aniadiran mas esbirros");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        }
        Esbirro[] esbirrosPersonaje = esbirrosPers.toArray(new Esbirro[0]);
        // tipo personaje
        System.out.println("Que tipo de personaje desea crear? - Escriba el numero de su tipo:");
        System.out.println("1. Licantropo --- 2. Vampiro --- 3.Cazador");
        // habria que poner un while por si mete otro valor
        Integer leido = lectura.nextInt();
        FileWriter escritorFich = new FileWriter(ficheroPersonajes);
        FabricaPersonajes fabricaPersonajes = super.getFabricaPersonajes();
        StringBuilder sb = new StringBuilder();
        switch (leido) {
            case 1 -> {
                // creamos un licantropo
                sb.setLength(0);
                fabricaPersonajes = new FabricaLicantropo();
                Licantropo licanNuevo = (Licantropo) fabricaPersonajes.crearPersonaje(nombreCarac,
                        habilidadPersonaje,
                        armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                        esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                        fortalezasPersonaje);
                licanNuevo.rellenarPropiedadesEspecificas();
                super.getEntidades().aniadir(licanNuevo);
                rellenarStringBuilder(sb, licanNuevo);
                escritorFich.write(sb.toString()); // habra que convertir las propiedades que no sean string
            }
            case 2 -> {
                // creamos un vampiro
                sb.setLength(0);
                fabricaPersonajes = new FabricaVampiro();
                Vampiro vampNuevo = (Vampiro) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje,
                        armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                        esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                        fortalezasPersonaje);
                vampNuevo.rellenarPropiedadesEspecificas();
                super.getEntidades().aniadir(vampNuevo);
                rellenarStringBuilder(sb, vampNuevo);
                escritorFich.write(sb.toString());
            }
            case 3 -> {
                // creamos un cazador
                sb.setLength(0);
                fabricaPersonajes = new FabricaCazador();
                Cazador cazNuevo = (Cazador) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje,
                        armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                        esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                        fortalezasPersonaje);
                super.getEntidades().aniadir(cazNuevo);
                rellenarStringBuilder(sb, cazNuevo);
                escritorFich.write(sb.toString());
            }
        }

        // }

    }

    private void rellenarStringBuilder(StringBuilder sb, Personaje personaje) {//hay que cambiar la forma de guardar los esbirros
        if (personaje instanceof Vampiro) {
            sb.append("vampiro;");
        } else if (personaje instanceof Licantropo) {
            sb.append("licantropo;");
        } else if (personaje instanceof Cazador) {
            sb.append("cazador;");
        }
        sb.append(personaje.getNombre());
        sb.append(";");
        sb.append(personaje.getHabilidadPersonaje().getNombre());
        sb.append("/");
        sb.append(personaje.getHabilidadPersonaje().getValorAtaque());
        sb.append("/");
        sb.append(personaje.getHabilidadPersonaje().getValorDefensa());
        sb.append("/");
        sb.append(personaje.getHabilidadPersonaje().getLimitante());
        sb.append(";");

        // armas
        Arma[] armas = personaje.getArmas();
        for (int i = 0; i < armas.length; i++) {
            sb.append(armas[i].getNombre());
            sb.append("/");
            sb.append(armas[i].getModDanio());
            sb.append("/");
            sb.append(armas[i].getModDefensa());
            sb.append("/");
            sb.append(armas[i].getTipodeArma().toString());
            sb.append(",");
        }
        // armas activas
        sb.append(";");
        armas = personaje.getArmasActivas();
        for (int i = 0; i < armas.length; i++) {
            sb.append(armas[i].getNombre());
            sb.append("/");
            sb.append(armas[i].getModDanio());
            sb.append("/");
            sb.append(armas[i].getModDefensa());
            sb.append("/");
            sb.append(armas[i].getTipodeArma().toString());
            sb.append(",");
        } // se me guarda una barrita de mas
        sb.append(";");
        // armaduras
        Armadura[] armaduras = personaje.getArmaduras();
        for (int i = 0; i < armaduras.length; i++) {
            sb.append(armaduras[i].getNombre());
            sb.append("/");
            sb.append(armaduras[i].getModDanio());
            sb.append("/");
            sb.append(armaduras[i].getModDefensa());
            sb.append(",");
        }
        sb.append(";");
        // armadura activa
        sb.append(personaje.getArmaduraActiva().getNombre());
        sb.append("/");
        sb.append(personaje.getArmaduraActiva().getModDanio());
        sb.append("/");
        sb.append(personaje.getArmaduraActiva().getModDefensa());
        sb.append(";");
        // esbirros
        Esbirro[] esbirros = personaje.getEsbirros();
        escribirEsbirrosPers(esbirros, sb);
        sb.append(";");
        // salud
        sb.append(personaje.getSalud());
        sb.append(";");
        // poder
        sb.append(personaje.getPoder());
        sb.append(";");
        // debilidades
        Debilidad[] debilidades = personaje.getDebilidades();
        for (int i = 0; i < debilidades.length; i++) {
            sb.append(debilidades[i].getNombre());
            sb.append("/");
            sb.append(debilidades[i].getValor());
            // sb.append("|");
        }
        sb.append(";");
        // fortalezas
        Fortaleza[] fortalezas = personaje.getFortalezas();
        for (int i = 0; i < fortalezas.length; i++) {
            sb.append(fortalezas[i].getNombre());
            sb.append("/");
            sb.append(fortalezas[i].getValor());
            // sb.append("|");
        }
        sb.append(";");
        if (personaje instanceof Vampiro vamp) {
            sb.append(vamp.getSangre());
            sb.append(";");
            sb.append(vamp.getEdad());
        } else if (personaje instanceof Licantropo lican) {
            sb.append(lican.getRabia());
        } else if (personaje instanceof Cazador cazador) {
            sb.append(cazador.getVoluntad());
        }
    }
    
    private void escribirEsbirrosPers(Esbirro[] esbirros, StringBuilder sb) { // guardar cada esbirro del personaje                                                                                  
        for (int i = 0; i < esbirros.length; i++) {
            sb.append(esbirros[i].getNombre());
            sb.append("/");
            sb.append(esbirros[i].getSalud());
            sb.append("/");
            if (esbirros[i] instanceof Ghoul) {
                sb.append("ghoul");
            } else if (esbirros[i] instanceof Humano) {
                Humano humano = (Humano) esbirros[i];
                sb.append("humano");
            } else if (esbirros[i] instanceof Demonio) {
                sb.append("demonio");
            }
            sb.append(",");
        }
    }

    private void validarDesafio(Desafio desafio, Publisher notificador) {

        Scanner scanner = new Scanner(System.in);
        int eleccion = 0;
        // Sacamos las fortalezas y debilidades de los personajes desafiados y
        // desafiantes
        Debilidad[] debilidadesDesafiante = desafio.getJugadorDesafiante().getPersonajeActivo().getDebilidades();
        Fortaleza[] fortalezasDesafiante = desafio.getJugadorDesafiante().getPersonajeActivo().getFortalezas();
        Debilidad[] debilidadesDesafiado = desafio.getJugadorDesafiado().getPersonajeActivo().getDebilidades();
        Fortaleza[] fortalezasDesafiado = desafio.getJugadorDesafiado().getPersonajeActivo().getFortalezas();

        // arraylist donde se guardaran los resultados:
        ArrayList<Fortaleza> FElegDesafiante = new ArrayList<>();
        ArrayList<Fortaleza> FElegDesafiado = new ArrayList<>();
        ArrayList<Debilidad> DElegDesafiante = new ArrayList<>();
        ArrayList<Debilidad> DElegDesafiado = new ArrayList<>();

        // mostramos debilidades por pantalla del desafiantes
        listarDebilidades(debilidadesDesafiante);
        System.out.println("Escoja los números de las debilidades del Jugador desafiante deseas: ");
        // el operador elige debilidades y las guarda
        while (eleccion != debilidadesDesafiante.length + 1) { // habra que comprobar que no elija una debilidad o
            // fortaleza 2 veces
            eleccion = scanner.nextInt();
            DElegDesafiante.add(debilidadesDesafiante[eleccion]);
        }
        // mostramos fortalezas por pantalla del desafiantes
        listarFortalezas(fortalezasDesafiante);
        System.out.println("Escoja los números de las fortalezas del Jugador desafiante que desea: ");
        // el operador elige fortalezas y las guarda
        while (eleccion != fortalezasDesafiante.length + 1) { // habra que comprobar que no elija una debilidad o
            // fortaleza 2 veces
            eleccion = scanner.nextInt();
            FElegDesafiante.add(fortalezasDesafiante[eleccion]);
        }
        // mostramos debilidades por pantalla del desafiado
        listarDebilidades(debilidadesDesafiado);
        System.out.println("Escoja los números de las debilidades del Jugador desafiado que desea: ");
        while (eleccion != debilidadesDesafiante.length + 1) { // habra que comprobar que no elija una debilidad o
            // fortaleza 2 veces
            eleccion = scanner.nextInt();
            DElegDesafiado.add(debilidadesDesafiado[eleccion]);
        }
        // mostramos fortalezas por pantalla del desafiado
        listarFortalezas(fortalezasDesafiado);
        System.out.println("Escoja los números de las fortalezas del Jugador desafiado que desea: ");
        // el operador elige fortalezas y las guarda
        while (eleccion != fortalezasDesafiado.length + 1) { // habra que comprobar que no elija una debilidad o
            // fortaleza 2 veces
            eleccion = scanner.nextInt();
            FElegDesafiado.add(fortalezasDesafiado[eleccion]);
        }

        // comprobar oro desafiado
        int oro = desafio.getOroApostado();
        int oroDesafiado = desafio.getJugadorDesafiado().getOro();
        System.out.println("Oro del usuario que ha sido desafiado: " + oroDesafiado);
        System.out.println("Oro apostado: " + oro);

        // ahora el operador decide si validar o no el desafio:
        String validacion = null;
        System.out.println("Deseas validar o no validar el desafio: SI/NO");
        while (!validacion.equals("SI") || !validacion.equals("NO")) {
            validacion = scanner.nextLine();
            if (validacion.equals("SI")) { // habria que hacer que se cambie a mayus lo que escriba para que da
                                           // igual que pona si, Si, o SI
                desafio.setEstado(Desafio.State.Validado);
                notificador.suscribirUsuario(desafio.getJugadorDesafiado());
                notificador.notificarUsuario(desafio);
            } else if (!validacion.equals("SI") || !validacion.equals("NO")) {
                System.out.println(
                        "Por favor, intraduzca 'Si' si quiere validar el desafio o 'No' si quiere rechazarlo");
            }
        }

    }

    public void realizarFuncionMenuOperador(int opcion) throws IOException {
        // manager = super.getManagerUsuarios();
        ArrayList<Usuario> usuarioEle = manager.getUsuariosRegistrados();
        // insertar variables duplicadas en las opciones de banear y desbanear?
        switch (opcion) {
            case 1 -> {// Darse de baja
                DarseDeBaja(this); // DarseDeBaja(null)
                System.out.println("Saliendo del sistema.");
                System.exit(0);
            }
            case 2 -> {
                // Editar Personaje
                System.out.println("Personajes disponibles:");
                entidades = super.getEntidades();
                ArrayList<Integer> personajeEle = super.getEntidades().MostraryElegir("PERSONAJES");// se podria hacer
                                                                                                    // que entidades de
                                                                                                    // usuario fuera
                                                                                                    // publico
                Personaje personaje = super.getEntidades().elegirPersonaje(personajeEle.get(0));// para que lo hereden
                                                                                                // los hijos sin tener
                                                                                                // que hacer get

                personaje.editarPersonajeOperador(personaje, entidades);
                for (int i = 0; i < manager.getUsuariosRegistrados().size(); i++) { // esto
                    if (manager.getUsuariosRegistrados().get(i) instanceof Jugador jugador) {// comprobar otros
                                                                                             // parametros a lo mejor
                        if (jugador.getPersonajeActivo().getNombre().equals(personaje.getNombre())) {
                            jugador.setPersonajeActivo(personaje.clonar()); // por polimorfismo se ejecutara el clonar
                                                                            // del personaje especifico
                        }
                    }
                }
                guardarPersonajeEditado(personaje);
            }
            case 3 -> // Aniadir Personaje
                aniadirPersonaje();
            case 4 -> {// Validar Desafio
                // NECESITO ACCEDER A LA LISTA DE DESAFIOS
                leerDesafios();
                Desafio desafio = super.getDesafiosAct().obtenerDesafio();
                validarDesafio(desafio, notificador);// y notificarlo con el observer
            }
            case 5 -> {
                // Banear Usuario
                imprimirListaUsuariosDesbaneadosBaneados(usuarioEle, opcion);
                Scanner escanerUsuario = new Scanner(System.in);// se podrian mostrar los nicks de todos los jugadores
                System.out.println("Introduzca el numero del usuario que desea banear: ");
                Integer numero = escanerUsuario.nextInt();
                Usuario usuario = usuarioEle.get(numero);
                System.out.println("¿Esta seguro de que quiere desbanear al usuario " + usuario.getNick() + "?");
                System.out.println("Pulse 1 si asi es, en caso contrario pulse culaquier otro numero");
                Integer opc = escanerUsuario.nextInt();
                if (opc == 1) {
                    usuario.setEstadoObservador(State.baneado);
                }
                /*
                 * Creo que lo sig no haria falta pero por si acaso lo dejo:
                 * String nick = usuario.getNick();
                 * String password = usuario.getPassword();
                 * Usuario usuario = super.getManagerUsuarios().obtenerUsuario(nick, password);
                 */
            }
            case 6 -> {
                // Desbanear Usuario
                imprimirListaUsuariosDesbaneadosBaneados(usuarioEle, opcion);// a lo mejor estaria mejor ponerlo en
                                                                             // operador del sistema
                Scanner escanerUsu = new Scanner(System.in);
                System.out.println("Introduzca el numero del usuario que desea banear: ");
                Integer num = escanerUsu.nextInt();
                Usuario usu = usuarioEle.get(num);// habria que ver como elegir al usuario a banear
                System.out.println("¿Esta seguro de que quier desbanear al usuario " + usu.getNick() + "?");
                System.out.println("Pulse 1 si asi es, en caso contrario pulse culaquier otro numero");
                Integer op = escanerUsu.nextInt();
                if (op == 1) {
                    usu.setEstadoObservador(State.noBaneado);
                }
            }
            case 7 -> {
                // Salir
                System.out.println("Cerrando sesion y saliendo");
                System.exit(0);
            }
        }
    }

    private void leerDesafios() throws FileNotFoundException {

        File file = new File("Ficheros/Desafios.txt");
        Scanner scanner = new Scanner(file);
        String linea = scanner.nextLine();

        String[] partes = linea.split(" ");
        String desafiante = partes[1];
        String desafiado = partes[2];
        String oroApostado = partes[3];

        Integer oroApuesta = Integer.parseInt(oroApostado);
        String nickIterado = "";
        int indice = 0;
        Jugador jugadorDesafiante = null;
        while(!(desafiante.equals(nickIterado))) {
            Usuario usuario = manager.getUsuariosRegistrados().get(indice);
            if (usuario instanceof Jugador) {
                jugadorDesafiante = (Jugador) usuario;
                nickIterado = jugadorDesafiante.getNick();
            }
            
            ++indice;
        }

        nickIterado = "";
        Jugador jugadorDesafiado = null;
        indice = 0;
        while(!(desafiado.equals(nickIterado))) {
            Usuario usuario = manager.getUsuariosRegistrados().get(indice);
            if (usuario instanceof Jugador) {
                jugadorDesafiado = (Jugador) usuario;
                nickIterado = jugadorDesafiado.getNick();
            }
            
            ++indice;
        }

        Desafio desafio = new Desafio();
        desafio.setJugadorDesafiante(jugadorDesafiante);
        desafio.setJugadorDesafiado(jugadorDesafiado);
        desafio.setOroApostado(oroApuesta);

        super.getDesafiosAct().guardarDesafio(desafio);;

    }

    public void guardarPersonajeEditado(Personaje personaje) {
        File archivo = new File("Ficheros/Personajes.txt");
        ArrayList<Personaje> listaPersonajes = entidades.getPersonajes();
        int indicePersonajeAntiguo = listaPersonajes.indexOf(personaje);
        List<String> lineas = new ArrayList<>();
        StringBuilder sbNuevo = new StringBuilder();
        rellenarStringBuilder(sbNuevo, personaje);
        String lineaNueva = sbNuevo.toString();

        try {
            Scanner lector = new Scanner(archivo);

            // cargar todas las líneas del archivo en una lista
            while (lector.hasNextLine()) {
                lineas.add(lector.nextLine());
            }
            lector.close();

            // reemplazar la línea en la lista con la nueva línea
            lineas.set(indicePersonajeAntiguo, lineaNueva);

            // escribir la lista actualizada de nuevo en el archivo
            FileWriter escritor = new FileWriter(archivo);
            for (String linea : lineas) {
                escritor.write(linea + "\n");
            }
            escritor.close();

            System.out.println("La línea ha sido reemplazada con éxito.");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo.");
            e.printStackTrace();
        }
    }

    public void imprimirListaUsuariosDesbaneadosBaneados(ArrayList<Usuario> usuarioEle, int opcion) {// no tiene sentido
                                                                                                     // crearse otro
                                                                                                     // array
        // list nuevo
        for (int i = 0; i < usuarioEle.size(); i++) {
            Usuario usuario = usuarioEle.get(i);
            TipoUsuario rol = usuario.getRol();
            if (rol.equals(TipoUsuario.Jugador)) {
                Jugador usuarioJugador = (Jugador) usuario;
                Boolean estado = usuarioJugador.getEstaBaneado();
                if (!estado && opcion == 5) {
                    System.out.println(i + "-" + usuario.getNick());
                } else if (estado && opcion == 6) {
                    System.out.println(i + "-" + usuario.getNick());
                }

            }
        }
    }

    public void listarDebilidades(Debilidad[] d) {

        for (int i = 0; i < d.length; i++) {
            Debilidad debilidad = d[i];
            System.out.println(i + ":" + debilidad.getNombre());
        }
    }

    public void listarFortalezas(Fortaleza[] f) {

        for (int i = 0; i < f.length; i++) {
            Fortaleza fortaleza = f[i];
            System.out.println(i + ":" + fortaleza.getNombre());
        }
    }
}
