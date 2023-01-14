package org.tomdep.springcloud.msvc.cursos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.tomdep.springcloud.msvc.cursos.models.Usuario;

import java.util.List;

@FeignClient(name = "msvc-usuarios", url = "localhost:8001/api/v1/usuarios")
public interface UsuarioClientRest {
    @GetMapping("/{id}")
    Usuario detalle(@PathVariable Long id);

    @GetMapping("/por/curso")
    List<Usuario> obtenerAlumnosPorCurso(@RequestParam Iterable<Long> ids);

    @PostMapping
    Usuario crear(@RequestBody Usuario usuario);
}
