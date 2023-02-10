package com.polizas.pruebaApiPersonalSoft.controller;

import com.polizas.pruebaApiPersonalSoft.model.Poliza;
import com.polizas.pruebaApiPersonalSoft.service.PolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Indica que el cliente va hacer una peticion
@RestController
public class PolizaController {

    @Autowired
    private PolizaService service;

    @GetMapping("/")
    public String verPaginaDeInicio(Model model){
        List<Poliza> listaPolizas = service.ListAll();
        model.addAttribute("listaPolizas", listaPolizas);
        return "index";
    }

    @GetMapping("/polizas")
    public List<Poliza> listarPolizas(){
        return service.listarPolizas();
    }

    @GetMapping("/polizas/{idPoliza}")
    public ResponseEntity<Poliza> obtenerPoliza(@PathVariable Integer idPoliza){
        try {
            Poliza poliza = service.obtenerPolizasPorId(idPoliza);
            return new ResponseEntity<Poliza>(poliza, HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<Poliza>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/polizas")
    public void guardarPolizas(@RequestBody Poliza poliza){
        service.guardarPolizas(poliza);
    }

    @PutMapping("/polizas/{idPoliza}")
    public ResponseEntity<?> actualizarPoliza(@RequestBody Poliza poliza, @PathVariable Integer idPoliza){
        try {
            Poliza polizaActual = service.obtenerPolizasPorId(idPoliza);
            polizaActual.setIdPoliza(poliza.getIdPoliza());
            polizaActual.setNombre(poliza.getNombre());
            polizaActual.setIdCliente(poliza.getIdCliente());
            polizaActual.setFechaPoliza(poliza.getFechaPoliza());
            polizaActual.setFechaNacimiento(poliza.getFechaNacimiento());
            polizaActual.setCoberturaPoliza(poliza.getCoberturaPoliza());
            polizaActual.setNombrePlanPoliza(poliza.getNombrePlanPoliza());
            polizaActual.setCiudadResidencia(poliza.getCiudadResidencia());
            polizaActual.setDireccionResidencia(poliza.getDireccionResidencia());
            polizaActual.setPlaca(poliza.getPlaca());
            polizaActual.setModelo(poliza.getModelo());
            return new ResponseEntity<Poliza>(HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<Poliza>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/polizas/{idPoliza}")
    public void eliminarPoliza(@PathVariable Integer idPoliza){
        service.eliminarPolizas(idPoliza);
    }
}
