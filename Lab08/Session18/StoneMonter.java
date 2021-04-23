package Lab08;

public class StoneMonter extends Monster{
    public StoneMonter(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
