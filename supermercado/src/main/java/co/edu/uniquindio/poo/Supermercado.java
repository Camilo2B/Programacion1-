package co.edu.uniquindio.poo;

import java.time.LocalTime;

public class Supermercado {

    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador(LocalTime.of(12, 00), "Julio", "Morales", "1092830729", "12982392", "Carrera 12","JulioM@gmail.com");

        Trabajador trabajador2 = new Trabajador(LocalTime.of(6, 00), "Benito", "Suarez", "1928197219", "092019021", "Carrera 12", "BSuarez@gmail.com");
    }
}
