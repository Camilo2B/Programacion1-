package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class DetalleFactura {
    private String id;
    private int cantidad;
    private int  subtotal;
    private LinkedList<Producto> productos;

    public DetalleFactura(String id, int cantidad, int subtotal){
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        productos = new LinkedList<>();
    }

    public void agregarProductos(Producto producto) {
        productos.add(producto);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", subtotal=" + subtotal + "]";
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    
    
}
