package edu.galileo.universidad.service;

import edu.galileo.universidad.model.Alumno;
import edu.galileo.universidad.model.repository.AlumnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService{
    private AlumnoRepository alumnoRepository;
    public AlumnoService(AlumnoRepository alumnoRepository){
        this.alumnoRepository = alumnoRepository;
    }
    public Alumno add(Alumno alumno){
        return alumnoRepository.save(alumno);
    }
    public Alumno edit(Alumno alumno){
        if(alumnoRepository.existsById(alumno.getIdAlumno())){
            alumnoRepository.save(alumno);
        }else{
            new Exception("El alumno no existe por favor verifica la informacion a editar.");
        }
        return alumno;
    }
    public Alumno remove(Integer id){
        if(alumnoRepository.existsById(id)){
            Alumno obtenerAlumno = alumnoRepository.findById(id).get();
            alumnoRepository.delete(obtenerAlumno);
            return obtenerAlumno;
        }else{
            new Exception("El alumno no existe por favor verifica la informacion a editar.");
        }
        return null;
    }
    public List<Alumno> getAll(){
        return this.alumnoRepository.findAll();
    }
}
