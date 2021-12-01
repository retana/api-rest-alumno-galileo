package edu.galileo.universidad.model.repository;

import edu.galileo.universidad.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer>{
    List<Alumno> findAll();
}
