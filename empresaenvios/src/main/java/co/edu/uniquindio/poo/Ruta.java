package co.edu.uniquindio.poo;

public class Ruta {
    private int peaje;

    public Ruta(int peaje) {
        this.peaje = peaje;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    @Override
    public String toString() {
        return "Ruta [peaje=" + peaje + "]";
    }

    
}
