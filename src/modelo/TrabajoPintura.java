package modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    protected double Superficie;
    protected double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechainicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechainicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }


    public double costeMAterial() {
        return ((this.Superficie/7.8)* this.PrecioPintura);
    }
    public double costeManoObra(){
        return ((this.Superficie/10)*9.5);
    }
    public double costeTotal(){
        if (this.Superficie<50){
            return ((costeMAterial()+costeManoObra()*1.15));
        }else{
            return ((costeMAterial()+costeManoObra()));
        }
    }
    public String detalleServicio(){
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: "+this.Cliente+"\n";
        cadena += "Fecha de Inicio: "+this.Fechainicio+"\n";
        cadena += "------------------\n";
        cadena += "Pintor: "+this.Trabajador+"\n";
        cadena += "Coste Material: "+costeMAterial()+"\n";
        cadena += "Coste Mano Obra: "+costeManoObra()+"\n";
        cadena += "Coste Adicional: "+costeManoObra()+"\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "------------------\n";
        return cadena;
    }


}
