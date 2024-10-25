package prueba.documentos.Services;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.documentos.Entidades.Documento;
import prueba.documentos.Entidades.Hipoteca;
import prueba.documentos.Entidades.Oferta;


@Service
public class HipotecaServices {

    public String procesarDocumentosOferta(String id) {
        Oferta oferta = new Oferta();//Proceso Conexion base de datos

        boolean documentosCompletos = true;// proceso Conexion base de datos

        if (documentosCompletos) {
            // Crear la hipoteca y actualizar el estado de la oferta
            Hipoteca hipoteca = new Hipoteca();
            hipoteca.setFechaAprobacion(new Date());
            hipoteca.setEstado("Activa");
            hipoteca.setMonto(oferta.getMonto());
            hipoteca.setTasaInteres(oferta.getTasaInteres());
            hipoteca.setPlazo(oferta.getPlazo());
            hipoteca.setOferta(oferta);

            oferta.setEstado("Aceptada");
            oferta.setHipoteca(hipoteca);


            // Llamada a un sistema externo de gestión documental
            enviarDocumentosAGestionDocumental(oferta.getDocumentos());
            return "Hipoteca creada y documentos enviados al sistema de gestión documental.";
        } else {
            return "Documentos incompletos. Solicite al cliente los documentos pendientes.";
        }
    }

    private void enviarDocumentosAGestionDocumental(ArrayList<Documento> documentos) {
        // Lógica para enviar documentos a un sistema de gestión documental externo.
        // Ejemplo: httpClient.post("https://gestor-documental/api", documentos);
    }
}

