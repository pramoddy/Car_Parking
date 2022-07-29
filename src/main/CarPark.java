package main;


 public class CarPark
{
    int[] parkingSlots= {0, 0, 1, 0, 0, 0, 0, 0, 0, 0};

    public String driver(int SlotNumber){
        if (checkGivenParkingSlotEmptyOrOccupied(SlotNumber) =="True"){
            parkingSlots[SlotNumber]=1;
            return "True";

        }
        else
            return "False";
    }
    public String checkGivenParkingSlotEmptyOrOccupied(int parkSlot) {
        if (parkingSlots[parkSlot] == 0)
        {
            return "True";
        }
        else
            return "False";
    }
    public int checkParkingSlotAvailableOrNot() {

        for (int counter = 0; counter < parkingSlots.length; counter++) {
            if(parkingSlots[counter]!=1)
            {
                return 0;
            }
        }
        return -1;

    }
}









