package Acciones;

import ControGeneral.Command;
import ControGeneral.Command;
import Led.Led;


public class PreOff implements Command {

    public Led opcionled;
    public PreOff(Led led) {
        this.opcionled = led ;
        
    }


    public void ejecutar() {
        opcionled.lapagar();
    }

}
