package com.prueba.test.controller;

import com.prueba.test.models.Estudiante;
import com.prueba.test.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EstudianteController{
    
    @Autowired
    EstudianteRepository repository;

    //obtener estudiantes
    @GetMapping("/estudiantes")
    public List<Estudiante> getAllNotes() {
        return repository.findAll();
    }

    //insertar estudiante
    @PostMapping("/estudiante")
    public Estudiante storeEstudiante(@RequestBody Estudiante newEstudiante){
        return repository.save(newEstudiante);
    }

    //obtener un producto 
    @GetMapping("/estudiante/{id}")
    public int updateEstudiante(@RequestBody Estudiante updateEstudiante, @PathVariable Long id){
        repository.findById(id)
            .map(estudiante -> {
                estudiante.setNombre(updateEstudiante.getNombre());
                estudiante.setRut(updateEstudiante.getRut());
                estudiante.setFechaNacimiento(updateEstudiante.getFechaNacimiento());
                estudiante.setCarrera(updateEstudiante.getCarrera());
                repository.save(estudiante);
            return 0;
            });
        return 0;
    }

    //Eliminiar 
    @DeleteMapping("/estudiante/{id}")
    public void deleteEstudiante(@PathVariable Long id){
        repository.deleteById(id);
    }
}