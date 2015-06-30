/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author EST1659109
 */
public class Led2 extends TipoAccion{
    private boolean estado;
    @Override
    public boolean On() {
        return estado=true;        
    }

    @Override
    public boolean Off() {
        return estado=false;
    }
}
