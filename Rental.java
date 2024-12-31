package Rental.vehicle;
import customer.Customer;

public interface Rental{
    void rent(Customer customer, int days);
    void rentVehicle();
}
