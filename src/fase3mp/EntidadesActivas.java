package fase3mp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import fase3mp.Humano.nivelLealtad;


public class EntidadesActivas {

    private ArrayList<Personaje> personajes;
    private ArrayList<Arma> armas;
    private ArrayList<Armadura> armaduras;
    private ArrayList<Fortaleza> fortalezas;
    private ArrayList<Debilidad> debilidades;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Esbirro> esbirros;
    private FabricaEsbirros fabricaEsbirros;

    public EntidadesActivas() {
        personajes = new ArrayList<>();
        armas = new ArrayList<>();
        armaduras = new ArrayList<>();
        fortalezas = new ArrayList<>();
        debilidades = new ArrayList<>();
        habilidades = new ArrayList<>();
        esbirros = new ArrayList<>();
        
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

    public Esbirro devolverEsbirro(String nombre, int salud, String tipo) {
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

    public ArrayList<Integer> MostraryElegir(String objetoMostrar) {
        Scanner escaner = new Scanner(System.in);
        if (objetoMostrar.equals("PERSONAJES")) {
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println("- " + i + ".Personaje: " + personajes.get(i).getNombre());
            }
            System.out.println("- " + (personajes.size()) + ".Salir");
            System.out.println("Escoja el numero por favor:");

            int personajeEle = escaner.nextInt(); // Si nos mete una letra peta

            ArrayList<Integer> personajesElegidos = new ArrayList<>();
            while (personajeEle > personajesElegidos.size() || personajeEle < 0) {
                System.out.println("Por favor ingrese un numero de la lista indicada anteriormente.");
                personajeEle = escaner.nextInt();
            }
            if (personajeEle == personajes.size()) {
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
            if (armas.size() == 0) {
                System.out.println("No hay armas en el sistema.");
            }
            ArrayList<Integer> armasElegidas = new ArrayList<>();
            while (armaEle != armas.size()) {
                armaEle = escaner.nextInt();
                if (!(armaEle < 0) && !(armaEle >= armas.size())) {
                    if (armasElegidas.contains(armaEle)) {
                        System.out.println("Ya posee esta arma, elija otra de la lista.");
                    } else {
                        armasElegidas.add(armaEle);
                    }
                } else if (armaEle != armas.size()) {
                    System.out.println("Arma erronea. Por favor, introduzca un arma de la lista.");
                    
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
            if (armaduras.size() == 0) {
                System.out.println("No hay armaduras en el sistema.");
            }
            while (armaduraEle != armaduras.size()) {
                armaduraEle = escaner.nextInt();
                if (!(armaduraEle >= armaduras.size()) && !(armaduraEle < 0)) {
                    if (armadurasElegidas.contains(armaduraEle)) {
                        System.out.println("Ya posee esta armadura, elija otra de la lista");
                    } else {
                        armadurasElegidas.add(armaduraEle);
                    }
                } else if (armaduraEle != armaduras.size()) {
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
            if (fortalezas.size() == 0) {
                System.out.println("No hay fortalezas en el sistema.");
            }
            ArrayList<Integer> fortalezasElegidas = new ArrayList<>();
            while (fortalezaEle != fortalezas.size()) {
                fortalezaEle = escaner.nextInt();

                if (!(fortalezaEle >= fortalezas.size()) && !(fortalezaEle < 0)) {
                    if (fortalezasElegidas.contains(fortalezaEle)) {
                        System.out.println("Ya posee esta fortaleza, elija otra de la lista");
                    } else {
                        fortalezasElegidas.add(fortalezaEle);
                    }
                } else if(fortalezaEle>fortalezas.size() || fortalezaEle<0){
                    System.out.println("Fortaleza erronea. Por favor, introduzca una fortaleza de la lista");
                }
            }
            return fortalezasElegidas;

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
            while (debilidadEle != debilidades.size()) {
                debilidadEle = escaner.nextInt();
                if (!(debilidadEle >= debilidades.size()) && !(debilidadEle < 0)) {
                    if (debilidadesElegidas.contains(debilidadEle)) {
                        System.out.println("Ya posee esta debilidad, por favor elija otra de la lista.");
                    } else {
                        debilidadesElegidas.add(debilidadEle);
                    }
                } else if (debilidadEle>debilidades.size() || debilidadEle<0){
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
            System.out.println("- " + (esbirros.size()) + ".Salir");
            ArrayList<Integer> esbirrosElegidos = new ArrayList<>();
            int esbirro = 0;
            while (esbirroEle != esbirros.size()) {
                esbirroEle = escaner.nextInt();
                if (esbirroEle < 0 || esbirroEle > esbirros.size()) {
                    System.out.println(
                            "Esbirro inexistente. Por favor introduzca el numero de uno de los esbirros disponibles.");
                }else if(esbirroEle != esbirros.size()){
                    esbirro = esbirroEle;
                }
                esbirrosElegidos.add(esbirro);
            }
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
            while (esbirroEle != esbirros.size()) {
                esbirroEle = escaner.nextInt();
                if (esbirroEle < 0 || esbirroEle > esbirros.size()) {
                    System.out.println(
                            "Esbirro inexistente. Por favor introduzca el numero de uno de los esbirros disponibles.");
                }else if(esbirroEle != esbirros.size()){
                    esbirro = esbirroEle;
                }
            }
            esbirroElegido.add(esbirro);
            return esbirroElegido;
        } else {
            System.out.println("No existe el contenido " + objetoMostrar);
            return null;
        }

    }

    public int MostraryElegirHabilidad() {
        int habilidadElegida = 0;
        Scanner escaner = new Scanner(System.in);

        for (int i = 0; i < habilidades.size(); i++) {
            System.out.println("Habilidad " + i + " " + habilidades.get(i).getNombre());
        }
        System.out.println((habilidades.size()) + " Salir");
        while (habilidadElegida != habilidades.size()) {
            habilidadElegida = escaner.nextInt();
            if (!(habilidadElegida >= habilidades.size()) && !(habilidadElegida < 0)) {
                return habilidadElegida;
            } else {
                System.out.println("Habilidad erronea, por favor introduzca una habilidad de la lista.");
            }
        }
        return habilidadElegida;
    }

    public Personaje obtenerPersonaje(String nombre, String tipo, int salud) {
        for (int i = 0; i < personajes.size(); i++) {
            if (personajes.get(i).getNombre().equals(nombre) && personajes.get(i).getSalud() == salud) {
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
            escritor.write("\n");
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
            //sb.append(",");
        } else if (esbirro instanceof Humano) {
            sb.append("humano");
            sb.append("/");
            Humano humano = (Humano) esbirro;
            sb.append(humano.getLealtad());
            //sb.append(",");
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

            sb.append("#");
            ArrayList<Esbirro> esbirrosDeEsbirro = demonio.getEsbirros();
            for (int j = 0; j < esbirrosDeEsbirro.size(); j++) {
                rellenarStringBuilderSubEsbirros(esbirrosDeEsbirro.get(j), sb); 
            }
            sb.append("#");
        }

    }

    private void rellenarStringBuilderSubEsbirros(Esbirro esbirro, StringBuilder sb) {
        // recursividad
        sb.append(esbirro.getNombre());
        sb.append("-");
        sb.append(esbirro.getSalud());
        sb.append("-");
        if (esbirro instanceof Ghoul) {
            sb.append("ghoul");
            sb.append("-");
            Ghoul ghoul = (Ghoul) esbirro;
            sb.append(ghoul.getDependencia());
            sb.append(",");
        } else if (esbirro instanceof Humano) {
            sb.append("humano");
            sb.append("-");
            Humano humano = (Humano) esbirro;
            sb.append(humano.getLealtad());
            sb.append(",");
        } else if (esbirro instanceof Demonio) {
            sb.append("demonio");
            sb.append("-");
            Demonio demonio = (Demonio) esbirro;
            if (demonio.getTienePacto()) {
                sb.append("si");
                sb.append("-");
                sb.append(demonio.getPacto().getAmo().getNombre());
                sb.append("-");
            } else {
                sb.append("no");
                sb.append("-");
                sb.append("null");
                sb.append("-");
            }

            sb.append("#");
            ArrayList<Esbirro> esbirrosDeEsbirro = demonio.getEsbirros();
            for (int j = 0; j < esbirrosDeEsbirro.size(); j++) {
                rellenarStringBuilderSubEsbirros(esbirrosDeEsbirro.get(j), sb); 
            }
            sb.append("#");
            sb.append(",");
        }

    }

    public void leerEsbirros() throws FileNotFoundException {
        File file = new File("Ficheros/Esbirros.txt");
        Scanner scannerEsbi = new Scanner(file);
        while (scannerEsbi.hasNextLine()) {
            boolean esta = false;
            String lineaEsbi = scannerEsbi.nextLine();
            //String[] partesComas = lineaEsbi.split(",");
            String[] partesEsbirro = lineaEsbi.split("/");
            String nombreEsbi = partesEsbirro[0];
            int salud = Integer.parseInt(partesEsbirro[1]);
            if (partesEsbirro[2].equals("humano")) {
                String lealtad = partesEsbirro[3];
                fabricaEsbirros = new FabricaHumano();
                Humano humano = (Humano) fabricaEsbirros.crearEsbirro(nombreEsbi, salud);
                if (lealtad.equals("BAJA")) {
                    humano.setLealtad(nivelLealtad.BAJA);
                } else if (lealtad.equals("NORMAL")) {
                    humano.setLealtad(nivelLealtad.NORMAL);
                } else if (lealtad.equals("ALTA")) {
                    humano.setLealtad(nivelLealtad.ALTA);
                }
                esbirros.add(humano);
            } else if (partesEsbirro[2].equals("ghoul")) {
                int dependencia = Integer.parseInt(partesEsbirro[3]);
                fabricaEsbirros = new FabricaGhoul();
                Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsbi, salud);
                ghoul.setDependencia(dependencia);
                for(int j = 0; j < esbirros.size(); j++){
                    if(esbirros.get(j).getNombre().equals(ghoul.getNombre()) && esbirros.get(j) instanceof Ghoul){
                        esta=true;
                    }
                }
                if (!esta){
                    esbirros.add(ghoul);
                }

            } else if (partesEsbirro[2].equals("demonio")) {
                String[] partesEsbirroDeEsbirro = partesEsbirro[5].split("#");
                Pacto pacto = null;
                Boolean tienePacto = false;
                if (partesEsbirro[3].equals("si")) {
                    tienePacto = true;
                    String nombreAmo = partesEsbirroDeEsbirro[0];
                    pacto = new Pacto();
                } else if (partesEsbirro[3].equals("no")) {
                    String nombreAmo = null;
                    pacto = null;
                }
                ArrayList<Esbirro> esbirrosPrinc = new ArrayList<>();
                leerEsbirrosPertenecientesAEsbirro(partesEsbirroDeEsbirro, esbirrosPrinc, 0);
                // aqui me creare el primer demonio ahora que tengo sus subesbirros
                fabricaEsbirros = new FabricaDemonio();
                Demonio demonio = (Demonio) fabricaEsbirros.crearEsbirro(nombreEsbi, salud);
                demonio.setPacto(pacto);
                demonio.setBooleanPacto(tienePacto);
                demonio.setFabricaEsbirros(fabricaEsbirros);
                demonio.setEntidades(this);
                demonio.setEsbirros(esbirrosPrinc);
                for(int j = 0; j < esbirros.size(); j++){
                    if(esbirros.get(j).getNombre().equals(demonio.getNombre()) && esbirros.get(j) instanceof Demonio){
                        esta=true;
                    }
                }
                if (!esta){
                    esbirros.add(demonio);
                }
            }
        }
    }

    private void leerEsbirrosPertenecientesAEsbirro(String[] partesEsbirroDeEsbirro, ArrayList<Esbirro> esbirrosPert,
            int i) {
        if (i + 1 != partesEsbirroDeEsbirro.length) {
            String[] Esbirr = partesEsbirroDeEsbirro[i + 1].split(",");
            boolean estaSecundario = false;
            for (int x = 0; x < Esbirr.length; x++) {
                String[] partesEsb = Esbirr[x].split("-");
                if (partesEsb[2].equals("ghoul")) {
                    String nombreEsb = partesEsb[0];
                    int saludEsb = Integer.parseInt(partesEsb[1]);
                    int dependencia = Integer.parseInt(partesEsb[3]);
                    fabricaEsbirros = new FabricaGhoul();
                    Ghoul ghoul = (Ghoul) fabricaEsbirros.crearEsbirro(nombreEsb, saludEsb);
                    ghoul.setDependencia(dependencia);
                    esbirrosPert.add(ghoul);
                    for(int j = 0; j < esbirros.size(); j++){
                        if(esbirros.get(j).getNombre().equals(ghoul.getNombre()) && esbirros.get(j) instanceof Ghoul){
                            estaSecundario=true;
                        }
                    }
                    if (!estaSecundario){
                        esbirros.add(ghoul);
                    }
                } else if (partesEsb[2].equals("demonio")) {
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
                    demonio.setEsbirros(esbirrosDeEsb);
                    for(int j = 0; j < esbirros.size(); j++){
                        if(esbirros.get(j).getNombre().equals(demonio.getNombre()) && esbirros.get(j) instanceof Demonio){
                            estaSecundario=true;
                    }
                }
                if (!estaSecundario){
                    esbirros.add(demonio);
                }
                }
            }

        } else {
            String[] Esbirr = partesEsbirroDeEsbirro[i].split(",");
            for (int j = 0; j < Esbirr.length; j++) {
                String[] partesEsb = Esbirr[j].split("-");
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
                    demonio.setEsbirros(null);
                    if (!esbirros.contains(demonio)) {
                        esbirros.add(demonio);
                    }
                }
            }
        }
    }

}
