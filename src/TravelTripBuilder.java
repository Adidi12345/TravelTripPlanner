import java.util.ArrayList;
import java.util.List;

public abstract class TravelTripBuilder {
    protected String destination;
    protected int numberOfDays;
    protected String hotel;
    protected String transport;
    protected String foodPlan;
    protected List<String> activities = new ArrayList<>();
    protected double budget;

    public TravelTripBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public TravelTripBuilder setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
        return this;
    }

    public TravelTripBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    public TravelTripBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public TravelTripBuilder setFoodPlan(String foodPlan) {
        this.foodPlan = foodPlan;
        return this;
    }

    public TravelTripBuilder addActivity(String activity) {
        this.activities.add(activity);
        return this;
    }

    public TravelTripBuilder setBudget(double budget) {
        this.budget = budget;
        return this;
    }

    public abstract TravelTrip build();
}
