package edu.galileo.universidad.controller;

import edu.galileo.universidad.model.Alumno;
import edu.galileo.universidad.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/alumno")
public class AlumnoController {
    private AlumnoService alumnoService;
    public AlumnoController(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }
    @GetMapping
    private List<Alumno> getAll(){
        return alumnoService.getAll();
    }
    @PutMapping
    private Alumno editAlumno(@RequestBody(required = true) Alumno alumno){
        return this.alumnoService.edit(alumno);
    }
    @PostMapping
    private Alumno addAlumno(@RequestBody(required = true) Alumno alumno){
        return this.alumnoService.add(alumno);
    }
    @DeleteMapping(value = "/{id}")
    private Alumno removeAlumno(@PathVariable(required = true, name="id") Integer id){
        return this.alumnoService.remove(id);
    }
}
