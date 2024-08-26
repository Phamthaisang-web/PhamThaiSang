/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

import java.util.Random;
import java.util.Scanner;

public class soxo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("Choi so xo.");
        System.out.println("KQ so xo. ");
        for(int i=1;i<=6;i++){
            int n = rd.nextInt(100);
            System.out.print(n +" ");
        }
    }
}
