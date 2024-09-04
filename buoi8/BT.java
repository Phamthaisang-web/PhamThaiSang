package buoi8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BT {

    public static ArrayList<Integer> importData(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        list.clear();
        
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            list.add(sc.nextInt());
        }
        return list;
    }

    public static void printData(ArrayList<Integer> list) {
        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] = " + list.get(i));
        }
    }

    public static void findMax2(ArrayList<Integer> list) {
        if (list.size() < 2) {
            System.out.println("Danh sach can co it nhat 2 phan tu.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Khong co so lon thu 2.");
        } else {
            System.out.println("So lon nhat thu 2 trong mang la: " + max2);
        }
    }

    public static void deleteOddNumber(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("Xoa phan tu le trong mang.");
        printData(list);
    }
}
