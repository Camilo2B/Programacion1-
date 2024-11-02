package co.edu.uniquindio.poo;

public class Motocicleta extends Vehiculo {
    private String cilindrada;
    private Envio envio; 

    public Motocicleta(String placa, String marca, String modelo, String cilindrada) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.envio = envio;
        

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

    @Override
    public double calcularCosto() {
        double costoPorPaquete = 0;
        
        if (Zona.equals("rural")) {
            costoPorPaquete = 15000;
        } else if (zona.equals("urbana")) {
            costoPorPaquete = 8000;
        }
        int numeroPaquetes = envio.getPaquetes().size(); 
        return numeroPaquetes * costoPorPaquete;
    
    }

}