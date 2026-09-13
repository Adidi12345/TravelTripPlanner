import java.util.List;

public class TravelTrip {
    private final String destination;
    private final int numberOfDays;
    private final String hotel;
    private final String transport;
    private final String foodPlan;
    private final List<String> activities;
    private final double budget;

    public TravelTrip(
            String destination,
            int numberOfDays,
            String hotel,
            String transport,
            String foodPlan,
            List<String> activities,
            double budget) {

        this.destination = destination;
        this.numberOfDays = numberOfDays;
        this.hotel = hotel;
        this.transport = transport;
        this.foodPlan = foodPlan;
        this.activities = List.copyOf(activities);
        this.budget = budget;
    }

    public void validate() {
        if (destination == null || destination.isBlank()) {
            throw new IllegalStateException("Destination is required");
        }

        if (numberOfDays <= 0) {
            throw new IllegalStateException("Number of days must be greater than 0");
        }

        if (hotel == null || hotel.isBlank()) {
            throw new IllegalStateException("Hotel is required");
        }

        if (transport == null || transport.isBlank()) {
            throw new IllegalStateException("Transport is required");
        }

        if (foodPlan == null || foodPlan.isBlank()) {
            throw new IllegalStateException("Food plan is required");
        }

        if (activities == null || activities.isEmpty()) {
            throw new IllegalStateException("At least one activity is required");
        }

        if (budget <= 0) {
            throw new IllegalStateException("Budget must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "\nTravel Trip" +
                "\nDestination: " + destination +
                "\nNumber of days: " + numberOfDays +
                "\nHotel: " + hotel +
                "\nTransport: " + transport +
                "\nFood plan: " + foodPlan +
                "\nActivities: " + String.join(", ", activities) +
                "\nBudget: $" + budget;
    }
}
