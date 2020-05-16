package com.prueba.test.repositories;

import com.prueba.test.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>
{

}