/*
>> Name: Serge MUNEZA
>> Class: ParkingMeter
>> Simple Short Description: This class simulates a parking meter and keeps track of purchased parking minutes.
>> Instance variables:
   - int purchasedMinutes: The number of minutes of parking time purchased.
>> Methods:
   - Parameterized and default constructors to initialize the meter object.
   - Getter and setter methods for the purchasedMinutes variable.
   - toString() method to return the parking meter details as a string.
*/

public class ParkingMeter {
    private int minutesPurchased;

    // Parameterized Constructor
    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    // Getter and Setter
    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    // toString method for displaying details
    @Override
    public String toString() {
        return "ParkingMeter [minutesPurchased=" + minutesPurchased + "]";
    }
}
