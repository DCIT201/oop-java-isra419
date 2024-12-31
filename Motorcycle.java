package Rental.vehicle;
import customer.Customer;

public class Motorcycle extends Vehicle implements Rental {
    private boolean hasHelmetIncluded;
    double cost;
    public Motorcycle(String vehicleId , String model,double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    public Motorcycle(String model, String name, int baseRentalRate, boolean isAvailable) {
    }

    public boolean isHasHelmetIncluded() {
        return hasHelmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        cost = getBaseRentalRate() * days;
        if (hasHelmetIncluded) {
            cost += 2 * days;
        }
        return cost;
    }
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            throw new IllegalStateException("The motorcycle is not available for rental");
        }
        setAvailable(false);
        System.out.println("Motorcycle rented by " + customer.getName() + " for " + days + " days.");

    }

    @Override
    public void rentVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned.");
    }
}