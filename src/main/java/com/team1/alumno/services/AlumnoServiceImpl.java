package com.team1.alumno.services;

import com.team1.alumno.entities.Alumno;
import com.team1.alumno.repositories.AlumnoRepository;
import com.team1.alumno.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno,Long> implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;
    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository) { super(baseRepository);}

    @Override
    public List<Alumno> search(String filtro) throws Exception {
        try{
            List <Alumno> alumnos = alumnoRepository.search(filtro);
            return alumnos;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
