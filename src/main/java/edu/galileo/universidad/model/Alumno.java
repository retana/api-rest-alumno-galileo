package edu.galileo.universidad.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "alumno")
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idAlumno;
    @Column
    private String nombre;
    @Column
        private String direccion;
    @Column
    private String telefono;
    @Column
    private String carne;
}
