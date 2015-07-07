package Acciones;

import ControGeneral.Command;
import ControGeneral.Command;
import Led.Led3;

public class PreonLed3 implements Command {

  public Led3 opcionled3;

  public PreonLed3(Led3 led){
      this.opcionled3= led;
  }

  public void ejecutar() {
      opcionled3.lenciende3();
  }

}