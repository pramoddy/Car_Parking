package main;


 public class CarParking
{
    public String Driver(int SlotNumber,int[] parkSlots){
        if (CheckgivenParkingSlot(SlotNumber,parkSlots) =="True"){
            return "True";
        }
        else
            return "False";

    }

    public String CheckgivenParkingSlot(int parkSlot, int[] carParkingSlotNumbers) {
        if (carParkingSlotNumbers[parkSlot] == 0)
        {
            return "True";
        }
        else
            return "False";

    }
    public int checkParkingAvailableOrNot(int[] carParkingSlotNumbers ) {

        String[] carNumbers;
        for (int counter = 0; counter < carParkingSlotNumbers.length; counter++) {
            if(carParkingSlotNumbers[counter]!=1)
            {
                return 0;
            }
        }
        return -1;

    }
}









