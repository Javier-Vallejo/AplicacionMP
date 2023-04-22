/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase3mp;

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

    public void editarPersonaje() {

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

    public Debilidad seleccionarDebilidad(String clima) {

        for (Debilidad debilidad : debilidades) {
            if (debilidad.getNombre().equals(clima)) {
                return debilidad;
            }
        }
        return null;
    }
}
