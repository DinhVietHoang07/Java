package Java2_02.Ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Nhiet_do {
        public static void main(String[] args) {
            int j = 0;
            System.out.println("How many day's temperatures?");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double[] arr = new double[n];
            double total = 0;

            for (int i = 0; i < arr.length; i++){
                System.out.println("Day " + (i + 1) + " 's high temp: ");
                arr[i] = scanner.nextDouble();
            }
            scanner.close();
            for (int i = 0; i < arr.length; i++){
                total = total + arr[i];
            }
            double average = total / arr.length;
            System.out.format("Average = %.3f", average);

            for (int i = 0; i < n; i++){
                if (arr[i] > (average/n)){
                    j = j + 1;
                }
            }
            System.out.printf("%d days above average", j);
        }
    }