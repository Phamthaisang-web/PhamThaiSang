
package buoi5;

import java.util.Random;
import java.util.Scanner;


public class keobubao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        
//        1keo
//        2bua
//        3bao
        System.out.println("1.Keo");
        System.out.println("2.Bua");
        System.out.println("3.Bao");
        int n=rd.nextInt(4);
        int a=sc.nextInt();
//        may win
        if(n==1&&a==3){
            System.out.println("May ra keo");
            System.out.println("Ban thua");
        }else if(n==2&&a==1){
            System.out.println("May ra bua");
            System.out.println("Ban thua");
        }else if(n==3&&a==2){
            System.out.println("May ra bao");
            System.out.println("Ban thua");
        }
        //ban win
        if(a==1&&n==3){
            System.out.println("May ra bao");
            System.out.println("Ban thang");
        }else if(a==2&&n==1){
            System.out.println("May ra keo");
            System.out.println("Ban thang");
        }else if(a==3&&n==2){
            System.out.println("May ra bua");
            System.out.println("Ban thang");
        }
        //hoa
        if(a==1&&n==1){
            System.out.println("May ra keo");
            System.out.println("Hoa");
        }else if(a==2&&n==2){
            System.out.println("May ra bua");
            System.out.println("Hoa");
        }else if(a==3&&n==3){
            System.out.println("May ra bao");
            System.out.println("Hoa");
        }
        
        
    }
}
