package edu.cundi.relevos.Controllers;

import edu.cundi.relevos.Models.EquipoColombia;
import edu.cundi.relevos.Models.EquipoEstadosUnidos;
import edu.cundi.relevos.Models.EquipoJamaica;
import edu.cundi.relevos.Models.Relevo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego Parra
 */
public class Main {

    public static void main(String[] args) {
        Relevo eC = new EquipoColombia();
        Relevo eEu = new EquipoEstadosUnidos();
        Relevo eJa = new EquipoJamaica();
        try {
            Thread.sleep(2000);
            eC.comenzarCarrera();
//            eEu.comenzarCarrera();
//            eJa.comenzarCarrera();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
