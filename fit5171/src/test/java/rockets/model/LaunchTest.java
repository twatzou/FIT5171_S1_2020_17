package rockets.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaunchTest {
    private Launch launch;
    @BeforeEach
    void setUp() {
        launch = new Launch();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("function should not set to null")
    @Test
    void shouldThrowExceptionWhenLocalDateToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launch.setLaunchDate(null));
        assertEquals("launchDate cannot be null or empty", exception.getMessage());
    }

    @DisplayName("function should not set to null")
    @Test
    void shouldThrowExceptionWhenPayloadToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launch.setPayload(null));
        assertEquals("payload cannot be null", exception.getMessage());
    }

    @DisplayName("function should not set to null")
    @Test
    void shouldThrowExceptionWhenLaunchSiteToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launch.setLaunchSite(null));
        assertEquals("launchSite cannot be null or empty", exception.getMessage());
    }

    @DisplayName("function should not be set to null")
    @Test
    void shouldThrowExceptionWhenNameToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> launch.setFunction(null));
        assertEquals("function cannot be null or empty", exception.getMessage());
    }

    @DisplayName("function should not be set to null")
    @Test
    void shouldThrowExceptionWhenLaunchOutcomeInvalid() {
        Launch.InvalidOutComeException exception = assertThrows(Launch.InvalidOutComeException.class,
                () -> launch.setLaunchOutcome(null));
        assertEquals("launchoutcome is invalid", exception.getMessage());
    }
}
