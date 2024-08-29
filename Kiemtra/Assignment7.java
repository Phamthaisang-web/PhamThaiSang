package bai7;

import java.util.Scanner;

public class Assignment7 {

    public static float[] imporData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu cua mang: ");
        int n = sc.nextInt();
        float[] arrays = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            arrays[i] = sc.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("[" + i + "] = " + arrays[i]);
        }
    }

    public static float findMax2(float[] arrays) {
        float kq = arrays[0];
        
        float solonnhat = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > kq) {
                kq = arrays[i];
                solonnhat = kq;
            }
        }
        System.out.println("lon nhat "+solonnhat);
        float kq1 = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > kq1 && arrays[i] < solonnhat) {
                kq1 = arrays[i];
            }
        }

        return kq1;
    }

    public static void deleteOddNumber(float[] arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (!(arrays[i] % 2 != 0 && arrays[i] % 1 == 0)) {
                count++;
            }
        }
        float[] chan = new float[count];
        int dem = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (!(arrays[i] % 2 != 0 && arrays[i] % 1 == 0)) {
                chan[dem++] = arrays[i];
            }
        }
        System.out.println("Xoa phan tu le trong mang. ");
        for (int i = 0; i < chan.length; i++) {
            System.out.println("[" + i + "] = "+ chan[i]);
        }
    }

    public static void main(String[] args) {
        float[] arrays = imporData();
        printData(arrays);
        System.out.println("So lon nhat thu 2 la: " + Assignment7.findMax2(arrays));
        deleteOddNumber(arrays);

    }
}
