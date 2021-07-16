package rockets.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RocketFamilyTest {
    private RocketFamily rocketFamily;
    @BeforeEach
    void setUp() {
        rocketFamily = new RocketFamily();
    }

    @AfterEach
    void tearDown() {
    }
    @DisplayName("function should not set to null")
    @Test
    void shouldThrowExceptionWhenLaunchSiteToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> rocketFamily.setFamilyName(null));
        assertEquals("familyName cannot be empty or null", exception.getMessage());
    }

    @DisplayName("function should not be set to null")
    @Test
    void shouldThrowExceptionWhenNameToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> rocketFamily.setVariations(null));
        assertEquals("variations cannot be empty or null", exception.getMessage());
    }
}
