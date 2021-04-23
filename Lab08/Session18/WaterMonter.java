package Lab08;

public class WaterMonter extends Monster{
    public WaterMonter(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
