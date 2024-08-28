
package buoi6;

import java.util.Scanner;

public class Tinhtrungbinhcong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu");
        int a=sc.nextInt();
        
        int[] n = new int[a];
        for(int i=0;i<n.length;i++){
            System.out.print("["+(i)+"] = ");
            n[i] = sc.nextInt();
        }
        float kq=0;
        System.out.println("Tinh trung binh cong.");
        for(int i=0;i<n.length;i++){
            kq+=n[i];
        }
        System.out.println("Kq = "+(kq/a));
    }  
}
