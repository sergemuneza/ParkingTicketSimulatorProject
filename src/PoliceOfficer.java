/*
>> Name: Serge MUNEZA
>> Class: PoliceOfficer
>> Simple Short Description: This class represents a police officer who examines parked cars and issues parking tickets if necessary.
>> Instance variables:
   - String name: The name of the officer.
   - String badgeNumber: The badge number of the officer.
>> Methods:
   - Parameterized and default constructors to initialize the officer object.
   - Method issueTicket() to examine a parked car and parking meter and issue a ticket if the time is exceeded.
   - Getter and setter methods for each instance variable.
   - toString() method to return the officer details as a string.
*/


public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    // Default Constructor
    public PoliceOfficer() {
        this.name = "Unknown";
        this.badgeNumber = "Unknown";
    }

    // Parameterized Constructor
    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    // Method to issue a parking ticket
    public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter) {
        if (car.getMinutesParked() > meter.getMinutesPurchased()) {
            return new ParkingTicket(car, this);  // Issue a ticket if the time has expired
        }
        return null;  // No ticket issued if the car is within the parking time
    }

    // toString method
    @Override
    public String toString() {
        return "PoliceOfficer [name=" + name + ", badgeNumber=" + badgeNumber + "]";
    }
}
