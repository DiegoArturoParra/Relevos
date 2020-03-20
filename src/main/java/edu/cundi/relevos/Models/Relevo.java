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
    private String nombre;
    private String recorrido;
    /**
     *
     */
    private int meta;
    /**
     *
     */
    private int distancia1;
    /**
     *
     */
    private int distancia2;

    /**
     *
     */
    private int distancia3;
    /**
     *
     */
    private int aleatorio;
    /**
     *
     */
    private int inicio;

    /**
     *
     */
    /**
     *
     * @param nombre
     * @param inicio
     * @param meta
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
     * @return
     */
    public int getMeta() {
        return meta;
    }

    /**
     *
     * @return
     */
    public int getAleatorio() {
        return aleatorio;
    }

    /**
     *
     * @param aleatorio
     */
    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public int getDistancia1() {
        return distancia1;
    }

    public void setDistancia1(int distancia1) {
        this.distancia1 = distancia1;
    }

    public int getDistancia2() {
        return distancia2;
    }

    public void setDistancia2(int distancia2) {
        this.distancia2 = distancia2;
    }

    public int getDistancia3() {
        return distancia3;
    }

    public void setDistancia3(int distancia3) {
        this.distancia3 = distancia3;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

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
     * @return
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
