package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int lengthI = scanner.nextInt();
        int lengthJ = scanner.nextInt();
        double[][] array = new double[lengthI][lengthJ];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter additional numbers: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double number = scanner.nextDouble();
                array[i][j] += number;
                System.out.print(array[i][j]);
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(array));

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
