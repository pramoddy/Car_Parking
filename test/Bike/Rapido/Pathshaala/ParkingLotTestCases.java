package Bike.Rapido.Pathshaala;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTestCases {




    @Test
    void checkGivenSlotIsEpmty() {
        int SlotNumber = 1;
        String emptyParkingSlot= new CarPark().checkGivenParkingSlotIsEmptyOrOccupied(SlotNumber - 1);

        assertEquals("True", emptyParkingSlot);
    }

    @Test
    void checkGivenSlotIsNotEmpty() {
        int SlotNumber = 3;
        String givenSlotIsOccupied = new CarPark().checkGivenParkingSlotIsEmptyOrOccupied(SlotNumber - 1);

        assertEquals("False", givenSlotIsOccupied);
    }

    @Test
    void checkAnySlotsIsEmptyInParkingLot() {

        int  emptySlotInParkingLot= new CarPark().checkAnyEmptySlotInParkingLot();

        assertEquals(0, emptySlotInParkingLot);

    }


    @Test
    void DriverParkTheCarWhenGivenSlotIsEmpty() {
        int SlotNumber = 1;

        String ParkTheCar = new CarPark().driverParkingTheCar(SlotNumber-1);

        assertEquals("True", ParkTheCar);

        if (ParkTheCar == "True") {

            System.out.println("Your Car is  Parked");
        }
    }

    @Test
    void checkTheParkingLotIsFull() {

        int parkingIsFull = new CarPark().checkAnyEmptySlotInParkingLot();

        assertEquals(-1, parkingIsFull);
    }


    @Test
    void unparkTheCarWhenCarIsNotParked() {
        int slotNumber = 3;
        int unparkTheCarWhenSlotIsEmpty = new CarPark().unparkTheCar(slotNumber - 1);

        assertEquals(0, unparkTheCarWhenSlotIsEmpty);

    }




    @Test
    void unparkTheCarWhenCarIsAlreadyParked() {
        int slotNumber = 3;
        int  unparkTheParkedCar = new CarPark().unparkTheCar(slotNumber - 1);

        assertEquals(0, unparkTheParkedCar);

    }

}



