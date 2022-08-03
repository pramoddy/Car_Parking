package Bike.Rapido.Pathshaala;


 public class CarPark {
     int[] parkingSlots = {0, 1, 1, 1, 1};

     public String driverParkingTheCar(int SlotNumber) {
         if (checkGivenParkingSlotIsEmptyOrOccupied(SlotNumber) == "True") {
             parkingSlots[SlotNumber] = 1;
             for(int i =0;i<5;i++)
             {
                 System.out.println(parkingSlots[i]);
             }
             return "True";

         }
         else {
             return "False";
         }


     }

     public String checkGivenParkingSlotIsEmptyOrOccupied(int parkSlot) {
         if (parkingSlots[parkSlot] == 0) {
             return "True";
         } else
             return "False";
     }

     public int checkAnyEmptySlotInParkingLot() {


         for (int counter = 0; counter < parkingSlots.length; counter++) {
             if (parkingSlots[counter] == 0) {
                 return 0;
             }

         }

         return -1;
     }

     public int unparkTheCar(int slotNumber) {
         if (checkGivenParkingSlotIsEmptyOrOccupied(slotNumber) == "True") {
             return -1;
         } else {
             parkingSlots[slotNumber] = 0;
             return 0;
         }
     }
 }











