package rockets.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

@NoArgsConstructor
@AllArgsConstructor
public class Launch extends Entity {
    public enum LaunchOutcome {
        FAILED, SUCCESSFUL
    }

    private LocalDate launchDate;

    private Rocket launchVehicle;

    private LaunchServiceProvider launchServiceProvider;

    private LaunchPayload payload;

    private String launchSite;

    private String orbit;

    private String function;

    private BigDecimal price;

    private LaunchOutcome launchOutcome;

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        notNull(launchDate,"launchDate cannot be null or empty");
        this.launchDate = launchDate;
    }

    public Rocket getLaunchVehicle() {
        return launchVehicle;
    }

    public void setLaunchVehicle(Rocket launchVehicle) {
        notBlank(launchVehicle.toString(),"launchVehicle cannot be null or empty");
        this.launchVehicle = launchVehicle;
    }

    public LaunchServiceProvider getLaunchServiceProvider() {
        return launchServiceProvider;
    }

    public void setLaunchServiceProvider(LaunchServiceProvider launchServiceProvider) {
        notBlank(launchServiceProvider.getName(),
                "launchServiceProvider cannot be null or empty");
        this.launchServiceProvider = launchServiceProvider;
    }

    public LaunchPayload getPayload() {
        return payload;
    }

    public void setPayload(LaunchPayload payload) {
        notNull(launchSite ,"payload cannot be null");
        this.payload = payload;
    }

    public String getLaunchSite() {
        return launchSite;
    }

    public void setLaunchSite(String launchSite) {
        notBlank(launchSite ,"launchSite cannot be null or empty");
        this.launchSite = launchSite;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        notBlank(orbit ,"orbit cannot be null or empty");
        this.orbit = orbit;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        notBlank(function ,"function cannot be null or empty");
        this.function = function;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LaunchOutcome getLaunchOutcome() throws InvalidOutComeException {
        return launchOutcome;
    }

    public void setLaunchOutcome(LaunchOutcome launchOutcome) throws InvalidOutComeException {
        if(launchOutcome != LaunchOutcome.SUCCESSFUL
                && launchOutcome != LaunchOutcome.FAILED)
            throw new InvalidOutComeException();
        this.launchOutcome = launchOutcome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Launch launch = (Launch) o;
        return Objects.equals(launchDate, launch.launchDate) &&
                Objects.equals(launchServiceProvider, launch.launchServiceProvider) &&
                Objects.equals(launchVehicle, launch.launchVehicle) &&
                Objects.equals(orbit, launch.orbit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchDate, launchVehicle, launchServiceProvider, orbit);
    }

    class InvalidOutComeException extends Exception{
        public InvalidOutComeException(){
            super("launchoutcome is invalid");
        }
    }
}
