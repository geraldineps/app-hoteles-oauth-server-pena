package pe.edu.cibertec.app_hoteles_oauth_server_pena.service.implementacion;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_hoteles_oauth_server_pena.model.Usuario;
import pe.edu.cibertec.app_hoteles_oauth_server_pena.repository.UsuarioRepository;
import pe.edu.cibertec.app_hoteles_oauth_server_pena.service.IUsuarioService;

@RequiredArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUsuarioXCodigo(String codigo) {
        return usuarioRepository.findByCodigo(codigo);
    }

}
