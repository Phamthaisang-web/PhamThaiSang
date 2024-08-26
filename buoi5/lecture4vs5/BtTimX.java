
package buoi4;

import java.util.Scanner;

public class BtTimX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a=sc.nextFloat();
        System.out.print("Nhap b: ");
        float b=sc.nextFloat();
        float x;
        if(a!=0){
            x = -b / a;
            System.out.println("x = " +x);
        }else if (b==0&&a==0){
        System.out.println("Phuong trinh co vo so nghiem");
        }else {
            System.out.println("Phuong trinh vo nghiem");
        }
       
    }
    }

