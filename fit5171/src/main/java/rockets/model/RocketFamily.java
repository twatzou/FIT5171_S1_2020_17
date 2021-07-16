package rockets.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RocketFamily { //Extra 1

    private String familyName;

    private List<Rocket> variations;

    public void setFamilyName(String satellite) {
        notBlank(satellite, "familyName cannot be empty or null");
        this.familyName = satellite;
    }

    public void setVariations(List rockets) {
        notNull(rockets, "variations cannot be empty or null");
        this.variations = rockets;
    }
}
