
package lecture4vs5;
import java.util.Scanner;
public class DoWhile {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        int sum = 0;
        do{

            System.out.print("Enter a number (0 to quit): ");
            number = console.nextInt();
            sum = sum + number;
        }while(number != 0);
            System.out.println("The total is " + sum);

    }
}
