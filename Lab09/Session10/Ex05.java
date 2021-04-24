package Lab09.Session10;

public class Ex05 extends Ex04{
    private boolean powerSteer; // Variable to store steering information

    public Ex05(String vId, String vName, int numWheels) {
        super(vId, vName, numWheels);
    }

    public void FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        // Invoke the super class constructor
        powerSteer=pSteer;
    }
    /**
     * Displays vehicle details
     *
     * @return void
     */
    void Ex05Details(){
        System.out.println("Vehicle no:"+ vehicleNo);
        System.out.println("Vehicle Name:"+ vehicleName);
        System.out.println("Number of Wheels:"+ wheels);
        if(powerSteer==true){
            System.out.println("Power Steering:Yes");
        }
        else{
            System.out.println("Power Stearing:No");
        }

        public void accelerate(int speed){
            // Invoke the super class accelerate() method
            super.accelerate(speed);
            System.out.println("Maximum acceleration:"+ speed + "kmph");
        }
    }
    /**
     * Define the TestVehicle.java class
     */
    public static class TestVehicle {
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args){
            FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }
    private static class FourWheeler {
        public FourWheeler(String s, String volkswagen, int i, boolean b) {
        }

        public void showDetails() {
        }
        public void accelerate(int i) {
        }
    }
}
