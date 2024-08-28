package buoi5;
import java.util.Random;
import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Tro chs tinh cong: dung +1d. Sai 3 cau thua");
        System.out.println("------------BAT DAU-----------");
        int lost = 0;
        int win = 0;
        while (lost != 3) {
            int n = rd.nextInt(4) + 2;
            int kq = 0;
            StringBuilder expression = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                int a = rd.nextInt(10) + 1;
                kq += a;
                if (i == 0) {
                    expression.append(a); // Không thêm dấu cộng trước số hạng đầu tiên
                } else {
                    expression.append(" + ").append(a);
                }
            }
            
            System.out.print(expression.toString() + " = ");
            System.out.println("\nNhap KQ phep tinh cong tren: ");
            int b = sc.nextInt();
            if (kq == b) {
                win += 1;
                System.out.println("Dung.");
            } else {
                lost += 1;
                System.out.println("Sai.");
            }
            System.out.println("KQ phep tinh tren: " + kq);
            System.out.println("Ban co so diem la: " + win + " Va so cau sai: " + lost);
        }
        if (lost == 3) {
            System.out.println("Ban Lose. Rat that vong");
        }
        System.out.println("Tro chs ket thuc.");
        sc.close();
    }
}
