
package calculation;

public class Calculation6 {
    void sum(int a,long b){
        System.out.println("a method invoked");
    }
    void sum(long a,int b){
        System.out.println("b method invoked");
    }
    public static void main(String[] args) {
        Calculation6 obj =new Calculation6();
        obj.sum(20,20 );
        
    }
}
