package Lab09.Session10;

public class Ex02 extends Ex01 {
    // Declare a field specific to child class
    private boolean powerSteer; // Variable to store steering information


    public void FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        // Attributes inherited from parent class
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        // Child class’ own attribute
        powerSteer = pSteer;
    }
/**
 * Displays vehicle details
 *
 * @return void
 */
    public void showDetails() {
        System.out.println("Vehicle no:"+ vehicleNo);
        System.out.println("Vehicle Name:"+ vehicleName);
        System.out.println("Number of Wheels:"+ wheels);

        if(powerSteer == true)
            System.out.println("Power Steering:Yes");
 else
        System.out.println("Power Steering:No");
    }
}
/**
 * Define the TestVehicle.java class
 */
class TestVehicle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object of child class and specify the values 
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetails(); // Invoke the child class method
        objFour.accelerate(200); // Invoke the inherited method
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