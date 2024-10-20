package practica03;

import PaqueteLectura.*;

public class Habitacion {
    private double costo;
    private boolean ocupada;    
    Persona persona;
    
    public Habitacion() {
        costo = GeneradorAleatorio.generarDouble(6001)+2000;
        ocupada = false;
        persona = null;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void ocupar(){
        this.ocupada = true;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void aumentarPrecio(double n) {
        costo += n;
    }
    
    @Override
    public String toString(){
        String aux = "Costo="+costo+" Estado="+ ocupada;
        if(ocupada) {
            aux+= persona.toString();
        }
        return aux;
    }
}