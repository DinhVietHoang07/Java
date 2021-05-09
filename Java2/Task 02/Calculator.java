package Java2_02.Ex;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("vui lòng nhập số phần tử trong mảng");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] mangSo = new int[num];
        System.out.println("nhập các phần tử trong mảng");
        mangSo[0] = scan.nextInt();
        mangSo[1] = scan.nextInt();
        mangSo[2] = scan.nextInt();
        mangSo[3] = scan.nextInt();
        mangSo[4] = scan.nextInt();
        System.out.println("-----------");
        double sum = mangSo[0]+mangSo[1]+ mangSo[2]+mangSo[3]+mangSo[4];

        double average = sum / num ;
        System.out.println("trung bình là:" + average);
    }
}


