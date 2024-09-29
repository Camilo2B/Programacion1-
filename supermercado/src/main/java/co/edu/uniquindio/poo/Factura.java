package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Factura {
    private String id;
    private LocalDate fecha;
    private int  total;
    private DetalleFactura detalleFactura;
    

    public Factura(String id, LocalDate fecha, int total, DetalleFactura factura){
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.detalleFactura = factura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", fecha=" + fecha + ", total=" + total + "]";
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    




    
}
