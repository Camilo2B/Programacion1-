package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Envio {
    private String codigo;
    private double totalCosto;
    private Zona zona;
    private LocalDate fechaEnvio;
    private LinkedList<Paquete> paquetes;

    public Envio(String codigo, double totalCosto, Zona zona, LocalDate fechaEnvio) {
        this.codigo = codigo;
        this.totalCosto = totalCosto;
        this.zona = zona;
        this.fechaEnvio = fechaEnvio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Envio [codigo=" + codigo + ", totalCosto=" + totalCosto + ", zona=" + zona + ", fechaEnvio="
                + fechaEnvio + "]";
    }

    

    

}
