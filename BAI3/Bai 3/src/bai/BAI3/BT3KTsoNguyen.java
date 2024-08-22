package bai.pkg3;

import java.util.Scanner;

public class BT3KTsoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        boolean check = sc.hasNextInt();
        if(check==true){
            System.out.println("La mot so nguyen. "); 
        }else {
            System.out.println("Khong phai la mot so nguyen. "); 
        }
             
    }
}
