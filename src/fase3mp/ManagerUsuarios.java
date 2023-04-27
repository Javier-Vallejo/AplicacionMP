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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ManagerUsuarios {
    private ArrayList<Map<String, String>> credencialesUsuarios;
    private ArrayList<Usuario> usuariosRegistrados;

    public ManagerUsuarios() {
        credencialesUsuarios = new ArrayList<Map<String, String>>();
        usuariosRegistrados = new ArrayList<Usuario>();
    }

    public ArrayList<Map<String, String>> getCredencialesUsuarios() {
        return credencialesUsuarios;
    }

    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public Jugador CrearJugador(String nombre, String nick, String password, TipoUsuario rol, State estadoObservador,
            int oro) {
        // deberia comprobar aqui si existe ya en el sistema el jugador
        if (usuariosRegistrados.isEmpty()) {
            Jugador jugador = new Jugador(nombre, nick, password, TipoUsuario.Jugador, oro);// habria
                                                                                            // que
                                                                                            // pasarle
                                                                                            // el oro
                                                                                            // del que
                                                                                            // dispone
                                                                                            // y su
                                                                                            // personaje
                                                                                            // activo
            guardarUsuario(jugador);
            guardarCredenciales(jugador);
            return jugador;
        } else {
            if (existeUsuario(nick, password) == false) {
                Jugador jugador = new Jugador(nombre, nick, password, TipoUsuario.Jugador);
                guardarUsuario(jugador);
                guardarCredenciales(jugador);
                return jugador;
            } else {
                System.out.println("Ya estas registrado con estos datos, no puedes volver a hacerlo");
                return null;
            }
        }
    }

    public OperadorSistema CrearOperador(String nombre, String nick, String password, TipoUsuario rol,
            State estadoObservador) {
        if (usuariosRegistrados.isEmpty()) {
            OperadorSistema operador = new OperadorSistema(nombre, nick, password, rol);
            guardarUsuario(operador);
            guardarCredenciales(operador);
            return operador;
        } else {
            if (existeUsuario(nick, password) == false) {
                OperadorSistema operador = new OperadorSistema(nombre, nick, password, rol);
                guardarUsuario(operador);
                guardarCredenciales(operador);
                return operador;
            } else {
                System.out.println("Ya estas registrado con estos datos, no puedes volver a hacerlo");
                return null;
            }
        }
    }

    private void guardarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    private void guardarCredenciales(Usuario usuario) {
        Map<String, String> credenciales = new HashMap<>();
        credenciales.put(usuario.getNick(), usuario.getPassword());
        credencialesUsuarios.add(credenciales);
    }

    public Boolean existeUsuario(String nick, String password) {
        for (int j = 0; j < credencialesUsuarios.size(); j++) {
            if ((credencialesUsuarios.get(j).containsKey(nick))
                    && (credencialesUsuarios.get(j).containsValue(password))) {
                return true;
            }
        }
        return false;
    }

    public Usuario obtenerUsuario(String nick, String password) {
        if (existeUsuario(nick, password)) {
            for (int i = 0; i < credencialesUsuarios.size(); i++) {
                if (usuariosRegistrados.get(i).getNick().equals(nick)) {
                    return usuariosRegistrados.get(i);
                }
            }
        }
        return null;
    }

    public void eliminarUsuario(String nick, String password) {
        if (existeUsuario(nick, password)) {
            for (int i = 0; i == usuariosRegistrados.size(); i++) {
                if (usuariosRegistrados.get(i).getNick() == nick) {
                    usuariosRegistrados.remove(i);
                }
            }
            for (int i = 0; i == credencialesUsuarios.size(); i++) {
                if (credencialesUsuarios.get(i).containsKey(nick)) {
                    credencialesUsuarios.remove(i);
                }
            }

            File archivo = new File("Ficheros/Usuarios.txt");
            int indiceUsuario = usuariosRegistrados.indexOf(obtenerUsuario(nick, password));
            List<String> lineas = new ArrayList<>();

            try {
                Scanner lector = new Scanner(archivo);

                // cargar todas las líneas del archivo en una lista
                while (lector.hasNextLine()) {
                    lineas.add(lector.nextLine());
                }
                lector.close();

                // reemplazar la línea en la lista con la nueva línea
                lineas.remove(indiceUsuario);

                // escribir la lista actualizada de nuevo en el archivo
                FileWriter escritor = new FileWriter(archivo);
                for (String linea : lineas) {
                    escritor.write(linea + "\n");
                }
                escritor.close();

                System.out.println("Baja exitosa.");

            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo.");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Error al leer o escribir el archivo.");
                e.printStackTrace();
            }
        }
    }

    public void LeerUsuarios(EntidadesActivas entidades) throws FileNotFoundException {
        File file = new File("Ficheros/Usuarios.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();

            String[] partes = linea.split(";");
            String tipo = partes[0];
            String nombre = partes[1];

            if (tipo.equals("operador")) {
                Map<String, String> credencialesOperador = new HashMap<>();
                TipoUsuario rol = TipoUsuario.OperadorSistema;
                Usuario usuarioOperador = new OperadorSistema(nombre, partes[2], partes[3], rol);
                credencialesOperador.put(partes[2], partes[3]);
                usuariosRegistrados.add(usuarioOperador);
                credencialesUsuarios.add(credencialesOperador);
            } else if (tipo.equals("jugador")) {
                Map<String, String> credencialesJugador = new HashMap<>();
                TipoUsuario rol = TipoUsuario.Jugador;
                State estadoObservador = State.noBaneado;
                int oro = Integer.parseInt(partes[5]);
                Usuario usuarioJugador = new Jugador(nombre, partes[2], partes[3], rol, oro);
                Jugador jugador = (Jugador) usuarioJugador;
                if (partes[6].equals("false")) {
                    Boolean estaBaneado = false;
                    jugador.setEstaBaneado(estaBaneado);
                } else if (partes[6].equals("true")) {
                    Boolean estaBaneado = true;
                    jugador.setEstaBaneado(estaBaneado);
                }
                String[] partesPersonaje = partes[7].split("-");
                String tipoPers = partesPersonaje[0];
                String nombrePers = partesPersonaje[1];
                Personaje personaje = entidades.obtenerPersonaje(nombrePers, tipoPers);
                jugador.setPersonajeActivo(personaje);
                usuariosRegistrados.add(usuarioJugador);
                credencialesJugador.put(partes[2], partes[3]);
                credencialesUsuarios.add(credencialesJugador);
            }

        }
    }

    public void guardarUsuarios(Usuario usuario) throws IOException {
        StringBuilder sb = new StringBuilder();
        rellenarStringBuilderUsuario(sb, usuario);
        File file = new File("Ficheros/Usuarios.txt");
        FileWriter escritor = new FileWriter(file, true);
        escritor.write(sb.toString());
        escritor.flush();
    }
    
    public void rellenarStringBuilderUsuario(StringBuilder sb, Usuario usuario){
        if (usuario instanceof Jugador) {
            sb.append("jugador");
        } else if (usuario instanceof OperadorSistema) {
            sb.append("operador");
        }
        sb.append(";");
        sb.append(usuario.getNombre());
        sb.append(";");
        sb.append(usuario.getNick());
        sb.append(";");
        sb.append(usuario.getPassword());
        sb.append(";");
        if (usuario instanceof Jugador) {
            Jugador jugador = (Jugador) usuario;
            sb.append(jugador.getNumeroRegistro());
            sb.append(";");
            Integer oro = jugador.getOro();
            sb.append(oro.toString());
            sb.append(";");
            Boolean estaBaneado = jugador.getEstaBaneado();
            sb.append(estaBaneado.toString());
            sb.append(";");
            Personaje personaje = jugador.getPersonajeActivo();
            if (personaje instanceof Vampiro) {
                sb.append("vampiro-");
            } else if (personaje instanceof Licantropo) {
                sb.append("licantropo-");
            } else if (personaje instanceof Cazador) {
                sb.append("cazador-");
            }
            sb.append(personaje.getNombre());
            sb.append("-");
            sb.append(personaje.getHabilidadPersonaje().getNombre());
            sb.append("/");
            sb.append(personaje.getHabilidadPersonaje().getLimitante());
            sb.append("/");
            sb.append(personaje.getHabilidadPersonaje().getValorAtaque());
            sb.append("/");
            sb.append(personaje.getHabilidadPersonaje().getValorDefensa());
            sb.append("-");
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
            sb.append("-");
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
            sb.append("-");
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
            sb.append("-");
            // armadura activa
            sb.append(personaje.getArmaduraActiva().getNombre());
            sb.append("/");
            sb.append(personaje.getArmaduraActiva().getModDanio());
            sb.append("/");
            sb.append(personaje.getArmaduraActiva().getModDefensa());
            sb.append("-");
            // esbirros
            Esbirro[] esbirros = personaje.getEsbirros();
            escribirEsbirrosdeEsbirro(esbirros, sb);
            sb.append("-");
            // salud
            sb.append(personaje.getSalud());
            sb.append("-");
            // poder
            sb.append(personaje.getPoder());
            sb.append("-");
            // debilidades
            Debilidad[] debilidades = personaje.getDebilidades();
            for (int i = 0; i < debilidades.length; i++) {
                sb.append(debilidades[i].getNombre());
                sb.append("/");
                sb.append(debilidades[i].getValor());
                sb.append("|");
            }
            sb.append("-");
            // fortalezas
            Fortaleza[] fortalezas = personaje.getFortalezas();
            for (int i = 0; i < fortalezas.length; i++) {
                sb.append(fortalezas[i].getNombre());
                sb.append("/");
                sb.append(fortalezas[i].getValor());
                sb.append("|");
            }
            sb.append("-");
            if (personaje instanceof Vampiro vamp) {
                sb.append(vamp.getSangre());
                sb.append("-");
                sb.append(vamp.getEdad());
            } else if (personaje instanceof Licantropo lican) {
                sb.append(lican.getRabia());
            } else if (personaje instanceof Cazador cazador) {
                sb.append(cazador.getVoluntad());
            }
        }
    }

    private void escribirEsbirrosdeEsbirro(Esbirro[] esbirros, StringBuilder sb) {
        // recursividad
        for (int i = 0; i < esbirros.length; i++) {
            sb.append(esbirros[i].getNombre());
            sb.append("/");
            sb.append(esbirros[i].getSalud());
            sb.append("/");
            if (esbirros[i] instanceof Ghoul) {
                Ghoul ghoul = (Ghoul) esbirros[i];
                sb.append(ghoul.getDependencia());
                sb.append("|");// separara cada esbirro con |
            } else if (esbirros[i] instanceof Humano) {
                Humano humano = (Humano) esbirros[i];
                sb.append(humano.getLealtad());
                sb.append("|");
            } else if (esbirros[i] instanceof Demonio) {
                Demonio demonio = (Demonio) esbirros[i];
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
                sb.append("|");
                ArrayList<Esbirro> esbirrosDeEsbirro = demonio.getEsbirros();
                for (int j = 0; j < esbirrosDeEsbirro.size(); j++) {
                    escribirEsbirrosdeEsbirro(esbirros, sb); // recursividad
                }
            }
        }
    }

    public void editarUsuarioEnFichero(String nick, String password) {
        File archivo = new File("Ficheros/Usuarios.txt");
        int indiceUsuario = usuariosRegistrados.indexOf(obtenerUsuario(nick, password));
        List<String> lineas = new ArrayList<>();
        StringBuilder sbNuevo = new StringBuilder();
        rellenarStringBuilderUsuario(sbNuevo, obtenerUsuario(nick, password));
        String lineaNueva = sbNuevo.toString();

        try {
            Scanner lector = new Scanner(archivo);

            // cargar todas las líneas del archivo en una lista
            while (lector.hasNextLine()) {
                lineas.add(lector.nextLine());
            }
            lector.close();

            // reemplazar la línea en la lista con la nueva línea
            lineas.set(indiceUsuario , lineaNueva);

            // escribir la lista actualizada de nuevo en el archivo
            FileWriter escritor = new FileWriter(archivo);
            for (String linea : lineas) {
                escritor.write(linea + "\n");
            }
            escritor.close();

            System.out.println("El usuario ha sido ha sido editado con éxito.");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo.");
            e.printStackTrace();
        }
    }
}
