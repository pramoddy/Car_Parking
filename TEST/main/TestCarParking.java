package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCarParking {
    @Test
    void checkSlotIsEpmty() {
        int SlotNumber = 5;
        String checkParkingSlotAvailableOrNot = new CarPark().checkGivenParkingSlotEmptyOrOccupied(SlotNumber-1);

        assertEquals("True", checkParkingSlotAvailableOrNot);
    }

    @Test
    void checkSlotIsNotEmpty() {
        int SlotNumber = 3;
        String checkParkingSlotAvailableOrNot = new CarPark().checkGivenParkingSlotEmptyOrOccupied(SlotNumber-1);

        assertEquals("False", checkParkingSlotAvailableOrNot);
    }

    @Test
    void checkAvailableSlotInParking() {

        int checkAnyParkingSlotAvailableOrNot = new CarPark().checkParkingSlotAvailableOrNot();

        assertEquals(0, checkAnyParkingSlotAvailableOrNot);

    }

    @Test
    void checkNotAvailableSlotInParking() {

        int checkParkingSlotAvailableOrNot = new CarPark().checkParkingSlotAvailableOrNot();

        assertEquals(0, checkParkingSlotAvailableOrNot);
    }

    @Test
    void testDriverParkedTheCar() {
        int SlotNumber = 1;
        String ParkedTheCar = new CarPark().driver(SlotNumber);

        assertEquals("True", ParkedTheCar);

        if (ParkedTheCar == "True") {

            System.out.println("Your Car is  Parked");
        }
    }
}
