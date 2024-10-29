package co.edu.uniquindio.poo;

public class Furgoneta extends Vehiculo {
    private Transmision transmision;

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

    
    
}
