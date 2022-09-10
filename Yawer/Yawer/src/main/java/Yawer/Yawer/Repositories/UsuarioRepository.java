package Yawer.Yawer.Repositories;


import Yawer.Yawer.Domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends JpaRepository <Usuario, Long> {

}