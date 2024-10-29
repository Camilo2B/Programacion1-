package co.edu.uniquindio.poo;

public class Motocicleta extends Vehiculo {
    private String cilindrada;

    public Motocicleta(String placa, String marca, String modelo, String cilindrada) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta [cilindrada=" + cilindrada + "]";
    }

    
    
}
