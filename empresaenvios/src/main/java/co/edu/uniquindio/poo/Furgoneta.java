package co.edu.uniquindio.poo;

public class Furgoneta extends Vehiculo {
    private Transmision transmision;
    private int distanciaRecorrida;

    public Furgoneta(String placa, String marca, String modelo, Transmision transmision) {
        super(placa, marca, modelo);
        this.transmision = transmision;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Furgoneta [transmision=" + transmision + "]"+super.toString();
    }

    @Override
    public double calcularCostoTotal() {
        int costoPorKilometro = 3000;
        int fleteFijo = 10000;
        double costoTotal = (distanciaRecorrida * costoPorKilometro) + fleteFijo;
        return costoTotal;
    }

    
    
}