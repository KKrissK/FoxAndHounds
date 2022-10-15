package nye.progtech.FoxAndHounds.ui;

import nye.progtech.FoxAndHounds.service.CurrentState;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {


    public static void main(String[] args) {

        try {
           Frame frame = new Frame();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
