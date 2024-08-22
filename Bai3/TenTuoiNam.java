
package bai.pkg3;

import java.util.Scanner;

public class TenTuoiNam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = sc.nextInt();
        System.out.print("Nhap nam:");
        int nam= sc.nextInt();
        System.out.print("Nhap Gioi tinh(nam/nu/gay): ");
        String gioitinh = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap chuyen nganh:");
        String nganh = sc.nextLine();
        System.out.print("Nhap GPA:");
        float gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap que quan:");
        String que = sc.nextLine();
         
        // xuat
        System.out.println("------------Output-----------");
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Nam: "+nam);
        System.out.println("Gioi tinh: "+gioitinh);
        System.out.println("Chuyen nganh: "+nganh);
        System.out.println("GPA: "+gpa);
        System.out.println("Que quan: "+que);
        
        
    }
    
}
