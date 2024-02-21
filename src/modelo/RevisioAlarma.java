package modelo;

import java.time.LocalDate;

public class RevisioAlarma extends Servicio {
    int NumeroAlarmas;

    public RevisioAlarma(String cliente, int numeroAlarmas) {
        super(cliente);
        this.NumeroAlarmas = numeroAlarmas;
        this.Trabajador="Revisor Especialista Contraincendios";

    }

    public double costeMAterial(){
        return 0;
    }
    public double costeManoObra(){
        return ((this.NumeroAlarmas/3)*40);

    }
    public double costeTotal(){
        return costeManoObra();
    }
    public String detalleServicio(){
        String cadena = "";

        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: "+this.Cliente+"\n";
        cadena += "Fecha: "+this.Fechainicio+"\n";
        cadena += "----------------------\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "----------------------\n";
        return  cadena;
    }


}
