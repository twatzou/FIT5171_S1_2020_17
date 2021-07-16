package rockets.model;

import com.google.common.collect.Sets;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

import static org.apache.commons.lang3.Validate.notNull;

@NoArgsConstructor
public class LaunchServiceProvider extends Entity {
    private String name;

    private int yearFounded;

    private String nationality;

    private String headquarters;

    private Set<Rocket> rockets;

    public LaunchServiceProvider(String name, int yearFounded, String nationality) {
        notNull(name, "Name cannot be null");
        notNull(yearFounded, "YearFounded cannot be null");
        notNull(nationality, "nationality cannot be null");
        this.name = name;
        this.yearFounded = yearFounded;
        this.nationality = nationality;

        rockets = Sets.newLinkedHashSet();
    }

    public String getName() {
        return name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public String getNationality () {
        return nationality;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public Set<Rocket> getRockets() {
        return rockets;
    }

    public void setHeadquarters(String headquarters) {
        notNull(headquarters, "HeadQuarters cannot be null");
        this.headquarters = headquarters;
    }

    public void setRockets(Set<Rocket> rockets) {
        notNull(rockets, "Rockets cannot be null");
        this.rockets = rockets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaunchServiceProvider that = (LaunchServiceProvider) o;
        return yearFounded == that.yearFounded &&
                Objects.equals(name, that.name) &&
                Objects.equals(nationality, that.nationality);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, yearFounded, nationality);
    }
}
