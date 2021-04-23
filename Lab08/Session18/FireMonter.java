package Lab08;

public class FireMonter extends Monster{
    public FireMonter(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fite!";
    }
}
