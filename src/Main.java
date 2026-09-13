public class Main {

    public static void main(String[] args) {
        TripDirector director = new TripDirector();

        BudgetTripBuilder budgetBuilder = new BudgetTripBuilder();
        TravelTrip budgetTrip = director.buildBudgetVacation(budgetBuilder);

        LuxuryTripBuilder luxuryBuilder = new LuxuryTripBuilder();
        TravelTrip luxuryTrip = director.buildLuxuryVacation(luxuryBuilder);

        System.out.println("=== BUDGET VACATION ===");
        System.out.println(budgetTrip);

        System.out.println("\n=== LUXURY VACATION ===");
        System.out.println(luxuryTrip);

        System.out.println("\n=== CUSTOM TRIP ===");

        TravelTrip customTrip = new BudgetTripBuilder()
                .setDestination("Astana")
                .setNumberOfDays(3)
                .setHotel("City Hotel")
                .setTransport("Train")
                .setFoodPlan("Breakfast and Dinner")
                .addActivity("City Tour")
                .addActivity("Museum Visit")
                .setBudget(250)
                .build();

        System.out.println(customTrip);
    }
}
