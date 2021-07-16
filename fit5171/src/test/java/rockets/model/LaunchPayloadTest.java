package rockets.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LaunchPayloadTest {
    private LaunchPayload launchPayload;
    @BeforeEach
    void setUp() {
        launchPayload = new LaunchPayload();
    }

    @AfterEach
    void tearDown() {
    }
    @DisplayName("function should not set to null")
    @Test
    void shouldThrowExceptionWhenLaunchSiteToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launchPayload.setSatellites(null));
        assertEquals("satellite cannot be empty or null", exception.getMessage());
    }

    @DisplayName("function should not be set to null")
    @Test
    void shouldThrowExceptionWhenNameToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launchPayload.setspacecraft(null));
        assertEquals("spacecraft cannot be empty or null", exception.getMessage());
    }
}
