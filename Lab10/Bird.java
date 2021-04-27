package Lab09;

public class Bird extends Animal{
    private int fly;

    public Bird(int fly){
        this.fly=fly;
    }



    public String haveBaby() {
        return "Bird{" +
                "fly=" + fly +
                '}';
    }
}
