
package buoi6;

import java.util.Scanner;

public class Tinhtrungbinhcong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Nhap gia tri");
        int[] n=new int(a);
        for(int i=0;i<n.length;i++){
            System.out.println("Nhap gia tri");
            System.out.print("["i+1"] = ");
            
            System.out.print(n[i] + " ");
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
    }  
}
