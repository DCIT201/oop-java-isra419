package Rental.vehicle;

import customer.Customer;

public abstract class  Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    public Vehicle(){
           this.vehicleId=vehicleId;
           this.model= model;
           this.baseRentalRate= baseRentalRate;
           this.isAvailable= true;

        }

    public Vehicle(String vehicleId, String model, double baseRentalRat) {
    }

    public java.lang.String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }
