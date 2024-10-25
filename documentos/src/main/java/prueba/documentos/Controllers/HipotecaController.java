package prueba.documentos.Controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import prueba.documentos.Services.HipotecaServices;

@RestController
@CrossOrigin(origins = "url")
@RequestMapping("/api/ofertas")
public class HipotecaController {

    private HipotecaServices hipotecaService;

    @PostMapping("/procesar")
    public String procesarOferta(@RequestParam("id") String id) {
        String resultado = hipotecaService.procesarDocumentosOferta(id);
        return resultado;
    }
}

