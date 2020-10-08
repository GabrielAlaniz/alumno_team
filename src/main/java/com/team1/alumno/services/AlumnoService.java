package com.team1.alumno.services;

import com.team1.alumno.entities.Alumno;

import java.util.List;

public interface AlumnoService extends BaseService<Alumno,Long> {
    List<Alumno> search(String filtro) throws Exception;
}
