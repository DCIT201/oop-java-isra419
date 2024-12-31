package Rental.vehicle;
import agency.RentalAgency;
import customer.Customer;


public class Main{
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("C500","Camry",80,true);
        Motorcycle motorcycle = new Motorcycle("H50","Royal", 60 ,true);
        Truck truck = new Truck("T680", "Long vehicle", 100 , 500);
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("Opoku - Agyemang","Dl2243443547");
        agency.registerCustomer(customer);

        agency.processRental(customer,car,7);
        agency.processReturn(car);

        agency.processRental(customer,truck,9);
    }

}