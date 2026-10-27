package com.projects.api_star_wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        var calculator = new Calculator();

        assertThat(calculator.sum(3, 2)).isEqualTo(5);
    }
}
