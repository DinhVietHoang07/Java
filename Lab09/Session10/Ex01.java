package Lab09.Session10;

public class Ex01 {
    // Declare common attributes of a vehicle
    protected String vehicleNo; // Variable to store vehicle number
    protected String vehicleName; // Variable to store vehicle name
    protected int wheels; // Variable to store number of wheels

    /**
     * Accelerates the vehicle
     *
     * @return void
     */
    public void accelerate(int speed) {
        System.out.println("Accelerating at: "+ speed + "kmph");
    }
}
