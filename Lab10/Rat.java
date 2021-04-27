package Lab09;

import java.util.Scanner;

public class Rat extends Animal{
    private int speed, weight;
    Scanner sc = new Scanner(System.in);

    public Rat () {}

    public Rat (String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void port () {
        System.out.print("Nhap ten rat :");
        name = sc.nextLine();
        System.out.print("Nhap toc do rat :");
        speed = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap can nang rat :");
        weight = Integer.parseInt(sc.nextLine());
    }
}

