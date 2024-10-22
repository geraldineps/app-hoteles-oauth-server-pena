package pe.edu.cibertec.app_hoteles_oauth_server_pena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.app_hoteles_oauth_server_pena.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByCodigo(String codigo);

}
