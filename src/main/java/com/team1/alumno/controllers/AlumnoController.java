package com.team1.alumno.controllers;

import com.team1.alumno.entities.Alumno;
import com.team1.alumno.services.AlumnoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumnos")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl> {
}
