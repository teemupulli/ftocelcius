package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestsJava {

    @Test
    public void testFartoCelsius() {
        // Test for boiling point of water
        assertEquals(37.77777777777778, Main.FartoCelsius(100), 0.01);
        // Test for freezing point of water
        assertEquals(0.0, Main.FartoCelsius(32), 0.01);
        // Test for a random temperature
        assertEquals(20.0, Main.FartoCelsius(68), 0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        // Test for boiling point of water
        assertEquals(-173.15, Main.KelvinToCelsius(100), 0.01);
        // Test for freezing point of water
        assertEquals(0.0, Main.KelvinToCelsius(273.15f), 0.01);
        // Test for a random temperature
        assertEquals(26.85, Main.KelvinToCelsius(300), 0.01);
    }
}
