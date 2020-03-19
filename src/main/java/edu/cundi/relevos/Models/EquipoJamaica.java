package edu.cundi.relevos.Models;

import edu.cundi.relevos.Controllers.Carrera;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class EquipoJamaica extends Relevo {

    private List<Thread> jam = new ArrayList<>();
    private Carrera equipoJam = new Carrera();

    public EquipoJamaica() {
        agregarCorredores();
        corriendo();
        setColor("\u001B[37m");
    }

    @Override
    public void agregarCorredores() {
        jam.add(new Thread(equipoJam, "Chili"));
        jam.add(new Thread(equipoJam, "Arthur Wint"));
        jam.add(new Thread(equipoJam, "Usaint Bolt"));
    }

    @Override
    public void corriendo() {
        for (Thread corredor : jam) {
            try {
                corredor.start();
                corredor.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EquipoJamaica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void comenzarCarrera() {
        agregarCorredores();
        corriendo();
    }
}
