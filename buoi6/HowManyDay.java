package buoi6;

import java.util.Scanner;

public class HowManyDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperatures? ");
        int days = sc.nextInt();
        int sum = 0;
        int[] temps = new int[days];
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.println("Averge temp = %.1f " + average);
        System.out.println(count + " days above average");
    }
}
