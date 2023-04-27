/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class EntidadesActivas {
    private ArrayList<Personaje> personajes;
    private ArrayList<Arma> armas;
    private ArrayList<Armadura> armaduras;
    private ArrayList<Fortaleza> fortalezas;
    private ArrayList<Debilidad> debilidades;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Esbirro> esbirros;

    public EntidadesActivas() {
        personajes = new ArrayList<>();
        armas = new ArrayList<>();
        armaduras = new ArrayList<>();
        fortalezas = new ArrayList<>();
        debilidades = new ArrayList<>();
        habilidades = new ArrayList<>();
        esbirros = new ArrayList<>();
        // leer de los ficheros correspondientes y rellenar
    }

    public ArrayList<Fortaleza> getFortalezas() {
        return fortalezas;
    }

    public ArrayList<Debilidad> getDebilidades() {
        return debilidades;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Armadura> getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(ArrayList<Armadura> armaduras) {
        this.armaduras = armaduras;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void aniadir(Object objeto) {
        // comprueba de que clase es objeto y meterlo en su respectiva lista
        if (objeto instanceof Personaje) {
            Personaje personaje = (Personaje) objeto;
            personajes.add(personaje);
        } else if (objeto instanceof Arma) {
            Arma arma = (Arma) objeto;// comprobar si ya estan en el sistema
            armas.add(arma);
        } else if (objeto instanceof Armadura) {
            Armadura armadura = (Armadura) objeto;
            armaduras.add(armadura);
        } else if (objeto instanceof Habilidad) {
            Habilidad habilidad = (Habilidad) objeto;
            habilidades.add(habilidad);
        } else if (objeto instanceof Humano) {
            Humano humano = (Humano) objeto;
            if (!existeEsbirro(humano)) {
                esbirros.add(humano);
            } else {
                System.out.println("No se ha agregado porque ya existe en el sistema");
            }
        } else if (objeto instanceof Ghoul) {
            Ghoul ghoul = (Ghoul) objeto;
            if (!existeEsbirro(ghoul)) {
                esbirros.add(ghoul);
            } else {
                System.out.println("No se ha agregado porque ya existe en el sistema");
            }
        } else if (objeto instanceof Demonio) {
            Demonio demonio = (Demonio) objeto;
            if (!existeEsbirro(demonio)) {
                esbirros.add(demonio);
            } else {
                System.out.println("No se ha agregado porque ya existe en el sistema");
            }
        }

    }

    public boolean existeEsbirro(Esbirro esbirro) {// comparacion esbirros para si se guarda en sistema
        if (esbirros.contains(esbirro)) {
            return true;
        } else {
            return false;
        }

    }

    public Personaje elegirPersonaje(int eleccion) {
        return personajes.get(eleccion);
    }

    public Arma elegirArma(int eleccion) {
        return armas.get(eleccion);
    }

    public Armadura elegirArmadura(int eleccion) {
        return armaduras.get(eleccion);
    }

    public Fortaleza elegirFortaleza(int eleccion) {
        return fortalezas.get(eleccion);
    }

    public Debilidad elegirDebilidad(int eleccion) {
        return debilidades.get(eleccion);
    }

    public Esbirro obtenerEsbirro(int eleccion) {
        return esbirros.get(eleccion);
    }

    public Habilidad elegirHabilidad(int eleccion) {
        return habilidades.get(eleccion);
    }

    public ArrayList<Integer> MostraryElegir(String objetoMostrar) {// se podrian poner if para controlar que meta un
                                                                    // numero
        Scanner escaner = new Scanner(System.in);// en el rango correcto
        if (objetoMostrar.equals("PERSONAJES")) {
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println("Personaje " + i + ": " + personajes.get(i).getNombre());
            }
            System.out.println((personajes.size()) + " Salir");
            System.out.println("Escoja el numero por favor:");
            int personajeEle = escaner.nextInt();
            ArrayList<Integer> personajesElegidos = new ArrayList<>();
            personajesElegidos.add(personajeEle);
            return personajesElegidos;
        } else if (objetoMostrar.equals("ARMAS")) {
            int armaEle = 0;
            for (int i = 0; i < armas.size(); i++) {
                System.out.println(
                        "Arma " + i + ": " + armas.get(i).getNombre() + " " + armas.get(i).getTipodeArma().toString());
            }
            System.out.println((armas.size()) + " Salir");
            ArrayList<Integer> armasElegidas = new ArrayList<>();
            while (armaEle != armas.size()) {// habria que limitar para que no acepte enteros mayores que el size
                armaEle = escaner.nextInt();
                if (!(armaEle == armas.size())) {
                    armasElegidas.add(armaEle);
                }
                return armasElegidas;
            }
        } else if (objetoMostrar.equals("ARMADURAS")) {
            int armaduraEle = 0;
            for (int i = 0; i < armaduras.size(); i++) {
                System.out.println("Armadura " + i + armaduras.get(i).getNombre());
            }
            System.out.println((armaduras.size()) + " Salir");
            ArrayList<Integer> armadurasElegidas = new ArrayList<>();
            while (armaduraEle != armaduras.size()) {
                if (!(armaduraEle == armaduras.size())) {
                    armaduraEle = escaner.nextInt();
                    armadurasElegidas.add(armaduraEle);
                }
                return armadurasElegidas;
            }
        } else if (objetoMostrar.equals("FORTALEZAS")) {
            int fortalezaEle = 0;
            for (int i = 0; i < fortalezas.size(); i++) {
                System.out.println("Fortaleza " + i + fortalezas.get(i).getNombre());
            }
            System.out.println((fortalezas.size()) + " Salir");
            ArrayList<Integer> fortalezasElegidas = new ArrayList<>();
            while (fortalezaEle != fortalezas.size()) {
                if (!(fortalezaEle == fortalezas.size())) {
                    fortalezaEle = escaner.nextInt();
                    fortalezasElegidas.add(fortalezaEle);
                }
                return fortalezasElegidas;
            }
        } else if (objetoMostrar.equals("DEBILIDADES")) {
            int debilidadEle = 0;
            for (int i = 0; i < debilidades.size(); i++) {
                System.out.println("Debilidad " + i + debilidades.get(i).getNombre());
            }
            System.out.println(debilidades.size() + " Salir");
            ArrayList<Integer> debilidadesElegidas = new ArrayList<>();
            while (debilidadEle != debilidades.size()) {
                if (!(debilidadEle == debilidades.size())) {
                    debilidadEle = escaner.nextInt();
                    debilidadesElegidas.add(debilidadEle);
                }
                return debilidadesElegidas;
            }
        } else if (objetoMostrar.equals("ESBIRROS")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println(
                        "Esbirro " + i + esbirros.get(i).getNombre() + " " + esbirros.get(i).getClass().getName());
            }
            System.out.println((debilidades.size()) + " Salir");
            ArrayList<Integer> esbirrosElegidos = new ArrayList<>();
            while (esbirroEle != debilidades.size()) {
                esbirroEle = escaner.nextInt();
                esbirrosElegidos.add(esbirroEle);
                return esbirrosElegidos;
            }
        } else if (objetoMostrar.equals("ESBIRRO")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println(
                        "Esbirro " + i + esbirros.get(i).getNombre() + " " + esbirros.get(i).getClass().getName());
            }
            System.out.println((esbirros.size()) + " Salir");
            ArrayList<Integer> esbirroElegido = new ArrayList<>();
            while (esbirroEle != esbirros.size()) {
                esbirroEle = escaner.nextInt();
            }
            esbirroElegido.add(esbirroEle);
            return esbirroElegido;
        }

        else {
            System.out.println("No existe el contenido " + objetoMostrar);
            return null;
        }
        return null;
    }

    public int MostraryElegirHabilidad() {
        int habilidadElegida = 0;
        Scanner escaner = new Scanner(System.in);

        for (int i = 0; i < habilidades.size(); i++) {
            System.out.println("Habilidad " + i + habilidades.get(i).getNombre());
        }
        System.out.println((habilidades.size() + 1) + " Salir");
        habilidadElegida = escaner.nextInt();
        return habilidadElegida;
    }

    public Personaje obtenerPersonaje(String nombre, String tipo) {
        for (int i = 0; i < personajes.size(); i++) {
            if (personajes.get(i).getNombre().equals(nombre)) {
                if (personajes.get(i) instanceof Vampiro && tipo.equals("vampiro")) {
                    return personajes.get(i);
                } else if (personajes.get(i) instanceof Licantropo && tipo.equals("licantropo")) {
                    return personajes.get(i);
                } else if (personajes.get(i) instanceof Cazador && tipo.equals("cazador")) {
                    return personajes.get(i);
                }
            }
        }
        return null;
    }

    public void LeerEntidades() throws FileNotFoundException {
        File file = new File("Ficheros/Entidades.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();

            String[] partes = linea.split(" ");
            String tipo = partes[0];
            String nombre = partes[1];

            if (tipo.equals("arma")) {
                Arma arma = new Arma(nombre, partes[2], partes[3], partes[4]);
                armas.add(arma);
            } else if (tipo.equals("armadura")) {
                Armadura armadura = new Armadura(nombre, partes[2], partes[3]);
                armaduras.add(armadura);
            } else if (tipo.equals("fortaleza")) {
                Fortaleza fortaleza = new Fortaleza(nombre, Integer.parseInt(partes[2]));
                fortalezas.add(fortaleza);
            } else if (tipo.equals("debilidad")) {
                Debilidad debilidad = new Debilidad(nombre, Integer.parseInt(partes[2]));
                debilidades.add(debilidad);
            }

        }
    }

}
