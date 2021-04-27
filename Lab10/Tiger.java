package Lab09;

public class Tiger extends Animal{
    private int run;

    public Tiger(int run){
        this.run=run;

    }

    public String haveBaby() {
        return "Tiger{" +
                "run=" + run +
                '}';
    }
}
