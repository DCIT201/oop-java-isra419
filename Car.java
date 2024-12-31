package Rental.vehicle;
import customer.Customer;

public class Car extends Vehicle implements Rental{
    private boolean hasGPS;
    double cost;
    public Car(String vehicleId, String model, double baseRentalRate){
        super(vehicleId,model,baseRentalRate);
        this.hasGPS= hasGPS;
    }

    public Car(String model, String name, int baseRentalRate, boolean isAvailable) {
    }

    public boolean hasGPS(){
        return hasGPS;
    }

    @Override
    public void rent(Customer customer, int days) {
        if(isAvailable()){
            throw new IllegalStateException("The car is not available for rental");
        }setAvailable(false);
        System.out.println("Car rented by " +customer.getName() + " for " + days +" days.");

    }

    @Override
    public void rentVehicle() {
        setAvailable(true);
        System.out.println("Car returned.");

    }

    @Override
    public double calculateRentalCost(int days) {
         cost = getBaseRentalRate() * days;
        if(hasGPS){
            cost +=6 * days;
        }
        return cost;
    }
}
