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

    public void MostrarArmas (Personaje personajeEle) {
        Arma[] armasPersonaje = personajeEle.getArmas();
        for (Arma armaPersonaje: armasPersonaje) {
                System.out.print(armaPersonaje.getNombre());
                System.out.println(armaPersonaje.devolverModificadores());
            }
    }

    public void editarPersonaje(Personaje personajeEle, EntidadesActivas entidades) {
        int opcion = 0; 
        Scanner escanerLectura = new Scanner(System.in);
        while(opcion!=9){
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
            switch(opcion){
                case 1-> {
                    System.out.println("Introduzca nuevo nombre: ");//hacer que no se repitan nombres personajes
                    String nuevoNombre = escanerLectura.nextLine();
                    personajeEle.setNombre(nuevoNombre);
                } case 2 ->{
                    System.out.println("Armas actuales: ");
                    MostrarArmas(personajeEle);
                    System.out.println("Quiere eliminar o aniadir armas: ");
                    String eleccion = escanerLectura.nextLine();
                    if(eleccion.equals("eliminar")){
                        System.out.println("Selecciona las armas que quieras eliminar: ");
                        ArrayList<Integer> armasBorrar = new ArrayList<>();
                        int nuevoNombre = escanerLectura.nextInt();
                       

                        Arma[] arrayArmas = personajeEle.getArmas();
                        List<Arma> lista = Arrays.asList(arrayArmas);
                        ArrayList<Arma> arrayList = new ArrayList<>(lista);

                    }else if(eleccion.equals("aniadir")){

                    }else{

                    }
                } case 3 ->{
                    System.out.println("Quiere eliminar o añadir armaduras: ");
                    String eleccion = escanerLectura.nextLine();
                    if(eleccion.equals("eliminar")){

                    }else if(eleccion.equals("añadir")){

                    }else{

                    }
                } case 4 ->{
                    System.out.println("Escoge la habilidad que desea: ");
                    //mostrar habilidades y elegir
                } case 5 ->{
                    System.out.println("Quiere eliminar o añadir debilidades: ");
                    String eleccion = escanerLectura.nextLine();
                    if(eleccion.equals("eliminar")){

                    }else if(eleccion.equals("añadir")){

                    }else{

                    }
                } case 6 -> {
                    System.out.println("Quiere eliminar o añadir fortalezas: ");
                    String eleccion = escanerLectura.nextLine();
                    if(eleccion.equals("eliminar")){

                    }else if(eleccion.equals("añadir")){

                    }else{

                    }
                } case 7 ->{
                    System.out.println("Que nuevo valor de salud desea (entre 1 y 5): ");
                    int eleccion = escanerLectura.nextInt();
                    while(eleccion>5 || eleccion<1){
                        System.out.println("Por favor introduzca un valor entre 1 y 5: ");
                        eleccion = escanerLectura.nextInt();
                    }
                    personajeEle.setSalud(eleccion);
                } case 8 ->{
                    System.out.println("Que nuevo valor de daño desea (entre 1 y 5): ");
                    int eleccion = escanerLectura.nextInt();
                    while(eleccion>5 || eleccion<1){
                        System.out.println("Por favor introduzca un valor entre 1 y 5: ");
                        eleccion = escanerLectura.nextInt();
                    }
                    personajeEle.setPoder(eleccion);
                } case 9 ->{
                    System.out.println("Volviendo a la pantalla del menu del operador");
                }
            }
            System.out.println("Desea realizar algun cambio mas: 1.si/2.no");
            int eleccion = escanerLectura.nextInt();
            if (eleccion==2){
                System.out.println("Volviendo a la pantalla del menu del operador");
                return;
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

        for(Debilidad debilidad: debilidades){
            if (debilidad.getNombre().equals(factor) ) {
                return debilidad;
            }
        }
        return null;
    }

    public Fortaleza seleccionarFortaleza(String factor) {
        
        for(Fortaleza fortaleza: fortalezas){
            if (fortaleza.getNombre().equals(factor) ) {
                return fortaleza;
            }
        }
        
        return null;
    }
}
