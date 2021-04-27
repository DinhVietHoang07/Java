package Lab09;

public class Animal {
    protected String name;
    private int eat;
    private Animal haveBaby;

    public Animal() {
    }


    public Animal(String name, int eat, Animal haveBaby){
        this.name=name;
        this.eat=eat;
        this.haveBaby=haveBaby;
    }

    public String getName() {
        return name;
    }

    public int getEat() {
        return eat;
    }

    public Animal getHaveBaby() {
        return haveBaby;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public void setHaveBaby(Animal haveBaby) {
        this.haveBaby = haveBaby;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", eat=" + eat +
                ", haveBaby=" + haveBaby +
                '}';
    }
}
