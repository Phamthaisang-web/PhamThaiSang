
package buoi4;

import java.util.Scanner;
public class IF {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        int percent= sc.nextInt();
        if(percent >= 90){
            System.out.println("you got an A!");
        }
        if(percent >= 80){
            System.out.println("you got an B!");
        }
        if(percent >= 70){
            System.out.println("you got an C!");
        }
        if(percent >= 60){
            System.out.println("you got an D!");
        }
        if (percent < 60){
            System.out.println("you got an F!");
        }

    }
    
}
