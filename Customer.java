package customer;
import Rental.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String licenseNumber;
    private List<Vehicle> rentalHistory;

    public Customer(){
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rentalHistory = new ArrayList<>();

    }

    public Customer(String name, String licenseNumber) {
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }public void addRentalHistory(Vehicle vehicle){
        rentalHistory.add(vehicle);
    }
}
