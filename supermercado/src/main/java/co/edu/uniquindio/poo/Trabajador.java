package co.edu.uniquindio.poo;

import java.time.LocalTime;
import java.util.LinkedList;

public class Trabajador extends Persona {
    private LocalTime horario;
    private LinkedList<Factura> facturas;

    public Trabajador(LocalTime horario, String nombre, String apellido, String cedula, String telefono, String direccion, String email) {
        super(nombre, apellido, cedula, telefono, direccion, email);
        this.horario = horario;
        facturas = new LinkedList<>();
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Trabajador [horario=" + horario + "]";
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
