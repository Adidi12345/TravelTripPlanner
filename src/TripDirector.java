public class TripDirector {

    public TravelTrip buildBudgetVacation(BudgetTripBuilder builder) {
        return builder
                .setDestination("Almaty")
                .setNumberOfDays(5)
                .setHotel("Budget Hotel")
                .setTransport("Bus")
                .setFoodPlan("Local Food")
                .addActivity("City Tour")
                .addActivity("Mountain Walk")
                .setBudget(400)
                .build();
    }

    public TravelTrip buildLuxuryVacation(LuxuryTripBuilder builder) {
        return builder
                .setDestination("Paris")
                .setNumberOfDays(7)
                .setHotel("Five-Star Hotel")
                .setTransport("Private Car")
                .setFoodPlan("Fine Dining")
                .addActivity("Eiffel Tower Tour")
                .addActivity("Private City Tour")
                .addActivity("Luxury Shopping")
                .setBudget(5000)
                .build();
    }
}
