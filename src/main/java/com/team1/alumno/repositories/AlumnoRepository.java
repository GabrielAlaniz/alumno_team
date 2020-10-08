package com.team1.alumno.repositories;

import com.team1.alumno.entities.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno,Long>{
    @Query(value = "SELECT a FROM Alumno a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%")
    List <Alumno> search(@Param("filtro")String filtro);
}
