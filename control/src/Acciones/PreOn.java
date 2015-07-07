package Acciones;

import ControGeneral.Command;
import ControGeneral.Command;
import Led.Led;

public class PreOn implements Command {

  public Led opcionled;

  public PreOn(Led led){
      this.opcionled= led;
  }

  public void ejecutar() {
      opcionled.lenciende();
  }

}