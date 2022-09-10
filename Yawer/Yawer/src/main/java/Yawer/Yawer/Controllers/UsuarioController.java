package Yawer.Yawer.Controllers;

import Yawer.Yawer.Domains.Usuario;
import Yawer.Yawer.Services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsuarioController {

@Autowired
ServiceUsuario serviceUsuario;


    @GetMapping ("/users")
    private List<Usuario> listaUsuarios (){
        return serviceUsuario.consultarListaUsuarios();
    }


    @PostMapping("/users")
    private void crearUsuario (@RequestBody Usuario usuario) {
        serviceUsuario.crearUsuario(usuario);

    }


    @GetMapping ("/users/{id}")
    public ResponseEntity<Usuario> buscarUsuario (@PathVariable int id) {
        Usuario p = serviceUsuario.buscarUsuario(id);

        return new ResponseEntity<Usuario>(p, HttpStatus.OK);
    }

    @PatchMapping  ("/users/{id}")
    private void editarEmpresa (@RequestBody Usuario usuario){
        serviceUsuario.editarUsuario(usuario);
    }


    @DeleteMapping("/users/{id}")
    private void EliminarEmpresa (@PathVariable("id") Long id) {
            serviceUsuario.eliminarrUsuario(id);
    }
}
