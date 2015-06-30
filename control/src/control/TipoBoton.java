/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;

/**
 *
 * @author EST1659109
 */
public class TipoBoton implements Control{

    Boton boton;    

    @Override
    public void setBoton(Boton miBoton) {
        this.boton=miBoton;
    }

    @Override
    public void Control() {
        boton.execute();
    }
    
}
