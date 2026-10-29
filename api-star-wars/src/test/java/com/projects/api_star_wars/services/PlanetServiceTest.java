package com.projects.api_star_wars.services;

import com.projects.api_star_wars.models.Planet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static com.projects.api_star_wars.constants.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = PlanetService.class) // serve para dizer ao spring que é um contexto de teste
public class PlanetServiceTest {
    @Autowired
    private PlanetService planetService;

    @Test
    public void createPlanet(){
        Planet createdPlanet = this.planetService.create(PLANET);

        assertThat(createdPlanet).isEqualTo(PLANET);
    }
}
