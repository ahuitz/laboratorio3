package ControGeneral;

public class Boton {

    private Command encender;

    private Command apagar;

    public Boton(Command encender, Command apagar) {
        this.encender = encender;
        this.apagar = apagar;
    }

    public void enciendeLed() {
        encender.ejecutar();
    }

   
    
    public void apagaLed() {
        
        apagar.ejecutar();
    }

}
