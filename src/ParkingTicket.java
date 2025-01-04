/*
>> Name: Serge MUNEZA
>> Class: ParkingTicket
>> Simple Short Description: This class represents a parking ticket issued for a car parked beyond the purchased time.
>> Instance variables:
   - ParkedCar car: The parked car that the ticket is issued for.
   - double fine: The calculated fine for the parking violation.
   - PoliceOfficer officer: The officer issuing the parking ticket.
>> Methods:
   - Parameterized and default constructors to initialize the ticket object.
   - Method to calculate fine based on the number of minutes over the limit.
   - Getter and setter methods for each instance variable.
   - toString() method to return the parking ticket details as a string.
*/


public class ParkingTicket {
    private ParkedCar car;
    private double fine;
    private PoliceOfficer officer;

    // Default Constructor (corrected)
    public ParkingTicket() {
        // Initialize with default values for ParkedCar and PoliceOfficer
        this.car = new ParkedCar("Unknown", "Unknown", "Unknown", "Unknown", 0);
        this.fine = 0.0;
        this.officer = new PoliceOfficer("Unknown", "Unknown");
    }

    // Parameterized Constructor
    public ParkingTicket(ParkedCar car, PoliceOfficer officer) {
        this.car = car;
        this.fine = calculateFine(car.getMinutesParked());
        this.officer = officer;
    }

    // Method to calculate fine based on time over the limit
    private double calculateFine(int minutesParked) {
        int overTime = minutesParked - 60;  // Assume 60 minutes is the allowed time
        if (overTime <= 0) {
            return 0;  // No fine
        } else if (overTime <= 60) {
            return 25;  // First hour over
        } else {
            return 25 + (10 * (overTime / 60));  // Additional $10 for every extra hour
        }
    }

    // Getters and Setters
    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    // toString method
    @Override
    public String toString() {
        return "ParkingTicket [carDetails=" + car.toString() + ", fine=" + fine +
                ", officerName=" + officer.getName() + ", officerBadgeNumber=" + officer.getBadgeNumber() + "]";
    }
}
