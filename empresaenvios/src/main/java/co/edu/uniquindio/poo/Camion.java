package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private Ruta ruta; // Objeto Ruta que contiene información sobre los peajes
    private Envio envio; // Objeto Envio que contiene la lista de paquetes

    public Camion(String placa, String marca, String modelo, double capacidadCarga, Ruta ruta, Envio envio) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.ruta = ruta;
        this.envio = envio;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double calcularCostoTotal() {
        int numeroPeajes = ruta.getNumeroPeajes(); // Obtiene el número de peajes desde Ruta
        int costoPorPeaje = ruta.getValorPeaje(); // Obtiene el valor del peaje desde Ruta
        int costoPorKilo = 7000;
        
        // Calcula el costo de los peajes
        double costoTotalPeajes = numeroPeajes * costoPorPeaje;
        
        // Calcula el costo total por peso de los paquetes
        double pesoTotal = envio.getPaquetes().stream().mapToDouble(Paquete::getPeso).sum();
        double costoTotalPeso = pesoTotal * costoPorKilo;
        
        // Suma los dos costos
        return costoTotalPeajes + costoTotalPeso;
    }

    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + "] " + super.toString();
    }
    
    // Getters y setters para ruta y envio si son necesarios
}



    
    
}
