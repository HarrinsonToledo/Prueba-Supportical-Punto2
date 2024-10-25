package prueba.documentos.Entidades;

import java.util.Date;

public class Hipoteca {

    private String id;
    private Date fechaAprobacion;
    private String estado;
    private Double monto;
    private Double tasaInteres;
    private Date plazo;

    private Oferta oferta;

    public Hipoteca() {

    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }
    
    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Double getMonto() {
        return monto;
    }
    
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    public Double getTasaInteres() {
        return tasaInteres;
    }
    
    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public Date getPlazo() {
        return plazo;
    }
    
    public void setPlazo(Date plazo) {
        this.plazo = plazo;
    }
    
    public Oferta getOferta() {
        return oferta;
    }
    
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    
}
