package edu.cundi.relevos.Controllers;

import edu.cundi.relevos.Models.*;

/**
 * @author diego parra
 */
public class Carrera {

    /**
     * Constructor Por Defecto.
     */
    public Carrera() {

    }

    public void empezarCarrera() {
        Relevo equipo1 = new Relevo("Estados Unidos", 0, 120);
        Relevo equipo2 = new Relevo("      Colombia", 0, 120);
        Relevo equipo3 = new Relevo("       Jamaica", 0, 120);
        Corredor corredor1 = new Corredor(equipo1, 0, 40);
        Corredor corredor2 = new Corredor(equipo2, 0, 40);
        Corredor corredor3 = new Corredor(equipo3, 0, 40);
        Corredor corredor4 = new Corredor(equipo1, 40, 80);
        Corredor corredor5 = new Corredor(equipo2, 40, 80);
        Corredor corredor6 = new Corredor(equipo3, 40, 80);
        Corredor corredor7 = new Corredor(equipo1, 80, 120);
        Corredor corredor8 = new Corredor(equipo2, 80, 120);
        Corredor corredor9 = new Corredor(equipo3, 80, 120);
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        corredor6.start();
        corredor7.start();
        corredor8.start();
        corredor9.start();
    }
}
