package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Cliente extends Persona {
    private LinkedList<Producto> productos;
    private LinkedList<Factura> facturas;

    public Cliente(String nombre, String apellido, String cedula, String telefono, String direccion, String email) {
        super(nombre, apellido, cedula, telefono, direccion, email);
        productos = new LinkedList<>();
        facturas = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Cliente []";
    }

    public void agregarProductos(Producto producto) {
        productos.add(producto);
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public LinkedList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(LinkedList<Factura> facturas) {
        this.facturas = facturas;
    }

}
