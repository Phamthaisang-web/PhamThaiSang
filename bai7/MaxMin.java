package bai7;

import java.util.Scanner;

public class MaxMin {

    public static void max(int[] n) {
        int max = 0;
        max=n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }

        } 
        System.out.println("Phan tu lon nhat: "+max);
    }

    public static void min(int[] n) {
        int min=0;
        min=n[0];
        for (int i = 0; i < n.length; i++) {
            
            if (n[i] < min) {
                min = n[i];
            }
            
        }
        System.out.println("Phan tu nho nhat: "+min);

       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu");
        int a = sc.nextInt();

        int[] n = new int[a];
        for (int i = 0; i < n.length; i++) {
            System.out.print("[" + (i) + "] = ");
            n[i] = sc.nextInt();
        }
        MaxMin.max(n);
        MaxMin.min(n);
    }

}
