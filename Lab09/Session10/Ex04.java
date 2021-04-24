package Lab09.Session10;

class Ex04 {
    protected String vehicleNo; // Variable to store vehicle number
    protected String vehicleName; // Variable to store vehicle name
    protected int wheels; // Variable to store number of wheels

    public Ex04(String vId, String vName, int numWheels) {
    }

    /**
     * Parameterized constructor to initialize values based on user input
     *  @param vId a String variable storing vehicle ID
     * @param vName a String variable storing vehicle name
     * @param numWheels an integer variable storing number of wheels
     */
    public void Vehicle(String vId, String vName, int numWheels){
        vehicleNo=vId;
        vehicleName=vName;
        wheels=numWheels;
    }
    /**
     * Accelerates the vehicle
     *
     * @return void
     */
    public void accelerate(int speed){
        System.out.println("Accelerating at:"+ speed + " kmph");
    }
}

