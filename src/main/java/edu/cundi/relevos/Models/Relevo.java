package edu.cundi.relevos.Models;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author diego parra
 */
public class Relevo extends Thread {

    private static final String colorCorredor1 = "\u001B[31m";
    private static final String colorCorredor2 = "\u001B[33m";
    private static final String colorCorredor3 = "\u001B[37m";

    /**
     * atributo guarda nombre.
     */
    private String nombre;
    /**
     * atributo guarda recorrido.
     */
    private String recorrido;
    /**
     * atributo guarda meta.
     */
    private int meta;
    /**
     * atributo guarda distancia del equipo 1.
     */
    private int distancia1;
    /**
     * atributo guarda distancia del equipo 2.
     */
    private int distancia2;
    /**
     * atributo guarda distancia del equipo 3.
     */
    private int distancia3;
    /**
     * atributo guarda el numero aleatorio.
     */
    private int aleatorio;
    /**
     * atributo guarda el inicio del corredor.
     */
    private int inicio;

    /**
     *
     * @param nombre parametro que guarda el nombre del equipo
     * @param inicio parametro que guarda el inicio de la distancia en donde
     * esta el corredor.
     * @param meta parametro que guarda la meta de la carrera.
     */
    public Relevo(String nombre, int inicio, int meta) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.meta = meta;
        this.distancia1 = 0;
        this.distancia2 = 40;
        this.distancia3 = 80;
    }

    /**
     *
     * @return retorna la meta.
     */
    public int getMeta() {
        return meta;
    }

    /**
     *
     * @return el numero aleatorio.
     */
    public int getAleatorio() {
        return aleatorio;
    }

    /**
     *
     * @param aleatorio set cambia el valor.
     */
    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }

    /**
     *
     * @return retorna el nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre parametro que guarda el nombre del equipo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return retorna el recorrido en la consola.
     */
    public String getRecorrido() {
        return recorrido;
    }

    /**
     *
     * @param recorrido set guarda el recorrido en la consola.
     */
    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    /**
     *
     * @return  retorna la distancia del equipo 1.
     */
    public int getDistancia1() {
        return distancia1;
    }

    /**
     *
     * @param distancia1 parametro que guarda la distancia del equipo 1.
     */
    public void setDistancia1(int distancia1) {
        this.distancia1 = distancia1;
    }

    /**
     *
     * @return retorna la distancia del equipo 2.
     */
    public int getDistancia2() {
        return distancia2;
    }

    /**
     *
     * @param distancia2 parametro que guarda la distancia del equipo 2.
     */
    public void setDistancia2(int distancia2) {
        this.distancia2 = distancia2;
    }

    /**
     *
     * @return retorna la distancia del equipo 3.
     */
    public int getDistancia3() {
        return distancia3;
    }

    /**
     *
     * @param distancia3 parametro que guarda la distancia del equipo 3.
     */
    public void setDistancia3(int distancia3) {
        this.distancia3 = distancia3;
    }

    /**
     *
     * @return retorna donde inicia el corredor.
     */
    public int getInicio() {
        return inicio;
    }

    /**
     *
     * @param inicio parametro set que cambia el inicio del corredor.
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
/**
 * 
 * @return metodo que imprime en la consola.
 */
    public synchronized String pintarConsola() {
        recorrido = "\033[36m " + nombre + " ";
        for (int i = inicio; i <= getMeta(); i++) {
            if (i == getDistancia1()) {
                recorrido += colorCorredor1 + " A ";
            } else if (i == getDistancia2()) {
                recorrido += colorCorredor2 + " B ";
            } else if (i == getDistancia3()) {
                recorrido += colorCorredor3 + " C ";
            } else {
                recorrido += "+";
            }
        }
        return recorrido;
    }

    /**
     *
     * @return metodo que retorna un random
     */
    public int generaNumeroAleatorio() {
        int num = ThreadLocalRandom.current().nextInt(0, 50 + 1);
        if (num >= 0 && num <= 15) {
            num = 4;
        } else if (num >= 15 && num <= 30) {
            num = 8;
        } else {
            num = 12;
        }
        return num;
    }
}
