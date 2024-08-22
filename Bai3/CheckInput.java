package bai.pkg3;

import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        
        if (sc.hasNextInt()) {

            int number = sc.nextInt();
            System.out.println("La so nguyen");
        } else if (sc.hasNext()) {
            System.out.println("La ky tu");
            String input = sc.next();

        } 
        

         
        
        sc.close();
    }
}
