package Acciones;

import ControGeneral.Command;
import ControGeneral.Command;
import Led.Led3;


public class PreOffled3 implements Command {

    public Led3 opcionled3;
    public PreOffled3(Led3 led) {
        this.opcionled3 = led ;
        
    }


    public void ejecutar() {
        opcionled3.lapagar3();
    }

}
