package Rental.vehicle;
import customer.Customer;

public class Truck extends Vehicle implements Rental {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate){
        super(vehicleId,model,baseRentalRate);
        this.loadCapacity= loadCapacity;
    }

    public Truck(String model, String name, int baseRentalRate, int loadCapacity) {
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + loadCapacity;
    }

    @Override
    public void rent(Customer customer, int days) {
        if(!isAvailable()){
            throw new IllegalStateException("The truck is not available for rental");
        }setAvailable(false);
        System.out.println("Truck rented by " +customer.getName() + " for " + days +" days.");


    }

    @Override
        public void rentVehicle() {
            setAvailable(true);
            System.out.println("Truck returned.");

    }
}
