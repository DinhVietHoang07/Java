package Lab09;

import Lab09.Animal;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat c = new Cat();
        Rat r = new Rat();

        int choosl = 0;
        while (choosl < 5) {
            System.out.println("Moi ban cho memu :");
            System.out.println("1. Meo duoc sinh ra");
            System.out.println("2. Chuot duoc sinh ra");
            System.out.println("3. Meo duoi duoc chuot");
            System.out.println("4. Meo an thit chuot");
            System.out.println("5. het phim");
            choosl = sc.nextInt();

            if (choosl == 1) {
                c.port();
            }
            else if (choosl == 2) {
                r.port();
            }
            else if (choosl == 3) {
                if (c.getSpeed() < r.getSpeed()) {
                    System.out.println("Meo khong duoi duoc chuot");
                }
                else {
                    System.out.println("Meo bat duoc chuot");
                }
            }
            else if (choosl == 4) {
                if (r.getWeight() < 100) {
                    System.out.println("mum mum! chuot gay qua");
                }
                else {
                    System.out.println("mum mun! chuot beo qua");
                }
            }
            else {
                if (c.getSpeed() < r.getSpeed()) {
                    System.out.println("Chuot van con song, choi tiep");
                }
                else {
                    System.out.println("het phim!!!");
                }
            }
        }

    }
}
