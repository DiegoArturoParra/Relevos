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
public class EquipoColombia extends Relevo {

    private List<Thread> col = new ArrayList<>();
    private Carrera equipoCol = new Carrera();

    public EquipoColombia() {
        setColor("\u001B[31m");
    }

    @Override
    public void agregarCorredores() {
        col.add(new Thread(equipoCol, "Zambrano"));
        col.add(new Thread(equipoCol, " Diego Palomeque"));
        col.add(new Thread(equipoCol, "Alejandro Perlaza"));
    }

    @Override
    public void corriendo() {
        for (Thread corredor : col) {
            try {
                corredor.start();
                corredor.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EquipoColombia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void comenzarCarrera() {
        agregarCorredores();
        corriendo();
    }
}
