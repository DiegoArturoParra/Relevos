package edu.cundi.relevos.Controllers;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego Parra
 */
public class Main {

    public static void main(String[] args) {
       
        try {
            Carrera c = new Carrera();
            c.empezarCarrera();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
