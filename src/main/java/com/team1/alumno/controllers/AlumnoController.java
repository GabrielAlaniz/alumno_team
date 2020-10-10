package com.team1.alumno.controllers;

import com.team1.alumno.entities.Alumno;
import com.team1.alumno.services.AlumnoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumnos")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl> {
    @GetMapping("/search")
    public ResponseEntity <?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error \":\""+e.getMessage()+"\"}"));
        }
    }
}
