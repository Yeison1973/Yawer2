package Yawer.Yawer.Services;


import Yawer.Yawer.Domains.Usuario;
import Yawer.Yawer.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceUsuario {

    @Autowired
    UsuarioRepository usuarioRepository;


    public List<Usuario> consultarListaUsuarios(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());

        return usuarios;
    }


    public void crearUsuario (Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    public Usuario buscarUsuario (int id){

        Usuario usuario = null;

        for (Usuario p :consultarListaUsuarios() ) {
            if (p.getId() == id){
                return p;
            }
        }

        return usuario;
    }



    public void editarUsuario (Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    public void eliminarrUsuario (Long id){
        usuarioRepository.deleteById(id);
    }

}
