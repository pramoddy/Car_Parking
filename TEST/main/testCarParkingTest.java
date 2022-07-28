package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testCarParkingTest {
    int[] ParkingSlots={0,0,1,0,0,0,0,0,0,0};
    @Test
    void CheckSlotisEpmty() {
        int SlotNumber = 5;
        String checkParkiSlotAvailableOrNot = new CarParking().CheckgivenParkingSlot(SlotNumber-1,ParkingSlots);
        assertEquals("True", checkParkiSlotAvailableOrNot);
    }

    @Test
    void CheckSlotisNotEmpty() {
        int SlotNumber = 3;
        String checkParkiSlotAvailableOrNot = new CarParking().CheckgivenParkingSlot(SlotNumber-1,ParkingSlots);
        assertEquals("False", checkParkiSlotAvailableOrNot);
    }

    @Test
    void CheckAvailableSlotInParking() {

        int checkParkiSlotAvailableOrNot = new CarParking().checkParkingAvailableOrNot(ParkingSlots);
        assertEquals(0, checkParkiSlotAvailableOrNot);

    }

    @Test
    void CheckNotAvailableSlotInParking() {

        int checkParkiSlotAvailableOrNot = new CarParking().checkParkingAvailableOrNot(ParkingSlots);
        assertEquals(0, checkParkiSlotAvailableOrNot);
    }

    @Test
    void DriverTest() {
        int SlotNumber = 1;
        String ParkTheCar = new CarParking().Driver(SlotNumber, ParkingSlots);
        assertEquals("True", ParkTheCar);
        if (ParkTheCar == "True") {
            ParkingSlots[SlotNumber - 1] = 1;
        }
        for (int counter = 0; counter < 10; counter++)
        {
        System.out.print(" "+ParkingSlots[counter]);
        }

    }
}