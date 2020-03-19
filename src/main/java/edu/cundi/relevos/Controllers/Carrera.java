package edu.cundi.relevos.Controllers;

import edu.cundi.relevos.Models.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author diego parra
 */
public class Carrera implements Runnable {

    
    public Carrera() {
    }

    public synchronized void empezarCarrera() {
        Thread hilo = Thread.currentThread();

        int comodin = 0;
        int distancia = 0;
        int distanciaReal = 0;
        do {
            int aleatorio = ThreadLocalRandom.current().nextInt(1, 20 + 1);
            distancia = aleatorio;
            distanciaReal += distancia;
            if (distanciaReal > 100) {
                comodin = distanciaReal;
                distanciaReal -= 100;
                comodin -= distanciaReal;
                distanciaReal = comodin;
            }
            System.out.println("Comienza: " + hilo.getName() + " corriste "
                    + aleatorio + " m la distancia actual es: " + distanciaReal + " metros");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (distanciaReal < 100);
        System.out.println(String.format("Ha %s finalizado ", hilo.getName())); 
    }

    @Override
    public void run() {
        this.empezarCarrera();
    }
}
