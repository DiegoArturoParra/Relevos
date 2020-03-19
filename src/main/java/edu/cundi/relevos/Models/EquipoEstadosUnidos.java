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
public class EquipoEstadosUnidos extends Relevo {

    private List<Thread> eeuu = new ArrayList<>();
    private Carrera equipoEeuu = new Carrera();

    public EquipoEstadosUnidos() {
        setColor("\u001B[36m");
    }

    @Override
    public void agregarCorredores() {
        eeuu.add(new Thread(equipoEeuu, "Zambrano"));
        eeuu.add(new Thread(equipoEeuu, " Diego Palomeque"));
        eeuu.add(new Thread(equipoEeuu, "Alejandro Perlaza"));
    }

    @Override
    public void corriendo() {
        for (Thread corredor : eeuu) {
            try {
                corredor.start();
                corredor.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EquipoEstadosUnidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void comenzarCarrera() {
        agregarCorredores();
        corriendo();
    }
}
