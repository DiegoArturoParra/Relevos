package edu.cundi.relevos.Models;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diego parra
 */
public class Corredor extends Thread {

    /**
     * Se instancia un objeto de la clase relevo.
     */
    Relevo equipo;
    private int distancia;
    private int meta;
    private int distanciaAlcanzada;
    private String equipo1;
    private String equipo2;
    private String equipo3;

    /**
     *
     * @param equipo parametro como objeto de la clase relevo
     * @param distancia parametro con cual inicia los corredores.
     * @param meta parametro con el cual termina los corredores.
     */
    public Corredor(Relevo equipo, int distancia, int meta) {
        this.equipo = equipo;
        this.distancia = distancia;
        this.meta = meta;
    }

    /**
     * Metodo para ejecutar los hilos.
     */
    @Override
    public void run() {

        if (distancia == 0) {
            while (true) {
                distanciaAlcanzada = recorrer(1);
                if (distanciaAlcanzada >= 40) {
                    equipo.setDistancia1(40);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        distancia = 40;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if (distancia == 40) {
            while (true) {
                distanciaAlcanzada = recorrer(2);
                if (distanciaAlcanzada >= 80) {
                    equipo.setDistancia2(80);
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if (distancia == 80) {
            while (true) {
                distanciaAlcanzada = recorrer(3);
                if (distanciaAlcanzada >= 120) {
                    System.out.println("\nEl equipo Ganador es:" + equipo.getNombre());
                    JOptionPane.showMessageDialog(null, "Ganador: " + equipo.getNombre());
                    System.exit(0);
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     *
     * @param numeroDeCorredor Parametro que recibe el numero de jugador
     * @return retorna el recorrido de los corredores.
     */
    public int recorrer(int numeroDeCorredor) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        int recorrido;
        equipo.setAleatorio(equipo.generaNumeroAleatorio());

        if (numeroDeCorredor == 1) {
            recorrido = distanciaCorredor1();
            return recorrido;
        }

        if (numeroDeCorredor == 2) {
            recorrido = distanciaCorredor2();
            return recorrido;
        }

        if (numeroDeCorredor == 3) {
            recorrido = distanciaCorredor3();
            return recorrido;
        }
        return 0;
    }

    /**
     *
     * @return retorna las distancia de los corredores que estan de primeras.
     */
    private int distanciaCorredor1() {
        equipo.setDistancia1(equipo.getDistancia1() + equipo.getAleatorio());
        if (equipo.pintarConsola().contains("Estados Unidos")) {
            equipo1 = equipo.pintarConsola();
        } else if (equipo.pintarConsola().contains("Colombia")) {
            equipo2 = equipo.pintarConsola();
        } else if (equipo.pintarConsola().contains("Jamaica")) {
            equipo3 = equipo.pintarConsola();
        }
        if (equipo1 != null) {
            System.out.println(equipo1);
        }
        if (equipo3 != null) {
            System.out.println(equipo3);
        }
        if (equipo2 != null) {
            System.out.println(equipo2);
        }
        return equipo.getDistancia1();
    }

    /**
     *
     * @return retorna las distancia de los corredores que estan de segundas.
     */
    private int distanciaCorredor2() {
        equipo.setDistancia2(equipo.getDistancia2() + equipo.getAleatorio());
        if (equipo.pintarConsola().contains("Estados Unidos")) {
            equipo1 = equipo.pintarConsola();
        } else if (equipo.pintarConsola().contains("Colombia")) {
            equipo2 = equipo.pintarConsola();
        } else if (equipo.pintarConsola().contains("Jamaica")) {
            equipo3 = equipo.pintarConsola();
        }
        if (equipo1 != null) {
            System.out.println(equipo1);
        }
        if (equipo3 != null) {
            System.out.println(equipo3);
        }
        if (equipo2 != null) {
            System.out.println(equipo2);
        }
        return equipo.getDistancia2();
    }

    /**
     *
     * @return retorna las distancia de los corredores que estan de terceras.
     */
    private int distanciaCorredor3() {
        equipo.setDistancia3(equipo.getDistancia3() + equipo.getAleatorio());
        if (equipo.pintarConsola().contains("Estados Unidos")) {
            equipo1 = equipo.pintarConsola();
        } else if (equipo.pintarConsola().contains("Colombia")) {
            equipo2 = equipo.pintarConsola();
        } else if (equipo.pintarConsola().contains("Jamaica")) {
            equipo3 = equipo.pintarConsola();
        }
        if (equipo1 != null) {
            System.out.println(equipo1);
        }
        if (equipo3 != null) {
            System.out.println(equipo3);
        }
        if (equipo2 != null) {
            System.out.println(equipo2);
        }

        return equipo.getDistancia3();
    }
}
