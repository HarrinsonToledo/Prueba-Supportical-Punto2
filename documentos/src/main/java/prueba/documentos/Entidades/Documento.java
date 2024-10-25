package prueba.documentos.Entidades;

import java.util.Date;

public class Documento {

    private String id;
    private String tipo;
    private String estado;
    private Date fechaSubida;

    private Oferta oferta;

    public Documento() {

    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Date getFechaSubida() {
        return fechaSubida;
    }
    
    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }
    
    public Oferta getOferta() {
        return oferta;
    }
    
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    
}
