package com.team1.alumno.services;

import com.team1.alumno.entities.Alumno;
import com.team1.alumno.repositories.AlumnoRepository;
import com.team1.alumno.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno,Long> implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;
    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository) { super(baseRepository);}
}
