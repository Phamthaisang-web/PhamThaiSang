
package buoi4;

import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        int n=sc.nextInt();
        switch(n){
            case 5: System.out.println("Five"); break;
            case 4: System.out.println("Four"); break;
            case 3: System.out.println("Three"); break;
            case 2: System.out.println("Two"); break;
            case 1: System.out.println("One"); break;
            default: System.out.println("No");
        }
    }
}
