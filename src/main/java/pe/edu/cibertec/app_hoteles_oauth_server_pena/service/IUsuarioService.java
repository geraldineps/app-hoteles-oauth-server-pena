package pe.edu.cibertec.app_hoteles_oauth_server_pena.service;

import pe.edu.cibertec.app_hoteles_oauth_server_pena.model.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioXCodigo(String codigo);
}
