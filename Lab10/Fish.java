package Lab09;

public class Fish extends Animal {
    private int swim;
    private int dive;

    public Fish(int swim, int dive){
        this.swim=swim;
        this.dive=dive;
    }

    public Fish() {
        this.swim=swim;
    }


    public String haveBaby() {
        return "Fish{" +
                "swim=" + swim +
                ", dive=" + dive +
                '}';
    }
}
