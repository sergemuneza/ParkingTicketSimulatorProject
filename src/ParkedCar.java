/*
>> Name: Serge MUNEZA
>> Class: ParkedCar
>> Description: This class represents a parked car and stores details such as make, model, color, license number, and minutes parked.
>> Instance variables:
   - String make: The make of the car.
   - String model: The model of the car.
   - String color: The color of the car.
   - String licenseNumber: The license plate number of the car.
   - int minutesParked: The number of minutes the car has been parked.
>> Methods:
   - Parameterized and default constructors to initialize the car object.
   - Getter and setter methods for each instance variable.
   - toString() method to return the car details as a string.
*/

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    // Parameterized Constructor
    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    // toString method for displaying details
    @Override
    public String toString() {
        return "ParkedCar [make=" + make + ", model=" + model + ", color=" + color +
                ", licenseNumber=" + licenseNumber + ", minutesParked=" + minutesParked + "]";
    }
}
