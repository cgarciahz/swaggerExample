package com.datum.swaggerejemplo.controller;

import com.datum.swaggerejemplo.entity.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/persona")
public class PersonaController {

    private static List<Persona> personas = new ArrayList<>();

    private PersonaController(){
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Pedro Alberto");
        persona.setApellido("Infante");

        personas.add(persona);
    }

    @GetMapping
    public List<Persona> personas(){
        return personas;
    }
    @PostMapping
    public Persona agregar(@RequestBody Persona persona){
        personas.add(persona);
        return persona;
    }


}
