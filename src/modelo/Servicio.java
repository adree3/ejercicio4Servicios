package modelo;

import java.time.LocalDate;

public abstract class Servicio {
    protected String Trabajador;
    protected LocalDate Fechainicio;
    protected String Cliente;

    public Servicio(String trabajador, LocalDate fechainicio, String cliente) {
        Trabajador = trabajador;
        Fechainicio = fechainicio;
        Cliente = cliente;
    }

    public Servicio(String cliente) {
        Cliente = cliente;
    }

    public abstract double costeMAterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();


}
