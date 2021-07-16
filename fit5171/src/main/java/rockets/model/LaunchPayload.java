package rockets.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.apache.commons.lang3.Validate.notBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LaunchPayload { //Extra 2

    private String satellite;

    private String spacecraft;

    public void setSatellites(String satellite) {
        notBlank(satellite, "satellite cannot be empty or null");
        this.satellite = satellite;
    }

    public void setspacecraft(String spacecraft) {
        notBlank(spacecraft, "spacecraft cannot be empty or null");
        this.satellite = spacecraft;
    }
}
