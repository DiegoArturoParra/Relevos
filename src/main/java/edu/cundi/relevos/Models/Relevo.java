package edu.cundi.relevos.Models;

/**
 *
 * @author diego parra
 */
public abstract class Relevo {

    /**
     *
     */
    private int meta;
    /**
     *
     */
    private int distancia;
    /**
     *
     */
    private String color;
    /**
     *
     */
    private int aleatorio;
    /**
     *
     */
    private int metaAlcanzada;

    /**
     *
     */
    /**
     *
     */
    public Relevo() {
        this.meta = 300;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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
    public int getDistancia() {
        return distancia;
    }

    /**
     *
     * @param distancia
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
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

    /**
     *
     * @return
     */
    public int getMetaAlcanzada() {
        return metaAlcanzada;
    }

    /**
     *
     * @param metaAlcanzada
     */
    public void setMetaAlcanzada(int metaAlcanzada) {
        this.metaAlcanzada = metaAlcanzada;
    }

    /**
     *
     */
    public abstract void agregarCorredores();

    /**
     *
     */
    public abstract void corriendo();

    /**
     * 
     */
    public abstract void comenzarCarrera();
}
