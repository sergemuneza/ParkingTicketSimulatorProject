/*
>> Name: Serge MUNEZA
>> Class: TestParkingTicket
>> Simple Short Description: This class contains test cases to simulate the parking ticket scenario for various conditions.
>> Instance variables: None (static methods only).
>> Methods:
   - testTicketWithinTime(): Tests a case where the car is within the purchased time.
   - testTicketOverTime(): Tests a case where the car is over the purchased time.
   - testTicketJustBarelyWithinTime(): Tests a case where the car is just within the purchased time.
   - testTicketJustBarelyOverTime(): Tests a case where the car is just over the purchased time.
   - testTicketExactlyAtTime(): Tests a case where the car is exactly at the purchased time.
   - testTicketLessThanOneHourOver(): Tests a case where the car is less than one hour over the purchased time.
   - testTicketMoreThanOneHourOver(): Tests a case where the car is more than one hour over the purchased time.
   - testTicketExactlyOneHourOver(): Tests a case where the car is exactly one hour over the purchased time.
*/


import java.util.Scanner;

public class TestParkingTicket {

    public static void main(String[] args) {
        // Run test cases
        testTicketWithinTime();
        testTicketOverTime();
        testTicketJustBarelyWithinTime();
        testTicketJustBarelyOverTime();
        testTicketExactlyAtTime();
        testTicketLessThanOneHourOver();
        testTicketMoreThanOneHourOver();
        testTicketExactlyOneHourOver();
    }

    // Test case 1: The ParkedCar is within the parking time purchased.
    public static void testTicketWithinTime() {
        ParkedCar car = new ParkedCar("Honda", "Civic", "Red", "XYZ123", 60);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Alice", "12345");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("Test: Ticket Within Time");
        if (ticket == null) {
            System.out.println("No ticket issued. Car is within parking time.");
        } else {
            System.out.println(ticket);
        }
    }

    // Test case 2: The ParkedCar is over the parking time purchased.
    public static void testTicketOverTime() {
        ParkedCar car = new ParkedCar("Toyota", "Camry", "Blue", "ABC123", 90);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("John", "54321");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket Over Time");
        System.out.println(ticket);
    }

    // Test case 3: The ParkedCar is just barely within the parking time purchased.
    public static void testTicketJustBarelyWithinTime() {
        ParkedCar car = new ParkedCar("Ford", "Focus", "Green", "DEF456", 60);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Emma", "67890");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket Just Barely Within Time");
        if (ticket == null) {
            System.out.println("No ticket issued. Car is within parking time.");
        } else {
            System.out.println(ticket);
        }
    }

    // Test case 4: The ParkedCar is just barely over the parking time purchased.
    public static void testTicketJustBarelyOverTime() {
        ParkedCar car = new ParkedCar("Chevrolet", "Malibu", "Yellow", "GHI789", 61);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("David", "11223");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket Just Barely Over Time");
        System.out.println(ticket);
    }

    // Test case 5: The ParkedCar is exactly at the parking time purchased.
    public static void testTicketExactlyAtTime() {
        ParkedCar car = new ParkedCar("Nissan", "Altima", "Black", "JKL012", 60);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Sophia", "33445");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket Exactly At Time");
        if (ticket == null) {
            System.out.println("No ticket issued. Car is within parking time.");
        } else {
            System.out.println(ticket);
        }
    }

    // Test case 6: The ParkedCar is ticketed for being less than 1 hour over the time purchased.
    public static void testTicketLessThanOneHourOver() {
        ParkedCar car = new ParkedCar("Hyundai", "Elantra", "Silver", "MNO345", 75);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Olivia", "66778");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket Less Than One Hour Over");
        System.out.println(ticket);
    }

    // Test case 7: The ParkedCar is ticketed for being more than 1 hour over the time purchased.
    public static void testTicketMoreThanOneHourOver() {
        ParkedCar car = new ParkedCar("BMW", "3 Series", "White", "PQR678", 130);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("James", "99000");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket More Than One Hour Over");
        System.out.println(ticket);
    }

    // Test case 8: The ParkedCar is ticketed for being exactly 1 hour over the time purchased.
    public static void testTicketExactlyOneHourOver() {
        ParkedCar car = new ParkedCar("Mercedes", "Benz", "Grey", "STU901", 120);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Liam", "55555");

        ParkingTicket ticket = officer.issueTicket(car, meter);
        System.out.println("\nTest: Ticket Exactly One Hour Over");
        System.out.println(ticket);
    }
}
