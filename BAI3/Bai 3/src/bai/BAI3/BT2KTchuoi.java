
package bai.pkg3;

import java.util.Scanner;


public class BT2KTchuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        if (sc.hasNext()) {
            
            String input = sc.next();
            if (input.length() == 1) {
                System.out.println("Day la ki tu: " + input);
            } else {
                System.out.println("Day la chuoi: " + input);
            }
        } else {
            System.out.println("Khong co dau vao.");
        }     
    }
}
