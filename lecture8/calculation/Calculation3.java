
package C;


public class Calculation3 {
    int sum(int a,int b){
        System.out.println(a+b);
    }
    
    double sum(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Calculation3 obj =new Calculation3();
        int result=obj.sum(3, 2);
    }
}
