package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Producto {
    private String codigo;
    private String nombre;
    private int precio;
    private LinkedList<Factura> facturas;

    public Producto(String codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        facturas = new LinkedList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public LinkedList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(LinkedList<Factura> facturas) {
        this.facturas = facturas;
    }
}
