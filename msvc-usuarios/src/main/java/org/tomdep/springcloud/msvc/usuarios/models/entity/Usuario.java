package org.tomdep.springcloud.msvc.usuarios.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Setter
@Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nombre;
    @NotEmpty
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String password;
}