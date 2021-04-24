package Lab09.Session10;

public class Ex10 {
    public static void main(String[] args)
    {
        Ex08 objShape; // Declare the Shape object
        String shape; // Variable to store the type of shape
        if(args.length==2) {
            shape = args[0].toLowerCase();
            switch(shape){
                case "Ex09": objShape = new Ex09();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
                case "rectangle": objShape = new Rectangle();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
            }
        }
        else{
            // Error message to be displayed when arguments are not supplied
            System.out.println("Usage: java Calculator <shape-name> <value>");
        }
    }
}

        


