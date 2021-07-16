package rockets.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaunchServiceProviderTest {
    private LaunchServiceProvider launchServiceProvider;
    @BeforeEach
    void setUp() {
        launchServiceProvider = new LaunchServiceProvider("guo",2020,"china");
    }
    @AfterEach
    void tearDown() {
    }
    @DisplayName("should throw exception when pass a null to setName function")
    @Test
    public void shouldThrowExceptionWhenNameToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new LaunchServiceProvider(null,2020,"g"));
        assertEquals("Name cannot be null", exception.getMessage());
    }

    @DisplayName("should throw exception when pass a null to setName function")
    @Test
    public void shouldThrowExceptionWhenCountryToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new LaunchServiceProvider("ss",2020,null));
        assertEquals("nationality cannot be null", exception.getMessage());
    }
    @DisplayName("should throw exception when pass a null to setRocktes function")
    @Test
    public void shouldThrowExceptionWhenRocketsToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launchServiceProvider.setRockets(null));
        assertEquals("Rockets cannot be null", exception.getMessage());
    }
    @DisplayName("should throw exception when pass a null to setheadquarters function")
    @Test
    public void shouldThrowExceptionWhensetHeadQuartersToNull(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launchServiceProvider.setHeadquarters(null));
        assertEquals("HeadQuarters cannot be null", exception.getMessage());
    }

    @DisplayName("should return true when two launchServiceProvider have the same name")
    @Test
    public void shouldReturnTrueWhenlaunchServiceProviderHaveSameName() {
        LaunchServiceProvider anotherUser = new LaunchServiceProvider("guo",2019,"other");
        assertTrue(launchServiceProvider.getName().equals(anotherUser.getName()));
    }

    @DisplayName("should return false when two lauchServiceProvider have the same name")
    @Test
    public void shouldReturnFalseWhenlaunchServiceProviderHaveSameName() {
        LaunchServiceProvider anotherUser = new LaunchServiceProvider("shuai",2019,"other");
        assertFalse(launchServiceProvider.equals(anotherUser));
    }
}
