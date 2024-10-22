package pe.edu.cibertec.app_hoteles_oauth_server_pena.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private String password;
    private String email;
    private String rol;
    private Boolean activo;
}
