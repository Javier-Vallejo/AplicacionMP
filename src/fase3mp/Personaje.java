/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public abstract class Personaje implements InterfazPersonaje { // a lo mejor habria que hacer que fueran ArrayList

    private String nombre;
    private Habilidad habilidadPersonaje;
    private Arma[] armas;
    private Arma[] armasActivas;
    private Armadura[] armaduras;
    private Armadura armaduraActiva;
    private Esbirro[] esbirros;
    private int Salud;
    private int Poder;
    private Debilidad[] debilidades;
    private Fortaleza[] fortalezas;

    public Personaje(String nombre, Habilidad habilidadPersonaje, Arma[] armas, Arma[] armasActivas,
            Armadura[] armaduras,
            Armadura armaduraActiva, Esbirro[] esbirros, int Salud, int Poder, Debilidad[] debilidades,
            Fortaleza[] fortalezas) {
        setNombre(nombre);
        setHabilidadPersonaje(habilidadPersonaje);
        setArmas(armas);
        setArmaduras(armaduras);
        setArmaduraActiva(armaduraActiva);
        setArmasActivas(armasActivas);
        setEsbirros(esbirros);
        setSalud(Salud);
        setPoder(Poder);
        setDebilidades(debilidades);
        setFortalezas(fortalezas);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habilidad getHabilidadPersonaje() {
        return habilidadPersonaje;
    }

    public void setHabilidadPersonaje(Habilidad habilidadPersonaje) {
        this.habilidadPersonaje = habilidadPersonaje;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public void setArmas(Arma[] armas) {
        this.armas = armas;
    }

    public Arma[] getArmasActivas() {
        return armasActivas;
    }

    public void setArmasActivas(Arma[] armasActivas) {
        this.armasActivas = armasActivas;
    }

    public Armadura[] getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(Armadura[] armaduras) {
        this.armaduras = armaduras;
    }

    public Armadura getArmaduraActiva() {
        return armaduraActiva;
    }

    public void setArmaduraActiva(Armadura armaduraActiva) {
        this.armaduraActiva = armaduraActiva;
    }

    public Esbirro[] getEsbirros() {
        return esbirros;
    }

    public void setEsbirros(Esbirro[] esbirros) {
        this.esbirros = esbirros;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    public Debilidad[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(Debilidad[] debilidades) {
        this.debilidades = debilidades;
    }

    public Fortaleza[] getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(Fortaleza[] fortalezas) {
        this.fortalezas = fortalezas;
    }

    public int devolverPoder() {
        return Poder;
    }

    public Habilidad devolverHabilidad() {
        return habilidadPersonaje;
    }

    public int devolverDañoArma() {
        int dañoArma = 0;
        for (int i = 0; i < armasActivas.length; i++) {
            dañoArma += armasActivas[i].devolverModificadores();
        }
        return dañoArma;
    }

    public int devolverDefensaArma() {
        return armaduraActiva.devolverModificadores();
    }

    public abstract int calculoDanio();

    public abstract int calculoDefensa();

    public int calculoVida() {
        int vidaPersonaje = this.Salud;
        int saludTotal = 0;
        saludTotal += vidaPersonaje;
        for (Esbirro esbirro : esbirros) {
            int saludEsbirro = esbirro.devolverSalud();
            saludTotal += saludEsbirro;
        }
        return saludTotal;
    }

    public void MostrarArmas(Personaje personajeEle) {
        int indice = 0;
        Arma[] armasPersonaje = personajeEle.getArmas();
        if (armasPersonaje.length == 0) {
            System.out.println("Este personaje no tiene armas.");
        }
        for (Arma armaPersonaje : armasPersonaje) {
            System.out.println(
                    "- " + indice + ".Arma " + ": " + armaPersonaje.getNombre() + ", "
                            + armaPersonaje.devolverModificadores());
            ++indice;
        }
        System.out.println("- " + armasPersonaje.length + ".Salir");
    }

    public void MostrarArmaduras(Personaje personajeEle) {
        int indice = 0;
        Armadura[] armadurasPersonaje = personajeEle.getArmaduras();
        if (armadurasPersonaje.length == 0) {
            System.out.println("Este personaje no tiene armaduras.");
        }
        for (Armadura armaduraPersonaje : armadurasPersonaje) {
            System.out.println(
                    "- " + indice + ".Armadura " + ": " + armaduraPersonaje.getNombre() + ", "
                            + armaduraPersonaje.devolverModificadores());
            ++indice;
        }
        System.out.println("- " + armadurasPersonaje.length + ".Salir");
        return;
    }

    public void MostrarDebilidades(Personaje personajeEle) {
        int indice = 0;
        Debilidad[] debilidadesPersonaje = personajeEle.getDebilidades();
        if (debilidadesPersonaje.length == 0) {
            System.out.println("Este personaje no tiene debilidades.");
        }
        for (Debilidad debilidadPersonaje : debilidadesPersonaje) {
            System.out.println(
                    "- " + indice + ".Debilidad " + ": " + debilidadPersonaje.getNombre() + ", "
                            + debilidadPersonaje.getValor());
            ++indice;
        }
        System.out.println("- " + debilidadesPersonaje.length + ".Salir");
        return;
    }

    public void editarPersonaje(Personaje personajeEle, EntidadesActivas entidades) {
        int opcion = 0;
        while (true) {
            Scanner escanerLectura = new Scanner(System.in);
            System.out.println("Que desea editar del personaje:");
            System.out.println("- 1.Nombre");
            System.out.println("- 2.Armas");
            System.out.println("- 3.Armaduras");
            System.out.println("- 4.Habilidad");
            System.out.println("- 5.Debilidades");
            System.out.println("- 6.Fortalezas");
            System.out.println("- 7.Salud");
            System.out.println("- 8.Poder");
            System.out.println("- 9.Salir");
            opcion = escanerLectura.nextInt();
            switch (opcion) {
                case 1 -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduzca nuevo nombre: ");// hacer que no se repitan nombres personajes
                    String nuevoNombre = scanner.nextLine();
                    personajeEle.setNombre(nuevoNombre);
                }
                case 2 -> {
                    List<Arma> listaArmas = Arrays.asList(personajeEle.getArmas());
                    ArrayList<Arma> arrayListArmas = new ArrayList<>(listaArmas);
                    System.out.println("Quiere eliminar o aniadir armas: ");
                    escanerLectura.nextLine();
                    String eleccion = escanerLectura.nextLine();

                    if (eleccion.equals("eliminar")) {
                        int armaAeliminar = 0;
                        System.out.println("Selecciona las armas que quieras eliminar: ");
                        while (armaAeliminar != arrayListArmas.size()) {// habria que limitar para que no acepte enteros
                            // mayores que el size
                            System.out.println("Armas actuales: ");
                            MostrarArmas(personajeEle);
                            armaAeliminar = escanerLectura.nextInt();
                            if (!(armaAeliminar >= arrayListArmas.size())) {
                                arrayListArmas.remove(armaAeliminar);
                                Arma[] arrayArmas = arrayListArmas.toArray(new Arma[0]);
                                personajeEle.setArmas(arrayArmas);
                            } else {
                                System.out.println("Arma no incluida, por favor selecciona un arma de la lista");
                            }
                        }

                    } else if (eleccion.equals("aniadir")) {
                        System.out.println("Elige las armas que desea aniadir: ");
                        ArrayList<Integer> armasElegidas = entidades.MostraryElegir("ARMAS");
                        for (int i = 0; i < armasElegidas.size(); ++i) {
                            Arma armaElegida = entidades.elegirArma(armasElegidas.get(i));
                            arrayListArmas.add(armaElegida);
                        }
                        Arma[] arrayArmas = arrayListArmas.toArray(new Arma[0]);
                        personajeEle.setArmas(arrayArmas);
                    } else {
                        System.out.println("Por favor, escojauna de las opciones disponibles ");
                    }
                }
                case 3 -> {
                    List<Armadura> listaArmaduras = Arrays.asList(personajeEle.getArmaduras());
                    ArrayList<Armadura> arrayListArmaduras = new ArrayList<>(listaArmaduras);
                    System.out.println("Quiere eliminar o aniadir armaduras: ");
                    escanerLectura.nextLine();
                    String eleccion = escanerLectura.nextLine();

                    if (eleccion.equals("eliminar")) {
                        int armadurasAeliminar = 0;
                        System.out.println("Selecciona las armaduras que desea eliminar: ");
                        while (armadurasAeliminar != arrayListArmaduras.size()) {// habria que limitar para que no
                                                                                 // acepte enteros
                            // mayores que el size
                            System.out.println("Armaduras actuales: ");
                            MostrarArmaduras(personajeEle);
                            armadurasAeliminar = escanerLectura.nextInt();
                            if (!(armadurasAeliminar >= arrayListArmaduras.size())) {
                                arrayListArmaduras.remove(armadurasAeliminar);
                                Armadura[] arrayArmaduras = arrayListArmaduras.toArray(new Armadura[0]);
                                personajeEle.setArmaduras(arrayArmaduras);
                            } else {
                                System.out
                                        .println("Armadura no incluida, por favor selecciona un armadura de la lista");
                            }
                        }

                    } else if (eleccion.equals("aniadir")) {
                        System.out.println("Elige las armaduras que desea aniadir:");
                        ArrayList<Integer> armadurasElegidas = entidades.MostraryElegir("ARMADURAS");
                        for (int i = 0; i < armadurasElegidas.size(); ++i) {
                            Armadura armaduraElegida = entidades.elegirArmadura(armadurasElegidas.get(i));
                            arrayListArmaduras.add(armaduraElegida);
                        }
                        Armadura[] arrayArmas = arrayListArmaduras.toArray(new Armadura[0]);
                        personajeEle.setArmaduras(arrayArmas);
                    } else {
                        System.out.println("Por favor, escoja una de las opciones disponibles");
                    }
                }
                case 4 -> {
                    System.out.println("Escoge la habilidad que desea: ");
                    int habilidadElegida = entidades.MostraryElegirHabilidad();
                    Habilidad habilidad = entidades.elegirHabilidad(habilidadElegida);
                    personajeEle.setHabilidadPersonaje(habilidad);
                }
                case 5 -> {
                    List<Debilidad> listaDebilidades = Arrays.asList(personajeEle.getDebilidades());
                    ArrayList<Debilidad> arrayListDebilidades = new ArrayList<>(listaDebilidades);
                    System.out.println("Quiere eliminar o aniadir debilidades: ");
                    escanerLectura.nextLine();
                    String eleccion = escanerLectura.nextLine();

                    if (eleccion.equals("eliminar")) {
                        int debilidadesAeliminar = 0;
                        System.out.println("Selecciona las debilidades que desea eliminar:");
                        while (debilidadesAeliminar != arrayListDebilidades.size()) {// habria que limitar para que no
                                                                                     // acepte enteros
                            // mayores que el size
                            System.out.println("Debilidades actuales:");
                            MostrarDebilidades(personajeEle);
                            debilidadesAeliminar = escanerLectura.nextInt();
                            if (!(debilidadesAeliminar >= arrayListDebilidades.size())) {
                                arrayListDebilidades.remove(debilidadesAeliminar);
                                Debilidad[] arrayDebilidades = arrayListDebilidades.toArray(new Debilidad[0]);
                                personajeEle.setDebilidades(arrayDebilidades);
                            } else {
                                System.out
                                        .println("Armadura no incluida, por favor selecciona un armadura de la lista");
                            }
                        }

                    } else if (eleccion.equals("aniadir")) {
                        System.out.println("Elige las debilidades que desea aniadir:");
                        ArrayList<Integer> debilidadesElegidas = entidades.MostraryElegir("DEBILIDADES");
                        for (int i = 0; i < debilidadesElegidas.size(); ++i) {
                            Debilidad debilidadElegida = entidades.elegirDebilidad(debilidadesElegidas.get(i));
                            arrayListDebilidades.add(debilidadElegida);
                        }
                        Debilidad[] arraydebilidades = arrayListDebilidades.toArray(new Debilidad[0]);
                        personajeEle.setDebilidades(arraydebilidades);
                    } else {
                        System.out.println("Por favor, escoja una de las opciones disponibles");
                    }
                }
                case 6 -> {
                    List<Armadura> listaArmaduras = Arrays.asList(personajeEle.getArmaduras());
                    ArrayList<Armadura> arrayListArmaduras = new ArrayList<>(listaArmaduras);
                    System.out.println("Quiere eliminar o aniadir armaduras: ");
                    escanerLectura.nextLine();
                    String eleccion = escanerLectura.nextLine();

                    if (eleccion.equals("eliminar")) {
                        int armadurasAeliminar = 0;
                        System.out.println("Selecciona las armaduras que desea eliminar: ");
                        while (armadurasAeliminar != arrayListArmaduras.size()) {// habria que limitar para que no
                                                                                 // acepte enteros
                            // mayores que el size
                            System.out.println("Armaduras actuales: ");
                            MostrarArmaduras(personajeEle);
                            armadurasAeliminar = escanerLectura.nextInt();
                            if (!(armadurasAeliminar >= arrayListArmaduras.size())) {
                                arrayListArmaduras.remove(armadurasAeliminar);
                                Armadura[] arrayArmaduras = arrayListArmaduras.toArray(new Armadura[0]);
                                personajeEle.setArmaduras(arrayArmaduras);
                            } else {
                                System.out
                                        .println("Armadura no incluida, por favor selecciona un armadura de la lista");
                            }
                        }

                    } else if (eleccion.equals("aniadir")) {
                        System.out.println("Elige las armaduras que desea aniadir:");
                        ArrayList<Integer> armadurasElegidas = entidades.MostraryElegir("ARMADURAS");
                        for (int i = 0; i < armadurasElegidas.size(); ++i) {
                            Armadura armaduraElegida = entidades.elegirArmadura(armadurasElegidas.get(i));
                            arrayListArmaduras.add(armaduraElegida);
                        }
                        Armadura[] arrayArmas = arrayListArmaduras.toArray(new Armadura[0]);
                        personajeEle.setArmaduras(arrayArmas);
                    } else {
                        System.out.println("Por favor, escoja una de las opciones disponibles");
                    }
                }
                case 7 -> {
                    System.out.println("Que nuevo valor de salud desea (entre 1 y 5): ");
                    int eleccion = escanerLectura.nextInt();
                    while (eleccion > 5 || eleccion < 1) {
                        System.out.println("Por favor introduzca un valor entre 1 y 5: ");
                        eleccion = escanerLectura.nextInt();
                    }
                    personajeEle.setSalud(eleccion);
                }
                case 8 -> {
                    System.out.println("Que nuevo valor de daño desea (entre 1 y 5): ");
                    int eleccion = escanerLectura.nextInt();
                    while (eleccion > 5 || eleccion < 1) {
                        System.out.println("Por favor introduzca un valor entre 1 y 5: ");
                        eleccion = escanerLectura.nextInt();
                    }
                    personajeEle.setPoder(eleccion);
                }
                case 9 -> {
                    System.out.println("Volviendo a la pantalla del menu del operador");
                    return;
                }
            }
            int eleccion = 0;
            while (!(eleccion == 1 ^ eleccion == 2)) {
                System.out.println("Desea realizar algun cambio mas:");
                System.out.println("1.Si");
                System.out.println("2.No");
                System.out.println("Por favor seleccione el numero");
                eleccion = escanerLectura.nextInt();
                if (eleccion == 2) {
                    System.out.println("Volviendo a la pantalla del menu del operador");
                    return;
                } else if (eleccion != 1 && eleccion != 2) {
                    System.out.println("Por favor seleccione 1 o dos");
                }
            }

        }
    }

    public void rellenarPropiedadesEspecificas() {

    }

    public int devolverDañoHabilidad(Habilidad habilidad) {
        return habilidad.getValorAtaque();
    }

    @Override
    public Personaje clonar() {
        return null;
    }

    public Debilidad seleccionarDebilidad(String factor) {

        for (Debilidad debilidad : debilidades) {
            if (debilidad.getNombre().equals(factor)) {
                return debilidad;
            }
        }
        return null;
    }

    public Fortaleza seleccionarFortaleza(String factor) {

        for (Fortaleza fortaleza : fortalezas) {
            if (fortaleza.getNombre().equals(factor)) {
                return fortaleza;
            }
        }

        return null;
    }
}
