package agency;

import customer.Customer;
import Rental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<Customer> customers;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        fleet.add(vehicle);
    }
    public void registerCustomer(Customer customer){
        customers.add(customer);
    }public void processRental(Customer customer, Vehicle vehicle, int days){
        if(!vehicle.isAvailable()){
            throw new IllegalStateException("vehicle is not available for rental.");
        }
        vehicle.rent(customer,days);
        customer.addRentalHistory(vehicle);
        System.out.println("Rental processed: " + vehicle + "rented to " + customer.getName());
    }public void processReturn(Vehicle vehicle){
        vehicle.returnVehicle();
        System.out.println("Return processed for : " + vehicle);
    }
}
