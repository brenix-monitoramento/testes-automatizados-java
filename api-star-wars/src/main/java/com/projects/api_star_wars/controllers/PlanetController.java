package com.projects.api_star_wars.controllers;

import com.projects.api_star_wars.models.Planet;
import com.projects.api_star_wars.services.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetController {
    @Autowired
    private PlanetService planetService;

    @GetMapping
    ResponseEntity<List<Planet>> getAll(){
        List<Planet> planets = this.planetService.listAll();

        return ResponseEntity.ok().body(planets);
    }

    @PostMapping
    ResponseEntity<Planet> post(@RequestBody Planet planet){
        Planet createdPlanet = this.planetService.create(planet);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdPlanet);
    }
}
