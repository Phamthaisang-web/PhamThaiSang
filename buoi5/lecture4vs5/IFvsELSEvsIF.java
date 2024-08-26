
package buoi4;

import java.util.Scanner;

public class IFvsELSEvsIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        
        int place=sc.nextInt();
        if(place==1){
            System.out.println("Gold medal");
        }else if(place==2){
            System.out.println("Silver medal");
        }else if (place ==3){
            System.out.println("Bronze medal");
        }
    }
}
