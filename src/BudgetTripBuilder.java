public class BudgetTripBuilder extends TravelTripBuilder {

    @Override
    public TravelTrip build() {
        TravelTrip trip = new TravelTrip(
                destination,
                numberOfDays,
                hotel,
                transport,
                foodPlan,
                activities,
                budget
        );

        trip.validate();
        return trip;
    }
}
