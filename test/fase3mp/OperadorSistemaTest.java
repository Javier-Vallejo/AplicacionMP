/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fase3mp;

import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class OperadorSistemaTest {

    public OperadorSistemaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    public ArrayList<Integer> MostraryElegirSinEscanner(String objetoMostrar, ArrayList<Personaje> personajes,
            ArrayList<Arma> armas,
            ArrayList<Armadura> armaduras,
            ArrayList<Fortaleza> fortalezas,
            ArrayList<Debilidad> debilidades,
            ArrayList<Esbirro> esbirros) {

            


        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        if (objetoMostrar.equals("PERSONAJES")) {
            int personajeEle = 0;

            ArrayList<Integer> personajesElegidos = new ArrayList<>();
            if (personajeEle == personajes.size()) {

            } else {
                personajesElegidos.add(personajeEle);
                return personajesElegidos;
            }
        }

        else if (objetoMostrar.equals("ARMAS")) {
            int armaEle = 0;
            for (int i = 0; i < armas.size(); i++) {
                System.out.println("- " + i + ".Arma: " + armas.get(i).getNombre() + " "
                        + armas.get(i).getTipodeArma().toString());
            }
            System.out.println("- " + armas.size() + ".Salir");
            if (armas.size() == 0) {
                System.out.println("No hay armas en el sistema.");
            }
            ArrayList<Integer> armasElegidas = new ArrayList<>();

            armaEle = 0;
            if (!(armaEle < 0) && !(armaEle >= armas.size())) {
                if (armasElegidas.contains(armaEle)) {
                    System.out.println("Ya posee esta arma, elija otra de la lista.");
                } else {
                    armasElegidas.add(armaEle);
                    return armasElegidas;
                }
            }

        } else if (objetoMostrar.equals("ARMADURAS")) {
            int armaduraEle = 0;
            for (int i = 0; i < armaduras.size(); i++) {
                System.out.println("- " + i + ".Armadura:" + armaduras.get(i).getNombre());
            }
            System.out.println("- " + armaduras.size() + ".Salir");
            ArrayList<Integer> armadurasElegidas = new ArrayList<>();
            if (armaduras.size() == 0) {
                System.out.println("No hay armaduras en el sistema.");
            }
            armaduraEle = 0;
            if (!(armaduraEle >= armaduras.size()) && !(armaduraEle < 0)) {
                if (armadurasElegidas.contains(armaduraEle)) {
                    System.out.println("Ya posee esta armadura, elija otra de la lista");
                } else {
                    armadurasElegidas.add(armaduraEle);
                    return armadurasElegidas;

                }
            } else if (armaduraEle != armaduras.size()) {
                System.out.println("Armadura erronea. Por favor, introduzca un armadura de la lista.");
            }

        } else if (objetoMostrar.equals("FORTALEZAS")) {
            int fortalezaEle = 0;
            for (int i = 0; i < fortalezas.size(); i++) {
                System.out.println("- " + i + ".Fortaleza:" + fortalezas.get(i).getNombre());
            }
            System.out.println("- " + (fortalezas.size()) + ".Salir");
            if (fortalezas.size() == 0) {
                System.out.println("No hay fortalezas en el sistema.");
            }
            ArrayList<Integer> fortalezasElegidas = new ArrayList<>();

            fortalezaEle = 0;

            if (!(fortalezaEle >= fortalezas.size()) && !(fortalezaEle < 0)) {
                if (fortalezasElegidas.contains(fortalezaEle)) {
                    System.out.println("Ya posee esta fortaleza, elija otra de la lista");
                } else {
                    fortalezasElegidas.add(fortalezaEle);
                    return fortalezasElegidas;

                }
            } else if (fortalezaEle > fortalezas.size() || fortalezaEle < 0) {
                System.out.println("Fortaleza erronea. Por favor, introduzca una fortaleza de la lista");
            }

        } else if (objetoMostrar.equals("DEBILIDADES")) {
            int debilidadEle = 0;
            for (int i = 0; i < debilidades.size(); i++) {
                System.out.println("- " + i + ".Debilidad:" + debilidades.get(i).getNombre());
            }
            System.out.println("- " + (debilidades.size()) + ".Salir");
            if (debilidades.size() == 0) {
                System.out.println("No hay debilidades en el sistema.");
            }
            ArrayList<Integer> debilidadesElegidas = new ArrayList<>();

            debilidadEle = 0;
            if (!(debilidadEle >= debilidades.size()) && !(debilidadEle < 0)) {
                if (debilidadesElegidas.contains(debilidadEle)) {
                    System.out.println("Ya posee esta debilidad, por favor elija otra de la lista.");
                } else {
                    debilidadesElegidas.add(debilidadEle);
                    return debilidadesElegidas;

                }
            } else if (debilidadEle > debilidades.size() || debilidadEle < 0) {
                System.out.println("Debilidad erronea. Por favor, introduzca una debilidad de la lista.");
            }

        } else if (objetoMostrar.equals(
                "ESBIRROS")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println("- " + i + ".Esbirro:" + esbirros.get(i).getNombre() + " "
                        + esbirros.get(i).getClass().getName());
            }
            System.out.println("- " + (esbirros.size()) + ".Salir");
            ArrayList<Integer> esbirrosElegidos = new ArrayList<>();
            int esbirro = 0;

            esbirroEle = 0;
            if (esbirroEle < 0 || esbirroEle > esbirros.size()) {
                System.out.println(
                        "Esbirro inexistente. Por favor introduzca el numero de uno de los esbirros disponibles.");
            } else if (esbirroEle != esbirros.size()) {
                esbirro = esbirroEle;
            }
            esbirrosElegidos.add(esbirro);
            return esbirrosElegidos;

        } else if (objetoMostrar.equals(
                "ESBIRRO")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println("- " + i + ".Esbirro " + esbirros.get(i).getNombre() + " "
                        + esbirros.get(i).getClass().getName());
            }
            System.out.println("- " + (esbirros.size()) + ".Salir");
            ArrayList<Integer> esbirroElegido = new ArrayList<>();
            int esbirro = 0;

            esbirroEle = 0;
            if (esbirroEle < 0 || esbirroEle > esbirros.size()) {
                System.out.println(
                        "Esbirro inexistente. Por favor introduzca el numero de uno de los esbirros disponibles.");
            } else if (esbirroEle != esbirros.size()) {
                esbirro = esbirroEle;
            }

            esbirroElegido.add(esbirro);
            return esbirroElegido;

        } else {
            System.out.println("No existe el contenido " + objetoMostrar);
            return null;
        }
        return null;
    }

    public EntidadesActivas crearEntidades() {
        EntidadesActivas instance = new EntidadesActivas();
        ArrayList<Fortaleza> expResult = new ArrayList<>();
        Fortaleza fortaleza = new Fortaleza("fortaleza1", 2);
        Fortaleza fortaleza2 = new Fortaleza("fortaleza2", 4);
        expResult.add(fortaleza);
        expResult.add(fortaleza2);
        instance.setFortalezas(expResult);
        ArrayList<Debilidad> debilidades = new ArrayList<>();
        Debilidad debilidad = new Debilidad("debilidad", 2);
        Debilidad debilidad2 = new Debilidad("debilidad2", 4);
        debilidades.add(debilidad);
        debilidades.add(debilidad2);
        instance.setDebilidades(debilidades);
        Cazador cazador = CrearCazadorBase();
        instance.aniadir(cazador);

        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        instance.aniadir(habilidad);

        Ghoul ghoul = new Ghoul("esbirro", 10);
        instance.aniadir(ghoul);

        Arma arma = new Arma("arma", "10", "10", "de2manos");
        ArrayList<Arma> armas = new ArrayList<>();
        armas.add(arma);
        instance.setArmas(armas);

        Armadura armadura = new Armadura("armadura", "10", "5");
        ArrayList<Armadura> armaduras = new ArrayList<>();
        armaduras.add(armadura);
        instance.setArmaduras(armaduras);
        return instance;
    }

    public int MostraryElegirHabilidad() {
        System.out.println("MostraryElegirHabilidad");
        EntidadesActivas instance = crearEntidades();
        int expResult = 0;

        ArrayList<Habilidad> habilidades = instance.getHabilidades();

        int habilidadElegida = 0;

        for (int i = 0; i < habilidades.size(); i++) {
            System.out.println("Habilidad " + i + " " + habilidades.get(i).getNombre());
        }
        System.out.println((habilidades.size()) + " Salir");
        habilidadElegida = 0;
        if (!(habilidadElegida >= habilidades.size()) && !(habilidadElegida < 0)) {
            int result = habilidadElegida;
            return result;

        } else {
            System.out.println("Habilidad erronea, por favor introduzca una habilidad de la lista.");

        }
        return 0;
    }


    private void aniadirPersonaje(OperadorSistema operadorSistema, int opcionArma, int opcionArmadura,
            int eleccionEsbirro, String tipoEsbirro, Integer tipoPersonaje) throws IOException {

         //set up
         EntidadesActivas entidadadesActivas = crearEntidades();
         operadorSistema.setEntidades(entidadadesActivas);


        System.out.println("Escriba el nombre del personaje:");
        String nombreCarac = "nombre";
        // armas
        ArrayList<Arma> mochilaArmasPersonaje = new ArrayList<>();
        ArrayList<Arma> listaArmas = entidadadesActivas.getArmas();
        System.out.println("Vas a introducir armas hasta que pulses salir");
        System.out.println("Desea crear un arma de 0 o elegirla del sistema: ");
        System.out.println("1- Crearla ");
        System.out.println("2- Elegirla de las que hay en el sistema");
        System.out.println("3- Salir");

        switch (opcionArma) {
            case 1 -> {
                System.out.println("Escriba el nombre del arma");
                String nombre = "nombreArma";
                System.out.println("Escriba su ataque");
                String danio = "3";
                System.out.println("Escriba su defensa");
                String defensa = "2";
                System.out.println("Escriba si es de 1 o 2 manos");
                String tipo = "de2manos";
                if (tipo.equals("1")) {
                    tipo = "de1mano";
                } else if (tipo.equals("2")) {
                    tipo = "de2manos";
                }
                Arma arma = new Arma(nombre, danio, defensa, tipo);
                mochilaArmasPersonaje.add(arma);
            }

            case 2 -> {
                System.out.println("Escriba los numeros de las armas que quiere que tenga su personaje: ");
                ArrayList<Integer> armasEleg = MostraryElegirSinEscanner("ARMAS", null, listaArmas, null,
                        null, null, null);

                for (int i = 0; i < armasEleg.size(); i++) {
                    if (!(mochilaArmasPersonaje
                            .contains(operadorSistema.getEntidades().elegirArma(armasEleg.get(i))))) {
                        mochilaArmasPersonaje.add(operadorSistema.getEntidades().elegirArma(armasEleg.get(i)));
                    }
                }
            }

        }

        Arma[] armasPersonaje = mochilaArmasPersonaje.toArray(new Arma[0]);

        // armas activas

        int numArmaActiva = 0;
        int longitudListaArmas = 0;
        ArrayList<Arma> armasActivas = new ArrayList<>();
        System.out.println("Elige el numero del arma o armas que quiera activar: ");
        System.out.println("(Ten en cuenta que puede escoger o una de dos manos o dos de una mano)");

        for (int i = 0; i < armasPersonaje.length; i++) {
            System.out.println(
                    i + "_ " + armasPersonaje[i].getNombre() + " " + armasPersonaje[i].getTipodeArma().toString());
        }
        System.out.println(armasPersonaje.length + " Salir");
        numArmaActiva = 0;
        if (!(numArmaActiva == armasPersonaje.length)) {
            if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de2manos
                    && longitudListaArmas == 0) {
                armasActivas.add(armasPersonaje[numArmaActiva]);
                longitudListaArmas = 2;
                System.out.println("Arma " + numArmaActiva + " activada con exito.");
            } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                    && longitudListaArmas == 0) {
                armasActivas.add(armasPersonaje[numArmaActiva]);
                longitudListaArmas = 1;
                System.out.println("Arma " + numArmaActiva + " activada con exito.");
            } else if (armasPersonaje[numArmaActiva].getTipodeArma() == Arma.tipoArma.de1mano
                    && longitudListaArmas == 1
                    && armasActivas.contains(armasPersonaje[numArmaActiva]) == false) {
                armasActivas.add(armasPersonaje[numArmaActiva]);
                longitudListaArmas = 2;
                System.out.println("Arma " + numArmaActiva + " activada con exito.");
            } else if (armasActivas.contains(armasPersonaje[numArmaActiva])) {
                System.out.println("Arma ya activa");
            } else {
                System.out.println("El arma que intentas establecer como activa no cabe");
                System.out.println("¿Desea eliminar un arma que ya tenga?");
                System.out.println("- 1.Si");
                System.out.println("- 2.No");
                int eleccion = 2;
                if (eleccion == 1) {
                    System.out.println("Estas son sus armas Activas");
                    for (int i = 0; i < armasActivas.size(); i++) {
                        System.out.println(
                                i + "_ " + armasActivas.get(i).getNombre() + " "
                                        + armasPersonaje[i].getTipodeArma().toString());
                    }
                    eleccion = 0;
                    if (armasActivas.get(eleccion).getTipodeArma() == Arma.tipoArma.de1mano) {
                        longitudListaArmas = 1;
                    } else {
                        longitudListaArmas = 0;
                    }
                    armasActivas.remove(eleccion);

                } else if (eleccion == 2) {
                    System.out.println(
                            "El arma que intentas establecer como activa no se activara por falta de hueco.");
                } else {
                    System.out.println("Por favor, introduzca 1 o 2.");
                }
            }
        }

        Arma[] armasActivasPersonaje = armasActivas.toArray(new Arma[0]);

        // armaduras

        ArrayList<Armadura> mochilaArmadurasPersonaje = new ArrayList<>();
        ArrayList<Armadura> listaArmaduras = entidadadesActivas.getArmaduras();
        System.out.println("Vas a introducir armaduras hasta que pulses salir");
        System.out.println("Desea crear una armadura de 0 o elegirla del sistema: ");
        System.out.println("1- Crear la armadura ");
        System.out.println("2- Elegir armaduras del sistema");
        System.out.println("3- Salir");

        switch (opcionArmadura) {
            case 1 -> {
                System.out.println("Escriba el nombre de la armadura");
                String nombre = "nombreArmadura";
                System.out.println("Escriba su ataque");
                String danio = "0";
                System.out.println("Escriba su defensa");
                String defensa = "5";
                Armadura armadura = new Armadura(nombre, danio, defensa);
                mochilaArmadurasPersonaje.add(armadura);
            }

            case 2 -> {
                System.out.println("Escriba el numero de la armadura que quiere que tenga su personaje: ");
                ArrayList<Integer> armadurasEleg = MostraryElegirSinEscanner("ARMADURAS", null, null,
                listaArmaduras, null, null, null);

                for (int i = 0; i < armadurasEleg.size(); i++) {
                    if (!(mochilaArmadurasPersonaje
                            .contains(operadorSistema.getEntidades().elegirArmadura(armadurasEleg.get(i))))) {
                        mochilaArmadurasPersonaje
                                .add(operadorSistema.getEntidades().elegirArmadura(armadurasEleg.get(i)));
                    }
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
        if (!(numArmaduraActiva == armadurasPersonaje.length)) {
            armaduraActivaPersonaje = armadurasPersonaje[numArmaduraActiva];
        }

       
        // fortaleza
        System.out.println("Escriba el numero de la/las fortaleza/fortalezas que quiere que tenga su personaje: ");
        ArrayList<Fortaleza> fortalezasBase = entidadadesActivas.getFortalezas();
        ArrayList<Integer> fortalezasEleg = MostraryElegirSinEscanner("FORTALEZAS", null, null, null, fortalezasBase,
                null, null);
        Fortaleza[] fortalezasPersonaje = new Fortaleza[fortalezasEleg.size()];
        for (int i = 0; i < fortalezasEleg.size(); i++) {
            fortalezasPersonaje[i] = operadorSistema.getEntidades().elegirFortaleza(fortalezasEleg.get(i));
        }
        // // debilidad
        System.out.println("Escriba el numero de la/las debilidad/debilidades que quiere que tenga su personaje: ");
        ArrayList<Debilidad> debilidades = entidadadesActivas.getDebilidades();
        ArrayList<Integer> debilidadesEleg = MostraryElegirSinEscanner("DEBILIDADES", null, null, null, null,
                debilidades, null);
        Debilidad[] debilidadesPersonaje = new Debilidad[debilidadesEleg.size()];
        for (int i = 0; i < debilidadesEleg.size(); i++) {
            debilidadesPersonaje[i] = operadorSistema.getEntidades().elegirDebilidad(debilidadesEleg.get(i));
        }

        // salud personaje
        System.out.println("Escriba la salud del personaje: [Limitada entre 1 y 5]");
        int saludPersonaje = 3;
        // poder personaje
        System.out.println("Escriba el poder del personaje: [Limitado entre 1 y 5]");
        int poderPersonaje = 4;

        // habilidad
        System.out.println("Escriba el numero de la habilidad que quiere que tenga su personaje: ");
        int habilidadElegida = MostraryElegirHabilidad();
        Habilidad habilidadPersonaje = operadorSistema.getEntidades().getHabilidades().get(habilidadElegida);

        // Esbirros
        FabricaEsbirros fabricaEsbirros = operadorSistema.getFabricaEsbirros();
        ArrayList<Esbirro> esbirrosPers = entidadadesActivas.getEsbirros();

        System.out.println("Desea elegir esbirros que esten en el sistema o crear nuevos: ");
        System.out.println("1-Aniadir conjunto del sistema ");
        System.out.println("2-Crear nuevos "); // habra // activas
        System.out.println("3-Aniadir un esbirro del sistema");
        System.out.println("4-Salir");

        switch (eleccionEsbirro) {
            case 1 -> {
                ArrayList<Integer> esbirros = MostraryElegirSinEscanner("ESBIRROS", null, null, null, null, null,
                        esbirrosPers);
                for (int i = 0; i < esbirros.size(); i++) {
                    esbirrosPers.add(operadorSistema.getEntidades().obtenerEsbirro(esbirros.get(i)));
                }

            }
            case 2 -> {

                System.out.println("Va a crear un nuevo esbirro");
                System.out.println("Escriba el tipo de esbirro que desea introducirle: ");
                System.out.println("Las opciones son Humano, Ghoul y Demonio. Escriba salir para terminar.");

                tipoEsbirro = tipoEsbirro.toLowerCase().trim();
                if (!(tipoEsbirro.equals("salir"))) {
                    System.out.println("Introduzca el nombre que le quiere poner al esbirro: ");
                    String nombreEsbirro = "nombreEsbirro";
                    System.out.println("Introduzca la salud del esbirro: ");
                    int saludEsbirro = 2;

                    switch (tipoEsbirro) { // se deberia poder elegir si crear nuevos esbirros o elegir
                                           // algunos del sistema
                        case "humano" -> {
                            fabricaEsbirros = new FabricaHumano();
                            Humano humano = (Humano) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                            // humano.rellenarPropiedadesEspec();

                            operadorSistema.getEntidades().aniadir(humano);
                            esbirrosPers.add(humano);
                        }
                        case "ghoul" -> {
                            fabricaEsbirros = new FabricaGhoul();
                            Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsbirro, saludEsbirro);
                            // ghoul.rellenarPropiedadesEspec();

                            operadorSistema.getEntidades().aniadir(ghoul);
                            esbirrosPers.add(ghoul);
                        }
                        case "demonio" -> {
                            fabricaEsbirros = new FabricaDemonio();
                            Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsbirro,
                                    saludEsbirro);
                            demonio.setFabricaEsbirros(operadorSistema.getFabricaEsbirros());
                            demonio.setEntidades(operadorSistema.getEntidades());
                            // demonio.rellenarPropiedadesEspec();

                            operadorSistema.getEntidades().aniadir(demonio);
                            esbirrosPers.add(demonio);
                        }
                        default -> {
                            System.out.println("Nombre de esbirro no correcto");
                        }
                    }

                }
            }
            case 3 -> {
                ArrayList<Integer> esbirroEle = MostraryElegirSinEscanner("ESBIRRO", null, null, null, null, null,
                        esbirrosPers);
                esbirrosPers.add(operadorSistema.getEntidades().obtenerEsbirro(esbirroEle.get(0)));
            }
            case 4 -> {
                System.out.println("No se aniadiran mas esbirros");
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }

        Esbirro[] esbirrosPersonaje = esbirrosPers.toArray(new Esbirro[0]);
        // tipo personaje
        System.out.println("Que tipo de personaje desea crear? - Escriba el numero de su tipo:");
        System.out.println("1. Licantropo --- 2. Vampiro --- 3.Cazador");
        FabricaPersonajes fabricaPersonajes = operadorSistema.getFabricaPersonajes();
        switch (tipoPersonaje) {
            case 1 -> {
                // creamos un licantropo
                fabricaPersonajes = new FabricaLicantropo();
                Licantropo licanNuevo = (Licantropo) fabricaPersonajes.crearPersonaje(nombreCarac,
                        habilidadPersonaje,
                        armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                        esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                        fortalezasPersonaje);
                // en lugar de licanNuevo.rellenarPropiedadesEspecificas();
                licanNuevo.setRabia(4);
                operadorSistema.getEntidades().aniadir(licanNuevo);

            }
            case 2 -> {
                // creamos un vampiro
                fabricaPersonajes = new FabricaVampiro();
                Vampiro vampNuevo = (Vampiro) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje,
                        armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                        esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                        fortalezasPersonaje);
                // en lugar de vampNuevo.rellenarPropiedadesEspecificas();
                vampNuevo.setSangre(3);
                vampNuevo.setEdad(2);
                operadorSistema.getEntidades().aniadir(vampNuevo);

            }
            case 3 -> {
                // creamos un cazador
                fabricaPersonajes = new FabricaCazador();
                Cazador cazNuevo = (Cazador) fabricaPersonajes.crearPersonaje(nombreCarac, habilidadPersonaje,
                        armasPersonaje, armasActivasPersonaje, armadurasPersonaje, armaduraActivaPersonaje,
                        esbirrosPersonaje, saludPersonaje, poderPersonaje, debilidadesPersonaje,
                        fortalezasPersonaje);
                // en lugar de cazNuevo.rellenarPropiedadesEspecificas();
                cazNuevo.setVoluntad(3);
                operadorSistema.getEntidades().aniadir(cazNuevo);

            }
        }

        // }

    }

    public Cazador CrearCazadorBase() {

        Habilidad habilidad = new Habilidad("habilidad", 10, 10, 0);
        Arma arma = new Arma("arma", "10", "10", "de2manos");
        Arma[] armas = new Arma[1];
        armas[0] = arma;
        Armadura armadura = new Armadura("armadura", "10", "5");
        Armadura[] armaduras = new Armadura[1];
        armaduras[0] = armadura;
        Esbirro esbirro = new Esbirro("esbirro", 10);
        Esbirro[] esbirros = new Esbirro[1];
        esbirros[0] = esbirro;
        Debilidad debilidad = new Debilidad("debilidad", 0);
        Debilidad[] debilidades = new Debilidad[1];
        debilidades[0] = debilidad;
        Fortaleza fortaleza = new Fortaleza("fortaleza", 0);
        Fortaleza[] fortalezas = new Fortaleza[1];
        fortalezas[0] = fortaleza;
        Cazador instance = new Cazador("nombre", habilidad, armas, armas, armaduras, armadura, esbirros, 3, 3,
                debilidades, fortalezas);
        instance.setVoluntad(10);

        return instance;

    }

    public OperadorSistema CrearOperador() {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        managerUsuarios.CrearJugador("nombre", "A", "a", TipoUsuario.Jugador, null, 100);
        OperadorSistema instance = new OperadorSistema("operador", "ope", "123", TipoUsuario.OperadorSistema,
                managerUsuarios);
        Publisher expResult = new Publisher();
        instance.setNotificador(expResult);
        instance.setManagerUsuarios(managerUsuarios);
        return instance;
    }

    @Test
    public void testGetNotificador() {
        System.out.println("getNotificador");
        OperadorSistema instance = CrearOperador();
        Publisher expResult = new Publisher();
        instance.setNotificador(expResult);
        assertEquals(expResult, instance.getNotificador());

    }

    /**
     * Test of setNotificador method, of class OperadorSistema.
     */
    @Test
    public void testSetNotificador() {
        System.out.println("setNotificador");
        OperadorSistema instance = CrearOperador();
        Publisher notificadorViejo = instance.getNotificador();
        Publisher notificador = new Publisher();
        instance.setNotificador(notificador);
        assertNotEquals(instance.getNotificador(), notificadorViejo);
    }

    /**
     * Test of getManager method, of class OperadorSistema.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        OperadorSistema instance = CrearOperador();
        ManagerUsuarios antiguoManager = instance.getManagerUsuarios();
        ManagerUsuarios expResult = new ManagerUsuarios();
        assertNotEquals(expResult.getUsuariosRegistrados().size(), antiguoManager.getUsuariosRegistrados().size());

    }

    /**
     * Test of setManager method, of class OperadorSistema.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        OperadorSistema instance = CrearOperador();
        ManagerUsuarios antiguoManager = instance.getManagerUsuarios();
        ManagerUsuarios manager = new ManagerUsuarios();
        instance.setManager(manager);
        assertNotEquals(antiguoManager.getUsuariosRegistrados(), instance.getManager().getUsuariosRegistrados());
    }

    /**
     * Test of imprimirListaUsuariosDesbaneadosBaneados method, of class
     * OperadorSistema.
     */
    @Test
    public void testImprimirListaUsuariosDesbaneadosBaneados() {
        System.out.println("imprimirListaUsuariosDesbaneadosBaneados");
        ArrayList<Usuario> usuarioEle = new ArrayList<>();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        Jugador usuario = new Jugador("a", "A", "q11", TipoUsuario.Jugador, managerUsuarios);
        Jugador usuario2 = new Jugador("c", "c", "qas11", TipoUsuario.Jugador, managerUsuarios);
        usuarioEle.add(usuario);
        usuarioEle.add(usuario2);
        int opcion = 0;
        OperadorSistema instance = CrearOperador();
        instance.imprimirListaUsuariosDesbaneadosBaneados(usuarioEle, opcion);
    }

    /**
     * Test of listarDebilidades method, of class OperadorSistema.
     */
    @Test
    public void testListarDebilidades() {
        System.out.println("listarDebilidades");
        Cazador cazador = CrearCazadorBase();
        Debilidad[] d = cazador.getDebilidades();
        OperadorSistema instance = CrearOperador();
        instance.listarDebilidades(d);
    }

    /**
     * Test of listarFortalezas method, of class OperadorSistema.
     */
    @Test
    public void testListarFortalezas() {
        System.out.println("listarFortalezas");
        Cazador cazador = CrearCazadorBase();
        Fortaleza[] f = cazador.getFortalezas();
        OperadorSistema instance = CrearOperador();
        instance.listarFortalezas(f);
    }

    @Test
    public void testAniadirPersonajeOPcionCrear() throws IOException {
        System.out.println("AniadirPersonajeOPcion1");
        OperadorSistema instance = CrearOperador();
        int crear = 1;
        int conjunto = 1;
        String tipo = "ghoul";
        int tipoPersonajeLicantropo = 1;
        aniadirPersonaje(instance, crear, crear, conjunto, tipo, tipoPersonajeLicantropo);
    }


    @Test
    public void testAniadirPersonajeOPcionElegirSistema() throws IOException {
        System.out.println("AniadirPersonajeOPcion1");
        OperadorSistema instance = CrearOperador();
        int elegir = 2;
        int crear = 2;
        String tipo = "demonio";
        int tipoPersonajeVampiro = 2;
        aniadirPersonaje(instance, elegir, elegir, crear, tipo, tipoPersonajeVampiro);
    }

    @Test
    public void testAniadirPersonajeOPcionAnadirUnEsbirro() throws IOException {
        System.out.println("AniadirPersonajeOPcion1");
        OperadorSistema instance = CrearOperador();
        int crearArma = 1;
        int elegirArmadura = 2;
        int AnadirEsbirro = 3;
        String tipo = "cazador";
        int tipoPersonajeCazador = 3;
        aniadirPersonaje(instance, crearArma, elegirArmadura, AnadirEsbirro, tipo, tipoPersonajeCazador);
    }


}
