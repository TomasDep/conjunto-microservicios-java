package org.tomdep.springcloud.msvc.cursos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tomdep.springcloud.msvc.cursos.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
