
package buoi5;

import java.util.Random;
import java.util.Scanner;

public class soxo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("Choi so xo.tu 01->100");
        System.out.println("Nhap so choi ma ban thich");
        int a=sc.nextInt();
        
        int n = rd.nextInt(100)+1;
        System.out.println("KQ so xo. "+n);
        if(a==n){
            System.out.println("Ban trung thuong.");
        }else{
            System.out.println("Ban khong trung thuong.");
        }
    }   
    
}
