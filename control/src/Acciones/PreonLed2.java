/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

import ControGeneral.Command;
import ControGeneral.Command;
import Led.Led2;

/**
 *
 * @author Cliente
 */
public class PreonLed2 implements Command{
    
    public Led2 led2;

    public PreonLed2(Led2 led2) {
        this.led2 = led2;
    }

    @Override
    public void ejecutar() {
        led2.lenciende1();
    }
    
    
}
