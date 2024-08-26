
package buoi4;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        
        int x=sc.nextInt();
        if(x>0){
            System.out.println("Positive");
        }else if(x<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
    
}


