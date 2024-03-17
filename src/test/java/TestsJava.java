import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureConversionTest {

    @Test
    public void testFahrenheitToCelsius() {
        // Test for freezing point of water
        assertEquals(0.0, TemperatureConversion.FartoCelsius(32), 0.01);
        // Test for boiling point of water
        assertEquals(100.0, TemperatureConversion.FartoCelsius(212), 0.01);
        // Test for a random temperature
        assertEquals(20.0, TemperatureConversion.FartoCelsius(68), 0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        // Test for absolute zero
        assertEquals(-273.15, TemperatureConversion.KelvinToCelsius(0), 0.01);
        // Test for freezing point of water
        assertEquals(0.0, TemperatureConversion.KelvinToCelsius(273.15), 0.01);
        // Test for boiling point of water
        assertEquals(100.0, TemperatureConversion.KelvinToCelsius(373.15), 0.01);
        // Test for a random temperature
        assertEquals(26.85, TemperatureConversion.KelvinToCelsius(300), 0.01);
    }
}
