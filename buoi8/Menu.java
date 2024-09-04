package buoi8;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("1. Nhap so phan tu");
            System.out.println("2. Xuat so phan tu");
            System.out.println("3. So lon nhat thu 2 phan tu");
            System.out.println("4. Xoa so le");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list = BT.importData(list);
                    break;
                case 2:
                    BT.printData(list);
                    break;
                case 3:
                    BT.findMax2(list);
                    break;
                case 4:
                    BT.deleteOddNumber(list);
                    break;
                case 5:
                    System.out.println("Goodbye.");
                    sc.close(); // Đóng Scanner để giải phóng tài nguyên hệ thống
                    return;
                default:
                    System.out.println("chon sai.");
            }
        }
    }
}
