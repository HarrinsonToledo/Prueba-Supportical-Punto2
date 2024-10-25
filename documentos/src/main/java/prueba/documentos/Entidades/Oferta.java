package prueba.documentos.Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Oferta {

    private String id;
    private Date fechaCreacion;
    private String estado; 
    private Double monto;
    private Double tasaInteres;
    private Date plazo;

    private Cliente cliente;

    private Hipoteca hipoteca;

    private ArrayList<Documento> documentos;

    public Oferta() {

    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Hipoteca getHipoteca() {
        return hipoteca;
    }
    
    public void setHipoteca(Hipoteca hipoteca) {
        this.hipoteca = hipoteca;
    }
    
    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }
    
    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }
    
}
