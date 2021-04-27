package Lab09;

import Lab09.Fish;

import java.util.Scanner;

public class Cat extends Animal{
    private int speed;
    Scanner sc = new Scanner(System.in);

    public Cat () {}

    public Cat (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void port () {
        System.out.print("Nhap ten cat :");
        name = sc.nextLine();
        System.out.print("Nhap toc do cat :");
        speed = Integer.parseInt(sc.nextLine());
    }


    public void eat (Rat food) {


    }

    public void run () {

    }

    public boolean getcatch (Rat a) {
        if (speed <= a.getSpeed()) {
            return false;
        }
        else {
            return true;
        }
    }


    public Animal haveBaby (String name) {
        Fish f = new Fish();
        return f;
    }


}

