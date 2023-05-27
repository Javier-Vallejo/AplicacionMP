package fase3mp;

import java.util.Scanner;


public class Ghoul extends Esbirro implements IEsbirros {

    private int dependencia;

    public Ghoul(String nombre, int salud) {
        super(nombre, salud);

    }

    @Override
    public void rellenarPropiedadesEspec() {

        Scanner escanerGhoul = new Scanner(System.in); 
        System.out.println("Introduzca el valor de dependencia: ");
        int valorDependencia = escanerGhoul.nextInt();
        dependencia = valorDependencia;

    }

    @Override
    public int calcularVidaRestante() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

    public int getDependencia() {
        return dependencia;
    }

}
