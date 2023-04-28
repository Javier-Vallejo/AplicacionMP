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
    private FabricaEsbirros fabricaEsbirros;// habra que pasarselo como parametro

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

    public Esbirro devolverEsbirro(int salud, String nombre, String tipo) {
        Esbirro esbirro = null;
        for (int i = 0; i < esbirros.size(); i++) {
            esbirro = esbirros.get(i);
            if (esbirro.getSalud() == salud && esbirro.getNombre() == nombre) {
                if (esbirro instanceof Humano && tipo.equals("Humano")) {
                    return esbirro;
                } else if (esbirro instanceof Ghoul && tipo.equals("Ghoul")) {
                    return esbirro;
                } else if (esbirro instanceof Demonio && tipo.equals("Demonio")) {
                    return esbirro;
                }
            }
        }
        return esbirro;
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

    public ArrayList<Integer> MostraryElegir(String objetoMostrar) {// se podrian poner if para controlar que meta un numero
        Scanner escaner = new Scanner(System.in);// en el rango correcto
        if (objetoMostrar.equals("PERSONAJES")) {
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println("- " + i + ".Personaje: " + personajes.get(i).getNombre());
            }
            System.out.println("- " + (personajes.size()) + ".Salir");
            System.out.println("Escoja el numero por favor:");

            int personajeEle = escaner.nextInt(); //Si nos mete una letra peta

            ArrayList<Integer> personajesElegidos = new ArrayList<>();
            while (personajeEle > personajesElegidos.size() || personajeEle < 0) {
                System.out.println("Por favor ingrese un numero de la lista indicada anteriormente.");
                personajeEle = escaner.nextInt();
            }
            if (personajeEle == personajesElegidos.size()) {
                return null;
            } else {
                personajesElegidos.add(personajeEle);
                return personajesElegidos;
            }
        } else if (objetoMostrar.equals("ARMAS")) {
            int armaEle = 0;
            for (int i = 0; i < armas.size(); i++) {
                System.out.println("- " + i + ".Arma: " + armas.get(i).getNombre() + " "
                        + armas.get(i).getTipodeArma().toString());
            }
            System.out.println("- " + armas.size() + ".Salir");
            ArrayList<Integer> armasElegidas = new ArrayList<>();
            while (armaEle != armas.size()) {
                armaEle = escaner.nextInt();
                if (!(armaEle < 0) && !(armaEle >= armas.size())) {
                    if (armasElegidas.contains(armaEle)) {
                        System.out.println("Ya posee esta arma, elija otra de la lista.");
                    } else {
                        armaEle = escaner.nextInt();
                        armasElegidas.add(armaEle);
                    }
                } else {
                    System.out.println("Arma erronea. Por favor, introduzca un arma de la lista.");
                    //armaEle = escaner.nextInt();
                }
            }
            return armasElegidas;

        } else if (objetoMostrar.equals("ARMADURAS")) {
            int armaduraEle = 0;
            for (int i = 0; i < armaduras.size(); i++) {
                System.out.println("- " + i + ".Armadura:" + armaduras.get(i).getNombre());
            }
            System.out.println("- " + armaduras.size() + ".Salir");
            ArrayList<Integer> armadurasElegidas = new ArrayList<>();
            while (armaduraEle != armaduras.size()) {
                armaduraEle = escaner.nextInt();
                if (!(armaduraEle >= armaduras.size()) && !(armaduraEle < 0)) {
                    if (armadurasElegidas.contains(armaduraEle)) {
                        System.out.println("Ya posee esta armadura, elija otra de la lista");
                    } else {
                        armaduraEle = escaner.nextInt();
                        armadurasElegidas.add(armaduraEle);
                    }
                } else {
                    System.out.println("Armadura erronea. Por favor, introduzca un armadura de la lista.");
                }
            }
            return armadurasElegidas;

        } else if (objetoMostrar.equals("FORTALEZAS")) {
            int fortalezaEle = 0;
            for (int i = 0; i < fortalezas.size(); i++) {
                System.out.println("- " + i + ".Fortaleza:" + fortalezas.get(i).getNombre());
            }
            System.out.println("- " + (fortalezas.size()) + ".Salir");
            ArrayList<Integer> fortalezasElegidas = new ArrayList<>();
            while (fortalezaEle != fortalezas.size()) {
                fortalezaEle = escaner.nextInt();

                if (!(fortalezaEle >= fortalezas.size()) && !(fortalezaEle < 0)) {
                    if (fortalezasElegidas.contains(fortalezaEle)) {
                        System.out.println("Ya posee esta fortaleza, elija otra de la lista");
                    } else {
                        fortalezaEle = escaner.nextInt();
                        fortalezasElegidas.add(fortalezaEle);
                    }
                } else {
                    System.out.println("Fortaleza erronea. Por favor, introduzca una fortaleza de la lista");
                }
            }
            return fortalezasElegidas;

        } else if (objetoMostrar.equals("DEBILIDADES")) {
            int debilidadEle = 0;
            for (int i = 0; i < debilidades.size(); i++) {
                System.out.println("- " + i + ".Debilidad:" + debilidades.get(i).getNombre());
            }
            System.out.println("- " + (debilidades.size() + 1) + ".Salir");
            ArrayList<Integer> debilidadesElegidas = new ArrayList<>();
            while (debilidadEle != debilidades.size()) {
                debilidadEle = escaner.nextInt();
                if (!(debilidadEle >= debilidades.size()) && !(debilidadEle < 0)) {
                    if (debilidadesElegidas.contains(debilidadEle)) {
                        System.out.println("Ya posee esta debilidad, por favor elija otra de la lista.");
                    } else {
                        debilidadEle = escaner.nextInt();
                        debilidadesElegidas.add(debilidadEle);
                    }
                } else {
                    System.out.println("Debilidad erronea. Por favor, introduzca una debilidad de la lista.");
                }
            }
            return debilidadesElegidas;

        } else if (objetoMostrar.equals(
                "ESBIRROS")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println("- " + i + ".Esbirro:" + esbirros.get(i).getNombre() + " "
                        + esbirros.get(i).getClass().getName());
            }
            System.out.println("- " + (debilidades.size() + 1) + ".Salir");
            ArrayList<Integer> esbirrosElegidos = new ArrayList<>();
            while (esbirroEle != debilidades.size()) {
                esbirroEle = escaner.nextInt();
                esbirrosElegidos.add(esbirroEle);
                return esbirrosElegidos;
            }
        } else if (objetoMostrar.equals(
                "ESBIRRO")) {
            int esbirroEle = 0;
            for (int i = 0; i < esbirros.size(); i++) {
                System.out.println("- " + i + ".Esbirro " + esbirros.get(i).getNombre() + " "
                        + esbirros.get(i).getClass().getName());
            }
            System.out.println("- " + (esbirros.size() + 1) + ".Salir");
            ArrayList<Integer> esbirroElegido = new ArrayList<>();
            while (esbirroEle != esbirros.size()) {
                esbirroEle = escaner.nextInt();
            }
            esbirroElegido.add(esbirroEle);
            return esbirroElegido;
        } else {
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
        while (habilidadElegida != habilidades.size()) {
            habilidadElegida = escaner.nextInt();
            if (!(habilidadElegida >= habilidades.size()) && !(habilidadElegida <0)){
                return habilidadElegida;
            } else{
                System.out.println("Habilidad erronea, por favor introduzca una habilidad de la lista.");
            }
        }
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

    public void GuardarEsbirroFichero(Esbirro esbirro) throws IOException {
        if (!esbirros.contains(esbirro)) {
            File file = new File("Ficheros/Esbirros.txt");
            StringBuilder sb = new StringBuilder();
            rellenarStringBuilderEsbirro(esbirro, sb);
            FileWriter escritor = new FileWriter(file, true);
            escritor.write(sb.toString());
            escritor.flush();
        } else {
            System.out.println("El esbirro ya estaba guardado");
        }
    }

    private void rellenarStringBuilderEsbirro(Esbirro esbirro, StringBuilder sb) {
        // recursividad
        sb.append(esbirro.getNombre());
        sb.append("/");
        sb.append(esbirro.getSalud());
        sb.append("/");
        if (esbirro instanceof Ghoul) {
            sb.append("ghoul");
            sb.append("/");
            Ghoul ghoul = (Ghoul) esbirro;
            sb.append(ghoul.getDependencia());
            sb.append(",");
        } else if (esbirro instanceof Humano) {
            sb.append("humano");
            sb.append("/");
            Humano humano = (Humano) esbirro;
            sb.append(humano.getLealtad());
            sb.append(",");
        } else if (esbirro instanceof Demonio) {
            sb.append("demonio");
            sb.append("/");
            Demonio demonio = (Demonio) esbirro;
            if (demonio.getTienePacto()) {
                sb.append("si");
                sb.append("/");
                sb.append(demonio.getPacto().getAmo().getNombre());
                sb.append("/");
            } else {
                sb.append("no");
                sb.append("/");
                sb.append("null");
                sb.append("/");
            }

            sb.append("*");
            ArrayList<Esbirro> esbirrosDeEsbirro = demonio.getEsbirros();
            for (int j = 0; j < esbirrosDeEsbirro.size(); j++) {
                rellenarStringBuilderSubEsbirros(esbirro, sb); // debo hacer otra funcion para rellenar esbirros hijos
            }
            sb.append("*");
            sb.append(",");
        }

    }

    private void rellenarStringBuilderSubEsbirros(Esbirro esbirro, StringBuilder sb) {
        // recursividad
        sb.append(esbirro.getNombre());
        sb.append(".");
        sb.append(esbirro.getSalud());
        sb.append(".");
        if (esbirro instanceof Ghoul) {
            sb.append("ghoul");
            sb.append(".");
            Ghoul ghoul = (Ghoul) esbirro;
            sb.append(ghoul.getDependencia());
            sb.append(",");
        } else if (esbirro instanceof Humano) {
            sb.append("humano");
            sb.append(".");
            Humano humano = (Humano) esbirro;
            sb.append(humano.getLealtad());
            sb.append(",");
        } else if (esbirro instanceof Demonio) {
            sb.append("demonio");
            sb.append(".");
            Demonio demonio = (Demonio) esbirro;
            if (demonio.getTienePacto()) {
                sb.append("si");
                sb.append(".");
                sb.append(demonio.getPacto().getAmo().getNombre());
                sb.append(".");
            } else {
                sb.append("no");
                sb.append(".");
                sb.append("null");
                sb.append(".");
            }

            sb.append("*");
            ArrayList<Esbirro> esbirrosDeEsbirro = demonio.getEsbirros();
            for (int j = 0; j < esbirrosDeEsbirro.size(); j++) {
                rellenarStringBuilderSubEsbirros(esbirro, sb); // debo hacer otra funcion para rellenar esbirros hijos
            }
            sb.append("*");
            sb.append(",");
        }

    }

    public void leerEsbirros() throws FileNotFoundException {
        File file = new File("Ficheros/Esbirros.txt");
        Scanner scannerEsbi = new Scanner(file);
        while (scannerEsbi.hasNextLine()) {
            String lineaEsbi = scannerEsbi.nextLine();
            String[] partesEsbirro = lineaEsbi.split("/");
            String nombreEsbi = partesEsbirro[0];
            String[] partesEsbirroDeEsbirro = partesEsbirro[4].split("#");
            int salud = Integer.parseInt(partesEsbirro[1]);
            if (partesEsbirro[2].equals("humano")) {// me falta crearlos y guardarlos en sistema
                int lealtad = Integer.parseInt(partesEsbirro[3]);
            } else if (partesEsbirro[2].equals("ghoul")) {
                int dependencia = Integer.parseInt(partesEsbirro[3]);
            } else if (partesEsbirro[2].equals("demonio")) {
                if (partesEsbirro[3].equals("si")) {
                    Boolean tienePacto = true;
                    String nombreAmo = partesEsbirroDeEsbirro[0];
                    Pacto pacto = new Pacto();
                } else if (partesEsbirro[3].equals("no")) {
                    Boolean tienePacto = false;
                    String nombreAmo = null;
                    Pacto pacto = null;
                }
                ArrayList<Esbirro> esbirrosPrinc = new ArrayList<>();
                leerEsbirrosPertenecientesAEsbirro(partesEsbirroDeEsbirro, esbirrosPrinc, 0);
                // aqui me creare el primer demonio ahora que tengo sus subesbirros
            }
        }
    }

    private void leerEsbirrosPertenecientesAEsbirro(String[] partesEsbirroDeEsbirro, ArrayList<Esbirro> esbirrosPert,
            int i) {
        if (partesEsbirroDeEsbirro[i + 1] != null) {
            String[] Esbirr = partesEsbirroDeEsbirro[i + 1].split(",");
            for (int x = 0; x < Esbirr.length; x++) {
                String[] partesEsb = Esbirr[x].split(".");
                if (partesEsb[2].equals("ghoul")) {
                    String nombreEsb = partesEsb[0];
                    int saludEsb = Integer.parseInt(partesEsb[1]);
                    int dependencia = Integer.parseInt(partesEsb[3]);
                    fabricaEsbirros = new FabricaGhoul();
                    Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsb, saludEsb);
                    ghoul.setDependencia(dependencia);
                    esbirrosPert.add(ghoul);
                    if (!esbirros.contains(ghoul)) {
                        esbirros.add(ghoul);
                    }
                } else if (partesEsb[2].equals("demonio")) {
                    i += 1;
                    ArrayList<Esbirro> esbirrosDeEsb = new ArrayList<>();
                    leerEsbirrosPertenecientesAEsbirro(partesEsbirroDeEsbirro, esbirrosDeEsb, i + 1);
                    String nombreEsb = partesEsb[0];
                    int saludEsb = Integer.parseInt(partesEsb[1]);
                    Boolean tienePacto = null;
                    Pacto pacto = null;
                    if (partesEsb[3].equals("si")) {
                        tienePacto = true;
                        String nombreAmo = partesEsbirroDeEsbirro[4];// habra que pasarselo como parametro a pacto
                        pacto = new Pacto();
                    } else if (partesEsb[3].equals("no")) {
                        tienePacto = false;
                        String nombreAmo = null;
                    }
                    fabricaEsbirros = new FabricaDemonio();
                    Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsb, saludEsb);
                    demonio.setPacto(pacto);
                    demonio.setBooleanPacto(tienePacto);
                    demonio.setFabricaEsbirros(fabricaEsbirros);
                    demonio.setEntidades(this);
                    esbirrosPert.add(demonio);
                    if (!esbirros.contains(demonio)) {
                        esbirros.add(demonio);
                    }
                }
            }

        } else {
            String[] Esbirr = partesEsbirroDeEsbirro[i + 1].split(",");
            for (int j = 0; j < Esbirr.length; j++) {
                String[] partesEsb = Esbirr[j].split(".");
                String nombreEsb = partesEsb[0];
                int saludEsb = Integer.parseInt(partesEsb[1]);
                if (partesEsb[2].equals("humano")) {
                    int lealtad = Integer.parseInt(partesEsb[3]);// habra que comprobar el string y establecer valor del
                    // enum
                    fabricaEsbirros = new FabricaHumano();
                    Humano humano = (Humano) fabricaEsbirros.crearEsbirro(nombreEsb, saludEsb);
                    humano.setLealtad(Humano.nivelLealtad.ALTA);
                    esbirrosPert.add(humano);// lo añado a su demonio
                    if (!esbirros.contains(humano)) {
                        esbirros.add(humano);// lo añado al sistema tambien
                    }
                } else if (partesEsb[2].equals("ghoul")) {
                    int dependencia = Integer.parseInt(partesEsb[3]);
                    fabricaEsbirros = new FabricaGhoul();
                    Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsb, saludEsb);
                    ghoul.setDependencia(dependencia);
                    esbirrosPert.add(ghoul);
                    if (!esbirros.contains(ghoul)) {
                        esbirros.add(ghoul);
                    }
                } else if (partesEsb[2].equals("demonio")) {// habra que setearse como array vacio de esbirros
                    Boolean tienePacto = null;
                    Pacto pacto = null;
                    if (partesEsb[3].equals("si")) {
                        tienePacto = true;
                        String nombreAmo = partesEsbirroDeEsbirro[4];
                        pacto = new Pacto();
                    } else if (partesEsb[3].equals("no")) {
                        tienePacto = false;
                        String nombreAmo = null;
                    }
                    fabricaEsbirros = new FabricaDemonio();
                    Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsb, saludEsb);
                    demonio.setPacto(pacto);
                    demonio.setBooleanPacto(tienePacto);
                    demonio.setFabricaEsbirros(fabricaEsbirros);
                    demonio.setEntidades(this);
                    esbirrosPert.add(demonio);
                    if (!esbirros.contains(demonio)) {
                        esbirros.add(demonio);
                    }
                }
            }
        }
    }

}
