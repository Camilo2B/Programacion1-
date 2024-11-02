package co.edu.uniquindio.poo;

import java.util.LinkedList;


public class EnvioRapido {
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Envio> envios;
    private String nombre;

    public EnvioRapido(LinkedList<Vehiculo> vehiculos, LinkedList<Envio> envios, String nombre) {
        this.vehiculos = new LinkedList<>();
        this.envios = new LinkedList<>();
        this.nombre = nombre;
    }
    
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(LinkedList<Envio> envios) {
        this.envios = envios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
