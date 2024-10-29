package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + "]"+super.toString();
    }

    
    
}
