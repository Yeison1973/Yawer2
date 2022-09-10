package Yawer.Yawer.Controllers;

import Yawer.Yawer.Domains.Empresa;
import Yawer.Yawer.Services.ServiceEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class EmpresaController {



    @Autowired
    ServiceEmpresa serviceEmpresa;


    @PostMapping (path = "/enterprises", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private void crearEmpresa (@RequestBody Empresa empresa) {
        serviceEmpresa.crearEmpresa(empresa);
    }


    @GetMapping ("/enterprises")
     private List<Empresa> listaEmpresas (){

        return serviceEmpresa.consultarListaEmpresa();
    }


   @GetMapping ("/enterprises/{id}")
    public ResponseEntity<Empresa> buscarPersona (@PathVariable int id) {
        Empresa p = serviceEmpresa.buscarEmpresa(id);

        return new ResponseEntity<Empresa>(p, HttpStatus.OK);
    }



    @DeleteMapping("/enterprises/{id}")
    private void EliminarEmpresa (@PathVariable("id") Long id) {
        serviceEmpresa.eliminarrEmpresa(id);
    }


    @PatchMapping  ("/enterprises")
     private void editarEmpresa (@RequestBody Empresa empresa){
        serviceEmpresa.editarEmpresa(empresa);
    }

}
