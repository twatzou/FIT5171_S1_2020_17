package rockets.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class RocketUnitTest {
    private Rocket target;

    @BeforeEach
    public void setUp() {
        target = new Rocket("Q","China","x");
    }

    //Constructor validation.
    //name cannot be null or empty
    @DisplayName("should throw exception when pass a null as name to the Rocket's constructor")
    @Test
    public void shouldThrowExceptionWhenSetNameToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> new Rocket(null, "China", "x"));
        assertEquals("name cannot be null or empty", exception.getMessage());
    }

    @DisplayName("should throw exception when pass an empty string as name to the Rocket's constructor")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhenSetNameToEmptyString(String name){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Rocket(name, "China", "x"));
        assertEquals("name cannot be null or empty", exception.getMessage());
    }
    //country cannot be null or empty
    @DisplayName("should throw exception when pass a null as country to the Rocket's constructor")
    @Test
    public void shouldThrowExceptionWhenSetCountryToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> new Rocket("Q", null, "x"));
        assertEquals("nationality cannot be null or empty", exception.getMessage());
    }

    @DisplayName("should throw exception when pass an empty string as country to the Rocket's constructor")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhenSetCountryToEmptyString(String country){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Rocket("Q", country, "x"));
        assertEquals("nationality cannot be null or empty", exception.getMessage());
    }
    //manufacturer cannot be null or empty
    @DisplayName("should throw exception when pass a null as manufacturer to the Rocket's constructor")
    @Test
    public void shouldThrowExceptionWhenSetManufacturerToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> new Rocket("Q", "China", null));
        assertEquals("manufacturer cannot be null or empty", exception.getMessage());
    }

    @DisplayName("should throw exception when pass an empty string as manufacturer to the Rocket's constructor")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    public void shouldThrowExceptionWhenSetManufacturerToEmptyString(String manufacturer){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Rocket("Q", "China", manufacturer));
        assertEquals("manufacturer cannot be null or empty", exception.getMessage());
    }

    //massToLEO validation.
    @DisplayName("should throw exception when pass a null to setMassToLEO function")
    @Test
    public void shouldThrowExceptionWhenSetMassToLEOToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToLEO(null));
        assertEquals("massToLEO cannot be null", exception.getMessage());
    }

    //massToGTO validation.
    @DisplayName("should throw exception when pass a null to setMassToLEO function")
    @Test
    public void shouldThrowExceptionWhenSetMassToGTOToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToGTO(null));
        assertEquals("massToGTO cannot be null", exception.getMessage());
    }

    //massToOther validation.
    @DisplayName("should throw exception when pass a null to setMassToOther function")
    @Test
    public void shouldThrowExceptionWhenSetMassToOtherToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToOther(null));
        assertEquals("massToOther cannot be null", exception.getMessage());
    }

    //equals validation
    @DisplayName("should return true when two rockets have the same name,country,manufacturer")
    @Test
    public void shouldReturnTrueWhenRocksHaveSameNameCountryManufacturer() {
        target = new Rocket("Q","China","x");
        Rocket anotherRocket = new Rocket("Q","China","x");
        assertTrue(target.equals(anotherRocket));
    }

    @DisplayName("should return true when rockets don't have the same name,country,manufacturer")
    @Test
    public void shouldReturnFalseWhenRocksHaveDifferentNameCountryManufacturer() {
        target = new Rocket("Q","China","x");
        Rocket r1 = new Rocket("QQ","China","x");
        Rocket r2 = new Rocket("Q","Australia","x");
        Rocket r3 = new Rocket("Q","China","xx");
        assertFalse(target.equals(r1)||target.equals(r2)||target.equals(r3));
    }
}
